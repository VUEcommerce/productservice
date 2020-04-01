use vue;
DROP TABLE IF EXISTS `product_clothes`;
CREATE TABLE `product_clothes` (
  `id` varchar(32) NOT NULL,
  `sku` varchar(32) NOT NULL,
  `name` varchar(32) NOT NULL,
  `brand` varchar(32),
  `maincat`varchar(32),
  `subcat` varchar(32),
  `desc` text,
  `img` varchar(128),
  `price` float DEFAULT '0.00',
  `wt` float DEFAULT '0.000',
  `qty` bigint unsigned DEFAULT '0',
  `size` varchar(8),
  PRIMARY KEY (`id`),
  UNIQUE KEY (`id`, `sku`)
) ENGINE=InnoDB;


INSERT INTO `product_clothes` VALUES ('000001','S00001','NAME_000001','BRAND_A','Jeans','Skinny Fit','description','http://image.com','10.00','1.0','1','HM'); 
INSERT INTO `product_clothes` VALUES ('000002','S00002','NAME_000002','BRAND_A','Jeans','Slim Fit','description','http://image.com','10.00','1.0','1','HM');
INSERT INTO `product_clothes` VALUES ('000003','S00003','NAME_000003','BRAND_A','Jeans','Regular Fit','description','http://image.com','10.00','1.0','1','HM');
INSERT INTO `product_clothes` VALUES ('000004','S00004','NAME_000004','BRAND_A','Pants','Slim Fit','description','http://image.com','10.00','1.0','1','HM');
INSERT INTO `product_clothes` VALUES ('000005','S00005','NAME_000005','BRAND_A','Pants','Regular Fit','description','http://image.com','10.00','1.0','1','HM');
INSERT INTO `product_clothes` VALUES ('000006','S00006','NAME_000006','BRAND_B','Pants','Skinny Fit','description','http://image.com','10.00','1.0','1','HM');
INSERT INTO `product_clothes` VALUES ('000007','S00007','NAME_000007','BRAND_B','Pants','Formal','description','http://image.com','10.00','1.0','1','HM');
INSERT INTO `product_clothes` VALUES ('000008','S00008','NAME_000008','BRAND_B','T-shirts','Striped T-shirts','description','http://image.com','10.00','1.0','1','HM');
INSERT INTO `product_clothes` VALUES ('000009','S00009','NAME_000009','BRAND_B','T-shirts','Graphic','description','http://image.com','10.00','1.0','1','HM');
INSERT INTO `product_clothes` VALUES ('000010','S00010','NAME_000010','BRAND_C','T-shirts','Tank Tops','description','http://image.com','10.00','1.0','1','HM');

INSERT INTO `brand` VALUES ('001','BRAND_A',true,5,1000,'Singapore','http://image.com','2020-01-01','2020-02-02','http://instag.com','http://fb.com','http://shopif'); 
INSERT INTO `brand` VALUES ('002','BRAND_B',true,5,1000,'Singapore','http://image.com','2020-01-01','2020-02-02','http://instag.com','http://fb.com','http://shopif');
INSERT INTO `brand` VALUES ('003','BRAND_C',true,5,1000,'Singapore','http://image.com','2020-01-01','2020-02-02','http://instag.com','http://fb.com','http://shopif');
INSERT INTO `brand` VALUES ('004','BRAND_D',true,5,1000,'Singapore','http://image.com','2020-01-01','2020-02-02','http://instag.com','http://fb.com','http://shopif');
INSERT INTO `brand` VALUES ('005','BRAND_E',true,5,1000,'Singapore','http://image.com','2020-01-01','2020-02-02','http://instag.com','http://fb.com','http://shopif');
INSERT INTO `brand` VALUES ('006','BRAND_F',true,5,1000,'Singapore','http://image.com','2020-01-01','2020-02-02','http://instag.com','http://fb.com','http://shopif');
INSERT INTO `brand` VALUES ('007','BRAND_G',true,5,1000,'Singapore','http://image.com','2020-01-01','2020-02-02','http://instag.com','http://fb.com','http://shopif');
INSERT INTO `brand` VALUES ('008','BRAND_H',true,5,1000,'Singapore','http://image.com','2020-01-01','2020-02-02','http://instag.com','http://fb.com','http://shopif');
INSERT INTO `brand` VALUES ('009','BRAND_I',true,5,1000,'Singapore','http://image.com','2020-01-01','2020-02-02','http://instag.com','http://fb.com','http://shopif');
INSERT INTO `brand` VALUES ('010','BRAND_J',true,5,1000,'Singapore','http://image.com','2020-01-01','2020-02-02','http://instag.com','http://fb.com','http://shopif');