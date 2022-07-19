package com.idat.desarrolloServiciosIIPrueba.service;

import java.util.List;

import com.idat.desarrolloServiciosIIPrueba.model.Productos;

public interface ProductoService {

	void guardarProducto(Productos producto);
	void actualizarProducto(Productos producto);
	void eliminarProducto(Integer id);
	List<Productos> listarProductos();
	Productos obtenerProductoId(Integer id);
	
}
