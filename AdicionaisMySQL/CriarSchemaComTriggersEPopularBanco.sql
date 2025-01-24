-- MySQL Workbench Synchronization
-- Generated: 2025-01-24 17:07
-- Model: New Model
-- Version: 1.0
-- Project: Name of the project
-- Author: Felip

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

CREATE SCHEMA IF NOT EXISTS `sistema_registro` DEFAULT CHARACTER SET utf8 ;

CREATE TABLE IF NOT EXISTS `sistema_registro`.`livro` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `titulo` VARCHAR(150) NOT NULL,
  `autor` VARCHAR(150) NOT NULL,
  `editora` VARCHAR(150) NOT NULL,
  `quantidade` INT(11) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `sistema_registro`.`usuario` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `login` VARCHAR(150) NOT NULL,
  `senha` VARCHAR(150) NOT NULL,
  `pessoa_id` INT(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_usuario_pessoa1_idx` (`pessoa_id` ) ,
  CONSTRAINT `fk_usuario_pessoa1`
    FOREIGN KEY (`pessoa_id`)
    REFERENCES `sistema_registro`.`pessoa` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `sistema_registro`.`pessoa` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(150) NOT NULL,
  `idade` INT(11) NOT NULL,
  `endereco` VARCHAR(150) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `sistema_registro`.`emprestimo` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `id_pessoa` INT(11) NOT NULL,
  `id_livro` INT(11) NOT NULL,
  `data_emprestimo` VARCHAR(50) NOT NULL,
  `data_devolucao` VARCHAR(50) NOT NULL,
  PRIMARY KEY (`id`, `id_pessoa`, `id_livro`),
  INDEX `fk_livro_has_pessoa_pessoa1_idx` (`id_pessoa` ) ,
  INDEX `fk_livro_has_pessoa_livro_idx` (`id_livro` ) ,
  CONSTRAINT `fk_livro_has_pessoa_livro`
    FOREIGN KEY (`id_livro`)
    REFERENCES `sistema_registro`.`livro` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_livro_has_pessoa_pessoa1`
    FOREIGN KEY (`id_pessoa`)
    REFERENCES `sistema_registro`.`pessoa` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


DELIMITER $$

USE `sistema_registro`$$
CREATE DEFINER=`root`@`localhost` TRIGGER `sistema_registro`.`emprestimo_BEFORE_INSERT` BEFORE INSERT ON `emprestimo` FOR EACH ROW
BEGIN
	UPDATE livro
    SET quantidade = quantidade - 1
    WHERE id = NEW.id_livro
    AND quantidade > 0;
END$$

USE `sistema_registro`$$
CREATE DEFINER=`root`@`localhost` TRIGGER `sistema_registro`.`emprestimo_AFTER_DELETE` AFTER DELETE ON `emprestimo` FOR EACH ROW
BEGIN
	UPDATE livro
    SET quantidade = quantidade + 1
    WHERE id = OLD.id_livro;
END$$


DELIMITER ;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;


/* Executar após criar banco e tabelas para popular o mesmo.

INSERT INTO usuario(login, senha) VALUES('Felipe','felipe');
INSERT INTO usuario(login, senha) VALUES('a','a');

INSERT INTO pessoa(nome, idade, endereco) VALUES('Felipe',24,'Rua blabla');
INSERT INTO pessoa(nome, idade, endereco) VALUES('Davi',20,'Rua aaaaa');
INSERT INTO pessoa(nome, idade, endereco) VALUES('Lopes',24,'Rua vvvbbbb');

INSERT INTO livro(titulo, autor, editora, quantidade) VALUES('Eu, Robô','Isaac Asimov','Aleph',5);
INSERT INTO livro(titulo, autor, editora, quantidade) VALUES('O Retrato de Dorian Gray','Oscar Wilde','Abril',9);
INSERT INTO livro(titulo, autor, editora, quantidade) VALUES('O Homem do Castelo Alto','Philip K. Dick','Aleph',3);


*/
