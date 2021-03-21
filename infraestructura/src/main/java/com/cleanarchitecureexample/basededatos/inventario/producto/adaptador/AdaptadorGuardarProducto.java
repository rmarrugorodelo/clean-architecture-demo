package com.cleanarchitecureexample.basededatos.inventario.producto.adaptador;

import com.cleanarchitecureexample.basededatos.inventario.producto.modelo.ProductoJpa;
import com.cleanarchitecureexample.basededatos.inventario.producto.repositorio.RepositorioProductoJpa;
import com.cleanarchitecureexample.inventario.Producto;
import com.cleanarchitecureexample.inventario.producto.puerto.salida.RepositorioGuardarProducto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class AdaptadorGuardarProducto implements RepositorioGuardarProducto {

    private final RepositorioProductoJpa repositorioProductoJpa;

    @Override
    public Producto guardar(Producto producto) {
        ProductoJpa productoJpa = repositorioProductoJpa.save(ProductoJpa.deDominio(producto));
        return productoJpa.aDominio();
    }

}
