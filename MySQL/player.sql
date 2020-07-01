-- run as 362;
use red362;

drop table  if exists characters;
drop table  if exists dnd_classes;
drop table  if exists users;

CREATE TABLE IF NOT EXISTS dnd_classes (
  class_id int(11) NOT NULL AUTO_INCREMENT,
  class_name varchar(9) NOT NULL,
  PRIMARY KEY (class_id)
);

INSERT INTO dnd_classes (class_id, class_name) VALUES
(1, 'Guerriero'),
(2, 'Vate'),
(3, 'Prete');

create table if not exists users (
    user_id integer AUTO_INCREMENT primary key ,
    username varchar(20) unique,
    password varchar(20),
    email varchar(100) unique
    );
        
    
create table if not exists characters(
	nickname varchar(20) unique,
	user_id integer,
	strength_exp decimal(5,2),
    charm_exp decimal(5,2),
    intelligence_exp decimal(5,2),
    level integer,
    class_id integer NOT NULL,
    PRIMARY KEY(nickname),
    CONSTRAINT FOREIGN KEY (user_id) REFERENCES users(user_id) ON DELETE CASCADE,
    CONSTRAINT FOREIGN KEY (class_id) REFERENCES dnd_classes(class_id) ON DELETE CASCADE
    );
    
   
   INSERT INTO users(username,password,email) VALUES ('A','qwerty','caso@caso.caso');
   INSERT INTO users(username, password, email) VALUES ('B', '11111111', 'second@second.com');
   
   INSERT INTO characters(nickname, user_id, strenght_exp, charm_exp, intelligence_exp, level, class_id) VALUES ('Rock', 1,'0.1',0.2,0.1,0,1);
   INSERT INTO characters(nickname, user_id, strenght_exp, charm_exp, intelligence_exp, level, class_id) VALUES ('Vat', 2,0.1,0.2,0.3,0,2);