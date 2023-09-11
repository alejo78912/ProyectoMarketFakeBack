package com.Alejandro.Service;

import org.springframework.stereotype.Service;

import com.Alejandro.models.Usuario;
import com.Alejandro.repository.IUsuarioRepository;

@Service
public class AuthService {

	

	 private IUsuarioRepository usuarioRepository;

	 public int autenticar(String email, String contrasenia){
	        Usuario usuario = usuarioRepository.findByCustomLoginQuery(email, contrasenia);
	        if (usuario != null ) {
	            
	            if (usuario.getTipoUsuario().equals("Cliente")) {
	                return 1;
	            }
	            else if (usuario.getTipoUsuario().equals("Empleado")) {
	               return 2;
	            }
	            else if (usuario.getTipoUsuario().equals("Admin")) {
		               return 3;
		            }
	       
	        }
	 
	        return 0; 
	 }
}
