CREATE TABLE `tris`.`tipo_tarea` (
  `id_tipo_tarea` INT NOT NULL,
  `nombre` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id_tipo_tarea`),
  UNIQUE INDEX `idtipo_tarea_UNIQUE` (`id_tipo_tarea` ASC) VISIBLE);