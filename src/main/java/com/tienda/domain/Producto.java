package com.tienda.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;
import lombok.Data;

@Data
@Entity
@Table(name="producto")
public class Producto implements Serializable
{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_producto")
    private long idProducto;
    @Column(name="id_categoria")
    private long idCategoria;
    private String descripcion;
    private String detalle;
    private double precio;
    private int existencias;
    @Column(name="ruta_imagen")
    private String rutaImagen;
    private boolean activo; 

    @OneToMany
    @JoinColumn(name="id_categoria",updatable=false)
    List<Producto> productos;

    public Producto() {
    }

    public Producto(String descripcion, boolean activo) {
        this.descripcion = descripcion;
        this.activo = activo;
    }
}
