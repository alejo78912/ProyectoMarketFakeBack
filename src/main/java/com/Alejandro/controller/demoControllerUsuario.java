package com.Alejandro.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Alejandro.Service.UsuariService;
import com.Alejandro.models.Usuario;





@RestController
@RequestMapping("/api/usuarios")
@CrossOrigin(origins = "http://localhost:4200")
public class demoControllerUsuario {

	
	 @Autowired
	 private UsuariService usuarioService;

	

	 

	    @PostMapping
	    public ResponseEntity<Usuario> crear(@RequestBody Usuario usuario) {
	        return ResponseEntity.ok(usuarioService.guardar(usuario));
	    }

	    @DeleteMapping("/{cedulaUsuario}")
	    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
	    	usuarioService.eliminar(id);
	        return ResponseEntity.noContent().build();
	    
	    }
	    
	  
}
