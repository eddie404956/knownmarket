CREATE TABLE `price` (
  `price_id` int(11) NOT NULL AUTO_INCREMENT,
  `quantity` varchar(45) DEFAULT NULL COMMENT '价格',
  `abidance` varchar(45) DEFAULT NULL COMMENT '持续时间',
  `merchandise_mid` int(11) NOT NULL,
  PRIMARY KEY (`price_id`,`merchandise_mid`),
  KEY `fk_price_merchandise1_idx` (`merchandise_mid`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
