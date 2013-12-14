   create database familiare;
use familiare;

create table gruppoPermessi(

idGruppo int(3) not null,
tipoPersona varchar(20) not null,

primary key(idGruppo)
);

create table persona(

idPersona int(3) not null auto_increment,
nome varchar(20) not null,
cognome varchar(25) not null,
email varchar(50) not null,
idGruppo int (3) not null,
eliminato int(1),

primary key(idPersona),
foreign key(idGruppo) references gruppoPermessi(idGruppo)
);


create table utente(
idUtente int(3) not null auto_increment,
idPersona int(3) not null,
username varchar(20)not null,
password varchar(100)not null,
eliminato int(1),

primary key(idUtente,idPersona)
);

create table spesa(
idPersona int(3) not null,
idSpesa int(3) not null auto_increment,
dat date not null,
importo decimal(7,2)not null,
tipologia varchar(100)not null,
descrizione varchar(200),
positiva int (1),
eliminato int(1),

primary key(idSpesa,idPersona),
foreign key(idPersona) references persona(idPersona)

);



INSERT INTO gruppoPermessi VALUES ('1', 'Renata');
INSERT INTO gruppoPermessi VALUES ('2', 'Fabrizio');

INSERT INTO persona(nome,cognome,email,idGruppo,eliminato) VALUES('Renata','Vinci','vincirenata@yahoo.it','1','0');
INSERT INTO persona(nome,cognome,email,idGruppo,eliminato) VALUES('Fabrizio','Leoni','fabbri75@yahoo.it','2','0');

INSERT INTO utente(idPersona,username,password,eliminato) VALUES('1','renata','7d93cd2d915681d2c0d8c0cd916366a5','0');
INSERT INTO utente(idPersona,username,password,eliminato) VALUES('2','fabrizio','7d93cd2d915681d2c0d8c0cd916366a5','0');