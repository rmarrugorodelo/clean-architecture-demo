package com.cleanarchitecureexample.inventario.producto.puerto.salida;

import com.cleanarchitecureexample.inventario.Producto;

public interface RepositorioGuardarProducto {

    Producto guardar(Producto producto);
}
