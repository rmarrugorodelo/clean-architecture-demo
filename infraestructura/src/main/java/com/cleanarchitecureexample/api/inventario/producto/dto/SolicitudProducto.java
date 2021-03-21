package com.cleanarchitecureexample.api.inventario.producto.dto;

import com.cleanarchitecureexample.api.inventario.categoria.dto.SolicitudCategoria;
import com.cleanarchitecureexample.inventario.Producto;
import lombok.Builder;
import lombok.Value;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Value
@Builder
public class SolicitudProducto {

    @NotBlank
    String codigo;

    @NotBlank
    String nombre;

    String descripcion;

    @NotNull
    @Valid
    SolicitudCategoria categoria;

    public Producto toDomain() {
        return Producto
                .builder()
                .nombre(this.nombre)
                .descripcion(this.descripcion)
                .categoria(this.categoria.toDomain())
                .build();
    }
}
