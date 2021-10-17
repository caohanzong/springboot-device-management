CREATE DATABASE `easy`

USE `easy`

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`(
    `username` VARCHAR(32) NOT NULL,
    `password` VARCHAR(32) NOT NULL
)DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `borrower`;
CREATE TABLE `borrower`(
    `id` INT(6) NOT NULL AUTO_INCREMENT,
    `borrowerName` VARCHAR(32) NOT NULL,
    PRIMARY KEY(`id`)
)DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `equip`;
CREATE TABLE `equip`(
    `id` INT(6) NOT NULL AUTO_INCREMENT,
    `name` VARCHAR(32) NOT NULL,
    `serial` INT(6) NOT NULL,
    `state` INT(6) NOT NULL,
    `borrower` VARCHAR(32) NOT NULL,
    `date`  VARCHAR(32) NOT NULL,
    PRIMARY KEY(`id`)
)DEFAULT CHARSET=utf8;


INSERT  INTO `user`(`username`,`password`) VALUES ('admin','123456');

INSERT INTO `borrower`(`id`,`borrowerName`) VALUES (001,'uzi');
INSERT INTO `borrower`(`id`,`borrowerName`) VALUES (002,'lwx');
INSERT INTO `borrower`(`id`,`borrowerName`) VALUES (003,'灯红酒绿');

INSERT INTO `easy`.`equip` (`id`, `name`, `serial`, `state`, `borrower`, `date`) VALUES ('1', '设备1', '195778', '0', 'uzi', '2001-01-01');
INSERT INTO `easy`.`equip` (`id`, `name`, `serial`, `state`, `borrower`, `date`) VALUES ('2', 'y7000p', '000001', '1', '灯红酒绿', '2020-02-02');
INSERT INTO `easy`.`equip` (`id`, `name`, `serial`, `state`, `borrower`, `date`) VALUES ('3', '飞机', '345345', '1', 'lwx', '1999-07-21');
INSERT INTO `easy`.`equip` (`id`, `name`, `serial`, `state`, `borrower`, `date`) VALUES ('4', '打印机', '55', '1', 'lwx', '2011-05-11');
INSERT INTO `easy`.`equip` (`id`, `name`, `serial`, `state`, `borrower`, `date`) VALUES ('5', '飞行堡垒', '45235', '0', 'uzi', '2021-10-17');
INSERT INTO `easy`.`equip` (`id`, `name`, `serial`, `state`, `borrower`, `date`) VALUES ('6', '罗技', '89769', '0', '灯红酒绿', '2019-01-01');