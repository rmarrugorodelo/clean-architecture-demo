package com.cleanarchitecureexample.inventario.producto;

import com.cleanarchitecureexample.inventario.Producto;
import com.cleanarchitecureexample.inventario.producto.puerto.entrada.ComandoGuardarProducto;
import com.cleanarchitecureexample.inventario.producto.puerto.salida.RepositorioGuardarProducto;

public class CasoDeUsoGuardarProducto implements ComandoGuardarProducto {

    private final RepositorioGuardarProducto repositorioGuardarProducto;

    public CasoDeUsoGuardarProducto(RepositorioGuardarProducto repositorioGuardarProducto) {
        this.repositorioGuardarProducto = repositorioGuardarProducto;
    }

    @Override
    public Producto ejecutar(Producto producto) {
        return repositorioGuardarProducto.guardar(producto);
    }
}
