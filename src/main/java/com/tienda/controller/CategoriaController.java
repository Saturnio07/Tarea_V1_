package com.tienda.controller;

import com.tienda.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Dennis
 */
@Controller
@RequestMapping("/categoria")
public class CategoriaController 
{
    @Autowired
    private CategoriaService categoriaService;
    
    @GetMapping("/listado")//ejecuta lo de la plantilla
    
    public String listado(Model model){
        
        var categorias = categoriaService.getCategorias(false); //false trae activas e inactivas
        
        model.addAttribute("categorias", categorias);
        model.addAttribute("totalCategorias", categorias.size());
        
        return "/categoria/listado"; //folder en templates que vamos a crear
    }
    
    //agrega no se la profe lo quito muy rapido Xd
}
