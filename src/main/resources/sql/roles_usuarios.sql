CREATE TABLE `roles_usuarios` (
  `idRol` int NOT NULL,
  `idUsuario` int NOT NULL,
  KEY `fk_roles_idx` (`idRol`),
  KEY `fk_idUsuario_roles_idx` (`idUsuario`),
  CONSTRAINT `fk_idUsuario_roles` FOREIGN KEY (`idUsuario`) REFERENCES `usuarios` (`idUsuarios`),
  CONSTRAINT `fk_roles` FOREIGN KEY (`idRol`) REFERENCES `roles` (`idroles`)
)