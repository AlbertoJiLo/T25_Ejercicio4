
DROP table IF EXISTS salas;
DROP table IF EXISTS peliculas;

create table peliculas(
	id int auto_increment PRIMARY KEY,
	nombre varchar(100),
    calificacion_edad int
	);

create table salas(
	id int auto_increment PRIMARY KEY,
	nombre varchar(100),
	pelicula_id INT,
    FOREIGN KEY (pelicula_id) REFERENCES peliculas(id) ON DELETE CASCADE ON UPDATE CASCADE 
    );
    


insert into peliculas (nombre,calificacion_edad) values('Scott Pilgrim vs the world', '16');
insert into peliculas (nombre,calificacion_edad) values('Iron Man', '12');
insert into peliculas (nombre,calificacion_edad) values('Saw', '18');
insert into peliculas (nombre,calificacion_edad) values('Bob Esponja', '7');
insert into peliculas (nombre,calificacion_edad) values('Harry Potter', '12');


insert into salas (nombre, pelicula_id) values('Sala 1','1');
insert into salas (nombre, pelicula_id) values('Sala 2','2');
insert into salas (nombre, pelicula_id) values('Sala 3','4');
insert into salas (nombre, pelicula_id) values('Sala 4','5');
insert into salas (nombre, pelicula_id) values('Sala 5','3');


