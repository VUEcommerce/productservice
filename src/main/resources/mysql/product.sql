-- #mysql -h <ip> -P <p> -u root -p
-- #use vue

SET FOREIGN_KEY_CHECKS=0;
CREATE DATABASE vue;
SELECT @@default_storage_engine;

-- ----------------------------
-- Table structure for Product
-- ----------------------------
DROP TABLE IF EXISTS `ProductModel`;
CREATE TABLE `ProductModel` (
  `SKU` varchar(32) NOT NULL,
  `Name` varchar(32) NOT NULL DEFAULT '',
  `Brand` varchar(32) DEFAULT '',
  `Description` varchar(1024) DEFAULT '',
  `Image` varchar(128) DEFAULT '',
  `Price` float(10,2) DEFAULT '0.00',
  `Weight` float(6,3) DEFAULT '0.000',
  `Quantity` int(11) unsigned DEFAULT '0',
  PRIMARY KEY (`SKU`),
  UNIQUE KEY (`SKU`, `Name`)
);

-- ----------------------------
-- Table structure for Brand
-- ----------------------------
DROP TABLE IF EXISTS `BrandModel`;
CREATE TABLE `BrandModel` (
  `BrandId` varchar(32) NOT NULL,
  `Name` varchar(32) NOT NULL DEFAULT '',
  `Rating` int(3) DEFAULT '0',
  `FollowCount` int(11) DEFAULT '0',
  `FacebookUrl` varchar(128) DEFAULT '',
  `ShopifyUrl` varchar(128) DEFAULT '',
  `ProfileImage` varchar(128) DEFAULT '',
  `JoinDate` datetime DEFAULT NULL,
  PRIMARY KEY (`BrandId`),
  UNIQUE KEY (`BrandId`, `Name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;