package com.asir.tris.registrohorario.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.asir.tris.comunes.dto.UsuarioDto;

@Controller
@RequestMapping(path = "/registroHorario")
public class RegistroHorarioController {

	
    @GetMapping(value="/cargaInicial")
    public String cargaInicial(Model model, @ModelAttribute UsuarioDto dto){
		if (null == dto.getLogin()) {
			model.addAttribute("errorMessage", "Usuario/password incorrecto");
			return "login";
		}
		model.addAttribute("nombreCompleto",dto.getNombre());
		model.addAttribute("login", dto.getLogin());
        return "registroHorario";
    }
}
