package com.Alejandro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Alejandro.Service.UsuariService;
import com.Alejandro.models.Usuario;


@RestController
@RequestMapping("/api/auth")
@CrossOrigin(origins = "http://localhost:4200")
public class demoControllerAuth {

	
	@Autowired
 
	private UsuariService usuarioService;
	
	

	 @PostMapping
	    public ResponseEntity<?> autenticarUsuario(@RequestBody Usuario usuario) {
	        String correo = usuario.getEmailUsuario();
	        String contrasena = usuario.getConstrasenia();

	        String tipoUsuario = usuarioService.autenticarUsuario(correo, contrasena);

	        if (tipoUsuario != null) {
	            return ResponseEntity.ok(tipoUsuario);
	        } else {
	            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("La autenticación ha fallado");
	        }
	    }

}
