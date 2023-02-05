CREATE TABLE `roles` (
  `idroles` int NOT NULL,
  `nombre` varchar(45) NOT NULL,
  PRIMARY KEY (`idroles`),
  UNIQUE KEY `idroles_UNIQUE` (`idroles`),
  UNIQUE KEY `nombre_UNIQUE` (`nombre`)
)