package com.asir.tris.registrohorario.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.asir.tris.comunes.dto.UsuarioDto;
import com.asir.tris.registrohorario.dto.RegistroHorarioDto;

@Mapper
public interface RegistroHorarioDao {
	

    @Select("SELECT p.id_proyecto as idProyecto,p.nombre as nombreProyecto,p.tipo as idTipoProyecto,tp.nombre as nombreTipoProyecto,t.id_tarea as idTarea,t.nombre as nombreTarea,t.id_tipo_tarea as idTipoTarea,tt.nombre as nombreTipoTarea,t.fecha_inicio as fechaInicio,t.fecha_fin as fechafin,t.activo as activo,tu.id_usuario as idUsuario,tu.tiempo as tiempo,tu.comentarios as comentarios,DATE_FORMAT(tu.fecha,\"%d/%m/%Y\") as fechast, tu.fecha as fecha from proyectos p inner join tipo_proyecto tp on tp.id_tipo_proyecto = p.tipo inner join tareas t on t.id_proyecto = p.id_proyecto inner join tareas_usuario tu on tu.id_tarea = t.id_tarea inner join tipo_tarea tt on tt.id_tipo_tarea = t.id_tipo_tarea where tu.id_usuario = #{idUsuario} order by fecha ")
    List<RegistroHorarioDto> obtenerTareasUsuario(UsuarioDto dto);
    
}
