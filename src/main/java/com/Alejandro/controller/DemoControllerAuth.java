package com.Alejandro.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Alejandro.Service.UserService;

import ch.qos.logback.core.model.Model;




@RestController
@RequestMapping("/api/auth")
@CrossOrigin(origins = "http://localhost:4200")
public class DemoControllerAuth {

	
	@Autowired
    private UserService userService; // Supongamos que tienes un servicio UserService que contiene el método findLogin.

	@PostMapping("/login")
	public String login(@RequestBody Map<String, String> requestBody) {
	    String email = requestBody.get("email");
	    String password = requestBody.get("password");

	    int userType = userService.findLogin(email, password);

	    if (userType == 1) {
	        return "clienteView";
	    } else if (userType == 2) {
	        return "empleadoView";
	    } else if (userType == 3) {
	        return "adminView";
	    } else {
	        return "loginPage";
	    }
	}

	
	

}
