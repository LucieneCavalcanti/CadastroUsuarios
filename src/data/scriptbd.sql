create database bdTesteJava;
use bdTesteJava;
create table tbusuarios(
id int not null primary key identity,
nome varchar(200) not null,
email varchar(100) not null,
senha varchar(20) not null
)