CREATE DATABASE  IF NOT EXISTS `mini_project` 
USE `mini_project`;

DROP TABLE IF EXISTS `wish_list`;

CREATE TABLE `wish_list` (
  `wishlist_id` int NOT NULL AUTO_INCREMENT,
  `title` varchar(255) NOT NULL,
  PRIMARY KEY (`wishlist_id`),
  UNIQUE KEY `wishlist_id_UNIQUE` (`wishlist_id`),
  UNIQUE KEY `title_UNIQUE` (`title`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


LOCK TABLES `wish_list` WRITE;

UNLOCK TABLES;

DROP TABLE IF EXISTS `wish_item`;

CREATE TABLE `wish_item` (
  `item_order_id` int NOT NULL AUTO_INCREMENT,
  `item_id` int NOT NULL,
  `item_name` varchar(255) DEFAULT NULL,
  `description` longtext,
  `price` int DEFAULT NULL,
  PRIMARY KEY (`item_order_id`),
  KEY `item_id_idx` (`item_id`),
  CONSTRAINT `item_id` FOREIGN KEY (`item_id`) REFERENCES `wish_list` (`wishlist_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

LOCK TABLES `wish_item` WRITE;

UNLOCK TABLES;
