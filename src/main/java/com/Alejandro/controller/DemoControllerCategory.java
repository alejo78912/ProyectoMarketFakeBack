package com.Alejandro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Alejandro.Service.CategoryService;
import com.Alejandro.models.Category;
import com.Alejandro.models.Product;


@RestController
@RequestMapping("/api/categorias")
@CrossOrigin(origins = "http://localhost:4200")
public class DemoControllerCategory {

	
	 @Autowired
	  private CategoryService categoryService;

	    @GetMapping
	    public ResponseEntity<List<Category>> products() {
	        return ResponseEntity.ok(categoryService.categories());
	    }

	    @PostMapping
	    public ResponseEntity<Category> create(@RequestBody Category categoria) {
	        return ResponseEntity.ok(categoryService.save(categoria));
	    }
	    
	    
	    
	    @GetMapping("/{idCategoria}/products")
	    public ResponseEntity<List<Product>>getCategoriaById(@PathVariable Long idCategoria) {
	 
	    	  return ResponseEntity.ok(categoryService.getProductsByCategory(idCategoria));
	        
	        
	    }
	    
	    
}
