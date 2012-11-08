-- *******************************************************************
-- *       Database schema for springhibernate example project       *
-- *******************************************************************

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL';

SET @Database_version  = '0.1';

CREATE SCHEMA IF NOT EXISTS `springhibernate` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ;
SHOW WARNINGS;

USE `springhibernate`;

-- -----------------------------------------------------
-- Table `springhibernate`.`database`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `database` (
  `id` INT UNSIGNED NOT NULL AUTO_INCREMENT ,
  `version` VARCHAR(20) NOT NULL ,
  PRIMARY KEY (`Id`) )
CHARACTER SET utf8 COLLATE utf8_general_ci
ENGINE = InnoDB;
SHOW WARNINGS;

INSERT INTO `database` (`version`) VALUES(@Database_version);

COMMIT;

-- -----------------------------------------------------
-- Table `springhibernate`.`user`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `user` (
  `id` INT UNSIGNED NOT NULL AUTO_INCREMENT ,
  `login` VARCHAR(20) NOT NULL ,
  `password` CHAR(32) NOT NULL ,
  `lastName` VARCHAR(50) NOT NULL ,
  `firstName` VARCHAR(50) NOT NULL ,
  `email` VARCHAR(100) NOT NULL ,
  PRIMARY KEY (`Id`) )
CHARACTER SET utf8 COLLATE utf8_general_ci
ENGINE = InnoDB;
SHOW WARNINGS;