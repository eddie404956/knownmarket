
CREATE TABLE IF NOT EXISTS `product` (
  `id` INT NOT NULL COMMENT '',
  `product` BLOB NULL COMMENT '',
  `createtime` DATETIME NULL COMMENT '',
  `merchandise_mid` INT NOT NULL COMMENT '',
  `activeCode` VARCHAR(45) NULL COMMENT '激活码 ',
  PRIMARY KEY (`id`, `merchandise_mid`)  COMMENT '',
  INDEX `fk_product_merchandise1_idx` (`merchandise_mid` ASC)  COMMENT ''
  )
ENGINE = InnoDB