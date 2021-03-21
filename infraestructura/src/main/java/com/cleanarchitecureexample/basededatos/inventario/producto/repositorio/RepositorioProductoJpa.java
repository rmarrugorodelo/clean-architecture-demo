package com.cleanarchitecureexample.basededatos.inventario.producto.repositorio;

import com.cleanarchitecureexample.basededatos.inventario.producto.modelo.ProductoJpa;
import org.springframework.data.repository.CrudRepository;


public interface RepositorioProductoJpa extends CrudRepository<ProductoJpa, Long> {
}
