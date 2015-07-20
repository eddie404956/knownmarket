drop table if exists `order`;
CREATE TABLE IF NOT EXISTS `order` (
  `id` INT NOT NULL COMMENT '',
  `createtime` DATETIME NULL COMMENT '',
  `producer` VARCHAR(45) NULL COMMENT '',
  `customer` VARCHAR(45) NULL COMMENT '',
  `merchandise_mid` INT NOT NULL COMMENT '',
  `coupon_idcoupon` INT NOT NULL COMMENT '',
  `coupon_merchandise_mid` INT NOT NULL COMMENT '',
  `price_idprice` INT NOT NULL COMMENT '',
  `price_merchandise_mid` INT NOT NULL COMMENT '',
  PRIMARY KEY (`idorder`, `merchandise_mid`, `coupon_idcoupon`, `coupon_merchandise_mid`, `price_idprice`, `price_merchandise_mid`)  COMMENT '',
  INDEX `fk_order_merchandise1_idx` (`merchandise_mid` ASC)  COMMENT '',
  INDEX `fk_order_coupon1_idx` (`coupon_idcoupon` ASC, `coupon_merchandise_mid` ASC)  COMMENT '',
  INDEX `fk_order_price1_idx` (`price_idprice` ASC, `price_merchandise_mid` ASC)  COMMENT '',
  CONSTRAINT `fk_order_merchandise1`
    FOREIGN KEY (`merchandise_mid`)
    REFERENCES `merchandise` (`mid`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_order_coupon1`
    FOREIGN KEY (`coupon_idcoupon` , `coupon_merchandise_mid`)
    REFERENCES `coupon` (`idcoupon` , `merchandise_mid`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_order_price1`
    FOREIGN KEY (`price_idprice` , `price_merchandise_mid`)
    REFERENCES `price` (`idprice` , `merchandise_mid`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB