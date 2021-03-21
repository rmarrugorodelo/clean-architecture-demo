package com.cleanarchitecureexample.mensajeria.inventario;

import com.cleanarchitecureexample.inventario.Producto;
import com.cleanarchitecureexample.inventario.producto.puerto.salida.PuertaEnviarCorreo;
import com.cleanarchitecureexample.mensajeria.ServicioEnviarMensaje;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class AdaptadorProducto implements PuertaEnviarCorreo {

    private final ServicioEnviarMensaje servicioEnviarMensaje;

    @Override
    public void enviar(Producto producto) {
        servicioEnviarMensaje.enviar(null);
    }
}
