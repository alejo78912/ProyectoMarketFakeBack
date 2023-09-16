package com.Alejandro.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Alejandro.models.Categoria;
import com.Alejandro.models.Producto;

@Repository
public interface IProductoRepository  extends JpaRepository<Producto, Long>{

	List<Producto> findByCategoria (Categoria categoria);
	
}
