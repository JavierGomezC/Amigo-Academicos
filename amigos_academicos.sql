-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 21-06-2018 a las 04:04:39
-- Versión del servidor: 10.1.30-MariaDB
-- Versión de PHP: 7.2.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `amigos_academicos`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `asesor`
--

CREATE TABLE `asesor` (
  `nombre` varchar(30) NOT NULL,
  `codigo` int(30) NOT NULL,
  `semestre` int(30) NOT NULL,
  `carrera` varchar(30) NOT NULL,
  `materia` varchar(30) NOT NULL,
  `puntuacion` int(255) NOT NULL,
  `puntuaciones` int(255) NOT NULL,
  `puntuacionprom` float NOT NULL,
  `celular` int(30) NOT NULL,
  `clave` varchar(30) NOT NULL,
  `cedula` int(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `asesor`
--

INSERT INTO `asesor` (`nombre`, `codigo`, `semestre`, `carrera`, `materia`, `puntuacion`, `puntuaciones`, `puntuacionprom`, `celular`, `clave`, `cedula`) VALUES
('Alguien', 115123, 5, 'Ing de algo', 'Matealgo', 0, 0, 0, 3315634, 'miclave', 1090513),
('Carlos Rene', 11505372, 10, 'Ingeniería de Sistemas', 'Programacion Web', 0, 0, 0, 3415125, '1234', 105897235);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `asesoria`
--

CREATE TABLE `asesoria` (
  `id` int(30) NOT NULL,
  `idAsesor` int(30) NOT NULL,
  `idEstudiante` int(30) NOT NULL,
  `tema` varchar(30) NOT NULL,
  `terminada` tinyint(1) NOT NULL,
  `dia` int(30) NOT NULL,
  `mes` int(30) NOT NULL,
  `anio` int(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `estudiante`
--

CREATE TABLE `estudiante` (
  `nombre` varchar(30) NOT NULL,
  `codigo` int(30) NOT NULL,
  `semestre` int(30) NOT NULL,
  `carrera` varchar(30) NOT NULL,
  `celular` int(30) NOT NULL,
  `clave` varchar(30) NOT NULL,
  `cedula` int(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `estudiante`
--

INSERT INTO `estudiante` (`nombre`, `codigo`, `semestre`, `carrera`, `celular`, `clave`, `cedula`) VALUES
('Javier Gomez', 1151486, 5, 'Ing Sistemas', 314454431, 'algo123', 1090519880),
('alguien', 1151487, 0, 'Ingeniería de Sistemas', 0, 'algo123', 1090519881);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `hora`
--

CREATE TABLE `hora` (
  `hora` int(30) NOT NULL,
  `minuto` int(30) NOT NULL,
  `dia` varchar(30) NOT NULL,
  `ocupado` int(11) NOT NULL,
  `idHorario` int(100) DEFAULT NULL,
  `idAsesoria` int(30) DEFAULT NULL,
  `id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `hora`
--

INSERT INTO `hora` (`hora`, `minuto`, `dia`, `ocupado`, `idHorario`, `idAsesoria`, `id`) VALUES
(6, 0, 'Lunes', 0, 0, 0, 0),
(7, 0, 'Lunes', 0, 0, 0, 1),
(8, 0, 'Lunes', 1, 0, 0, 2),
(9, 0, 'Lunes', 1, 0, 0, 3),
(10, 0, 'Lunes', 0, 0, 0, 4),
(11, 0, 'Lunes', 0, 0, 0, 5),
(12, 0, 'Lunes', 1, 0, 0, 6),
(13, 0, 'Lunes', 0, 0, 0, 7),
(14, 0, 'Lunes', 0, 0, 0, 8),
(15, 0, 'Lunes', 0, 0, 0, 9),
(16, 0, 'Lunes', 0, 0, 0, 10),
(17, 0, 'Lunes', 0, 0, 0, 11),
(18, 0, 'Lunes', 0, 0, 0, 12),
(6, 0, 'Martes', 0, 0, 0, 13),
(7, 0, 'Martes', 0, 0, 0, 14),
(8, 0, 'Martes', 0, 0, 0, 15),
(9, 0, 'Martes', 0, 0, 0, 16),
(10, 0, 'Martes', 0, 0, 0, 17),
(11, 0, 'Martes', 1, 0, 0, 18),
(12, 0, 'Martes', 0, 0, 0, 19),
(13, 0, 'Martes', 0, 0, 0, 20),
(14, 0, 'Martes', 0, 0, 0, 21),
(15, 0, 'Martes', 0, 0, 0, 22),
(16, 0, 'Martes', 0, 0, 0, 23),
(17, 0, 'Martes', 0, 0, 0, 24),
(18, 0, 'Martes', 0, 0, 0, 25),
(6, 0, 'Miercoles', 0, 0, 0, 26),
(7, 0, 'Miercoles', 0, 0, 0, 27),
(8, 0, 'Miercoles', 0, 0, 0, 28),
(9, 0, 'Miercoles', 0, 0, 0, 29),
(10, 0, 'Miercoles', 0, 0, 0, 30),
(11, 0, 'Miercoles', 0, 0, 0, 31),
(12, 0, 'Miercoles', 1, 0, 0, 32),
(13, 0, 'Miercoles', 0, 0, 0, 33),
(14, 0, 'Miercoles', 0, 0, 0, 34),
(15, 0, 'Miercoles', 0, 0, 0, 35),
(16, 0, 'Miercoles', 0, 0, 0, 36),
(17, 0, 'Miercoles', 0, 0, 0, 37),
(18, 0, 'Miercoles', 0, 0, 0, 38),
(6, 0, 'Jueves', 0, 0, 0, 39),
(7, 0, 'Jueves', 0, 0, 0, 40),
(8, 0, 'Jueves', 0, 0, 0, 41),
(9, 0, 'Jueves', 0, 0, 0, 42),
(10, 0, 'Jueves', 0, 0, 0, 43),
(11, 0, 'Jueves', 0, 0, 0, 44),
(12, 0, 'Jueves', 0, 0, 0, 45),
(13, 0, 'Jueves', 0, 0, 0, 46),
(14, 0, 'Jueves', 0, 0, 0, 47),
(15, 0, 'Jueves', 0, 0, 0, 48),
(16, 0, 'Jueves', 0, 0, 0, 49),
(17, 0, 'Jueves', 0, 0, 0, 50),
(18, 0, 'Jueves', 0, 0, 0, 51),
(6, 0, 'Viernes', 0, 0, 0, 52),
(7, 0, 'Viernes', 0, 0, 0, 53),
(8, 0, 'Viernes', 0, 0, 0, 54),
(9, 0, 'Viernes', 1, 0, 0, 55),
(10, 0, 'Viernes', 1, 0, 0, 56),
(11, 0, 'Viernes', 0, 0, 0, 57),
(12, 0, 'Viernes', 0, 0, 0, 58),
(13, 0, 'Viernes', 1, 0, 0, 59),
(14, 0, 'Viernes', 1, 0, 0, 60),
(15, 0, 'Viernes', 0, 0, 0, 61),
(16, 0, 'Viernes', 0, 0, 0, 62),
(17, 0, 'Viernes', 0, 0, 0, 63),
(18, 0, 'Viernes', 0, 0, 0, 64),
(6, 0, 'Lunes', 0, 1, 0, 65),
(7, 0, 'Lunes', 0, 1, 0, 66),
(8, 0, 'Lunes', 0, 1, 0, 67),
(9, 0, 'Lunes', 0, 1, 0, 68),
(10, 0, 'Lunes', 0, 1, 0, 69),
(11, 0, 'Lunes', 0, 1, 0, 70),
(12, 0, 'Lunes', 0, 1, 0, 71),
(13, 0, 'Lunes', 0, 1, 0, 72),
(14, 0, 'Lunes', 0, 1, 0, 73),
(15, 0, 'Lunes', 0, 1, 0, 74),
(16, 0, 'Lunes', 0, 1, 0, 75),
(17, 0, 'Lunes', 0, 1, 0, 76),
(18, 0, 'Lunes', 0, 1, 0, 77),
(6, 0, 'Martes', 0, 1, 0, 78),
(7, 0, 'Martes', 0, 1, 0, 79),
(8, 0, 'Martes', 0, 1, 0, 80),
(9, 0, 'Martes', 0, 1, 0, 81),
(10, 0, 'Martes', 0, 1, 0, 82),
(11, 0, 'Martes', 0, 1, 0, 83),
(12, 0, 'Martes', 0, 1, 0, 84),
(13, 0, 'Martes', 0, 1, 0, 85),
(14, 0, 'Martes', 0, 1, 0, 86),
(15, 0, 'Martes', 0, 1, 0, 87),
(16, 0, 'Martes', 0, 1, 0, 88),
(17, 0, 'Martes', 0, 1, 0, 89),
(18, 0, 'Martes', 0, 1, 0, 90),
(6, 0, 'Miercoles', 0, 1, 0, 91),
(7, 0, 'Miercoles', 0, 1, 0, 92),
(8, 0, 'Miercoles', 0, 1, 0, 93),
(9, 0, 'Miercoles', 0, 1, 0, 94),
(10, 0, 'Miercoles', 0, 1, 0, 95),
(11, 0, 'Miercoles', 0, 1, 0, 96),
(12, 0, 'Miercoles', 0, 1, 0, 97),
(13, 0, 'Miercoles', 0, 1, 0, 98),
(14, 0, 'Miercoles', 0, 1, 0, 99),
(15, 0, 'Miercoles', 0, 1, 0, 100),
(16, 0, 'Miercoles', 0, 1, 0, 101),
(17, 0, 'Miercoles', 0, 1, 0, 102),
(18, 0, 'Miercoles', 0, 1, 0, 103),
(6, 0, 'Jueves', 0, 1, 0, 104),
(7, 0, 'Jueves', 0, 1, 0, 105),
(8, 0, 'Jueves', 0, 1, 0, 106),
(9, 0, 'Jueves', 0, 1, 0, 107),
(10, 0, 'Jueves', 0, 1, 0, 108),
(11, 0, 'Jueves', 0, 1, 0, 109),
(12, 0, 'Jueves', 0, 1, 0, 110),
(13, 0, 'Jueves', 0, 1, 0, 111),
(14, 0, 'Jueves', 0, 1, 0, 112),
(15, 0, 'Jueves', 0, 1, 0, 113),
(16, 0, 'Jueves', 0, 1, 0, 114),
(17, 0, 'Jueves', 0, 1, 0, 115),
(18, 0, 'Jueves', 0, 1, 0, 116),
(6, 0, 'Viernes', 0, 1, 0, 117),
(7, 0, 'Viernes', 0, 1, 0, 118),
(8, 0, 'Viernes', 0, 1, 0, 119),
(9, 0, 'Viernes', 0, 1, 0, 120),
(10, 0, 'Viernes', 0, 1, 0, 121),
(11, 0, 'Viernes', 0, 1, 0, 122),
(12, 0, 'Viernes', 0, 1, 0, 123),
(13, 0, 'Viernes', 0, 1, 0, 124),
(14, 0, 'Viernes', 0, 1, 0, 125),
(15, 0, 'Viernes', 0, 1, 0, 126),
(16, 0, 'Viernes', 0, 1, 0, 127),
(17, 0, 'Viernes', 0, 1, 0, 128),
(18, 0, 'Viernes', 0, 1, 0, 129);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `horario`
--

CREATE TABLE `horario` (
  `id` int(100) NOT NULL,
  `idAsesor` int(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `horario`
--

INSERT INTO `horario` (`id`, `idAsesor`) VALUES
(0, 11505372),
(1, 115123);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `sesion`
--

CREATE TABLE `sesion` (
  `idActualA` int(11) NOT NULL,
  `idActualE` int(11) NOT NULL,
  `id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `sesion`
--

INSERT INTO `sesion` (`idActualA`, `idActualE`, `id`) VALUES
(1, 0, 0);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `asesor`
--
ALTER TABLE `asesor`
  ADD PRIMARY KEY (`codigo`);

--
-- Indices de la tabla `asesoria`
--
ALTER TABLE `asesoria`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `estudiante`
--
ALTER TABLE `estudiante`
  ADD PRIMARY KEY (`codigo`);

--
-- Indices de la tabla `hora`
--
ALTER TABLE `hora`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `horario`
--
ALTER TABLE `horario`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `sesion`
--
ALTER TABLE `sesion`
  ADD PRIMARY KEY (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
