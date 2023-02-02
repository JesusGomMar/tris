package com.tris.tris.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.tris.tris.comunes.dto.UsuarioDto;

@Mapper
public interface UsuariosMapper {
    @Select("select * from usuarios")
    List<UsuarioDto> findAll();
}
