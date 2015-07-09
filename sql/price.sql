CREATE TABLE IF NOT EXISTS `price` (
  `idprice` INT NOT NULL COMMENT '',
  `quantity` VARCHAR(45) NULL COMMENT '价格',
  `abidance` VARCHAR(45) NULL COMMENT '持续时间',
  `merchandise_mid` INT NOT NULL COMMENT '',
  PRIMARY KEY (`idprice`, `merchandise_mid`)  COMMENT '',
  INDEX `fk_price_merchandise1_idx` (`merchandise_mid` ASC)  COMMENT '',
  CONSTRAINT `fk_price_merchandise1`
    FOREIGN KEY (`merchandise_mid`)
    REFERENCES `merchandise` (`mid`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB