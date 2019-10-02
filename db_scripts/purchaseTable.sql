CREATE TABLE `santoshbaghouse`.`purchase` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `purchaseCost` DOUBLE NULL,
  `saleCost` DOUBLE NULL,
  `GST` DOUBLE NULL,
  `discount` DOUBLE NULL,
  `totalSalePrice` DOUBLE NULL,
  `Barcode` VARCHAR(240) NULL,
  `totalQuantity` INT NULL,
  `availableQuantity` INT NULL,
  `DateOfPurchase` DATETIME NULL,
  `DateOfSale` DATETIME NULL,
  `brandId` INT NULL,
  `categoryId` INT NULL,
  `size` VARCHAR(10) NULL,
  `color` VARCHAR(45) NULL,
  PRIMARY KEY (`id`),
  
  CONSTRAINT `brandIdFK`
    FOREIGN KEY (`brandId`)
    REFERENCES `santoshbaghouse`.`brand` (`id`),
   
  CONSTRAINT `categoryIdFK`
    FOREIGN KEY (`categoryId`)
    REFERENCES `santoshbaghouse`.`category` (`id`),
   
  CONSTRAINT `sizeFK`
    FOREIGN KEY (`size`)
    REFERENCES `santoshbaghouse`.`size` (`name`),
   
  CONSTRAINT `colorFK`
    FOREIGN KEY (`color`)
    REFERENCES `santoshbaghouse`.`color` (`name`)
   ;
