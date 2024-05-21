-- phpMyAdmin SQL Dump
-- version 3.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 26-02-2013 a las 18:41:14
-- Versión del servidor: 5.5.24-log
-- Versión de PHP: 5.3.13

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `groupon`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `seas01`
--

CREATE TABLE IF NOT EXISTS `seas01` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `NOMBRE` varchar(200) DEFAULT NULL,
  `DESCRIPCION` varchar(250) DEFAULT NULL,
  `LONGITUD` varchar(100) DEFAULT NULL,
  `LATITUD` varchar(100) DEFAULT NULL,
  `IMAGEN` varchar(250) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM  DEFAULT CHARSET=utf8 AUTO_INCREMENT=14 ;

--
-- Volcado de datos para la tabla `seas01`
--

INSERT INTO `seas01` (`ID`, `NOMBRE`, `DESCRIPCION`, `LONGITUD`, `LATITUD`, `IMAGEN`) VALUES
(1, 'Seas, Estudios Abiertos', 'El sistema de Formacion Abierta de SEAS combina la metodologia a distancia con las nuevas tecnologias de comunicacion.', '41.67130099910645', '-0.878981351852417', 'Seas.png'),
(3, 'Hospital La Maz', 'MAZ dispone de una amplia red de centros asistenciales y hospitalarios propios y concertados distribuidos por todo el estado, especificos para la prestacion de asistencia a nuestros trabajadores protegidos, y donde la prioridad es dar un servicio de ', '41.68586103098603', '-0.8687353134155273', 'Hospitales.png'),
(4, 'Seas', 'Seas Estudios Superiores Abiertos. DelegaciÃ³n Centro Zaragoza', '41.64785539330573', '-0.8823448419570923', 'Seas.png'),
(5, 'Hospital Miguel Servet', 'Hospital Central de Zaragoza', '41.634874480570886', '-0.8996987342834473', 'Hospitales.png'),
(6, 'Hospital General de la Defensa de Zaragoza', 'Hospital Militar de Zaragoza', '41.63027962121499', '-0.9045052528381348', 'Hospitales.png'),
(7, 'Hospital Quiron Zaragoza', 'Clinica Quiron Zaragoza', '41.63666261827313', '-0.8937549591064453', 'Hospitales.png'),
(8, 'CLINICA NTRA. SRA. DEL PILAR', 'La superacion diaria y el esfuerzo en mejorar dia a dia es la filosofia que orienta el trabajo en la Clinica Nuestra Senora del Pilar.', '41.63715975985198', '-0.8889055252075195', 'Hospitales.png'),
(9, 'Clinica Montpellier', 'En junio de 1.970 se da forma al edificio moderno y funcional que alberga la Clinica Montpellier, que durante mas de 30 anos de servicio, se ha ganado a pulso un merecido prestigio dentro y fuera de la ciudad de Zaragoza.', '41.63626169485176', '-0.9138822555541992', 'Hospitales.png'),
(10, 'IberCaja', 'Sucursal de IberCaja', '41.669152', '-0.876903', 'Bancos.png'),
(11, 'CAI', 'Sucursal CAI', '41.669154', '-0.876605', 'Bancos.png'),
(12, 'Galerias Primero', 'Supermercado de Confianza, Galerias Primero', '41.670817', '-0.875522', 'Tiendas.png'),
(13, 'Gasolinera BP', 'Estacion de Servicio 24h', '41.666236', '-0.877179', 'Gasolineras.png');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE IF NOT EXISTS `usuario` (
  `ID_USUARIO` int(4) NOT NULL AUTO_INCREMENT,
  `EMAIL` varchar(50) COLLATE utf8_spanish2_ci NOT NULL,
  `PASS` varchar(25) COLLATE utf8_spanish2_ci NOT NULL,
  PRIMARY KEY (`ID_USUARIO`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci AUTO_INCREMENT=3 ;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`ID_USUARIO`, `EMAIL`, `PASS`) VALUES
(1, 'a@svalero.com', '1234'),
(2, 'b@svalero.com', '1234');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
