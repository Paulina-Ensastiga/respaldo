-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`User`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`User` (
  `user_id` INT NOT NULL AUTO_INCREMENT,
  `username` VARCHAR(25) NOT NULL,
  `passwor` VARCHAR(30) NOT NULL,
  `rol` VARCHAR(20) NOT NULL,
  PRIMARY KEY (`user_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Genre`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Genre` (
  `genere_id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(35) NOT NULL)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`book`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`book` (
  `book_id` INT NOT NULL AUTO_INCREMENT,
  `tittle` VARCHAR(250) NOT NULL,
  `isbn` VARCHAR(20) NOT NULL,
  `publis_date` DATE NOT NULL,
  `Genre_genere_id` INT NOT NULL,
  `stock` TINYINT ZEROFILL NOT NULL,
  PRIMARY KEY (`book_id`),
  INDEX `fk_book_Genre1_idx` (`Genre_genere_id` ASC) VISIBLE,
  CONSTRAINT `fk_book_Genre1`
    FOREIGN KEY (`Genre_genere_id`)
    REFERENCES `mydb`.`Genre` (`genere_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`author`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`author` (
  `author_id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(100) NOT NULL,
  `birtdate` DATE NOT NULL,
  `nationality` VARCHAR(70) NOT NULL,
  PRIMARY KEY (`author_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`author_has_book`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`author_has_book` (
  `author_author_id` INT NOT NULL,
  `book_book_id` INT NOT NULL,
  INDEX `fk_author_has_book_book1_idx` (`book_book_id` ASC) VISIBLE,
  INDEX `fk_author_has_book_author_idx` (`author_author_id` ASC) VISIBLE,
  CONSTRAINT `fk_author_has_book_author`
    FOREIGN KEY (`author_author_id`)
    REFERENCES `mydb`.`author` (`author_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_author_has_book_book1`
    FOREIGN KEY (`book_book_id`)
    REFERENCES `mydb`.`book` (`book_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`User_has_book`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`User_has_book` (
  `User_user_id` INT NOT NULL,
  `book_book_id` INT NOT NULL,
  PRIMARY KEY (`User_user_id`, `book_book_id`),
  INDEX `fk_User_has_book_book1_idx` (`book_book_id` ASC) VISIBLE,
  INDEX `fk_User_has_book_User1_idx` (`User_user_id` ASC) VISIBLE,
  CONSTRAINT `fk_User_has_book_User1`
    FOREIGN KEY (`User_user_id`)
    REFERENCES `mydb`.`User` (`user_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_User_has_book_book1`
    FOREIGN KEY (`book_book_id`)
    REFERENCES `mydb`.`book` (`book_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
