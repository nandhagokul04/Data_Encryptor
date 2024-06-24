-- --------------------------------------------------------
-- Host:                         localhost
-- Server version:               5.0.45-community-nt - MySQL Community Edition (GPL)
-- Server OS:                    Win32
-- HeidiSQL Version:             12.3.0.6589
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Dumping database structure for publicauditing
DROP DATABASE IF EXISTS `publicauditing`;
CREATE DATABASE IF NOT EXISTS `publicauditing` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `publicauditing`;

-- Dumping structure for table publicauditing.admin
DROP TABLE IF EXISTS `admin`;
CREATE TABLE IF NOT EXISTS `admin` (
  `username` varchar(30) default NULL,
  `password` varchar(30) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Data exporting was unselected.

-- Dumping structure for table publicauditing.auditorreg
DROP TABLE IF EXISTS `auditorreg`;
CREATE TABLE IF NOT EXISTS `auditorreg` (
  `userid` varchar(30) default NULL,
  `username` varchar(30) default NULL,
  `password` varchar(30) default NULL,
  `email` varchar(40) default NULL,
  `mobileno` varchar(10) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Data exporting was unselected.

-- Dumping structure for table publicauditing.dataownerreg
DROP TABLE IF EXISTS `dataownerreg`;
CREATE TABLE IF NOT EXISTS `dataownerreg` (
  `username` varchar(30) default NULL,
  `password` varchar(30) default NULL,
  `email` varchar(30) default NULL,
  `productkey` varchar(20) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Data exporting was unselected.

-- Dumping structure for table publicauditing.detail
DROP TABLE IF EXISTS `detail`;
CREATE TABLE IF NOT EXISTS `detail` (
  `username` varchar(50) NOT NULL,
  `groupname` varchar(50) NOT NULL,
  `filename` varchar(50) NOT NULL,
  `date` varchar(40) NOT NULL,
  `time` time NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Data exporting was unselected.

-- Dumping structure for table publicauditing.gender
DROP TABLE IF EXISTS `gender`;
CREATE TABLE IF NOT EXISTS `gender` (
  `Gender` varchar(20) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Data exporting was unselected.

-- Dumping structure for table publicauditing.ownerprofile
DROP TABLE IF EXISTS `ownerprofile`;
CREATE TABLE IF NOT EXISTS `ownerprofile` (
  `username` varchar(35) NOT NULL,
  `filename` varchar(700) NOT NULL,
  `checksum` varchar(100) NOT NULL,
  `date` varchar(100) NOT NULL,
  `time` time NOT NULL,
  PRIMARY KEY  (`filename`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Data exporting was unselected.

-- Dumping structure for table publicauditing.registration
DROP TABLE IF EXISTS `registration`;
CREATE TABLE IF NOT EXISTS `registration` (
  `username` varchar(30) default NULL,
  `password` varchar(30) default NULL,
  `dob` varchar(20) default NULL,
  `gender` varchar(20) default NULL,
  `age` varchar(20) default NULL,
  `groupname` varchar(30) default NULL,
  `email` varchar(50) default NULL,
  `mobile` varchar(10) default NULL,
  `city` varchar(40) default NULL,
  `state` varchar(30) default NULL,
  `nation` varchar(30) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Data exporting was unselected.

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
