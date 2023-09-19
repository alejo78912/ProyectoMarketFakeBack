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

import com.Alejandro.Service.UserService;

import com.Alejandro.models.User;





@RestController
@RequestMapping("/api/usuarios")
@CrossOrigin(origins = "http://localhost:4200")
public class DemoControllerUser {

	
	 @Autowired
	 private UserService userService;

	   @GetMapping
	    public ResponseEntity<List<User>> user() {
	        return ResponseEntity.ok(userService.users());
	    }

	 

	    @PostMapping
	    public ResponseEntity<User> create(@RequestBody User usuario) {
	        return ResponseEntity.ok(userService.save(usuario));
	    }

	    @DeleteMapping("/{cedulaUsuario}")
	    public ResponseEntity<Void> delete(@PathVariable Long id) {
	    	userService.delete(id);
	        return ResponseEntity.noContent().build();
	    
	    }
	    
	  
}
