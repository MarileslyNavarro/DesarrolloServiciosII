package com.idat.desarrolloServiciosIIPrueba.service;

import java.util.List;

import com.idat.desarrolloServiciosIIPrueba.dto.ProductoDTORequest;
import com.idat.desarrolloServiciosIIPrueba.dto.ProductoDTOResponse;

public interface ProductoService {

	void guardarProducto(ProductoDTORequest producto);
	void actualizarProducto(ProductoDTORequest producto);
	void eliminarProducto(Integer id);
	List<ProductoDTOResponse> listarProductos();
	ProductoDTOResponse obtenerProductoId(Integer id);
	
}
