use red362;

drop table  if exists dnd5_classes;
drop table  if exists player;
drop table  if exists personaggi;

CREATE TABLE IF NOT EXISTS dnd5_classes (
  class_id int(11) NOT NULL AUTO_INCREMENT,
  class_name varchar(9) NOT NULL,
  PRIMARY KEY (`class_id`)
);

INSERT INTO dnd5_classes (class_id, class_name) VALUES
(1, 'Guerriero'),
(2, 'Vate'),
(3, 'Prete');

create table if not exists player (
    player_id integer AUTO_INCREMENT primary key ,
    username varchar(20) unique,
    password varchar(20),
    email varchar(100) unique
    );
        
    select * from player;
    
create table if not exists personaggi(
username varchar(20) unique,
player_id integer,
Strength_exp decimal(5,2),
    Charm_exp decimal(5,2),
    Intelligence_exp decimal(5,2),
    Level integer,
    class_id integer NOT NULL,
    PRIMARY KEY(username),
    CONSTRAINT FOREIGN KEY (player_id) REFERENCES player(player_id),
    FOREIGN KEY (class_id) REFERENCES dnd5_classes(class_id)
    );
    
   select * from personaggi;
   
   INSERT INTO player(username,password,email) VALUES ('A','qwerty','caso@caso.caso');