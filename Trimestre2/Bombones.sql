-- phpMyAdmin SQL Dump
-- version 2.11.7
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 21-03-2016 a las 09:49:04
-- Versión del servidor: 5.0.51
-- Versión de PHP: 5.2.6

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `bombones`
--
create database if not exists bombones;
use bombones;
-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `bombones`
--

CREATE TABLE IF NOT EXISTS `bombones` (
  `IDBombon` varchar(3) NOT NULL,
  `NombreBombon` varchar(40) default NULL,
  `TipoChocolate` varchar(20) default NULL,
  `TipoNuez` varchar(20) default NULL,
  `TipoRelleno` varchar(20) default NULL,
  `DescripcionBombon` longtext,
  `CosteBombon` decimal(19,4) default NULL,
  `Envoltorio` tinyint(1) NOT NULL,
  `Dibujo` longblob,
  PRIMARY KEY  (`IDBombon`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcar la base de datos para la tabla `bombones`
--

INSERT INTO `bombones` (`IDBombon`, `NombreBombon`, `TipoChocolate`, `TipoNuez`, `TipoRelleno`, `DescripcionBombon`, `CosteBombon`, `Envoltorio`, `Dibujo`) VALUES
('B01', 'Extasis Crepuscular', 'Agridulce', 'Anacardo', 'Crema de Moca', 'Almendra con crema de moca recubierto de chocolate agridulce, para ocultar a los amantes debajo de la tierra', 0.3334, -1, ''),
('B02', 'Mora Agridulce', 'Agridulce', 'Ninguno', 'Mora', 'Moras de las montañas Cascadas cubiertas con chocolate agridulce para darle ese toque alpino.', 0.2889, 0, ''),
('B03', 'Mazapán Hoja de roble', 'Agridulce', 'Ninguno', 'Mazapán', 'Mazapán con la legendaria forma de hoja de roble con una cubierta de suave chocolate', 0.3722, -1, ''),
('B04', 'Frambuesa Agridulce', 'Agridulce', 'Ninguno', 'Fresa', 'Fabulosas fresas salvajas cubiertas con chocolate agridulce para darles ese toque alpino.', 0.2778, 0, ''),
('B05', 'Baya Agridulce', 'Agridulce', 'Ninguno', 'Baya', 'Bayas de las Islas Orcas cubiertas con chocolate amargodulce para conseguir ese toque del Noroeste del Pacífico.', 0.2889, 0, ''),
('B06', 'Mermelada Agridulce', 'Agridulce', 'Ninguno', 'Mermelada', 'Mermelada recubierta con chocolate Agridulce para conseguir ese toque británico.', 0.3389, -1, ''),
('B07', 'Cereza Agridulce', 'Agridulce', 'Ninguno', 'Cereza entera', 'Cereza Ana Real cubierto con chocolate Agridulce para conseguir ese toque de realeza.', 0.2944, -1, ''),
('B08', 'Avellana Amarga', 'Agridulce', 'Avellana', 'Ninguno', 'Clásica Avellana cubierta de chocolate Agridulce', 0.2833, 0, ''),
('D01', 'Almendra Suprema', 'Oscuro', 'Almendra', 'Ninguno', 'Almendras enteras inmersas en chocolate oscuro.', 0.3166, -1, ''),
('D02', 'Corazón Envuelto', 'Oscuro', 'Ninguno', 'Crema de cereza', 'Chocolate oscuro con un coración de crema de cereza.', 0.3278, 0, ''),
('D03', 'Anacardo Suprema', 'Oscuro', 'Anacardo', 'Ninguno', 'Almendra gigante rodeada de chocolate oscuro.', 0.3334, 0, ''),
('D04', 'Almendra Ambrosia', 'Oscuro', 'Almendra', 'Amaretto', 'Avellana clásica con amaretto.', 0.3945, 0, ''),
('D06', 'Avellana Suprema', 'Oscuro', 'Avellana', 'Ninguno', 'Avellanas enteras inmersas en chocolate oscuro.', 0.2667, 0, ''),
('D07', 'Cereza Clásica', 'Oscuro', 'Ninguno', 'Cereza, entera', 'Cereza entera en chocolate oscuro clásico', 0.3055, 0, ''),
('D08', 'Chocolate Kiwi', 'Oscuro', 'Castaña del Brasil', 'Ninguno', 'Castaña del Brasil rodeada de oscuro chocolate, una sección transversal parecida a la del fruto del kiwi.', 0.3111, -1, ''),
('D09', 'Belleza Americana', 'Oscuro', 'Ninguno', 'Ninguno', 'Riquísimo chocolate oscuro esculpido con la forma de un capullo de rosa Belleza Americana.', 0.2833, 0, ''),
('D11', 'Mazapán Delicia', 'Oscuro', 'Ninguno', 'mazapán', 'Delicioso mazapán con chocolate oscuro.', 0.3611, 0, ''),
('F01', 'Nuez  Moca', 'Puro', 'Nuez', 'Crema de Moca', 'Dulce y cremosa moca con nueces', 0.2661, 0, ''),
('F02', 'Pistacho Moca', 'Puro', 'Pistacho', 'Crema de Moca', 'Dulce y cremosa moca con pistachos', 0.2667, 0, ''),
('M01', 'Frambuesa dulce', 'Puro', 'Ninguno', 'Fresa', 'Fabulosas fresas salvajes endulzadas con un cremoso chocolate con leche', 0.2611, -1, ''),
('M02', 'Macadamia Suprema', 'Leche', 'Macadamia', 'Ninguno', 'Macadamia entera rodeada de chocolate con leche.', 0.3722, 0, ''),
('M03', 'Pistacho Supremo', 'Leche', 'Pistacho', 'Ninguno', 'Conjunto de frutos de pistacho rodeados de chocolate con leche.', 0.3166, -1, ''),
('M04', 'Delicia Mantequilla Cacahuete', 'Leche', 'Ninguno', 'Mantequilla cacahuet', 'Duave y cremosa mantequilla de cacahuete de los más finos cacahuetes del Senegal, envuelta en chocolate con leche.', 0.2667, 0, ''),
('M05', 'Mazapán Pinzón', 'Leche', 'Ninguno', 'Mazapán', 'Mazapán con pistachos, bañados en chocolate con leche', 0.3278, 0, ''),
('M06', 'Corazón Amante', 'Leche', 'Ninguno', 'Crema de Cereza', 'Chocolate con leche en forma de corazón con dulce crema de cerezas a modo de relleno..', 0.2889, -1, ''),
('M07', 'Manzana Amore', 'Leche', 'Almendra', 'Ninguno', 'Cremoso chocolate con leche diseñado en forma de manzana con hojas de almendro.', 0.2833, 0, ''),
('M08', 'Arce de Mazapán', 'Leche', 'Ninguno', 'Mazapán', 'Mazapán con forma de hoja de arce con un envoltorio de chocolate con leche.', 0.3556, 0, ''),
('M09', 'Baya Dulce', 'Leche', 'Ninguno', 'Baya', 'Bayas de las islas Orcas endulzadas con cremoso chocolate con leche.', 0.2944, -1, ''),
('M10', 'No me olvides', 'Leche', 'Ninguno', 'Mora', 'Bayas rellenas de chocolate con leche inolvidables, envueltas en delicados no me olvides.', 0.2556, 0, ''),
('M11', 'Cereza Dulce', 'Leche', 'Ninguno', 'Cereza entera', 'Cerezas Royal Anne endulzadas con cremoso chocolate con leche.', 0.3000, 0, ''),
('M12', 'Baya Dulce', 'Leche', 'Ninguno', 'Mora', 'Bayas de las montañas Cascada endulzadas con cremoso chocolate con leche.', 0.2889, -1, ''),
('M13', 'Mermelada Dulce', 'Leche', 'Ninguno', 'Mermelada', 'Mermelada hecha con naranjas valencianas endulzada con cremoso chocolate con leche.', 0.2500, 0, ''),
('M14', 'Avellana Virgen', 'Leche', 'Avellana', 'Crema de cereza', 'Las avellanas más suaves cubiertas por un cremoso chocolate con leche.', 0.2944, -1, ''),
('M15', 'Palma Tropical', 'Leche', 'Ninguna', 'Coco', 'Chocolate con leche en forma de palma tropical rellena con coco.', 0.2778, 0, ''),
('M16', 'Maravilla Mazapán', 'Leche', 'Ninguna', 'Mazapán', 'Mazapán en forma de almendra con una capa de chocolate con leche grabado con  "MMmmm."', 0.3334, 0, ''),
('M17', 'Avellana Amaretto', 'Leche', 'Avellana', 'Amaretto', 'Avellana clásica y amaretto envueltos en chocolate con leche.', 0.3500, -1, ''),
('M18', 'Avellana Moca', 'Leche', 'Avellana', 'Crema de Moca', 'Avellana clásica y crema de moca suavizados con chocolate con leche.', 0.3334, 0, ''),
('W01', 'Golondrina de Mazapán', 'Blanco', 'Ninguna', 'Mazapán', 'Mazapán con forma de golondrina con alas de chocolate blanco.', 0.3389, -1, ''),
('W02', 'Calla Lily', 'Blanco', 'Ninguna', 'Ninguno', 'Elegante chocolate blando esculpido con forma de lirio.', 0.3000, 0, ''),
('W03', 'Corazón Destrozado', 'Blanco', 'Avellana', 'Ninguno', 'Dos mitades de bombón bañadas en chocolate blando con avellanas', 0.3166, -1, ''),
('W06', 'Brasileño Supremo', 'Blanco', 'Castaña del Brasil', 'Ninguno', 'Una castaña del Brasil entera bañada en chocolate blanco.', 0.3055, 0, '');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cajas`
--

CREATE TABLE IF NOT EXISTS `cajas` (
  `IDCaja` varchar(4) NOT NULL,
  `NombreCaja` varchar(40) default NULL,
  `Tamaño` smallint(5) default NULL,
  `DescripcionCaja` longtext,
  `PrecioCaja` decimal(19,4) default NULL,
  `CantidadDisponible` smallint(5) default NULL,
  `Descontada` tinyint(1) NOT NULL,
  PRIMARY KEY  (`IDCaja`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcar la base de datos para la tabla `cajas`
--

INSERT INTO `cajas` (`IDCaja`, `NombreCaja`, `Tamaño`, `DescripcionCaja`, `PrecioCaja`, `CantidadDisponible`, `Descontada`) VALUES
('ALLS', 'Todo el año', 12, 'Moras y fresas alpinas para disfrutar en cualquier estación del año, tanto dulces como amargas.', 4.5181, 700, 0),
('ALPI', 'Colección Alpina', 12, 'Directamente desde las altas Cascadas, moras  y fresas alpinas con nuestro mejor chocolate', 12.5000, 400, 0),
('AUTU', 'Colección Otoño', 16, 'Caja de tamaño familiar con nuestros favoritos--Mazapán Maple,Hoja de roble, Finch, and Golondrina.', 25.9036, 200, 0),
('BITT', 'Agridulce', 16, 'Nuestros mejores sabores amargos en mermelada, bayas y fresas.', 16.7169, 200, 0),
('CHER', 'Clásicos Cherry', 8, 'Nuestras mejores bayas enteras - dulces, amargas y clásicas.', 9.7892, 500, 0),
('FUDG', 'Fantasía de moca y chocolate', 12, 'Una colección de ensueño de nuestra línea de fudge - nuestro famosos centros de moca  bañados en fudge.', 10.8434, 400, 0),
('HEAV', 'Avellanas Celestiales', 8, 'Nuestro mejor surtido de avellanas - Avellana Suprema, Avellana con cerezas, Avellana Amaretto, Avellana  Moca, and Avellana Amarga.', 9.4880, 300, 0),
('INTE', 'Internacional', 16, 'Surtido internacional caracterizado por Belleza Americana, Brasileño Supremo, Chocolate Kiwi, y Palma Tropical.', 20.4819, 500, 0),
('ISLA', 'Colección Isla', 16, 'Delicadezas que le transportan a las islas - Chocolate Kiwi, Calla Lily,  Palma Tropical, y Golondrina de Mazapán.', 21.0843, 400, 0),
('LOVE', 'Corazones amantes', 8, 'Nuestro mejor chocolate blanco y negro en los corazones de nuestra colección--Corazón destrozado, Corazón amante, y Corazón en una hoja.', 10.5422, 300, 0),
('MARZ', 'Maravillas de mazapán', 12, 'Un surtido de nuestras maravillas de mazapán almendradas.', 19.4277, 500, 0),
('NORT', 'Colección Viento del Norte', 16, 'Para los amantes de las actividades al aire libre, nuestra exclusiva colección--Mazapán Finch, Golondrina de Mazapán, No me olvides, Belleza Americana, Calla Lily, and Extasis Luz Vela.', 20.0301, 700, 0),
('PACI', 'Opulencia del Pacífico', 8, 'Nuestro más opulento surtido, excelentes dulces del Pacífico--Calla Lily, Avellana Amaretto, Avellana Moca, and Almendra Ambrosia', 12.6506, 500, 0),
('PEAN', 'Delicias de Mantequilla de Cacahuete', 12, 'Delicias de suave mantequilla de cachuete cubiertas de chocolate capaces de deshacer el corazón de cualquiera.', 11.4458, 900, 0),
('RAR1', 'Rara ella', 10, 'Exótica a más no poder', 24.0964, 345, 0),
('RAR2', 'Rara bastante', 11, 'Con bombón de chorizo y otras novedades', 18.0723, 111, 0),
('ROMA', 'Colección Romántica', 16, 'Nuestro surtido romántico clásico - Almendra Ambrosía, Extasis Luz de vela, Belleza americana, Apple Amore, No me olvides, Corazón destrozado y Corazón amante.', 20.6325, 700, 0),
('SUPR', 'Supremas', 8, 'Surtido de nuestros bombones con frutos secos: Avellana, Almendra, Brasileño. Pistacho, Cashew y Macadamia.', 14.9940, 400, 0),
('SWE2', 'Cremas dulces', 12, 'Cremas dulces para todo aquel que le apasione los rellenos de crema - moca, cherry y mantequilla de cacahuete', 13.8554, 200, 0),
('SWEE', 'Dulces y Amargos', 16, 'Nuestra mejor combinación de fresa, cerezay, mermelada, moras y bayas dulces y amargas.', 16.7169, 300, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

CREATE TABLE IF NOT EXISTS `clientes` (
  `IdCliente` int(10) NOT NULL auto_increment,
  `Apellidos` varchar(20) default NULL,
  `Nombre` varchar(15) default NULL,
  `Calle` varchar(30) default NULL,
  `Ciudad` varchar(15) default NULL,
  `Provincia` varchar(20) default NULL,
  `CodigoPostal` varchar(10) default NULL,
  `Telefono` varchar(24) default NULL,
  PRIMARY KEY  (`IdCliente`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=29 ;

--
-- Volcar la base de datos para la tabla `clientes`
--

INSERT INTO `clientes` (`IdCliente`, `Apellidos`, `Nombre`, `Calle`, `Ciudad`, `Provincia`, `CodigoPostal`, `Telefono`) VALUES
(1, 'Tienza Ramán', 'Carmen', 'Condesa de Venedito, 12', 'Madrid', 'Madrid', '28001', '915552933'),
(2, 'Guardiola Bartolomé', 'José Vicente', 'Marvá, 28', 'Alicante', 'Alicante', '03004', '965555235'),
(3, 'Alcolea Alemañ', 'Sergio', 'Ribadeo, 3', 'Aspe', 'Alicante', '03045', NULL),
(4, 'Artero Salcedo', 'Jesús', 'Plaza de España, 2', 'Madrid', 'Madrid', '28001', '915556789'),
(5, 'Samaniego Muñoz', 'Natalia', 'Calvo Sotelo, 42', 'Granada', 'Granada', '13002', '958555393'),
(6, 'Túnez Rodriguez', 'Alberto', 'Gran Via, 344', 'Madrid', 'Madrid', '28065', '915557355'),
(7, 'García Martínez', 'María del Prado', 'Castellana, 1456', 'Madrid', 'Madrid', '28034', '915552798'),
(8, 'Rodriguez Sánchez', 'Carmen', 'Rambla Mendez Nuñez, 54', 'Alicante', 'Alicante', '03014', '965105646'),
(9, 'Perez López', 'Juan', 'Rambla Mendez Nuñez, 21', 'Alicante', 'Alicante', '03014', '965105365'),
(10, 'Fernandez García', 'Jesús', 'Av. Constitución, 14', 'Cadiz', 'Cadiz', '10001', '912555489'),
(11, 'Sánchez Alonso', 'Francisco', 'Perez Galdos, 32', 'Valladolid', 'Valladolid', '11788', '914555248'),
(12, 'Perez López', 'Nicolas', 'Diagonal, 342', 'Barcelona', 'Barcelona', '79408', '915555808'),
(13, 'Garcia Navarro', 'Juan', 'Plaza de los Luceros, 88', 'Vic', 'Gerona', '19047', '915555808'),
(14, 'Pujante Martinez', 'José Luis', 'Parque María Luisa, 23', 'Sevilla', 'Sevilla', '81230', '954555345'),
(15, 'Lanos García', 'Luis', 'Alcazaba,12', 'Almería', 'Almería', '10011', '917555290'),
(16, 'Ramos López', 'María', 'Paseo Hondonada,12', 'Jaén', 'Jaén', '10033', '929555224'),
(17, 'Alonso Túnez', 'Alberto', 'Avenida Menéndez Pelayo, 1', 'Madrid', 'Madrid', '28009', '915559573'),
(18, 'Bustamante Lanos', 'Alonso', 'Calle Recastillejos,45', 'Aranda de Duero', 'Burgos', '17033', '915-55-58-08'),
(19, 'Abad Pérez', 'Cecilia', 'Calle de la Alhambra,25', 'Granada', 'Granada', '07052', '958555497'),
(20, 'Abelló Gónzales', 'José Antonio', 'Calle Miró,50', 'Badalona', 'Barcelona', '99508', '915555758'),
(21, 'Salisa Goméz', 'Virtudes', 'Calle del Paseo,23', 'Málaga', 'Málaga', '23889', '906555139'),
(22, 'Ramos Elez', 'Alejandra', 'Sol,56', 'Madrid', 'Madrid', '28002', '915558049'),
(23, 'Sanz Gómez', 'Javier', 'Calle Arturo Soria,54', 'Madrid', 'Madrid', '19000', '915552179'),
(24, 'Jimenez Sanz', 'Luisa', 'Calle Luna, 78', 'Sevilla', 'Sevilla', '34009', NULL),
(25, 'Aceiro Pérez', 'Luis', 'Calle San Juan, 45', 'Merida', 'Badajoz', '65098', '924578788'),
(26, 'Perez López', 'Ramón', 'Calle la pedrera,56', 'Barcelona', 'Barcelona', '79888', '915676776'),
(27, 'García Nuñez', 'Cristina', 'Calle San pedro, 45', 'Mérida', 'Badajoz', '65098', '924786767'),
(28, 'Pérez Ramos', 'Carlos', 'Calle Luna, 5', 'Cáceres', 'Cáceres', '66766', '927454599');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detallescajas`
--

CREATE TABLE IF NOT EXISTS `detallescajas` (
  `IDCaja` varchar(4) NOT NULL,
  `IDBombon` varchar(3) NOT NULL,
  `Cantidad` smallint(5) default NULL,
  PRIMARY KEY  (`IDCaja`,`IDBombon`),
  KEY `BombonesDetallesCajas` (`IDBombon`),
  KEY `CajasDetallesCajas` (`IDCaja`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcar la base de datos para la tabla `detallescajas`
--

INSERT INTO `detallescajas` (`IDCaja`, `IDBombon`, `Cantidad`) VALUES
('ALLS', 'B02', 2),
('ALLS', 'B04', 2),
('ALLS', 'B05', 2),
('ALLS', 'M01', 2),
('ALLS', 'M09', 2),
('ALLS', 'M12', 2),
('ALPI', 'B02', 4),
('ALPI', 'B04', 5),
('ALPI', 'B05', 5),
('ALPI', 'M12', 4),
('AUTU', 'B03', 6),
('AUTU', 'M05', 6),
('AUTU', 'M08', 6),
('AUTU', 'W01', 6),
('BITT', 'B02', 5),
('BITT', 'B04', 5),
('BITT', 'B05', 5),
('BITT', 'B06', 5),
('BITT', 'B07', 5),
('CHER', 'B07', 4),
('CHER', 'D07', 4),
('CHER', 'M11', 4),
('FUDG', 'B04', 4),
('FUDG', 'B05', 4),
('FUDG', 'F01', 9),
('FUDG', 'M02', 9),
('FUDG', 'W03', 4),
('HEAV', 'B08', 3),
('HEAV', 'D06', 2),
('HEAV', 'M14', 2),
('HEAV', 'M15', 2),
('HEAV', 'M16', 2),
('INTE', 'D08', 6),
('INTE', 'D09', 6),
('INTE', 'M05', 6),
('INTE', 'W06', 6),
('ISLA', 'D08', 6),
('ISLA', 'M08', 6),
('ISLA', 'M15', 6),
('ISLA', 'W02', 6),
('LOVE', 'D02', 4),
('LOVE', 'M06', 4),
('LOVE', 'W03', 4),
('MARZ', 'B03', 3),
('MARZ', 'D11', 3),
('MARZ', 'M05', 3),
('MARZ', 'M08', 3),
('MARZ', 'M16', 3),
('MARZ', 'W01', 3),
('NORT', 'B01', 4),
('NORT', 'D09', 4),
('NORT', 'M05', 4),
('NORT', 'M10', 4),
('NORT', 'W01', 4),
('NORT', 'W02', 4),
('PACI', 'D04', 3),
('PACI', 'M17', 3),
('PACI', 'M18', 3),
('PACI', 'W02', 3),
('PEAN', 'M04', 18),
('RAR1', 'M11', 6),
('RAR1', 'M13', 6),
('RAR2', 'B04', 5),
('RAR2', 'B05', 5),
('ROMA', 'B01', 4),
('ROMA', 'D02', 3),
('ROMA', 'D04', 3),
('ROMA', 'D09', 3),
('ROMA', 'M06', 3),
('ROMA', 'M07', 3),
('ROMA', 'M10', 3),
('ROMA', 'W03', 3),
('SUPR', 'D01', 2),
('SUPR', 'D03', 2),
('SUPR', 'D06', 2),
('SUPR', 'M02', 2),
('SUPR', 'M03', 2),
('SUPR', 'W06', 2),
('SWE2', 'B01', 6),
('SWE2', 'M04', 6),
('SWE2', 'M06', 6),
('SWEE', 'B02', 2),
('SWEE', 'B04', 3),
('SWEE', 'B05', 3),
('SWEE', 'B06', 3),
('SWEE', 'B07', 3),
('SWEE', 'M01', 2),
('SWEE', 'M09', 2),
('SWEE', 'M11', 2),
('SWEE', 'M12', 2),
('SWEE', 'M13', 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detallespedidos`
--

CREATE TABLE IF NOT EXISTS `detallespedidos` (
  `IDPedido` int(10) NOT NULL,
  `IDCaja` varchar(4) NOT NULL,
  `Cantidad` smallint(5) default NULL,
  PRIMARY KEY  (`IDPedido`,`IDCaja`),
  KEY `CajasDetallesPedidos` (`IDCaja`),
  KEY `PedidosDetallesPedidos` (`IDPedido`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcar la base de datos para la tabla `detallespedidos`
--

INSERT INTO `detallespedidos` (`IDPedido`, `IDCaja`, `Cantidad`) VALUES
(1, 'BITT', 1),
(1, 'FUDG', 1),
(1, 'HEAV', 2),
(1, 'INTE', 1),
(1, 'NORT', 2),
(1, 'PEAN', 1),
(1, 'ROMA', 2),
(1, 'SWEE', 2),
(2, 'ALPI', 2),
(2, 'AUTU', 1),
(2, 'BITT', 1),
(2, 'NORT', 2),
(2, 'SUPR', 1),
(3, 'BITT', 2),
(3, 'NORT', 1),
(3, 'SUPR', 1),
(3, 'SWE2', 1),
(3, 'SWEE', 2),
(4, 'ALPI', 2),
(4, 'MARZ', 1),
(4, 'PEAN', 2),
(5, 'ALPI', 1),
(5, 'INTE', 2),
(5, 'ROMA', 1),
(5, 'SWE2', 1),
(5, 'SWEE', 1),
(6, 'ALLS', 1),
(6, 'ALPI', 1),
(6, 'BITT', 2),
(6, 'HEAV', 1),
(6, 'LOVE', 1),
(6, 'NORT', 2),
(7, 'HEAV', 1),
(7, 'LOVE', 2),
(7, 'NORT', 2),
(7, 'PACI', 1),
(7, 'PEAN', 1),
(7, 'ROMA', 2),
(8, 'CHER', 1),
(8, 'FUDG', 1),
(8, 'LOVE', 2),
(8, 'NORT', 2),
(8, 'PACI', 1),
(8, 'PEAN', 1),
(8, 'ROMA', 2),
(9, 'AUTU', 1),
(9, 'BITT', 2),
(9, 'CHER', 1),
(9, 'HEAV', 1),
(9, 'INTE', 1),
(9, 'MARZ', 2),
(9, 'NORT', 2),
(9, 'PEAN', 1),
(9, 'ROMA', 1),
(9, 'SWE2', 2),
(9, 'SWEE', 2),
(10, 'ALLS', 1),
(10, 'ALPI', 1),
(10, 'LOVE', 2),
(10, 'ROMA', 2),
(10, 'SUPR', 1),
(10, 'SWE2', 1),
(11, 'AUTU', 1),
(11, 'BITT', 2),
(11, 'CHER', 2),
(11, 'FUDG', 2),
(11, 'HEAV', 1),
(11, 'INTE', 1),
(11, 'LOVE', 1),
(11, 'SWEE', 1),
(12, 'ALPI', 2),
(12, 'BITT', 1),
(12, 'INTE', 2),
(12, 'LOVE', 1),
(12, 'SWE2', 1),
(13, 'BITT', 1),
(13, 'CHER', 2),
(13, 'LOVE', 1),
(13, 'NORT', 2),
(13, 'PEAN', 1),
(13, 'SUPR', 1),
(14, 'AUTU', 2),
(14, 'BITT', 1),
(14, 'FUDG', 1),
(14, 'HEAV', 1),
(14, 'LOVE', 2),
(14, 'PACI', 1),
(14, 'ROMA', 2),
(15, 'BITT', 1),
(15, 'HEAV', 2),
(15, 'NORT', 2),
(15, 'PEAN', 1),
(15, 'SWE2', 2),
(15, 'SWEE', 1),
(16, 'ALPI', 1),
(16, 'AUTU', 1),
(16, 'CHER', 1),
(16, 'FUDG', 2),
(16, 'ISLA', 2),
(16, 'LOVE', 1),
(16, 'NORT', 2),
(16, 'PACI', 2),
(16, 'ROMA', 1),
(17, 'BITT', 1),
(17, 'CHER', 1),
(17, 'FUDG', 1),
(17, 'ISLA', 2),
(17, 'MARZ', 2),
(17, 'ROMA', 2),
(17, 'SUPR', 2),
(17, 'SWEE', 1),
(18, 'ALPI', 1),
(18, 'FUDG', 1),
(18, 'HEAV', 1),
(18, 'PACI', 1),
(18, 'SUPR', 1),
(18, 'SWEE', 1),
(19, 'AUTU', 1),
(19, 'CHER', 2),
(19, 'LOVE', 2),
(20, 'AUTU', 2),
(20, 'FUDG', 2),
(20, 'NORT', 1),
(20, 'PACI', 1),
(20, 'ROMA', 1),
(21, 'CHER', 1),
(21, 'HEAV', 2),
(21, 'ROMA', 1),
(21, 'SWE2', 1),
(22, 'AUTU', 1),
(22, 'CHER', 1),
(22, 'HEAV', 2),
(22, 'LOVE', 2),
(22, 'NORT', 2),
(22, 'SWE2', 2),
(22, 'SWEE', 1),
(23, 'BITT', 1),
(23, 'FUDG', 1),
(23, 'HEAV', 2),
(23, 'ISLA', 2),
(23, 'LOVE', 1),
(23, 'ROMA', 1),
(24, 'BITT', 2),
(24, 'HEAV', 1),
(24, 'LOVE', 1),
(24, 'NORT', 1),
(25, 'ALLS', 1),
(25, 'ALPI', 1),
(25, 'BITT', 1),
(25, 'LOVE', 2),
(25, 'SWE2', 2),
(26, 'BITT', 1),
(26, 'MARZ', 2),
(26, 'NORT', 1),
(26, 'ROMA', 2),
(26, 'SWE2', 1),
(26, 'SWEE', 2),
(27, 'ALLS', 1),
(27, 'FUDG', 2),
(27, 'HEAV', 2),
(27, 'INTE', 1),
(27, 'LOVE', 1),
(27, 'NORT', 2),
(27, 'ROMA', 1),
(27, 'SUPR', 1),
(27, 'SWEE', 1),
(28, 'AUTU', 1),
(28, 'BITT', 1),
(28, 'CHER', 1),
(28, 'FUDG', 2),
(28, 'ISLA', 2),
(29, 'BITT', 1),
(29, 'FUDG', 2),
(29, 'HEAV', 1),
(29, 'ISLA', 2),
(29, 'NORT', 2),
(30, 'PEAN', 2),
(30, 'SWEE', 2),
(31, 'INTE', 2),
(31, 'ROMA', 1),
(32, 'ALPI', 2),
(32, 'AUTU', 1),
(33, 'ALPI', 2),
(33, 'BITT', 1),
(33, 'NORT', 2),
(33, 'SUPR', 1),
(34, 'SUPR', 1),
(34, 'SWE2', 1),
(35, 'MARZ', 2),
(35, 'NORT', 2),
(35, 'SWEE', 2),
(36, 'ALPI', 1),
(36, 'INTE', 2),
(36, 'PEAN', 1),
(36, 'ROMA', 2),
(37, 'SWE2', 1),
(37, 'SWEE', 2),
(38, 'ALPI', 2),
(38, 'ROMA', 2),
(39, 'HEAV', 2),
(39, 'NORT', 1),
(40, 'ALLS', 1),
(40, 'BITT', 1),
(41, 'HEAV', 1),
(41, 'LOVE', 1),
(42, 'LOVE', 2),
(42, 'PACI', 2),
(43, 'FUDG', 2),
(43, 'NORT', 2),
(43, 'PEAN', 2),
(43, 'ROMA', 2),
(44, 'CHER', 2),
(44, 'LOVE', 2),
(45, 'NORT', 2),
(45, 'PACI', 2),
(46, 'PEAN', 2),
(46, 'ROMA', 2),
(47, 'AUTU', 2),
(47, 'BITT', 2),
(48, 'HEAV', 2),
(48, 'MARZ', 2),
(49, 'CHER', 2),
(49, 'NORT', 2),
(50, 'INTE', 2),
(50, 'PEAN', 2),
(51, 'ALLS', 2),
(51, 'ALPI', 2),
(51, 'ROMA', 2),
(51, 'SWE2', 2),
(51, 'SWEE', 2),
(52, 'LOVE', 2),
(52, 'ROMA', 1),
(52, 'SUPR', 1),
(52, 'SWE2', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pedidos`
--

CREATE TABLE IF NOT EXISTS `pedidos` (
  `IDPedido` int(10) NOT NULL,
  `IDCliente` int(10) default NULL,
  `IDTransportista` double(15,5) default NULL,
  `FechaPedido` datetime default NULL,
  `Regalo` tinyint(1) NOT NULL,
  `FormaPedido` double(15,5) default NULL,
  `NumeroCuenta` varchar(20) default NULL,
  `FechaExpiracion` datetime default NULL,
  `TarjetaCredito` double(15,5) default NULL,
  PRIMARY KEY  (`IDPedido`),
  KEY `ClientesPedidos` (`IDCliente`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcar la base de datos para la tabla `pedidos`
--

INSERT INTO `pedidos` (`IDPedido`, `IDCliente`, `IDTransportista`, `FechaPedido`, `Regalo`, `FormaPedido`, `NumeroCuenta`, `FechaExpiracion`, `TarjetaCredito`) VALUES
(1, 1, 2.00000, '2000-01-07 00:00:00', -1, 1.00000, '2045', '2005-05-01 00:00:00', 1.00000),
(2, 5, 3.00000, '2000-02-08 00:00:00', -1, 1.00000, '2945', '2005-03-01 00:00:00', 3.00000),
(3, 24, 1.00000, '2000-02-14 00:00:00', -1, 1.00000, '1833', '2006-05-01 00:00:00', 1.00000),
(4, 26, 2.00000, '2000-02-22 00:00:00', -1, 1.00000, '2709', '2005-03-01 00:00:00', 3.00000),
(5, 16, 3.00000, '2000-03-05 00:00:00', -1, 2.00000, '1265', '2001-06-01 00:00:00', 3.00000),
(6, 11, 1.00000, '1999-04-17 00:00:00', -1, 1.00000, '1805', '2006-05-01 00:00:00', 3.00000),
(7, 28, 3.00000, '2000-05-11 00:00:00', -1, 1.00000, '1713', '2006-05-01 00:00:00', 2.00000),
(8, 4, 3.00000, '2000-05-16 00:00:00', 0, 2.00000, '2765', '2005-03-01 00:00:00', 1.00000),
(9, 16, 3.00000, '2000-05-17 00:00:00', -1, 2.00000, '2445', '2007-04-01 00:00:00', 3.00000),
(10, 18, 1.00000, '2000-05-20 00:00:00', -1, 2.00000, '2003', '2006-05-01 00:00:00', 1.00000),
(11, 19, 1.00000, '2000-05-07 00:00:00', 0, 1.00000, '1491', '2007-06-01 00:00:00', 2.00000),
(12, 25, 1.00000, '2000-05-08 00:00:00', -1, 1.00000, '1373', '2007-01-01 00:00:00', 2.00000),
(13, 10, 3.00000, '1999-05-09 00:00:00', -1, 1.00000, '1641', '2006-05-01 00:00:00', 3.00000),
(14, 2, 1.00000, '2000-05-25 00:00:00', -1, 1.00000, '1679', '2006-05-01 00:00:00', 2.00000),
(15, 19, 2.00000, '2000-07-03 00:00:00', 0, 2.00000, '2847', '2005-03-01 00:00:00', 1.00000),
(16, 22, 3.00000, '2000-07-18 00:00:00', -1, 1.00000, '1263', '2007-06-01 00:00:00', 3.00000),
(17, 12, 2.00000, '2000-08-01 00:00:00', -1, 1.00000, '2685', '2005-03-01 00:00:00', 3.00000),
(18, 15, 2.00000, '2000-08-02 00:00:00', 0, 1.00000, '2157', '2007-04-01 00:00:00', 2.00000),
(19, 13, 1.00000, '2000-08-08 00:00:00', 0, 1.00000, '2183', '2007-04-01 00:00:00', 3.00000),
(20, 1, 2.00000, '2000-08-09 00:00:00', 0, 1.00000, '2979', '2004-03-01 00:00:00', 2.00000),
(21, 8, 3.00000, '2000-08-19 00:00:00', 0, 1.00000, '2721', '2005-03-01 00:00:00', 3.00000),
(22, 25, 3.00000, '2000-10-12 00:00:00', -1, 1.00000, '1443', '2007-06-01 00:00:00', 1.00000),
(23, 3, 2.00000, '2000-10-13 00:00:00', -1, 1.00000, '2849', '2005-03-01 00:00:00', 2.00000),
(24, 2, 3.00000, '2000-10-30 00:00:00', -1, 1.00000, '2117', '2007-04-01 00:00:00', 1.00000),
(25, 14, 1.00000, '1999-11-05 00:00:00', -1, 1.00000, '2363', '2007-04-01 00:00:00', 1.00000),
(26, 27, 2.00000, '2000-11-22 00:00:00', -1, 2.00000, '2379', '2007-04-01 00:00:00', 1.00000),
(27, 13, 2.00000, '1999-11-25 00:00:00', 0, 1.00000, '1697', '2006-05-01 00:00:00', 3.00000),
(28, 22, 2.00000, '1999-12-16 00:00:00', -1, 1.00000, '1607', '2006-05-01 00:00:00', 2.00000),
(29, 6, 2.00000, '2000-05-11 00:00:00', 0, 2.00000, '5545', '2003-02-08 00:00:00', 1.00000),
(30, 9, 1.00000, '2000-08-09 00:00:00', -1, 2.00000, '1643', '2001-05-08 00:00:00', 3.00000),
(31, 10, 2.00000, '2000-05-25 00:00:00', -1, 1.00000, '7854', '2007-06-11 00:00:00', 2.00000),
(32, 11, 2.00000, '2000-08-09 00:00:00', 0, 2.00000, '5544', '2001-02-08 00:00:00', 1.00000),
(33, 12, 1.00000, '2000-05-25 00:00:00', 0, 1.00000, '1573', '2007-06-01 00:00:00', 2.00000),
(34, 13, 2.00000, '2000-05-25 00:00:00', 0, 2.00000, '4586', '2007-06-21 00:00:00', 1.00000),
(35, 14, 3.00000, '2000-05-11 00:00:00', 0, 2.00000, '2456', '2001-01-23 00:00:00', 2.00000),
(36, 15, 2.00000, '2000-05-25 00:00:00', -1, 2.00000, '2323', '2007-06-01 00:00:00', 3.00000),
(37, 16, 1.00000, '2000-05-11 00:00:00', -1, 2.00000, '1677', '2001-02-18 00:00:00', 3.00000),
(38, 17, 2.00000, '2000-08-09 00:00:00', 0, 2.00000, '3445', '2004-02-08 00:00:00', 1.00000),
(39, 18, 1.00000, '2000-05-11 00:00:00', 0, 1.00000, '7952', '2003-06-09 00:00:00', 2.00000),
(40, 19, 3.00000, '2000-05-11 00:00:00', 0, 1.00000, '7657', '2007-06-01 00:00:00', 2.00000),
(41, 20, 2.00000, '2000-05-25 00:00:00', 0, 2.00000, '2578', '2007-02-11 00:00:00', 2.00000),
(42, 21, 1.00000, '2000-10-12 00:00:00', -1, 2.00000, '5677', '2003-01-08 00:00:00', 1.00000),
(43, 22, 2.00000, '2000-05-11 00:00:00', 0, 2.00000, '5424', '2002-03-08 00:00:00', 3.00000),
(44, 23, 1.00000, '2000-10-12 00:00:00', 0, 1.00000, '5663', '2001-03-12 00:00:00', 1.00000),
(45, 24, 2.00000, '2000-05-11 00:00:00', -1, 2.00000, '4565', '2007-06-01 00:00:00', 3.00000),
(46, 25, 3.00000, '2000-10-12 00:00:00', 0, 2.00000, '5675', '2002-02-08 00:00:00', 2.00000),
(47, 26, 1.00000, '2000-10-12 00:00:00', 0, 2.00000, '3466', '2004-02-01 00:00:00', 3.00000),
(48, 27, 2.00000, '2000-10-12 00:00:00', 0, 1.00000, '2456', '2003-02-17 00:00:00', 3.00000),
(49, 28, 1.00000, '2000-10-12 00:00:00', 0, 1.00000, '7555', '2001-02-08 00:00:00', 3.00000),
(50, 6, 2.00000, '2000-05-25 00:00:00', 0, 1.00000, '6745', '2002-06-11 00:00:00', 3.00000),
(51, 7, 3.00000, '2000-08-09 00:00:00', 0, 1.00000, '2343', '2004-02-08 00:00:00', 1.00000),
(52, 9, 1.00000, '2000-05-25 00:00:00', 0, 1.00000, '1345', '2007-06-01 00:00:00', 2.00000);

--
-- Filtros para las tablas descargadas (dump)
--

--
-- Filtros para la tabla `detallescajas`

ALTER TABLE `detallescajas`
  ADD CONSTRAINT `BombonesDetallesCajas` FOREIGN KEY (`IDBombon`) REFERENCES `bombones` (`IDBombon`),
  ADD CONSTRAINT `CajasDetallesCajas` FOREIGN KEY (`IDCaja`) REFERENCES `cajas` (`IDCaja`);

--
-- Filtros para la tabla `detallespedidos`

ALTER TABLE `detallespedidos`
  ADD CONSTRAINT `CajasDetallesPedidos` FOREIGN KEY (`IDCaja`) REFERENCES `cajas` (`IDCaja`),
  ADD CONSTRAINT `PedidosDetallesPedidos` FOREIGN KEY (`IDPedido`) REFERENCES `pedidos` (`IDPedido`);

--
-- Filtros para la tabla `pedidos`

ALTER TABLE `pedidos`
  ADD CONSTRAINT `ClientesPedidos` FOREIGN KEY (`IDCliente`) REFERENCES `clientes` (`IdCliente`);
