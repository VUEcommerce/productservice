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


-- ----------------------------
-- Table structure for Brand
-- ----------------------------
DROP TABLE IF EXISTS `brand`;
CREATE TABLE `brand` (
  `id` varchar(32) NOT NULL,
  `name` varchar(32) NOT NULL,
  `active` boolean,
  `rate` smallint DEFAULT '0',
  `follow` bigint unsigned DEFAULT '0',
  `locatn` varchar(32),
  `img` varchar(128),
  `joind` date,
  `lastmod` date,
  `instag` varchar(128),
  `fb` varchar(128),
  `shopif` varchar(128),
  PRIMARY KEY (`id`),
  UNIQUE KEY (`id`, `name`)
) ENGINE=InnoDB;
