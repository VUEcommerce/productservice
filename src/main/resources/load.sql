use vue;
DROP TABLE IF EXISTS product_clothes;
CREATE TABLE `product_clothes` (
  `id` varchar(32) NOT NULL,
  `sku` varchar(32) NOT NULL,
  `name` varchar(32) NOT NULL DEFAULT '',
  `brand` varchar(32) NULL,
  `desc` text NULL,
  `img` varchar(128) NULL,
  `price` float DEFAULT '0.00',
  `wt` float DEFAULT '0.000',
  `qty` bigint unsigned DEFAULT '0',
  `size` varchar(16) NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY (`id`, `sku`)
) ENGINE=InnoDB;


INSERT INTO `product_clothes` VALUES ('000001', 'S00001', 'NAME_000001', 'BRAND_A', 'description', 'http://image.com', '10.00', '1.0', '1', 'Medium'); 
INSERT INTO `product_clothes` VALUES ('000002', 'S00002', 'NAME_000002', 'BRAND_A', 'description', 'http://image.com', '10.00', '1.0', '1', 'Medium');
INSERT INTO `product_clothes` VALUES ('000003', 'S00003', 'NAME_000003', 'BRAND_A', 'description', 'http://image.com', '10.00', '1.0', '1', 'Medium');
INSERT INTO `product_clothes` VALUES ('000004', 'S00004', 'NAME_000004', 'BRAND_A', 'description', 'http://image.com', '10.00', '1.0', '1', 'Medium');
INSERT INTO `product_clothes` VALUES ('000005', 'S00005', 'NAME_000005', 'BRAND_A', 'description', 'http://image.com', '10.00', '1.0', '1', 'Medium');
INSERT INTO `product_clothes` VALUES ('000006', 'S00006', 'NAME_000006', 'BRAND_B', 'description', 'http://image.com', '10.00', '1.0', '1', 'Medium');
INSERT INTO `product_clothes` VALUES ('000007', 'S00007', 'NAME_000007', 'BRAND_B', 'description', 'http://image.com', '10.00', '1.0', '1', 'Medium');
INSERT INTO `product_clothes` VALUES ('000008', 'S00008', 'NAME_000008', 'BRAND_B', 'description', 'http://image.com', '10.00', '1.0', '1', 'Medium');
INSERT INTO `product_clothes` VALUES ('000009', 'S00009', 'NAME_000009', 'BRAND_B', 'description', 'http://image.com', '10.00', '1.0', '1', 'Medium');
INSERT INTO `product_clothes` VALUES ('000010', 'S00010', 'NAME_000010', 'BRAND_B', 'description', 'http://image.com', '10.00', '1.0', '1', 'Medium');
INSERT INTO `product_clothes` VALUES ('000011', 'S00011', 'NAME_000011', 'BRAND_C', 'description', 'http://image.com', '10.00', '1.0', '1', 'Medium');
