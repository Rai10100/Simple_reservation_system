-- MySQL dump 10.13  Distrib 8.0.19, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: cinema
-- ------------------------------------------------------
-- Server version	8.0.19

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `back_to_the_future`
--

DROP TABLE IF EXISTS `back_to_the_future`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `back_to_the_future` (
  `functions` varchar(25) DEFAULT NULL,
  `seat` int NOT NULL AUTO_INCREMENT,
  `reserved` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`seat`)
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `back_to_the_future`
--

LOCK TABLES `back_to_the_future` WRITE;
/*!40000 ALTER TABLE `back_to_the_future` DISABLE KEYS */;
INSERT INTO `back_to_the_future` VALUES ('Back to the Future',1,'no'),('Back to the Future',2,'no'),('Back to the Future',3,'no'),('Back to the Future',4,'no'),('Back to the Future',5,'no'),('Back to the Future',6,'no'),('Back to the Future',7,'no'),('Back to the Future',8,'no'),('Back to the Future',9,'no'),('Back to the Future',10,'no'),('Back to the Future',11,'no'),('Back to the Future',12,'no'),('Back to the Future',13,'no'),('Back to the Future',14,'no'),('Back to the Future',15,'no'),('Back to the Future',16,'no'),('Back to the Future',17,'no'),('Back to the Future',18,'no'),('Back to the Future',19,'no'),('Back to the Future',20,'no'),('Back to the Future',21,'no'),('Back to the Future',22,'no'),('Back to the Future',23,'no'),('Back to the Future',24,'no'),('Back to the Future',25,'no'),('Back to the Future',26,'no'),('Back to the Future',27,'no'),('Back to the Future',28,'no');
/*!40000 ALTER TABLE `back_to_the_future` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `casablanca`
--

DROP TABLE IF EXISTS `casablanca`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `casablanca` (
  `functions` varchar(25) DEFAULT NULL,
  `seat` int NOT NULL AUTO_INCREMENT,
  `reserved` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`seat`)
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `casablanca`
--

LOCK TABLES `casablanca` WRITE;
/*!40000 ALTER TABLE `casablanca` DISABLE KEYS */;
INSERT INTO `casablanca` VALUES ('Casablanca',1,'no'),('Casablanca',2,'no'),('Casablanca',3,'no'),('Casablanca',4,'no'),('Casablanca',5,'no'),('Casablanca',6,'no'),('Casablanca',7,'no'),('Casablanca',8,'no'),('Casablanca',9,'no'),('Casablanca',10,'no'),('Casablanca',11,'no'),('Casablanca',12,'no'),('Casablanca',13,'no'),('Casablanca',14,'no'),('Casablanca',15,'no'),('Casablanca',16,'no'),('Casablanca',17,'no'),('Casablanca',18,'no'),('Casablanca',19,'no'),('Casablanca',20,'no'),('Casablanca',21,'no'),('Casablanca',22,'no'),('Casablanca',23,'no'),('Casablanca',24,'no'),('Casablanca',25,'no'),('Casablanca',26,'no'),('Casablanca',27,'no'),('Casablanca',28,'no');
/*!40000 ALTER TABLE `casablanca` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `el_padrino`
--

DROP TABLE IF EXISTS `el_padrino`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `el_padrino` (
  `functions` varchar(25) DEFAULT NULL,
  `seat` int NOT NULL AUTO_INCREMENT,
  `reserved` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`seat`)
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `el_padrino`
--

LOCK TABLES `el_padrino` WRITE;
/*!40000 ALTER TABLE `el_padrino` DISABLE KEYS */;
INSERT INTO `el_padrino` VALUES ('El padrino',1,'no'),('El padrino',2,'no'),('El padrino',3,'no'),('El padrino',4,'no'),('El padrino',5,'no'),('El padrino',6,'no'),('El padrino',7,'no'),('El padrino',8,'no'),('El padrino',9,'no'),('El padrino',10,'no'),('El padrino',11,'no'),('El padrino',12,'no'),('El padrino',13,'no'),('El padrino',14,'no'),('El padrino',15,'no'),('El padrino',16,'no'),('El padrino',17,'no'),('El padrino',18,'no'),('El padrino',19,'no'),('El padrino',20,'no'),('El padrino',21,'no'),('El padrino',22,'no'),('El padrino',23,'no'),('El padrino',24,'no'),('El padrino',25,'no'),('El padrino',26,'no'),('El padrino',27,'no'),('El padrino',28,'no');
/*!40000 ALTER TABLE `el_padrino` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pulp_fiction`
--

DROP TABLE IF EXISTS `pulp_fiction`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pulp_fiction` (
  `functions` varchar(25) DEFAULT NULL,
  `seat` int NOT NULL AUTO_INCREMENT,
  `reserved` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`seat`)
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pulp_fiction`
--

LOCK TABLES `pulp_fiction` WRITE;
/*!40000 ALTER TABLE `pulp_fiction` DISABLE KEYS */;
INSERT INTO `pulp_fiction` VALUES ('Pulp Fiction',1,'si'),('Pulp Fiction',2,'si'),('Pulp Fiction',3,'si'),('Pulp Fiction',4,'no'),('Pulp Fiction',5,'no'),('Pulp Fiction',6,'no'),('Pulp Fiction',7,'no'),('Pulp Fiction',8,'si'),('Pulp Fiction',9,'si'),('Pulp Fiction',10,'si'),('Pulp Fiction',11,'no'),('Pulp Fiction',12,'no'),('Pulp Fiction',13,'no'),('Pulp Fiction',14,'no'),('Pulp Fiction',15,'no'),('Pulp Fiction',16,'no'),('Pulp Fiction',17,'no'),('Pulp Fiction',18,'no'),('Pulp Fiction',19,'no'),('Pulp Fiction',20,'no'),('Pulp Fiction',21,'no'),('Pulp Fiction',22,'no'),('Pulp Fiction',23,'no'),('Pulp Fiction',24,'no'),('Pulp Fiction',25,'no'),('Pulp Fiction',26,'no'),('Pulp Fiction',27,'no'),('Pulp Fiction',28,'no');
/*!40000 ALTER TABLE `pulp_fiction` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `the_matrix`
--

DROP TABLE IF EXISTS `the_matrix`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `the_matrix` (
  `functions` varchar(25) DEFAULT NULL,
  `seat` int NOT NULL AUTO_INCREMENT,
  `reserved` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`seat`)
) ENGINE=InnoDB AUTO_INCREMENT=32 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `the_matrix`
--

LOCK TABLES `the_matrix` WRITE;
/*!40000 ALTER TABLE `the_matrix` DISABLE KEYS */;
INSERT INTO `the_matrix` VALUES ('The Matrix',1,'no'),('The Matrix',2,'no'),('The Matrix',3,'no'),('The Matrix',4,'no'),('The Matrix',5,'no'),('The Matrix',6,'no'),('The Matrix',7,'no'),('The Matrix',8,'no'),('The Matrix',9,'no'),('The Matrix',10,'no'),('The Matrix',11,'no'),('The Matrix',12,'no'),('The Matrix',13,'no'),('The Matrix',14,'no'),('The Matrix',15,'no'),('The Matrix',16,'no'),('The Matrix',17,'no'),('The Matrix',18,'no'),('The Matrix',19,'no'),('The Matrix',20,'no'),('The Matrix',21,'no'),('The Matrix',22,'no'),('The Matrix',23,'no'),('The Matrix',24,'no'),('The Matrix',25,'no'),('The Matrix',26,'no'),('The Matrix',27,'no'),('The Matrix',28,'no');
/*!40000 ALTER TABLE `the_matrix` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-09-08 18:03:51
