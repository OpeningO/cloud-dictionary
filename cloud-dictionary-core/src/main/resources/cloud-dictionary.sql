/*
 Navicat Premium Data Transfer

 Source Server         : local
 Source Server Type    : MariaDB
 Source Server Version : 100509
 Source Host           : localhost:3306
 Source Schema         : cloud-dictionary

 Target Server Type    : MariaDB
 Target Server Version : 100509
 File Encoding         : 65001

 Date: 20/07/2021 15:56:05
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_application
-- ----------------------------
DROP TABLE IF EXISTS `t_application`;
CREATE TABLE `t_application` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL COMMENT '名称',
  `code` varchar(100) NOT NULL COMMENT '编码',
  `extra` tinytext DEFAULT NULL COMMENT '扩展信息',
  `create_time` datetime NOT NULL DEFAULT current_timestamp(),
  `update_time` datetime NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  PRIMARY KEY (`id`),
  UNIQUE KEY `name` (`name`),
  UNIQUE KEY `code` (`code`),
  KEY `create_time` (`create_time`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='应用';

-- ----------------------------
-- Table structure for t_business
-- ----------------------------
DROP TABLE IF EXISTS `t_business`;
CREATE TABLE `t_business` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `application_id` int(10) unsigned NOT NULL COMMENT '应用id',
  `application_code` varchar(100) NOT NULL COMMENT '应用编码',
  `name` varchar(50) NOT NULL COMMENT '名称',
  `code` varchar(100) NOT NULL COMMENT '编码',
  `extra` tinytext DEFAULT NULL COMMENT '扩展信息',
  `create_time` datetime NOT NULL DEFAULT current_timestamp(),
  `update_time` datetime NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE KEY `code` (`code`),
  KEY `application_id` (`application_id`),
  KEY `application_code` (`application_code`),
  KEY `create_time` (`create_time`),
  KEY `name` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='业务信息';

-- ----------------------------
-- Table structure for t_dictionary
-- ----------------------------
DROP TABLE IF EXISTS `t_dictionary`;
CREATE TABLE `t_dictionary` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `application_id` int(10) unsigned NOT NULL COMMENT '应用id',
  `application_code` varchar(100) NOT NULL COMMENT '应用编码',
  `business_id` int(10) unsigned NOT NULL COMMENT '业务id',
  `business_code` varchar(100) NOT NULL COMMENT '业务编码',
  `name` varchar(50) NOT NULL COMMENT '名称',
  `code` varchar(100) NOT NULL COMMENT '编码',
  `type` tinyint(4) unsigned NOT NULL COMMENT '类型，1=dictionary，2=tag',
  `extra` tinytext DEFAULT NULL COMMENT '扩展信息',
  `create_time` datetime NOT NULL DEFAULT current_timestamp(),
  `update_time` datetime NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE KEY `code` (`code`),
  KEY `application_id` (`application_id`),
  KEY `application_code` (`application_code`),
  KEY `business_id` (`business_id`),
  KEY `business_code` (`business_code`),
  KEY `create_time` (`create_time`),
  KEY `name` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='词典';

-- ----------------------------
-- Table structure for t_dictionary_property
-- ----------------------------
DROP TABLE IF EXISTS `t_dictionary_property`;
CREATE TABLE `t_dictionary_property` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `dictionary_id` int(10) NOT NULL COMMENT '词典id',
  `dictionary_code` varchar(100) NOT NULL COMMENT '词典编码',
  `name` varchar(50) NOT NULL COMMENT '名称',
  `code` varchar(100) NOT NULL COMMENT '编码',
  `value` varchar(255) NOT NULL COMMENT '取值',
  `extra` tinytext DEFAULT NULL COMMENT '扩展信息',
  `create_time` datetime NOT NULL DEFAULT current_timestamp(),
  `update_time` datetime NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE KEY `code` (`code`),
  KEY `dictionary_id` (`dictionary_id`),
  KEY `dictionary_code` (`dictionary_code`),
  KEY `create_time` (`create_time`),
  KEY `name` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='词典属性';

SET FOREIGN_KEY_CHECKS = 1;
