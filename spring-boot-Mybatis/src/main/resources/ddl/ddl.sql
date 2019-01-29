DROP TABLE IF EXISTS `mybatis`;
CREATE TABLE `mybatis` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'プライマリーキー',
  `userName` varchar(32) DEFAULT NULL COMMENT 'ユーザーネーム',
  `passWord` varchar(32) DEFAULT NULL COMMENT 'パスワード',
  `user_sex` varchar(32) DEFAULT NULL COMMENT '性別',
  `nick_name` varchar(32) DEFAULT NULL COMMENT 'ニックネーム',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;