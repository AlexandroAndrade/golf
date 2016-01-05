-- phpMyAdmin SQL Dump
-- version 4.0.10.10
-- http://www.phpmyadmin.net
--
-- Servidor: 127.9.48.130:3306
-- Tiempo de generación: 26-10-2015 a las 04:45:21
-- Versión del servidor: 5.5.45
-- Versión de PHP: 5.3.3

SET FOREIGN_KEY_CHECKS=0;
SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";

--
-- Base de datos: `alexandrade`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `hoyo`
--
create database alexandrade;

use alexandrade;

CREATE TABLE IF NOT EXISTS `hoyo` (
  `idHoyo` int(11) NOT NULL AUTO_INCREMENT,
  `Hoyo` varchar(45) NOT NULL,
  `par` int(5) NOT NULL,
  `longitudMetros` int(11) NOT NULL,
  `idSucursal` int(11) NOT NULL,
  PRIMARY KEY (`idHoyo`),
  UNIQUE KEY `uq_Hoyo` (`Hoyo`),
  UNIQUE KEY `uq_orden` (`orden`),
  KEY `fk_idSucursal_idx` (`idSucursal`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=19 ;

--
-- Volcado de datos para la tabla `hoyo`
--
INSERT INTO `hoyo` VALUES 
(1,'Hoyo 01',5,120,1,1),
(2,'Hoyo 02',4,90,2,1),
(3,'Hoyo 03',4,101,3,1),
(4,'Hoyo 04',4,85,4,1),
(5,'Hoyo 05',5,105,5,1),
(6,'Hoyo 06',4,83,6,1),
(7,'Hoyo 07',3,76,7,1),
(8,'Hoyo 08',3,53,8,1),
(9,'Hoyo 09',3,68,9,1),
(10,'Hoyo 10',4,75,10,1),
(11,'Hoyo 11',5,110,11,1),
(12,'Hoyo 12',5,88,12,1),
(13,'Hoyo 13',5,99,13,1),
(14,'Hoyo 14',6,116,14,1),
(15,'Hoyo 15',4,70,15,1),
(16,'Hoyo 16',4,81,16,1),
(17,'Hoyo 17',4,73,17,1),
(18,'Hoyo 18',5,100,18,1);



-- --------------------------------------------------------
commit;

--
-- Estructura de tabla para la tabla `juego`
--

CREATE TABLE IF NOT EXISTS `juego` (
  `idJuego` int(11) NOT NULL AUTO_INCREMENT,
  `idSocioGanador` int(11) NOT NULL,
  `totalGolpes` int(11) NOT NULL,
  `fechaJuego` datetime NOT NULL,
  `idTorneo` int(11) DEFAULT NULL,
  PRIMARY KEY (`idJuego`),
  KEY `fk_idSocioGanador` (`idSocioGanador`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=3 ;

--
-- Volcado de datos para la tabla `juego`
--

INSERT INTO `juego` (`idJuego`, `idSocioGanador`, `totalGolpes`, `fechaJuego`, `idTorneo`) VALUES
(1, 1, 100, '2015-10-20 00:00:00', NULL),
(2, 1, 77, '2015-10-20 21:33:12', NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `juegodetalle`
--

CREATE TABLE IF NOT EXISTS `juegodetalle` (
  `idJuegoDetalle` int(11) NOT NULL AUTO_INCREMENT,
  `idJuego` int(11) NOT NULL,
  `idSocio` int(11) NOT NULL,
  `idHoyo` int(11) NOT NULL,
  `golpes` int(11) NOT NULL,
  PRIMARY KEY (`idJuegoDetalle`),
  UNIQUE KEY `uq_idJuego_idSocio_idHoyo` (`idJuego`,`idSocio`,`idHoyo`),
  KEY `fk_idSocio` (`idSocio`),
  KEY `fk_idHoyo` (`idHoyo`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=53 ;

--
-- Volcado de datos para la tabla `juegodetalle`
--

INSERT INTO `juegodetalle` (`idJuegoDetalle`, `idJuego`, `idSocio`, `idHoyo`, `golpes`) VALUES
(1, 1, 1, 1, 5),
(2, 1, 1, 2, 4),
(3, 1, 1, 3, 4),
(4, 1, 1, 4, 4),
(5, 1, 1, 5, 5),
(6, 1, 1, 6, 4),
(7, 1, 1, 7, 3),
(8, 1, 1, 8, 3),
(9, 1, 1, 9, 3),
(10, 1, 1, 10, 4),
(11, 1, 1, 11, 5),
(12, 1, 1, 12, 5),
(13, 1, 1, 13, 5),
(14, 1, 1, 14, 6),
(15, 1, 1, 15, 4),
(16, 1, 1, 16, 4),
(17, 1, 1, 17, 4),
(18, 1, 2, 1, 7),
(19, 1, 2, 2, 6),
(20, 1, 2, 3, 6),
(21, 1, 2, 4, 6),
(22, 1, 2, 5, 7),
(23, 1, 2, 6, 6),
(24, 1, 2, 7, 5),
(25, 1, 2, 8, 5),
(26, 1, 2, 9, 5),
(27, 1, 2, 10, 6),
(28, 1, 2, 11, 7),
(29, 1, 2, 12, 7),
(30, 1, 2, 13, 7),
(31, 1, 2, 14, 8),
(32, 1, 2, 15, 6),
(33, 1, 2, 16, 6),
(34, 1, 2, 17, 6),
(35, 1, 3, 1, 8),
(36, 1, 3, 2, 7),
(37, 1, 3, 3, 7),
(38, 1, 3, 4, 7),
(39, 1, 3, 5, 8),
(40, 1, 3, 6, 7),
(41, 1, 3, 7, 6),
(42, 1, 3, 8, 6),
(43, 1, 3, 9, 6),
(44, 1, 3, 10, 7),
(45, 1, 3, 11, 8),
(46, 1, 3, 12, 8),
(47, 1, 3, 13, 8),
(48, 1, 3, 14, 9),
(49, 1, 3, 15, 7),
(50, 1, 3, 16, 7),
(51, 1, 3, 17, 7),
(52, 1, 3, 18, 8);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `persona`
--

CREATE TABLE IF NOT EXISTS `persona` (
  `idPersona` int(11) NOT NULL AUTO_INCREMENT,
  `nombres` varchar(70) NOT NULL,
  `apellidoPaterno` varchar(45) NOT NULL,
  `apellidoMaterno` varchar(45) NOT NULL,
  `direccion` varchar(45) NOT NULL,
  `telefono` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  PRIMARY KEY (`idPersona`),
  UNIQUE KEY `uq_nombre_apellidoPaterno_apellidoMaterno` (`nombres`,`apellidoPaterno`,`apellidoMaterno`),
  UNIQUE KEY `uq_email` (`email`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=7 ;

--
-- Volcado de datos para la tabla `persona`
--

INSERT INTO `persona` (`idPersona`, `nombres`, `apellidoPaterno`, `apellidoMaterno`, `direccion`, `telefono`, `email`) VALUES
(1, 'Alex', 'Andrade', 'Mtz', 'W irlo Bronson Memorial Highway #764', '455-9988', 'yngwie-alex@hotmail.com'),
(2, 'Yngwie', 'Malmsteen', 'LannerBack', 'Highway #67', '+1748-9601', 'ymjl@gmail.com'),
(3, 'James Alan', 'Hetfield', '', 'Lincoln Rd. #494, San Francisco, California', '+1-887-5467', 'james.hetfiel@metallica.com'),
(5, 'Michael', 'Willy', 'Schenker', 'Flower St. #113, Berlin, Germany', '+1-555-6744', 'michael.schenker@michaelSchenkerHimself.com'),
(6, 'Rudolph', 'Willy', 'Schenker', 'Gleonaks Blvd. #997, Berlin, Germany', '+1-690-1342', 'rudolph.schenker@scorpions.com');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `socio`
--

CREATE TABLE IF NOT EXISTS `socio` (
  `idPersona` int(11) NOT NULL AUTO_INCREMENT,
  `idSucursal` int(11) NOT NULL,
  `claveSocio` varchar(10) NOT NULL,
  `handicap` int(10) unsigned NOT NULL,
  PRIMARY KEY (`idPersona`),
  UNIQUE KEY `uq_claveSocio` (`claveSocio`),
  KEY `fk_sucursal_idx` (`idSucursal`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=4 ;

--
-- Volcado de datos para la tabla `socio`
--

INSERT INTO `socio` (`idPersona`, `idSucursal`, `claveSocio`, `handicap`) VALUES
(1, 1, 'AAMTZ', 0),
(2, 1, 'YMLNB', 0),
(3, 1, 'JAHET', 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `sucursal`
--

CREATE TABLE IF NOT EXISTS `sucursal` (
  `idSucursal` int(11) NOT NULL AUTO_INCREMENT,
  `nombreSucursal` varchar(45) NOT NULL,
  `direccion` varchar(255) NOT NULL,
  `telefono` varchar(50) NOT NULL,
  PRIMARY KEY (`idSucursal`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=4 ;

--
-- Volcado de datos para la tabla `sucursal`
--

INSERT INTO `sucursal` (`idSucursal`, `nombreSucursal`, `direccion`, `telefono`) VALUES
(1, 'Lomas de Lourdes', 'Col. Lomas', '415-1515'),
(3, 'Club Campestre de Saltillo A.C.', 'Blvd. Ricardo Lopez Zertuche # 8650, Col. Los Cárdenas, Saltillo, Coahuila, México. C.P. 25200', '(844) 450-1100 | Fax. (844) 450-1128');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE IF NOT EXISTS `usuario` (
  `idPersona` int(11) NOT NULL,
  `nickName` varchar(45) NOT NULL,
  `password` varchar(1024) NOT NULL,
  PRIMARY KEY (`idPersona`),
  UNIQUE KEY `uq_nickName` (`nickName`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`idPersona`, `nickName`, `password`) VALUES
(5, 'michaelS', 'schenker123'),
(6, 'rudolphS', 'rudolphSchenker');

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `hoyo`
--
ALTER TABLE `hoyo`
  ADD CONSTRAINT `fk_idSucursal` FOREIGN KEY (`idSucursal`) REFERENCES `sucursal` (`idSucursal`);

--
-- Filtros para la tabla `juego`
--
ALTER TABLE `juego`
  ADD CONSTRAINT `fk_idSocioGanador` FOREIGN KEY (`idSocioGanador`) REFERENCES `socio` (`idPersona`);

--
-- Filtros para la tabla `juegodetalle`
--
ALTER TABLE `juegodetalle`
  ADD CONSTRAINT `fk_idHoyo` FOREIGN KEY (`idHoyo`) REFERENCES `hoyo` (`idHoyo`),
  ADD CONSTRAINT `fk_idJuego` FOREIGN KEY (`idJuego`) REFERENCES `juego` (`idJuego`),
  ADD CONSTRAINT `fk_idSocio` FOREIGN KEY (`idSocio`) REFERENCES `socio` (`idPersona`);

--
-- Filtros para la tabla `socio`
--
ALTER TABLE `socio`
  ADD CONSTRAINT `fk_sucursal` FOREIGN KEY (`idSucursal`) REFERENCES `sucursal` (`idSucursal`) ON DELETE NO ACTION ON UPDATE NO ACTION;
SET FOREIGN_KEY_CHECKS=1;
COMMIT;
