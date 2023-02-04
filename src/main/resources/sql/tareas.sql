CREATE TABLE `tris`.`tareas` (
  `id_tarea` INT NOT NULL,
  `id_tipo_tarea` INT NOT NULL,
  `nombre` VARCHAR(45) NOT NULL,
  `id_proyecto` INT NOT NULL,
  `fecha_Inicio` DATETIME NOT NULL,
  `fecha_fin` DATETIME NOT NULL,
  `activo` INT NOT NULL,
  PRIMARY KEY (`id_tarea`),
  UNIQUE INDEX `idtareas_UNIQUE` (`id_tarea` ASC) VISIBLE,
  INDEX `fk_tipo_tarea_idx` (`id_tipo_tarea` ASC) VISIBLE,
  INDEX `fk_proyecto_idx` (`id_proyecto` ASC) VISIBLE,
  CONSTRAINT `fk_tipo_tarea`
    FOREIGN KEY (`id_tipo_tarea`)
    REFERENCES `tris`.`tipo_tarea` (`id_tipo_tarea`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_proyecto`
    FOREIGN KEY (`id_proyecto`)
    REFERENCES `tris`.`proyectos` (`id_proyecto`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);