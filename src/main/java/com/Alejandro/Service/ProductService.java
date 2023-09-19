package com.Alejandro.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Alejandro.models.Product;
import com.Alejandro.repository.IProductRepository;



@Service
public class ProductService {
	
	  @Autowired
	  private IProductRepository productoRepository;
	  
	  public List<Product> mostSoldProducts() {
	        return productoRepository.findAll();
	    }

	   

	   

}
