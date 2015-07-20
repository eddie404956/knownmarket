drop table if exists `useruser`;
CREATE TABLE IF NOT EXISTS `user` (
  `id` INT NOT NULL COMMENT '',
  `username` VARCHAR(45) NOT NULL COMMENT '用户名',
  `password` VARCHAR(45) CHARACTER SET 'utf8mb4' NOT NULL COMMENT '用户密码',
  `email` VARCHAR(45) NULL COMMENT '用户邮箱，用来接收验证信息，接收更新',
  `alipay` VARCHAR(45) NULL COMMENT '用户的支付宝账号',
  `balance` DOUBLE NULL COMMENT '用户的账户余额',
  `gender` VARCHAR(10) NULL COMMENT '性别',
  `birthday` VARCHAR(45) NULL COMMENT '出生年月yyyymm',
  `isvalid` VARCHAR(10) NULL DEFAULT 'false' COMMENT '是否通过邮箱验证',
  PRIMARY KEY (`userid`)  COMMENT '')
ENGINE = InnoDB