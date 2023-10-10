package com.tienda.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

/**
 *
 * @author Dennis
 */
@Data
@Entity
@Table(name = "categoria")

/* Serializaci[on va almacenar datos de la bd*/

public class Categoria implements Serializable {
    
    private static final long serialVersionUID = 1L; /*Poder hacer ciclo de sumatoria*/
    
    @Id /*Id es la llave de la tabla categoria*/
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categoria")
    private long idCategoria;
    private String descripcion;
    private String rutaImagen;
    private boolean activo;

    public Categoria() {
    }

    public Categoria(String descripcion, boolean activo) {
        this.descripcion = descripcion;
        this.activo = activo;
    }

}
