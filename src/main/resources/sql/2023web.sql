/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 80032
 Source Host           : localhost:3306
 Source Schema         : 2023web

 Target Server Type    : MySQL
 Target Server Version : 80032
 File Encoding         : 65001

 Date: 06/01/2024 21:39:12
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for course
-- ----------------------------
DROP TABLE IF EXISTS `course`;
CREATE TABLE `course`  (
  `number` smallint(0) NOT NULL,
  `name` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL,
  `time` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL,
  `teacher` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL,
  `username` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL,
  `score` smallint(0) NULL DEFAULT NULL,
  PRIMARY KEY (`number`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of course
-- ----------------------------
INSERT INTO `course` VALUES (101, 'Web框架', '周一五六节', '王树刚', '123456789', 3);
INSERT INTO `course` VALUES (102, '人工智能', '周二一二节', '刘老师', NULL, 3);
INSERT INTO `course` VALUES (103, '机器学习', '周三三四节', '李老师', NULL, 3);

-- ----------------------------
-- Table structure for sc
-- ----------------------------
DROP TABLE IF EXISTS `sc`;
CREATE TABLE `sc`  (
  `username` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL,
  `number` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL,
  `name` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL,
  `time` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL,
  `teacher` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL,
  `score1` int(0) NULL DEFAULT NULL,
  `score2` int(0) NULL DEFAULT NULL,
  `state` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL,
  `studentname` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL,
  `teachernumber` int(0) NULL DEFAULT NULL,
  INDEX `number`(`number`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sc
-- ----------------------------
INSERT INTO `sc` VALUES ('100000001', '103', '机器学习', '周三三四节', '李老师', 3, NULL, NULL, '郑狗强', NULL);
INSERT INTO `sc` VALUES ('100000001', '102', '人工智能', '周二一二节', '刘老师', 3, NULL, NULL, '郑狗强', NULL);
INSERT INTO `sc` VALUES ('100000001', '101', 'Web框架', '周一五六节', '王树刚', 3, 100, '初修', '郑狗强', 123456789);

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `username` char(9) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL,
  `password` char(20) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL,
  `identity` char(20) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`username`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('100000001', '123456', 'student');
INSERT INTO `user` VALUES ('123456781', '123456', 'manager');
INSERT INTO `user` VALUES ('123456789', '123456', 'teacher');

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users`  (
  `username` char(9) CHARACTER SET utf32 COLLATE utf32_general_ci NOT NULL,
  `Sname` char(20) CHARACTER SET utf32 COLLATE utf32_general_ci NULL DEFAULT NULL,
  `Ssex` char(2) CHARACTER SET utf32 COLLATE utf32_general_ci NULL DEFAULT NULL,
  `Sage` smallint(0) NULL DEFAULT NULL,
  `college` char(20) CHARACTER SET utf32 COLLATE utf32_general_ci NULL DEFAULT NULL,
  `phone` varchar(255) CHARACTER SET utf32 COLLATE utf32_general_ci NULL DEFAULT NULL,
  `identity` varchar(255) CHARACTER SET utf32 COLLATE utf32_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`username`) USING BTREE,
  INDEX `Sdept`(`college`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf32 COLLATE = utf32_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES ('100000001', '郑狗强', '狗', 19, '信息科学与工程学部', '15954820361', 'student');
INSERT INTO `users` VALUES ('123456781', '王祥老祖', '男', 20, '信息科学与工程学部', '123457689', 'manager');
INSERT INTO `users` VALUES ('123456789', '张树刚', '男', 20, '信息科学与工程学部', '13654462493', 'teacher');

SET FOREIGN_KEY_CHECKS = 1;
