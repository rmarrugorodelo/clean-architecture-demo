package com.cleanarchitecureexample.api.inventario.producto.dto;

import com.cleanarchitecureexample.api.inventario.categoria.dto.SolicitudCategoria;
import lombok.Builder;
import lombok.Value;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Value
@Builder
public class RespuestaProducto {

    String codigo;

    String nombre;

    String descripcion;

    SolicitudCategoria categoria;
}
