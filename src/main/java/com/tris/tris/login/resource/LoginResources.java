package com.tris.tris.login.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tris.tris.comunes.dto.UsuarioDto;
import com.tris.tris.mappers.UsuariosMapper;

@RestController
@RequestMapping("/login")
public class LoginResources {

	@Autowired
	private UsuariosMapper usuariosMapper;
	
	
	
	@GetMapping("/all")
	public List<UsuarioDto> findAll(){		
		return usuariosMapper.findAll();
	}
}
