/*
 Navicat Premium Data Transfer

 Source Server         : 本地数据库
 Source Server Type    : MySQL
 Source Server Version : 80028 (8.0.28)
 Source Host           : localhost:3306
 Source Schema         : maven

 Target Server Type    : MySQL
 Target Server Version : 80028 (8.0.28)
 File Encoding         : 65001

 Date: 12/12/2022 14:29:59
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for course
-- ----------------------------
DROP TABLE IF EXISTS `course`;
CREATE TABLE `course`  (
  `id` int NOT NULL AUTO_INCREMENT COMMENT 'id',
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '课程名',
  `t_id` int NULL DEFAULT NULL COMMENT '授课老师id',
  `time` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '上课时间',
  `location` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '上课地点',
  `week` int NULL DEFAULT NULL COMMENT '周数',
  `type` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '课程类型',
  `credit` int NULL DEFAULT NULL COMMENT '学分',
  `number` int NULL DEFAULT NULL COMMENT '选课人数',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 15 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '课程表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of course
-- ----------------------------
INSERT INTO `course` VALUES (1, 'Java', 1, '周一', '六教', 18, '必修', 3, 3);
INSERT INTO `course` VALUES (2, 'Python', 2, '周二', '六教', 17, '选修', 2, 3);
INSERT INTO `course` VALUES (4, 'C', 3, '周三', '六教', 9, '选修', 1, 1);
INSERT INTO `course` VALUES (5, 'Jesus Mendoza', 739, 'third', '六教', 8, '必修', 2, 1);
INSERT INTO `course` VALUES (6, 'Tang Lan', 549, 'first', '六教', 13, '必修', 1, 1);
INSERT INTO `course` VALUES (7, 'Linda Lee', 896, 'third', '六教', 10, '选修', 2, 0);
INSERT INTO `course` VALUES (8, 'Liu Xiaoming', 918, 'second', '六教', 8, '选修', 1, 0);
INSERT INTO `course` VALUES (9, 'Nomura Takuya', 55, 'third', '六教', 11, '选修', 2, 0);
INSERT INTO `course` VALUES (10, 'Yan Zitao', 86, 'second', '六教', 10, '必修', 1, 0);
INSERT INTO `course` VALUES (11, 'Jiang Xiaoming', 272, 'first', '六教', 16, '必修', 1, 0);
INSERT INTO `course` VALUES (12, 'Takada Miu', 152, 'third', '六教', 2, '选修', 1, 0);
INSERT INTO `course` VALUES (13, 'Jonathan King', 244, 'second', '六教', 1, '必修', 1, 0);
INSERT INTO `course` VALUES (14, 'Eva Fisher', 174, 'first', '六教', 17, '选修', 2, 0);

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student`  (
  `id` int NOT NULL AUTO_INCREMENT COMMENT 'id',
  `u_id` int NULL DEFAULT NULL COMMENT '登录账号id',
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '姓名',
  `number` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '学号',
  `profession` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '专业',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '学生表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES (1, 3, '小明', '100231', '软件工程');
INSERT INTO `student` VALUES (2, NULL, '小红', '10024', '大数据');
INSERT INTO `student` VALUES (5, NULL, '超远', '0000000', '博士');
INSERT INTO `student` VALUES (6, NULL, '苏禾', '1', '2');
INSERT INTO `student` VALUES (7, NULL, '1', NULL, NULL);

-- ----------------------------
-- Table structure for student_course
-- ----------------------------
DROP TABLE IF EXISTS `student_course`;
CREATE TABLE `student_course`  (
  `id` int NOT NULL AUTO_INCREMENT COMMENT 'id',
  `c_id` int NULL DEFAULT NULL COMMENT '课程id',
  `s_id` int NULL DEFAULT NULL COMMENT '学生id',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 10 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '选课表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of student_course
-- ----------------------------
INSERT INTO `student_course` VALUES (1, 1, 1);
INSERT INTO `student_course` VALUES (2, 1, 2);
INSERT INTO `student_course` VALUES (3, 2, 1);
INSERT INTO `student_course` VALUES (4, 2, 2);
INSERT INTO `student_course` VALUES (5, 1, 3);
INSERT INTO `student_course` VALUES (6, 4, 3);
INSERT INTO `student_course` VALUES (7, 5, 3);
INSERT INTO `student_course` VALUES (8, 6, 3);
INSERT INTO `student_course` VALUES (9, 2, 3);

-- ----------------------------
-- Table structure for teacher
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher`  (
  `id` int NOT NULL AUTO_INCREMENT COMMENT 'id',
  `u_id` int NULL DEFAULT NULL COMMENT '登录账号id',
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '姓名',
  `sex` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '性别',
  `age` int NULL DEFAULT NULL COMMENT '年龄',
  `education` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '学历',
  `title` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '职称',
  `entry_time` date NULL DEFAULT NULL COMMENT '入职时间',
  `college` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '学院',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '老师表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of teacher
-- ----------------------------
INSERT INTO `teacher` VALUES (1, 2, '张三', '男', 31, '本科', '教师', '2022-12-09', '数信学院');
INSERT INTO `teacher` VALUES (2, NULL, '李四', '女', 40, '研究生', '教授', '2032-12-05', '历史学院');
INSERT INTO `teacher` VALUES (3, NULL, 'amy1', '女', 12, '11', '搜索', '2022-12-09', '大学');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `username` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户名',
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '密码',
  `identity` int NULL DEFAULT NULL COMMENT '身份#0:管理员#1:教师#2:学生',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 'admin', '1', 0);
INSERT INTO `user` VALUES (2, '1', '1', 1);
INSERT INTO `user` VALUES (3, '55400', '1', 2);

SET FOREIGN_KEY_CHECKS = 1;
