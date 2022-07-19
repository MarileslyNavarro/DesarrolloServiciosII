package com.idat.desarrolloServiciosIIPrueba.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.desarrolloServiciosIIPrueba.model.Productos;

@Repository
public interface ProductoRepository extends JpaRepository<Productos,Integer> {
	


} 
