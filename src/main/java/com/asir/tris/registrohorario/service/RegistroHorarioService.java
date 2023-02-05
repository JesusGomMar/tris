package com.asir.tris.registrohorario.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asir.tris.comunes.dto.UsuarioDto;
import com.asir.tris.registrohorario.dao.RegistroHorarioDao;
import com.asir.tris.registrohorario.dto.RegistroHorarioDto;

@Service
public class RegistroHorarioService {
	
	@Autowired
	RegistroHorarioDao dao;

	public List<RegistroHorarioDto> obtenerTareasUsuario(UsuarioDto dto) {
		return dao.obtenerTareasUsuario(dto);
	}
	
	
	


}
