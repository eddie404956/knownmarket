drop table if exists `product`;
CREATE TABLE IF NOT EXISTS `product` (
  `id` INT NOT NULL COMMENT '',
  `product` BLOB NULL COMMENT '',
  `createtime` DATETIME NULL COMMENT '',
  `merchandise_mid` INT NOT NULL COMMENT '',
  `activeCode` VARCHAR(45) NULL COMMENT '激活码 ',
  PRIMARY KEY (`idproduct`, `merchandise_mid`)  COMMENT '',
  INDEX `fk_product_merchandise1_idx` (`merchandise_mid` ASC)  COMMENT '',
  CONSTRAINT `fk_product_merchandise1`
    FOREIGN KEY (`merchandise_mid`)
    REFERENCES `merchandise` (`mid`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB