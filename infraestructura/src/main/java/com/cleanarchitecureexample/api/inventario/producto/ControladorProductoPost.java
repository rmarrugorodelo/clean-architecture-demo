package com.cleanarchitecureexample.api.inventario.producto;

import com.cleanarchitecureexample.api.inventario.producto.dto.RespuestaProducto;
import com.cleanarchitecureexample.api.inventario.producto.dto.SolicitudProducto;
import com.cleanarchitecureexample.inventario.producto.puerto.entrada.ComandoGuardarProducto;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/productos")
@AllArgsConstructor
public class ControladorProductoPost {

    private final ComandoGuardarProducto comandoGuardarProducto;

    @PostMapping
    public RespuestaProducto guardar(@Valid @RequestBody SolicitudProducto solicitudProducto) {
        comandoGuardarProducto.ejecutar(solicitudProducto.toDomain());
        return RespuestaProducto
                .builder()
                .build();
    }
}
