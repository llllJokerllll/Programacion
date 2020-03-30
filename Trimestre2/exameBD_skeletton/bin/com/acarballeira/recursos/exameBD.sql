DROP DATABASE IF EXISTS examebd;
CREATE DATABASE examebd CHARACTER SET = utf8 COLLATE = utf8_bin;
USE examebd;
create table usuario (
	id int NOT NULL AUTO_INCREMENT,
    nome varchar(50) NOT NULL,
    email varchar(200) NOT NULL,
    rol int(4) NOT NULL,
	PRIMARY KEY (id)
) AUTO_INCREMENT = 5;