package com.asir.tris.calendariolaboral.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.asir.tris.comunes.dto.UsuarioDto;

@Controller
@RequestMapping(path = "/calendarioLaboral")
public class CalendarioLaboralController {

	@GetMapping(value = "/cargaInicial")
	public String cargaInicial(Model model, @ModelAttribute UsuarioDto dto) {
		if (null == dto || null == dto.getLogin() || dto.getLogin().isEmpty()) {
			model.addAttribute("errorMessage", "Usuario/password incorrecto");
			return "login";
		}
		model.addAttribute("nombreCompleto", dto.getNombre());
		model.addAttribute("login", dto.getLogin());
		return "calendarioLaboral";
	}
}
