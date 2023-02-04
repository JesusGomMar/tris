CREATE TABLE `tris`.`tareas_usuario` (
  `id_usuario` INT NOT NULL,
  `id_tarea` INT NOT NULL,
  INDEX `fk_usuario_tarea_idx` (`id_usuario` ASC) VISIBLE,
  INDEX `fk_tarea_usuario_tarea_idx` (`id_tarea` ASC) VISIBLE,
  CONSTRAINT `fk_usuario_usuario_tarea`
    FOREIGN KEY (`id_usuario`)
    REFERENCES `tris`.`usuarios` (`idUsuarios`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_tarea_usuario_tarea`
    FOREIGN KEY (`id_tarea`)
    REFERENCES `tris`.`tareas` (`id_tarea`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);
