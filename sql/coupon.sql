drop table if exists `coupon`;
CREATE TABLE IF NOT EXISTS `coupon` (
  `id` INT NOT NULL COMMENT '',
  `code` VARCHAR(45) NULL COMMENT '优惠码\n',
  `deadline` VARCHAR(45) NULL COMMENT '有效期',
  `limit` VARCHAR(45) NULL DEFAULT '1' COMMENT '使用次数限制，－1为无限次使用',
  `merchandise_mid` INT NOT NULL COMMENT '',
  PRIMARY KEY (`idcoupon`, `merchandise_mid`)  COMMENT '',
  INDEX `fk_coupon_merchandise1_idx` (`merchandise_mid` ASC)  COMMENT '',
  CONSTRAINT `fk_coupon_merchandise1`
    FOREIGN KEY (`merchandise_mid`)
    REFERENCES `merchandise` (`mid`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB