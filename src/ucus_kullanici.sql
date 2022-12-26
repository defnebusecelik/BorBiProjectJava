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
-- Table structure for table `kullanici`
--

DROP TABLE IF EXISTS `kullanici`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `kullanici` (
  `kullaniciAdi` varchar(45) DEFAULT NULL,
  `kullaniciYasi` int DEFAULT NULL,
  `kullaniciTc` varchar(45) DEFAULT NULL,
  `rezervasyonNo` varchar(45) DEFAULT NULL,
  `kalkisYonu` varchar(45) DEFAULT NULL,
  `varisYonu` varchar(45) DEFAULT NULL,
  `saat` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `kullanici`
--

LOCK TABLES `kullanici` WRITE;
/*!40000 ALTER TABLE `kullanici` DISABLE KEYS */;
INSERT INTO `kullanici` VALUES ('EceŞahin',19,'8369484423','552464','Ankara','İstanbul','08.00-09.10'),('AltayDonuk',19,'34425435','2925720','Ankara','İstanbul','17.30-18.45'),('AltayDonuk',19,'3463456346','5133942','Ankara','İstanbul','17.30-18.45'),('DFSDSGsf',19,'34536','1617660','Ankara','İstanbul','17.30-18.45'),('altaydonuk',19,'346345','6563520','Ankara','İstanbul','17.30-18.45'),('AltayDonuk',19,'3465647','660910','Ankara','İstanbul','17.30-18.45'),('EceŞahin',19,'3846082','8984248','AnKARA','iSTANBUL','08.00-09.10'),('YiğitÇetinkay',19,'29383737337','1380988','Ankara','İstanbul','17.0-18.45'),('YiğitÇetinkaya',19,'23424242342','2050455','Ankara','İstanbul','17.30-18.45'),('YiğitÇetinkaya',19,'2414123412','1842120','Ankara','İstanbul','17.30-18.45'),('YiğitÇetinkaya',19,'2412412421','4636174','Ankara','İstanbul','17.30-18.45'),('YiğitÇetinkaya',19,'242412412','2890804','Ankara','İstanbul','17.30-18.45'),('YiğitÇetinkaya',19,'123214213421','983840','Ankara','İstabul','17.30-18.45'),('YiğitÇetinkaya',19,'241421421','105307','Ankara','İstanbul','17.30-18.45'),('BerfinŞahin',19,'4970259750','2347800','İstanbul','Ankara','06.45-08.00'),('İdilGülbek',21,'10022622332','6337512','İstanbul','Ankara','09.20-10.45'),('sjıpıhdngı',10,'27049','456402','İstanbul','Ankara','06.45-08.00'),('EceŞahin',-3,'12','38184','Ankara','İstanbul','0'),('eceşahin',19,'187340813643846','13416','Ankara','İstanbul','08.00-09.10'),('eb',1,'12312454634','6147624','a','b','1'),('EceŞahin',19,'44674977930','1370754','Ankara','İstanbul','08.00-09.10'),('f2',1,'d','274512','a','b','1'),('dc',2,'1','10068622','q','c','1'),('ECEŞAHİN',19,'398834948','1343664','Ankara','İstanbul','08.00-09.10'),('Eceşahin',32,'34243242','3380144','Ankara','İstanbul','08.00-09.10'),('eceşahin',32,'03*40940','352170','ankara','istanbul','08.00-09.10'),('eceşkf',32,'234','11326630','ankara','istenbul','2'),('eceşahin',71,'9485093','21599760','ankara','istanbul','17.30-18.45'),('eceşahin',71,'0475085708','1529424','ankara','istanbul','17.30-18.45'),('eceşahin',71,'32940924','18733165','ankara','istanbul','17.30-18.45'),('eceşahin',72,'3097402958','19392312','ankara','istanbul','17.30-18.45'),('eceşahin',32,'8570857854','22918140','ankara','istanbul','17.30-18.45'),('eceşahin',19,'1111111111111111111111111111111111','6970730','ankara','istanbul','17.30-18.45'),('Eceşahin',-3,'11111111111111111111111','7043400','ankara','istanbul','08.00-09.10'),('eceşahin',-10,'1111111111111111111111111111','1475760','ankara','istanbul','10.30-11.45'),('eceşahin',-3,'11111111111111111111111','5386524','ankara','istanbul','08.00-09.10');
/*!40000 ALTER TABLE `kullanici` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
