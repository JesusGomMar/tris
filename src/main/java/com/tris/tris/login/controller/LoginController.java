package com.tris.tris.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import com.tris.tris.comunes.dto.UsuarioDto;
import com.tris.tris.login.resource.LoginResources;

import jakarta.servlet.http.HttpSession;

@RestController
@RequestMapping(path = "/loginController")
public class LoginController {

	@Autowired
	private LoginResources loginResources;
	
	@PostMapping("/logini")
	public RedirectView logini(Model model, UsuarioDto dto,RedirectAttributes ra, HttpSession session) {
		UsuarioDto dtoAux = loginResources.usuarioLogin(dto);
		RedirectView rv = new RedirectView();
		if (null == dtoAux ) {
			// usuario no encontrado
			rv.setUrl("http://localhost:8080/");
//			model.addAttribute("message", "no encontrado");
			ra.addFlashAttribute("mensaje","no encontrado");
		} else if (dto.getPassword().equals(dtoAux.getPassword())){
			//password correcto
			session.setAttribute("idUsuario", dto.getIdUsuario());
			rv.setUrl("http://localhost:8080/menu.html");
		} else {
			//password incorrecto
			rv.setUrl("http://localhost:8080/");
			ra.addFlashAttribute("mensaje","erroneo");
		}
		return rv;
		
	}
}
