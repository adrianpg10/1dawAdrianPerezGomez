create database bingo;
use bingo;

create table tablaBingo
(
id varchar(10),
fecha date,
idJugador varchar(50),
tipo int,
bombo varchar(1000),
carton varchar(1000),

constraint pk_id primary key (id)


);