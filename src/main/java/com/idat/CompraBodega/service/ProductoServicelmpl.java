package com.idat.CompraBodega.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.CompraBodega.Model.Producto;
import com.idat.CompraBodega.Repository.ProductoRepository;

@Service
public class ProductoServicelmpl implements ProductoService {

	@Autowired
	private ProductoRepository repository;
	
	@Override
	public void guardarProducto(Producto producto) {
		// TODO Auto-generated method stub
		repository.save(producto);
	}

	@Override
	public void actualizarProducto(Producto producto) {
		// TODO Auto-generated method stub
		repository.saveAndFlush(producto);
	}

	@Override
	public void eliminarProducto(Integer id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public List<Producto> listarProductos() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Producto obtenerProductoId(Integer id) {
		// TODO Auto-generated method stub
		return repository.findById(id).orElse(null);
	}
}
