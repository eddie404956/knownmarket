CREATE TABLE `order` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `createtime` datetime DEFAULT NULL,
  `producer` varchar(45) DEFAULT NULL,
  `customer` varchar(45) DEFAULT NULL,
  `merchandise_mid` int(11) NOT NULL,
  `coupon_idcoupon` int(11) NOT NULL,
  `coupon_merchandise_mid` int(11) NOT NULL,
  `price_idprice` int(11) NOT NULL,
  `price_merchandise_mid` int(11) NOT NULL,
  PRIMARY KEY (`id`,`merchandise_mid`,`coupon_idcoupon`,`coupon_merchandise_mid`,`price_idprice`,`price_merchandise_mid`),
  KEY `fk_order_merchandise1_idx` (`merchandise_mid`),
  KEY `fk_order_coupon1_idx` (`coupon_idcoupon`,`coupon_merchandise_mid`),
  KEY `fk_order_price1_idx` (`price_idprice`,`price_merchandise_mid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
