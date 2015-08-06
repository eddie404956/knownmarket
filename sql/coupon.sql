CREATE TABLE `coupon` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `code` varchar(45) DEFAULT NULL COMMENT '优惠码\n',
  `deadline` varchar(45) DEFAULT NULL COMMENT '有效期',
  `limit` varchar(45) DEFAULT '1' COMMENT '使用次数限制，－1为无限次使用',
  `merchandise_mid` int(11) NOT NULL,
  PRIMARY KEY (`id`,`merchandise_mid`),
  KEY `fk_coupon_merchandise1_idx` (`merchandise_mid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
