package com.idat.CompraBodega.service;

import java.util.List;

import com.idat.CompraBodega.Model.Producto;

public interface ProductoService {
	void guardarProducto(Producto producto);
	void actualizarProducto(Producto producto);
	void eliminarProducto(Integer id);
	List <Producto> listarProductos();
	Producto obtenerProductoId(Integer id);
}
