CREATE TABLE `subscribe` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `merchandise_mid` int(11) NOT NULL,
  `user_userid` int(11) NOT NULL,
  `deadline` datetime DEFAULT NULL,
  `hassend` varchar(45) DEFAULT NULL COMMENT '是否需要发送更新\n',
  PRIMARY KEY (`id`,`merchandise_mid`,`user_userid`),
  KEY `fk_subscribe_merchandise1_idx` (`merchandise_mid`),
  KEY `fk_subscribe_user1_idx` (`user_userid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
