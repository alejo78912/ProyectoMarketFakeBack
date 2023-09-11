package com.Alejandro.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Alejandro.models.Producto;
import com.Alejandro.repository.IProductoRepository;


@Service
public class InventarioService {

	 @Autowired
	   private IProductoRepository productoRepository;
	 
	 
	 public List<Producto> productos() {
	        return productoRepository.findAll();
	    }
	 
	 public Producto guardar(Producto producto) {
	        return productoRepository.save(producto);
	    }

	 public void eliminar(Long id) {
	        productoRepository.deleteById(id);
	    }
	 
	 public Producto editar(Producto producto) {
	       Producto aux = productoRepository.findById(producto.getCodProducto()).orElse(null);
	       productoRepository.deleteById(aux.getCodProducto());
	       return productoRepository.save(producto);
	    }
	 
	

	  
	    
	 
	
}
