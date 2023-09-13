package com.Alejandro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Alejandro.Service.CategoriaService;
import com.Alejandro.models.Categoria;


@RestController
@RequestMapping("/api/categorias")
@CrossOrigin(origins = "http://localhost:4200")
public class demoControllerCategoria {

	
	 @Autowired
	    private CategoriaService categoriaService;

	    @GetMapping
	    public ResponseEntity<List<Categoria>> productos() {
	        return ResponseEntity.ok(categoriaService.categorias());
	    }

	    

	    @PostMapping
	    public ResponseEntity<Categoria> crear(@RequestBody Categoria categoria) {
	        return ResponseEntity.ok(categoriaService.guardar(categoria));
	    }
}
