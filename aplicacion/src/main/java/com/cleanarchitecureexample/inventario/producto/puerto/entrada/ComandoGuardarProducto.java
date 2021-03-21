package com.cleanarchitecureexample.inventario.producto.puerto.entrada;

import com.cleanarchitecureexample.inventario.Producto;

public interface ComandoGuardarProducto {

    Producto ejecutar(Producto producto);

}
