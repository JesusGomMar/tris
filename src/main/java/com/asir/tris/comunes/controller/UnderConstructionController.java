package com.asir.tris.comunes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/underConstruction")
public class UnderConstructionController {

    @GetMapping(value="/cargaInicial")
    public String cargaInicial(Model model){
        return "underConstruction";
    }
}
