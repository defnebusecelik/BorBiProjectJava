-- MySQL dump 10.13  Distrib 8.0.27, for Win64 (x86_64)
--
-- Host: localhost    Database: ucus
-- ------------------------------------------------------
-- Server version	8.0.27

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
-- Table structure for table `ucak`
--

DROP TABLE IF EXISTS `ucak`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ucak` (
  `ucus_tip` varchar(45) NOT NULL,
  `ucus_no` int DEFAULT NULL,
  `kalkis_yon` varchar(45) DEFAULT NULL,
  `varis_yon` varchar(45) DEFAULT NULL,
  `saat` varchar(45) DEFAULT NULL,
  `ucret` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ucak`
--

LOCK TABLES `ucak` WRITE;
/*!40000 ALTER TABLE `ucak` DISABLE KEYS */;
INSERT INTO `ucak` VALUES ('yurtdışı',11546,'İstanbul','NewYork','06.35-19.00',2548),('yurtiçi',28734,'Ankara','İstanbul','08.00-09.10',330),('yurtiçi',28734,'Ankara','İstanbul','08.00-09.10',330),('yurtiçi',54774,'Ankara','İstanbul','10.30-11.45',400),('yurtiçi',45368,'Ankara','İstanbul','12.30-13.30',550),('yurtiçi',87699,'Ankara','İstanbul','15.20-16.40',500),('yurtiçi',34567,'Ankara','İstanbul','17.30-18.45',450),('yurtiçi',23426,'İstanbul','Ankara','06.45-08.00',350),('yurtiçi',79800,'İstanbul','Ankara','09.20-10.45',450),('yurtiçi',67696,'İstanbul','Ankara','11.35-12.45',500),('yurtiçi',34678,'İstanbul','Ankara','14.30-15.35',550),('yurtiçi',45367,'İstanbul','Ankara','16.15-17.40',600),('yurtdışı',11546,'İstanbul','NewYork','06.35-19.00',2548),('yurtdışı',11485,'İstanbul','NewYork','10.15-22.45',3867),('yurtiçi',11768,'İstanbul','Dalaman','10.15-11.25',540),('yurtdışı',11905,'Ankara','NewYork','09.15-23.50',4025),('yurtiçi',11906,'Ankara','Dalaman','07.15-08.30',300),('yurtiçi',11796,'Ankara','Dalaman','11.10-12.30',520),('yurtiçi',37847,'Ankara','Malatya','09.25-10.25',445);
/*!40000 ALTER TABLE `ucak` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
