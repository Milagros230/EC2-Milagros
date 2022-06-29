package com.idat.CompraBodega.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.CompraBodega.Model.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto,Integer> {

}
