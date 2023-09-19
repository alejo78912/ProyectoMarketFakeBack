package com.Alejandro.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Alejandro.Service.ProductService;
import com.Alejandro.models.Product;


@RestController
@RequestMapping("/api/productos")
@CrossOrigin(origins = "http://localhost:4200")
public class DemoControllerProduct {

	@Autowired
    private ProductService productService;
	
	 @GetMapping("/{idProduct}/product")
	    public ResponseEntity<Product> obtenerPorId(@PathVariable Long idProduct) {
	        Product product = productService.getById(idProduct);
	        if (product != null) {
	            return ResponseEntity.ok(product);
	        } else {
	            return ResponseEntity.notFound().build();
	        }
	    }

}
