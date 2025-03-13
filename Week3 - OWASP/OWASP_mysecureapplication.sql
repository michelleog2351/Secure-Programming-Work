
SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";

--
-- Database: `mysecureapplication`
--

DROP DATABASE IF EXISTS `mysecureapplication`;

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `mysecureapplication` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `mysecureapplication`;
-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE IF NOT EXISTS `user` (
`id` bigint(15) NOT NULL,
  `email` varchar(255) NOT NULL,
  `password` varchar(32) NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

INSERT INTO `user` (`id`, `email`, `password`) VALUES
(1, 'admin@mysite.com', '75bb336d90dc47c0eb2f62bf924a6821'),
(2, 'guest@mysite.com', '5d41402abc4b2a76b9719d911017c592');

ALTER TABLE `user`
 ADD PRIMARY KEY (`id`);
ALTER TABLE `user`
MODIFY `id` bigint(15) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=3;COMMIT;

