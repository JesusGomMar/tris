package com.asir.tris.login.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.asir.tris.comunes.dto.UsuarioDto;

@Mapper
public interface LoginDao {
	
    @Select("SELECT usuarios.idUsuarios AS idUsuario, usuarios.nombre AS nombre, usuarios.apellidos AS apellidos, usuarios.mail AS mail, usuarios.login AS login, usuarios.password AS password, usuarios.activo AS activo, usuarios.fecha_alta AS fechaAlta, usuarios.fecha_baja AS fechaBaja, roles.idroles as idRol, roles.nombre as nombreRol FROM usuarios INNER JOIN roles_usuarios ON roles_usuarios.idUsuario = usuarios.idUsuarios INNER JOIN roles ON roles.idroles = roles_usuarios.idRol WHERE login = #{login} and activo =1")
	UsuarioDto usuarioLogin(UsuarioDto dto);
}
