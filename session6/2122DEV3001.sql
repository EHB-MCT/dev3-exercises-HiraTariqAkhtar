-- -------------------------------------------------------------
-- TablePlus 4.5.0(396)
--
-- https://tableplus.com/
--
-- Database: 2122DEV3001
-- Generation Time: 2021-12-02 11:08:36.6760
-- -------------------------------------------------------------


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


CREATE TABLE `S6_cities` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8 NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=latin1;

CREATE TABLE `S6_rides` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `departure_time` datetime NOT NULL,
  `departure_city_id` int(11) NOT NULL,
  `destination_city_id` int(11) NOT NULL,
  `train_id` int(11) NOT NULL,
  `platform` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `departure_city_id` (`departure_city_id`),
  KEY `destination_city_id` (`destination_city_id`),
  KEY `train_id` (`train_id`),
  CONSTRAINT `S6_rides_ibfk_1` FOREIGN KEY (`departure_city_id`) REFERENCES `S6_cities` (`id`),
  CONSTRAINT `S6_rides_ibfk_2` FOREIGN KEY (`destination_city_id`) REFERENCES `S6_cities` (`id`),
  CONSTRAINT `S6_rides_ibfk_3` FOREIGN KEY (`train_id`) REFERENCES `S6_trains` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

CREATE TABLE `S6_trains` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `type` varchar(255) CHARACTER SET utf8 NOT NULL,
  `max_passengers` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

INSERT INTO `S6_cities` (`id`, `name`) VALUES
(1, 'Brussel'),
(2, 'Gent'),
(3, 'Antwerpen'),
(4, 'Leuven'),
(5, 'Oostende'),
(6, 'Brugge'),
(7, 'Bergen'),
(8, 'Aarlen'),
(9, 'Luik'),
(10, 'Namen'),
(11, 'Waver'),
(12, 'Hasselt');

INSERT INTO `S6_rides` (`id`, `departure_time`, `departure_city_id`, `destination_city_id`, `train_id`, `platform`) VALUES
(1, '2021-11-23 14:20:58', 1, 5, 1, 1),
(2, '2021-11-23 14:29:17', 3, 10, 2, 7),
(3, '2021-11-23 14:37:32', 5, 12, 1, 5),
(4, '2021-11-23 15:58:14', 9, 1, 1, 1),
(5, '2021-11-23 16:25:16', 6, 4, 1, 5),
(6, '2021-11-23 16:30:00', 7, 5, 1, 3);

INSERT INTO `S6_trains` (`id`, `type`, `max_passengers`) VALUES
(1, 'IC', 255),
(2, 'TGV', 345),
(3, 'IC', 120);



/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;