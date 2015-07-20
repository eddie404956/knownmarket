drop table if exists `subscribe`;
CREATE TABLE IF NOT EXISTS `subscribe` (
  `id` INT NOT NULL COMMENT '',
  `merchandise_mid` INT NOT NULL COMMENT '',
  `user_userid` INT NOT NULL COMMENT '',
  `deadline` DATETIME NULL COMMENT '',
  `hassend` VARCHAR(45) NULL COMMENT '是否需要发送更新\n',
  PRIMARY KEY (`idsubscribe`, `merchandise_mid`, `user_userid`)  COMMENT '',
  INDEX `fk_subscribe_merchandise1_idx` (`merchandise_mid` ASC)  COMMENT '',
  INDEX `fk_subscribe_user1_idx` (`user_userid` ASC)  COMMENT '',
  CONSTRAINT `fk_subscribe_merchandise1`
    FOREIGN KEY (`merchandise_mid`)
    REFERENCES `merchandise` (`mid`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_subscribe_user1`
    FOREIGN KEY (`user_userid`)
    REFERENCES `user` (`userid`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB