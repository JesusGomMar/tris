package com.asir.tris.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.asir.tris.comunes.dto.UsuarioDto;
import com.asir.tris.login.service.LoginService;

@Controller
public class LoginController {

    @Autowired
    LoginService service;

    @GetMapping(value="/")
    public String landing(ModelMap model){
        return showLoginPage(model);
    }

    @GetMapping(value="/login")
    public String showLoginPage(ModelMap model){
        return "login";
    }

    @PostMapping(value="/login")
    public String showWelcomePage(ModelMap model, UsuarioDto dto){

		if (service.validarUsuario(dto)) {
			//password y usuario correcto
			return "menu";
		} else {
			// Usuario/password incorrecto
			model.put("errorMessage", "Usuario/password incorrecto");
			return "login";
		}
    }
    
    @GetMapping(value="/menu")
    public String menu(ModelMap model, UsuarioDto dto){
    	
    	return "menu";
    }
}
