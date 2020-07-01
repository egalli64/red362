-- run as 362;
use red362;

drop table if exists scenario;
drop table if exists gamesession;
drop table if exists characters;
drop table if exists users;
drop table if exists dnd_classes;



CREATE TABLE IF NOT EXISTS users (
    user_id integer AUTO_INCREMENT primary key,
    username varchar(20) unique,
    password varchar(20),
    email varchar(100) unique
);
        
    
CREATE TABLE IF NOT EXISTS characters(
	nickname varchar(20) unique,
	typology varchar(20),
	user_id integer,
    PRIMARY KEY(nickname),
    CONSTRAINT FOREIGN KEY (user_id) REFERENCES users(user_id) ON DELETE CASCADE
);
    
CREATE TABLE IF NOT EXISTS gamesession (
	game_id integer,
	nickname varchar(20) unique,
	user_id integer unique,
	lastconnection date,
	level integer,
	strength_exp decimal(5,2),
	charm_exp decimal(5,2),
	intelligence_exp decimal(5,2),
	PRIMARY KEY(game_id),
	CONSTRAINT FOREIGN KEY (user_id) REFERENCES users(user_id) ON DELETE CASCADE,
	CONSTRAINT FOREIGN KEY (nickname) REFERENCES characters(nickname) ON DELETE CASCADE
);

CREATE TABLE IF NOT EXISTS scenario (
	level integer,
	descr varchar(100),
	choice1 varchar(100),
	choice2 varchar(100),
	choice3 varchar(100),
	PRIMARY KEY(level)
);
INSERT INTO scenario (level, descr, choice1, choice2, choice3) VALUES
	(0,'Strada','cammini','rotoli', 'fuggi'),
	(1,'Sfida','accetti','rifiuti', 'temporeggi'),
	(2,'B','B1','B2', 'B3'),
	(3,'C','C1','C2', 'C3'),
	(4,'D','D1','D2', 'D3');


INSERT INTO users(username,password,email) VALUES ('A','qwerty','caso@caso.caso');
INSERT INTO users(username, password, email) VALUES ('B', '11111111', 'second@second.com');
   
INSERT INTO characters(nickname, typology ,user_id) VALUES ('Vat', "Prete" ,2);
INSERT INTO characters(nickname, typology ,user_id) VALUES ('Rock', "Vate" ,1);
    