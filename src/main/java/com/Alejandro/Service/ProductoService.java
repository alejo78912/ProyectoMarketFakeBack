package com.Alejandro.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Alejandro.models.Producto;
import com.Alejandro.repository.IProductoRepository;



@Service
public class ProductoService {
	
	  @Autowired
	  private IProductoRepository productoRepository;
	  
	  public List<Producto> proctosMasvendidos() {
	        return productoRepository.findAll();
	    }

	   

	   

}
