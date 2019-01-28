DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'プライマリーキー',
  `name` varchar(32) DEFAULT NULL COMMENT 'ユーザーID',
  `password` varchar(32) DEFAULT NULL COMMENT 'パスワード',
  `age`  int DEFAULT NULL COMMENT '年齢',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;