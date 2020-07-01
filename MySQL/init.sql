-- da eseguire come root

create user red362 identified by 'password';
create schema red362;

grant all privileges on red362.* to red362;
grant alter routine on red362.* to red362;