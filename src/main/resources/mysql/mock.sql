-- vue.ClothesModel
---------------------------------------------
-- `SKU` varchar(32) NOT NULL,
-- `Name` varchar(32) NOT NULL DEFAULT '',
-- `Brand` varchar(32) DEFAULT '',
-- `Description` varchar(1024) DEFAULT '',
-- `Image` varchar(128) DEFAULT '',
-- `Price` float(10,2) DEFAULT '0.00',
-- `Weight` float(6,3) DEFAULT '0.000',
-- `Quantity` int(11) unsigned DEFAULT '0',
-- `Size` varchar(16) DEFAULT '',
-- PRIMARY KEY (`SKU`),
-- UNIQUE KEY (`SKU`, `Name`)
---------------------------------------------
INSERT INTO `ProductModel` VALUES ('000001', 'NAME_A000001', 'BRAND_A', 'description', 'http://image.com', '10.00', '1.0', '1'); 
INSERT INTO `ProductModel` VALUES ('000002', 'NAME_A000002', 'BRAND_A', 'description', 'http://image.com', '10.00', '1.0', '1');
INSERT INTO `ProductModel` VALUES ('000003', 'NAME_A000003', 'BRAND_A', 'description', 'http://image.com', '10.00', '1.0', '1');
INSERT INTO `ProductModel` VALUES ('000004', 'NAME_A000004', 'BRAND_A', 'description', 'http://image.com', '10.00', '1.0', '1');
INSERT INTO `ProductModel` VALUES ('000005', 'NAME_A000005', 'BRAND_A', 'description', 'http://image.com', '10.00', '1.0', '1');
INSERT INTO `ProductModel` VALUES ('000006', 'NAME_A000006', 'BRAND_B', 'description', 'http://image.com', '10.00', '1.0', '1');
INSERT INTO `ProductModel` VALUES ('000007', 'NAME_A000007', 'BRAND_B', 'description', 'http://image.com', '10.00', '1.0', '1');
INSERT INTO `ProductModel` VALUES ('000008', 'NAME_A000008', 'BRAND_B', 'description', 'http://image.com', '10.00', '1.0', '1');
INSERT INTO `ProductModel` VALUES ('000009', 'NAME_A000009', 'BRAND_B', 'description', 'http://image.com', '10.00', '1.0', '1');
INSERT INTO `ProductModel` VALUES ('000010', 'NAME_A000010', 'BRAND_B', 'description', 'http://image.com', '10.00', '1.0', '1');
INSERT INTO `ProductModel` VALUES ('000011', 'NAME_A000011', 'BRAND_C', 'description', 'http://image.com', '10.00', '1.0', '1');

INSERT INTO `ClothesModel` VALUES ('000001', 'Medium'); 
INSERT INTO `ClothesModel` VALUES ('000002', 'Medium');
INSERT INTO `ClothesModel` VALUES ('000003', 'Medium');
INSERT INTO `ClothesModel` VALUES ('000004', 'Medium');
INSERT INTO `ClothesModel` VALUES ('000005', 'Medium');

