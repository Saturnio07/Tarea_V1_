package com.tienda.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;
import lombok.Data;

/**
 *
 * @author Dennis
 */
@Data
@Entity
@Table(name = "producto")

/* Serializaci[on va almacenar datos de la bd*/

public class Producto implements Serializable {
    
    private static final long serialVersionUID = 1L; /*Poder hacer ciclo de sumatoria*/
    
    @Id /*Id es la llave de la tabla producto*/
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private long idProducto;
    private String descripcion;
    private String rutaImagen;
    private boolean activo;

    //private long idCategoria;
    private String detalle;
    private int existencias;
    private double precio;
    
    @OneToMany
    @JoinColumn(name = "id_categoria", updatable = false)
    List<Producto> productos;
    
    public Producto() {
    }

    public Producto(String descripcion, boolean activo) {
        this.descripcion = descripcion;
        this.activo = activo;
    }

}
