drop table if exists `merchandise`;
CREATE TABLE IF NOT EXISTS `merchandise` (
  `mid` INT NOT NULL COMMENT '',
  `name` VARCHAR(45) NOT NULL COMMENT '',
  `description` VARCHAR(256) NULL COMMENT '',
  `authorid` VARCHAR(45) NULL COMMENT '商品作者的id，为userid',
  `byproduct` INT NULL COMMENT '',
  `lastest_product` INT NULL COMMENT '最新的产品',
  `is_friend` VARCHAR(45) NULL DEFAULT 'false' COMMENT '\'是否会员赞助产品\'',
  PRIMARY KEY (`mid`)  COMMENT '')
ENGINE = InnoDB