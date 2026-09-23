package com.example.productosJPA.service;

import com.example.productosJPA.model.Producto;
import com.example.productosJPA.repository.ProductoRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

    @Service
    public class ProductoService{

        private final ProductoRepository repository;

        public ProductoService(ProductoRepository repository) {
            this.repository = repository;
        }
        public void guardarProducto(Producto producto) {
            repository.save(producto);
        }
        public List<Producto> listarProductos() {
            return repository.findAllByOrderByNombreAsc();
        }
        public void modificarPrecio(String codigo, Double nuevoPrecio) {
            repository.findByCodigo(codigo).ifPresent(producto -> {
                producto.setPrecio(nuevoPrecio);
                repository.save(producto);
            });
        }
        @Transactional
        public void borrarProducto(String codigo) {
            repository.deleteByCodigo(codigo);
        }
    }
