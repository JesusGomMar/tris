package com.tris.tris.login.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping(path = "/login")
public class LoginController {

	//metodo q retorne redirectview, las jsp en static
	@PostMapping("/login")
	public String login() {
		return null;
		
	}
}
