CREATE TABLE `tris`.`proyectos` (
  `id_proyecto` INT NOT NULL,
  `nombre` VARCHAR(45) NOT NULL,
  `tipo` INT NULL,
  PRIMARY KEY (`id_proyecto`),
  UNIQUE INDEX `idnew_table_UNIQUE` (`id_proyecto` ASC) VISIBLE,
  INDEX `fk_tipo_proyecto_idx` (`tipo` ASC) VISIBLE,
  CONSTRAINT `fk_tipo_proyecto`
    FOREIGN KEY (`tipo`)
    REFERENCES `tris`.`tipo_proyecto` (`id_tipo_proyecto`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);