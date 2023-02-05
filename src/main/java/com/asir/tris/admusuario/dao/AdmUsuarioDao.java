package com.asir.tris.admusuario.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.asir.tris.comunes.dto.UsuarioDto;

@Mapper
public interface AdmUsuarioDao {
	

    @Select("SELECT usuarios.idUsuarios AS idUsuario, usuarios.nombre AS nombre, usuarios.apellidos AS apellidos, usuarios.mail AS mail, usuarios.activo AS activo, usuarios.fecha_alta AS fechaAlta,DATE_FORMAT(usuarios.fecha_alta,'%d/%m/%Y') AS fechaAltaSt, usuarios.fecha_baja AS fechaBaja FROM usuarios")
    List<UsuarioDto> obtenerUsuarios();
    
}
