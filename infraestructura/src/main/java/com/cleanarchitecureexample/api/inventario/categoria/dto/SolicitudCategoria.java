package com.cleanarchitecureexample.api.inventario.categoria.dto;

import com.cleanarchitecureexample.inventario.Categoria;
import lombok.Value;

@Value
public class SolicitudCategoria {

    Long id;

    String nombre;

    public Categoria toDomain() {
        return Categoria
                .builder()
                .nombre(this.nombre)
                .id(this.id)
                .build();
    }
}
