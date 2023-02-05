CREATE TABLE `tareas_usuario` (
  `id_usuario` int NOT NULL,
  `id_tarea` int NOT NULL,
  `tiempo` varchar(45) DEFAULT NULL,
  `fecha` datetime DEFAULT NULL,
  `comentarios` varchar(450) DEFAULT NULL,
  KEY `fk_usuario_tarea_idx` (`id_usuario`),
  KEY `fk_tarea_usuario_tarea_idx` (`id_tarea`),
  CONSTRAINT `fk_tarea_usuario_tarea` FOREIGN KEY (`id_tarea`) REFERENCES `tareas` (`id_tarea`),
  CONSTRAINT `fk_usuario_usuario_tarea` FOREIGN KEY (`id_usuario`) REFERENCES `usuarios` (`idUsuarios`)
)