package com.tienda.service;

import com.tienda.domain.Categoria;
import java.util.List;



/**
 *
 * @author Dennis
 */
public interface CategoriaService {
    
    //Se declara un metodo para obtener un Arraylist de objetos Categoria//
    //Los objetos vienen de la tabla categoria, todos los registros//
    
    public List<Categoria> getCategorias(boolean activos);
    
    //Abajo se colocara los m[etodos para realizar el CRUD de categor[ias, semana 6//
    
    
}