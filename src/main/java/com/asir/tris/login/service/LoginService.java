package com.asir.tris.login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asir.tris.comunes.dto.UsuarioDto;
import com.asir.tris.login.dao.LoginDao;

@Service
public class LoginService {
	
	@Autowired
	LoginDao loginDao;
	
	public boolean validarUsuario(UsuarioDto dto, UsuarioDto usuario){	
		boolean flag = false;
		if (null != usuario && validarPass(dto, usuario)) {
			flag= true;
		}
		return flag;
	}

	private boolean validarPass(UsuarioDto dto, UsuarioDto usuario) {
		return dto.getPassword().equals(usuario.getPassword());
	}

	public UsuarioDto usuarioLogin(UsuarioDto dto) {
		return loginDao.usuarioLogin(dto);
	}

}
