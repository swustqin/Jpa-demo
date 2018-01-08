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

 Date: 01/08/2018 23:12:44 PM
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `t_user`
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `sex` varchar(20) DEFAULT NULL,
  `region` int(11) NOT NULL,
  PRIMARY KEY (`id`,`region`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `t_user`
-- ----------------------------
BEGIN;
INSERT INTO `t_user` VALUES ('1', '张三', '20', '男', '10001'), ('2', '李四', '30', '男', '10002');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
