package com.example.productosJPA.runner;

import com.example.productosJPA.model.Producto;
import com.example.productosJPA.service.ProductoService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DemoRunner implements CommandLineRunner {

    private final ProductoService service;

    public DemoRunner(ProductoService service) {
        this.service = service;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("--- 1. ABM: ALTA ---");
        Producto nuevo = new Producto();
        nuevo.setCodigo("P99");
        nuevo.setNombre("Gorra");
        nuevo.setPrecio(8000.0);
        service.guardarProducto(nuevo);

        System.out.println("--- 2. ABM: MODIFICACIÓN ---");
        service.modificarPrecio("P99", 9500.0);

        System.out.println("--- 3. ABM: LECTURA ---");
        List<Producto> lista = service.listarProductos();
        for (Producto p : lista) {
            System.out.println("Producto: " + p.getNombre() + " - $" + p.getPrecio());
        }

        System.out.println("--- 4. ABM: BAJA ---");
        service.borrarProducto("P99");
    }
}