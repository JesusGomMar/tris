package com.asir.tris.registrohorario.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.asir.tris.comunes.dto.UsuarioDto;
import com.asir.tris.login.service.LoginService;
import com.asir.tris.registrohorario.dto.RegistroHorarioDto;
import com.asir.tris.registrohorario.service.RegistroHorarioService;

@Controller
@RequestMapping(path = "/registroHorario")
public class RegistroHorarioController {

	@Autowired
	RegistroHorarioService service;
	
    @Autowired
    LoginService loginService;
	
	@GetMapping(value = "/cargaInicial")
	public String cargaInicial(Model model, @ModelAttribute UsuarioDto dto) {
		if (null == dto || null == dto.getLogin() || dto.getLogin().isEmpty()) {
			model.addAttribute("errorMessage", "Usuario/password incorrecto");
			return "login";
		}
		model.addAttribute("nombreCompleto", dto.getNombre());
		model.addAttribute("login", dto.getLogin());
		return "registroHorario";
	}
	
	@GetMapping(value = "/cargaGrid")
	@ResponseBody
	public List<RegistroHorarioDto> cargaGrid(Model model, @ModelAttribute UsuarioDto dto){
		dto = loginService.usuarioLogin(dto);
		return service.obtenerTareasUsuario(dto);
		
	}
	
}
