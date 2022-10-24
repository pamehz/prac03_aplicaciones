
package com.practica1.controller;


import com.practica1.dao.ClienteDao;
import com.practica1.domain.Pais;
import com.practica1.service.ClienteService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Slf4j
@Controller
public class IndexController {
    
    @Autowired
    private ClienteService clienteService;
    
    @GetMapping("/")
    public String inicio(Model model) {
 
        var paises = clienteService.getPaises();
 
        model.addAttribute("paises", paises);
        
        return "index";
    }    
    @GetMapping("/nuevoPais")
    public String nuevoPais(Pais pais){
        return "modificarPais";
    }
    @PostMapping ("/guardarPais")
    public String guardarPais (Pais pais){
        clienteService.save(pais);
        return "redirect:/";
    }
}
