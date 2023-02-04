package com.tris.tris.registrohorario.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import jakarta.servlet.http.HttpSession;

@RestController
@RequestMapping(path = "/registroHorarioController")
public class RegistroHorarioController {

	@GetMapping("/cargaInicial")
	public RedirectView cargaInicial (HttpSession session) {
		// usuario mockeado, hay q recuperar el usuario que se ha logado
		Long idUsuario = 1l;
		RedirectView rv = new RedirectView();
		rv.setUrl("http://localhost:8080/registroHorario.html");
		return rv;
		
	}
}
