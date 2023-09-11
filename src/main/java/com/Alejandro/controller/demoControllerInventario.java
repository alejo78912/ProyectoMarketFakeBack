package com.Alejandro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Alejandro.Service.InventarioService;

import com.Alejandro.models.Producto;


@RestController
@RequestMapping("/api/inventarios")
@CrossOrigin(origins = "http://localhost:4200")
public class demoControllerInventario {
	
	 @Autowired
	    private InventarioService inventarioService;

	    @GetMapping
	    public ResponseEntity<List<Producto>> productos() {
	        return ResponseEntity.ok(inventarioService.productos());
	    }

	    @GetMapping("/{codProducto}")
	    public ResponseEntity<Producto> editar(@PathVariable Producto producto) {
	        Producto producto1 = inventarioService.editar(producto);
	        if (producto1 != null) {
	            return ResponseEntity.ok(producto);
	        } else {
	            return ResponseEntity.notFound().build();
	        }
	    }

	    @PostMapping
	    public ResponseEntity<Producto> crear(@RequestBody Producto producto) {
	        return ResponseEntity.ok(inventarioService.guardar(producto));
	    }

	    @DeleteMapping("/{codProducto}")
	    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
	    	inventarioService.eliminar(id);
	        return ResponseEntity.noContent().build();
	    }

}
