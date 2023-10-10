package com.tienda.service.impl;

import com.tienda.dao.CategoriaDao;
import com.tienda.domain.Categoria;
import com.tienda.service.CategoriaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



/**
 *
 * @author Dennis
 */
@Service
public class CategoriaServiceImpl implements CategoriaService
{
    @Autowired
    private CategoriaDao categoriaDao;
    
    @Override
    public List<Categoria> getCategorias(boolean activos){
        var lista = categoriaDao.findAll();
        
        if(activos)
        {
            lista.removeIf(e-> !e.isActivo());
        }
        
        return lista;
    }
}
