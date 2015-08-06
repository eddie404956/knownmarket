CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(45) NOT NULL COMMENT '用户名',
  `password` varchar(45) CHARACTER SET utf8mb4 NOT NULL COMMENT '用户密码',
  `email` varchar(45) DEFAULT NULL COMMENT '用户邮箱，用来接收验证信息，接收更新',
  `alipay` varchar(45) DEFAULT NULL COMMENT '用户的支付宝账号',
  `balance` double DEFAULT NULL COMMENT '用户的账户余额',
  `gender` varchar(10) DEFAULT NULL COMMENT '性别',
  `birthday` varchar(45) DEFAULT NULL COMMENT '出生年月yyyymm',
  `isvalid` varchar(10) DEFAULT 'false' COMMENT '是否通过邮箱验证',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
