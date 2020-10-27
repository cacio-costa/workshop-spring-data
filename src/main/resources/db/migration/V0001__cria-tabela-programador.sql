 CREATE TABLE programador (
  id bigint NOT NULL AUTO_INCREMENT,
  especialidade varchar(255) DEFAULT NULL,
  linguagem varchar(255) DEFAULT NULL,
  nascimento date DEFAULT NULL,
  nome varchar(255) DEFAULT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;