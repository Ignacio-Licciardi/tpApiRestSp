# tpApiRestSp

***TRABAJO-PRACTICO-DDS-IgnacioLicciardi***

-------------------------------------------------------

Datos para insertar manualmente en H2

INSERT INTO localidad (denominacion) VALUES ('Buenos Aires');
INSERT INTO localidad (denominacion) VALUES ('Cordoba');

INSERT INTO autor (apellido, nombre, biografia) VALUES ('Garcia Marquez', 'Gabriel', 'Escritor colombiano ...');
INSERT INTO autor (apellido, nombre, biografia) VALUES ('Borges', 'Jorge Luis', 'Escritor argentino ...');

INSERT INTO libro (fecha, genero, paginas, titulo) VALUES ('2023-01-01', 'Ficción', 250, 'Cien años de soledad');
INSERT INTO libro (fecha, genero, paginas, titulo) VALUES ('2023-02-01', 'Poesía', 150, 'Fervor de Buenos Aires');

INSERT INTO domicilio (calle, numero, fk_localidad) VALUES ('Santa Fe', 1234, 1);
INSERT INTO domicilio (calle, numero, fk_localidad) VALUES ('Colon', 5678, 2);

INSERT INTO persona (nombre, apellido, dni, fk_domicilio) VALUES ('Juan', 'Perez', 12345678, 1);
INSERT INTO persona (nombre, apellido, dni, fk_domicilio) VALUES ('Marta', 'Rodriguez', 87654321, 2);

-------------------------------------------------------
