package com.example.productosJPA.repository;

import com.example.productosJPA.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Optional;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
    List<Producto> findAllByOrderByNombreAsc();
    Optional<Producto> findByCodigo(String codigo);
    void deleteByCodigo(String codigo);
}