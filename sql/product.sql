CREATE TABLE IF NOT EXISTS `product` (
  `idproduct` INT NOT NULL COMMENT '',
  `product` BLOB NULL COMMENT '',
  `createtime` DATETIME NULL COMMENT '',
  `merchandise_mid` INT NOT NULL COMMENT '',
  PRIMARY KEY (`idproduct`, `merchandise_mid`)  COMMENT '',
  INDEX `fk_product_merchandise1_idx` (`merchandise_mid` ASC)  COMMENT '',
  CONSTRAINT `fk_product_merchandise1`
    FOREIGN KEY (`merchandise_mid`)
    REFERENCES `merchandise` (`mid`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB