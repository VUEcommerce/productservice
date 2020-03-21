-- #mysql -h <ip> -P <p> -u root -p
-- 
-- docker access locally: docker run -p 13306:3306 mysql:<tag>
--
-- docker staging: mysql -h 192.168.8.9 -P 40089 -u root -p

-- SET FOREIGN_KEY_CHECKS=0;
-- CREATE DATABASE vue;
-- SELECT @@default_storage_engine;

-- ----------------------------
-- Table structure for Clothes
-- ----------------------------
DROP TABLE Clothes IF EXISTS;
CREATE TABLE `Clothes` (
  `id` varchar(32) NOT NULL,
  `sku` varchar(32) NOT NULL,
  `name` varchar(32) NOT NULL DEFAULT '',
  `brand` varchar(32) DEFAULT '',
  `description` varchar(1024) DEFAULT '',
  `image` varchar(128) DEFAULT '',
  `price` float(10,2) DEFAULT '0.00',
  `weight` float(6,3) DEFAULT '0.000',
  `quantity` bigint(11) unsigned DEFAULT '0',
  `size` varchar(16) DEFAULT '',
  PRIMARY KEY (`id`),
  UNIQUE KEY (`id`, `sku`)
) ENGINE=InnoDB;
-- ----------------------------
-- Table structure for Brand
-- ----------------------------
-- DROP TABLE IF EXISTS `BrandModel`;
-- CREATE TABLE `BrandModel` (
--   `BrandId` varchar(32) NOT NULL,
--   `Name` varchar(32) NOT NULL DEFAULT '',
--   `Rating` int(3) DEFAULT '0',
--   `FollowCount` int(11) DEFAULT '0',
--   `FacebookUrl` varchar(128) DEFAULT '',
--   `ShopifyUrl` varchar(128) DEFAULT '',
--   `ProfileImage` varchar(128) DEFAULT '',
--   `JoinDate` datetime DEFAULT NULL,
--   PRIMARY KEY (`BrandId`),
--   UNIQUE KEY (`BrandId`, `Name`)
-- ) ENGINE=InnoDB;