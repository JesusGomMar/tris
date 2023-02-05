package com.asir.tris.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.asir.tris.comunes.dto.UsuarioDto;
import com.asir.tris.login.service.LoginService;

@Controller
public class LoginController {

    @Autowired
    LoginService service;

    @GetMapping(value="/")
    public String landing(Model model){
        return showLoginPage(model);
    }

    @GetMapping(value="/login")
    public String showLoginPage(Model model){
        return "login";
    }

    @PostMapping(value="/login")
    public String showWelcomePage(Model model, UsuarioDto dto){
    	UsuarioDto usuario = service.usuarioLogin(dto);
		if (service.validarUsuario(dto, usuario)) {
			//password y usuario correcto
			StringBuilder sb = new StringBuilder();
			sb.append('(').append(usuario.getNombre()).append(' ')
				.append(usuario.getApellidos()).append(')');
			model.addAttribute("nombreCompleto",sb.toString().toUpperCase());
			model.addAttribute("login", dto.getLogin());
			return "menu";
		} else {
			// Usuario/password incorrecto
			model.addAttribute("errorMessage", "Usuario/password incorrecto");
			return "login";
		}
    }
    
    @GetMapping(value="/menu")
    public String menu(Model model, UsuarioDto dto){
    	
    	return "menu";
    }
}
