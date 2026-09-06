package com.example.productosJPA.runner;

import com.example.productosJPA.model.Producto;
import com.example.productosJPA.repository.ProductoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class DemoRunner implements CommandLineRunner {

    private final ProductoRepository repository;

    public DemoRunner(ProductoRepository repository) {
        this.repository = repository;
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {

        System.out.println("--- CREANDO PRODUCTO ---");
        Producto nuevo = new Producto();
        nuevo.setCodigo("P01");
        nuevo.setNombre("Zapatillas");
        nuevo.setPrecio(15000.0);
        repository.save(nuevo);
        System.out.println("Producto P01 guardado con exito.");

        System.out.println("--- MODIFICAR UN PRODUCTO ---");
        repository.findByCodigo("P01").ifPresent(producto -> {
            producto.setPrecio(18000.0);
            repository.save(producto);
            System.out.println("Precio modificado a: " + producto.getPrecio());
        });

        System.out.println("--- ORDENAR EL LISTADO ---");
        List<Producto> lista = repository.findAllByOrderByNombreAsc();
        for (Producto p : lista) {
            System.out.println("Producto encontrado: " + p.getNombre() + " - Precio: " + p.getPrecio());
        }

        System.out.println("--- BORRAR UN PRODUCTO ---");
        repository.deleteByCodigo("P01");
        System.out.println("Producto P01 borrado de la base de datos.");
    }
}
