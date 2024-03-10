package com.hrevfdz.ELFinalHectorRolandoRevillaFernandez.controllers;

import com.hrevfdz.ELFinalHectorRolandoRevillaFernandez.enums.GeneroEnum;
import com.hrevfdz.ELFinalHectorRolandoRevillaFernandez.models.Genero;
import com.hrevfdz.ELFinalHectorRolandoRevillaFernandez.services.IGeneroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/generos")
public class GeneroController {
    @Autowired
    private IGeneroService service;

    @GetMapping
    public String findAllGeneros(Model model) {
        List<Genero> generos = service.findAll();
        model.addAttribute(GeneroEnum.GENEROS.nameVar, generos);
        model.addAttribute(GeneroEnum.GENEROS.nameVar.concat("Title"), GeneroEnum.GENEROS_TITLE.nameVar);
        final String pagePath = GeneroEnum.GENEROS.nameVar.concat("/").concat(GeneroEnum.GENEROS_LIST.nameVar);
        return pagePath;
    }
}
