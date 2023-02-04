package com.asir.tris.comunes;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/underConstruction")
public class UnderConstructionController {

    @GetMapping(value="/cargaInicial")
    public String cargaInicial(ModelMap model){
        return "underConstruction";
    }
}
