package com.cleanarchitecureexample.inventario;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Categoria {

    Long id;
    String codigo;
    String nombre;
    String descripcion;
}
