-- run it as root

drop schema if exists red362;
drop user if exists red362;

create user red362 identified by 'password';
create schema red362;

-- run it with all privileges

grant all privileges on red362.* to red362;
grant alter routine on red362.* to red362;

use red362;

drop table  if exists personaggi;
drop table  if exists dnd5_classes;
drop table  if exists users;

CREATE TABLE IF NOT EXISTS dnd5_classes (
  class_id int(11) NOT NULL AUTO_INCREMENT,
  class_name varchar(9) NOT NULL,
  PRIMARY KEY (class_id)
);

INSERT INTO dnd5_classes (class_id, class_name) VALUES
(1, 'Guerriero'),
(2, 'Vate'),
(3, 'Prete');

create table if not exists users (
    user_id integer AUTO_INCREMENT primary key ,
    username varchar(20) unique,
    password varchar(20),
    email varchar(100) unique
    );
        
    
create table if not exists personaggi(
username varchar(20) unique,
user_id integer,
Strength_exp decimal(5,2),
    Charm_exp decimal(5,2),
    Intelligence_exp decimal(5,2),
    Level integer,
    class_id integer NOT NULL,
    PRIMARY KEY(username),
    CONSTRAINT FOREIGN KEY (user_id) REFERENCES users(user_id) ON DELETE CASCADE,
    CONSTRAINT FOREIGN KEY (class_id) REFERENCES dnd5_classes(class_id) ON DELETE CASCADE
    );
    
   select * from personaggi;
   
   INSERT INTO users(username,password,email) VALUES ('A','qwerty','caso@caso.caso');