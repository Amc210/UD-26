DROP TABLE IF EXISTS cientificos;
DROP TABLE IF EXISTS proyecto;
DROP TABLE IF EXISTS AsignadoA;

create database cientificosUD26;
use cientificos;

CREATE TABLE cientificos(
dni int PRIMARY KEY,
nombre VARCHAR(255));

CREATE TABLE proyectos(
id int PRIMARY KEY auto_increment,
nombre VARCHAR(255),
horas int);

CREATE TABLE AsignadoA(
id int(11) auto_increment not null,
cientifico int,
proyecto char(4),
PRIMARY KEY (id),
FOREIGN KEY (cientifico) REFERENCES cientificos (dni) ON DELETE CASCADE ON UPDATE CASCADE,
FOREIGN KEY (proyecto) REFERENCES proyectos(id) ON DELETE CASCADE ON UPDATE CASCADE
);

insert into cientificos (dni, nombre) values (25545, 'Aaa');
insert into cientificos (dni, nombre) values (654645, 'Ooo');
insert into cientificos (dni, nombre) values (757867, 'Eee');
insert into cientificos (dni, nombre) values (9765, 'Iii');

insert into proyectos (id, nombre, horas) values (1, 'p1', 33);
insert into proyectos (id, nombre, horas) values (2,'p2', 65);
insert into proyectos (id, nombre, horas) values (3,'p3', 85);
insert into proyectos (id, nombre, horas) values (4,'p4', 78);

insert into AsignadoA (id, cientifico, proyecto) values (1, 25545, 4);
insert into AsignadoA (id, cientifico, proyecto) values (2, 654645, 3);
insert into AsignadoA (id, cientifico, proyecto) values (3, 757867, 2);
insert into AsignadoA (id, cientifico, proyecto) values (4, 9765, 1);