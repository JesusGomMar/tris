package com.asir.tris.admusuario.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asir.tris.admusuario.dao.AdmUsuarioDao;
import com.asir.tris.comunes.dto.UsuarioDto;

@Service
public class AdmUsuarioService {
	
	@Autowired
	AdmUsuarioDao dao;

	public List<UsuarioDto> obtenerUsuarios() {
		return dao.obtenerUsuarios();
	}
	
	
	


}
