package com.Alejandro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.Alejandro.models.Usuario;
import com.Alejandro.repository.IUsuarioRepository;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin(origins = "http://localhost:4200")
public class demoControllerAuth {

	
	@Autowired
    private IUsuarioRepository usuarioRepository;
	

	@PostMapping
	public ResponseEntity<?> login(@RequestBody Usuario usuario) {
	    Usuario usuarioEncontrado = usuarioRepository.findByEmailUsuario(usuario.getEmailUsuario());
	    if (usuarioEncontrado != null && usuarioEncontrado.getConstrasenia().equals(usuario.getConstrasenia())) {
	        return ResponseEntity.ok(usuarioEncontrado);
	    } else {
	        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
	    }
	}
}
