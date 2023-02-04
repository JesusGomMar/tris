CREATE TABLE `tris`.`tipo_proyecto` (
  `id_tipo_proyecto` INT NOT NULL,
  `nombre` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id_tipo_proyecto`),
  UNIQUE INDEX `idtipo_proyecto_UNIQUE` (`id_tipo_proyecto` ASC) VISIBLE,
  UNIQUE INDEX `nombre_UNIQUE` (`nombre` ASC) VISIBLE);