package com.asir.tris.registrohorario.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/registroHorario")
public class RegistroHorarioController {

    @GetMapping(value="/cargaInicial")
    public String cargaInicial(Model model){
        return "registroHorario";
    }
}
