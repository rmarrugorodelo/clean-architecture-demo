package com.cleanarchitecureexample.basededatos.inventario.producto.modelo;

import com.cleanarchitecureexample.inventario.Producto;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "productos")
@Builder
@Data
public class ProductoJpa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String codigo;

    @Column(nullable = false)
    private String nombre;

    private String descripcion;

    public static ProductoJpa deDominio(Producto producto) {
        return ProductoJpa
                .builder()
                .codigo(producto.getCodigo())
                .nombre(producto.getNombre())
                .descripcion(producto.getDescripcion())
                .build();
    }

    public Producto aDominio() {
        return Producto
                .builder()
                .codigo(getCodigo())
                .nombre(getNombre())
                .descripcion(getDescripcion())
                .build();
    }
}
