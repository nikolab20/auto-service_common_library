/*
SQLyog Ultimate v10.00 Beta1
MySQL - 5.5.5-10.4.10-MariaDB : Database - auto_servis
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`auto_servis` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;

USE `auto_servis`;

/*Table structure for table `deo` */

DROP TABLE IF EXISTS `deo`;

CREATE TABLE `deo` (
  `serijskiBroj` bigint(20) NOT NULL,
  `nazivDela` varchar(50) DEFAULT NULL,
  `proizvodjac` varchar(50) DEFAULT NULL,
  `opis` varchar(500) DEFAULT NULL,
  `sifraPredmetaProdaje` bigint(20) NOT NULL,
  `stanje` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`serijskiBroj`,`sifraPredmetaProdaje`),
  KEY `deo_ibfk_1` (`sifraPredmetaProdaje`),
  CONSTRAINT `deo_ibfk_1` FOREIGN KEY (`sifraPredmetaProdaje`) REFERENCES `predmetprodaje` (`sifraPredmetaProdaje`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `deo` */

insert  into `deo`(`serijskiBroj`,`nazivDela`,`proizvodjac`,`opis`,`sifraPredmetaProdaje`,`stanje`) values (138464,'Akumulator Bosch S5 100 Ah','Bosch','Kapacitet u Ah: 100\nRaspored polova: D+ normalni\nDužina: 353 mm\nSirina: 175 mm\nVisina: 190 mm',45,10),(142723,'Prednji amortizer Audi A4 Motor 00-07','Monroe Original ','Svi modeli osim onih sa Quattro pogonom',43,3),(205683,'Branik BMW E46 Compact 00-','Polcar','Prednji branik spreman za lakiranje ',38,1),(235139,'EGR Ventil Peugeot 307 00-','Delphi ','Motor: 2.0HDi\nSnaga motora: 100kW\nDužina 182 mm\nŠirina 165 mm\nVisina 125 mm\nTežina 0,8 kg\n5 -polni\nOblik kućišta utikača - pravougaoni ',44,2),(242645,'Alternator za Mercedes-Benz 93-00','Valeo','Alternator za Mercedes-Benz Razred C, Godište: 93-00',40,1),(745124,'Prednje kocione plocice - Alfa Romeo 147/156/GT','Valeo','Prednje kocione plocice za Alfu Romer 147/156/GT (00-09)',22,10),(874741,'Stabilizator Levi - Opel Astra H (04-09)','Valeo','Stabilizatori za Astru H, zamenski',20,10),(874742,'Stabilizator Desni - Astra H (04-09)','Valeo','Stabilizatori za Astru H, zamenski',21,10),(875694,'Komplet kvacila - Opel Astra H/ Zafira B (04-09)','LUK','Komplet kvacila sadrzi plicajuci zamajac, druk-lezaj, lamelu i sve potrebne delove za montazu',23,4),(1769181,'Prednja svetla Volkswagen Golf VII 12-','Valeo ','Sa motorom\nBeli žmigavac\nHromirana unutrašnjost\nCrna unutrašnjost\nAdaptivno svetlo\nDnevno svetlo\nProvidno staklo',47,2),(2979751,'Svečica grejača Alfa Romeo 147  00-10','Bosch','Grejač motora',42,5),(4074123,'Svećica za paljenje Renault Clio 05-','Bosch','Veličina ključa 14 mm\nSpoljni navoj 12 mm\nDužina navoja 26,5 mm\n\n',41,10),(4937306,'Rezervoar goriva Hyundai i30 07-12','Polcar','Benzinski rezervoar',46,1),(9549962,'Zadnji branik za VW Passat 00- ','Polcar','Zadnji branik spreman za lakiranje',39,6);

/*Table structure for table `klijent` */

DROP TABLE IF EXISTS `klijent`;

CREATE TABLE `klijent` (
  `sifraKlijenta` bigint(20) NOT NULL AUTO_INCREMENT,
  `imeKlijenta` varchar(50) DEFAULT NULL,
  `prezimeKlijenta` varchar(50) DEFAULT NULL,
  `brojPoseta` int(11) DEFAULT NULL,
  `dug` decimal(10,0) DEFAULT 0,
  PRIMARY KEY (`sifraKlijenta`),
  CONSTRAINT `CHK_dug` CHECK (`dug` >= 0)
) ENGINE=InnoDB AUTO_INCREMENT=50 DEFAULT CHARSET=utf8mb4;

/*Data for the table `klijent` */

insert  into `klijent`(`sifraKlijenta`,`imeKlijenta`,`prezimeKlijenta`,`brojPoseta`,`dug`) values (49,'Pera','Pera',1,'0');

/*Table structure for table `poreskastopa` */

DROP TABLE IF EXISTS `poreskastopa`;

CREATE TABLE `poreskastopa` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `oznaka` varchar(25) DEFAULT NULL,
  `vrednost` decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `CHK_vrednost` CHECK (`vrednost` >= 0)
) ENGINE=InnoDB AUTO_INCREMENT=142 DEFAULT CHARSET=utf8mb4;

/*Data for the table `poreskastopa` */

insert  into `poreskastopa`(`id`,`oznaka`,`vrednost`) values (1,'PDV','0.20'),(63,'PDV2','0.15'),(103,'PDV3','0.10');

/*Table structure for table `predmetprodaje` */

DROP TABLE IF EXISTS `predmetprodaje`;

CREATE TABLE `predmetprodaje` (
  `sifraPredmetaProdaje` bigint(20) NOT NULL AUTO_INCREMENT,
  `cena` decimal(10,0) DEFAULT NULL,
  `cenaSaPorezom` decimal(10,0) DEFAULT NULL,
  `id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`sifraPredmetaProdaje`),
  KEY `predmetprodaje_ibfk_1` (`id`),
  CONSTRAINT `predmetprodaje_ibfk_1` FOREIGN KEY (`id`) REFERENCES `poreskastopa` (`id`) ON UPDATE CASCADE,
  CONSTRAINT `CHK_cena` CHECK (`cena` >= 0),
  CONSTRAINT `CHK_cenap` CHECK (`cenaSaPorezom` >= 0)
) ENGINE=InnoDB AUTO_INCREMENT=53 DEFAULT CHARSET=utf8mb4;

/*Data for the table `predmetprodaje` */

insert  into `predmetprodaje`(`sifraPredmetaProdaje`,`cena`,`cenaSaPorezom`,`id`) values (20,'1700','2040',1),(21,'1700','2040',1),(22,'2400','2880',1),(23,'54000','64800',1),(24,'4500','5400',1),(25,'8000','9600',1),(26,'2500','3000',1),(38,'25704','30845',1),(39,'16588','19906',1),(40,'38550','46260',1),(41,'936','1123',1),(42,'2462','2954',1),(43,'6636','7963',1),(44,'22111','26533',1),(45,'16346','19615',1),(46,'22982','27578',1),(47,'44105','52926',1);

/*Table structure for table `racun` */

DROP TABLE IF EXISTS `racun`;

CREATE TABLE `racun` (
  `brojRacuna` bigint(20) NOT NULL AUTO_INCREMENT,
  `datumIzdavanja` date DEFAULT NULL,
  `ukupnaVrednost` decimal(10,0) DEFAULT 0,
  `ukupnaVrednostSaPorezom` decimal(10,0) DEFAULT 0,
  `obradjen` tinyint(1) DEFAULT NULL,
  `storniran` tinyint(1) DEFAULT NULL,
  `sifraRadnika` bigint(20) DEFAULT NULL,
  `sifraKlijenta` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`brojRacuna`),
  KEY `racun_ibfk_1` (`sifraRadnika`),
  KEY `racun_ibfk_2` (`sifraKlijenta`),
  CONSTRAINT `racun_ibfk_1` FOREIGN KEY (`sifraRadnika`) REFERENCES `radnik` (`sifraRadnika`),
  CONSTRAINT `racun_ibfk_2` FOREIGN KEY (`sifraKlijenta`) REFERENCES `klijent` (`sifraKlijenta`),
  CONSTRAINT `CHK_uv` CHECK (`ukupnaVrednost` >= 0),
  CONSTRAINT `CHK_uvp` CHECK (`ukupnaVrednostSaPorezom` >= 0)
) ENGINE=InnoDB AUTO_INCREMENT=121 DEFAULT CHARSET=utf8mb4;

/*Data for the table `racun` */

insert  into `racun`(`brojRacuna`,`datumIzdavanja`,`ukupnaVrednost`,`ukupnaVrednostSaPorezom`,`obradjen`,`storniran`,`sifraRadnika`,`sifraKlijenta`) values (120,'2020-05-07','4500','5400',1,0,1,49);

/*Table structure for table `radnik` */

DROP TABLE IF EXISTS `radnik`;

CREATE TABLE `radnik` (
  `sifraRadnika` bigint(20) NOT NULL AUTO_INCREMENT,
  `imeRadnika` varchar(50) DEFAULT NULL,
  `prezimeRadnika` varchar(50) DEFAULT NULL,
  `adresa` varchar(100) DEFAULT NULL,
  `telefon` varchar(25) DEFAULT NULL,
  `JMBG` varchar(13) DEFAULT NULL,
  `administrator` tinyint(1) DEFAULT NULL,
  `username` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`sifraRadnika`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8mb4;

/*Data for the table `radnik` */

insert  into `radnik`(`sifraRadnika`,`imeRadnika`,`prezimeRadnika`,`adresa`,`telefon`,`JMBG`,`administrator`,`username`,`password`) values (1,'Nikola','Bakic','Niksicka 6','0640683242','2012997722812',1,'nikolab20','nikolab20');

/*Table structure for table `stavkaracuna` */

DROP TABLE IF EXISTS `stavkaracuna`;

CREATE TABLE `stavkaracuna` (
  `brojRacuna` bigint(20) NOT NULL,
  `RB` bigint(20) NOT NULL,
  `kolicina` double DEFAULT 0,
  `ukupnaCena` decimal(10,2) DEFAULT 0.00,
  `ukupnaCenaSaPorezom` decimal(10,2) DEFAULT 0.00,
  `jedinicaMere` varchar(25) DEFAULT NULL,
  `sifraPredmetaProdaje` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`brojRacuna`,`RB`),
  KEY `stavkaracuna_ibfk_1` (`sifraPredmetaProdaje`),
  KEY `RB` (`RB`),
  CONSTRAINT `stavkaracuna_ibfk_1` FOREIGN KEY (`sifraPredmetaProdaje`) REFERENCES `predmetprodaje` (`sifraPredmetaProdaje`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `stavkaracuna_ibfk_2` FOREIGN KEY (`brojRacuna`) REFERENCES `racun` (`brojRacuna`),
  CONSTRAINT `CHK_kol` CHECK (`kolicina` >= 0),
  CONSTRAINT `CHK_uc` CHECK (`ukupnaCena` >= 0),
  CONSTRAINT `CHK_ucp` CHECK (`ukupnaCenaSaPorezom` >= 0)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `stavkaracuna` */

insert  into `stavkaracuna`(`brojRacuna`,`RB`,`kolicina`,`ukupnaCena`,`ukupnaCenaSaPorezom`,`jedinicaMere`,`sifraPredmetaProdaje`) values (120,1,1,'4500.00','5400.00','KOM',24);

/*Table structure for table `usluga` */

DROP TABLE IF EXISTS `usluga`;

CREATE TABLE `usluga` (
  `sifraUsluge` bigint(20) NOT NULL AUTO_INCREMENT,
  `nazivUsluge` varchar(50) DEFAULT NULL,
  `opisUsluge` varchar(500) DEFAULT NULL,
  `sifraPredmetaProdaje` bigint(20) NOT NULL,
  PRIMARY KEY (`sifraUsluge`,`sifraPredmetaProdaje`),
  KEY `usluga_ibfk_1` (`sifraPredmetaProdaje`),
  CONSTRAINT `usluga_ibfk_1` FOREIGN KEY (`sifraPredmetaProdaje`) REFERENCES `predmetprodaje` (`sifraPredmetaProdaje`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb4;

/*Data for the table `usluga` */

insert  into `usluga`(`sifraUsluge`,`nazivUsluge`,`opisUsluge`,`sifraPredmetaProdaje`) values (7,'Mali servis','Zamena svih filtera i motornog ulja bez materijala.',24),(9,'Zamena seta kvacila','Demontaza menjaca, zamena delova i vracanje menjaca.',25),(11,'Zamena kocionih plocica','Zamena prednjih i zadnjih kocionih plocica.',26);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
