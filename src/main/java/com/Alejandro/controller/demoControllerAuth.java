package com.Alejandro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Alejandro.Service.AuthService;
import com.Alejandro.models.Usuario;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin(origins = "http://localhost:4200")
public class demoControllerAuth {

	
	@Autowired
    private AuthService authService;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody Usuario usuario) {
        // Realiza la autenticación utilizando el servicio AuthService
        // (puedes personalizar esto según tus necesidades)
        int isAuthenticated = authService.autenticar(usuario.getEmailUsuario(), usuario.getConstrasenia());

        if (isAuthenticated == 1|| isAuthenticated == 2 || isAuthenticated==3) {
            // Devuelve una respuesta exitosa si la autenticación es exitosa
            return ResponseEntity.ok("Autenticación exitosa");
        } else {
            // Devuelve una respuesta de error en caso de autenticación fallida
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Autenticación fallida");
        }
    }
}
