
package com.practica1.controller;


import com.practica1.dao.ClienteDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class IndexController {
    
    @Autowired
    private ClienteDao clienteDao;
    
    @GetMapping("/")
    public String inicio(Model model) {
 
        var clientes = clienteDao.findAll();
        model.addAttribute("clientes", clientes);
        
        return "index";
    }     
}
