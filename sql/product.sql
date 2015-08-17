CREATE TABLE `product` (
  `product_id` int(11) NOT NULL,
  `product` blob,
  `createtime` datetime DEFAULT NULL,
  `merchandise_mid` int(11) NOT NULL,
  `activecode` varchar(45) DEFAULT NULL COMMENT '激活码 ',
  PRIMARY KEY (`product_id`,`merchandise_mid`),
  KEY `fk_product_merchandise1_idx` (`merchandise_mid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
