/*
 Navicat Premium Data Transfer

 Source Server         : MySql_ZhanShen
 Source Server Type    : MySQL
 Source Server Version : 50536
 Source Host           : 192.168.0.105
 Source Database       : springtest

 Target Server Type    : MySQL
 Target Server Version : 50536
 File Encoding         : utf-8

 Date: 01/08/2018 23:12:30 PM
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `account`
-- ----------------------------
DROP TABLE IF EXISTS `account`;
CREATE TABLE `account` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `money` double DEFAULT NULL,
  `region` int(11) NOT NULL,
  `city` varchar(255) NOT NULL,
  PRIMARY KEY (`id`,`region`,`city`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `account`
-- ----------------------------
BEGIN;
INSERT INTO `account` VALUES ('1', 'tom', '1000', '10001', 'chengdu'), ('1', 'jaden', '1200', '10001', 'guangzhou'), ('2', 'qin', '500', '10002', 'beijing'), ('2', 'zack', '800', '10002', 'shanghai');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
