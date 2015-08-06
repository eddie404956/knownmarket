CREATE TABLE `merchandise` (
  `mid` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `description` varchar(256) DEFAULT NULL,
  `authorid` varchar(45) DEFAULT NULL COMMENT '商品作者的id，为userid',
  `byproduct` int(11) DEFAULT NULL,
  `lastest_product` int(11) DEFAULT NULL COMMENT '最新的产品',
  `is_friend` varchar(45) DEFAULT 'false' COMMENT '''是否会员赞助产品''',
  PRIMARY KEY (`mid`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;
