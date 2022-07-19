package com.idat.desarrolloServiciosIIPrueba.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.desarrolloServiciosIIPrueba.model.Productos;
import com.idat.desarrolloServiciosIIPrueba.repository.ProductoRepository;

@Service
public class ProductoServiceImpl implements ProductoService {

	@Autowired
	private ProductoRepository repository;
	
	@Override
	public void guardarProducto(Productos producto) {
		repository.save(producto);
	}

	@Override
	public void actualizarProducto(Productos producto) {
		repository.saveAndFlush(producto);
	}

	@Override
	public void eliminarProducto(Integer id) {
		repository.deleteById(id);
	}

	@Override
	public List<Productos> listarProductos() {
		return repository.findAll();
	}

	@Override
	public Productos obtenerProductoId(Integer id) {
		return repository.findById(id).orElse(null);
	}

}
