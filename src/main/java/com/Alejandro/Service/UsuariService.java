package com.Alejandro.Service;


import org.springframework.stereotype.Service;

import com.Alejandro.models.Usuario;
import com.Alejandro.repository.IUsuarioRepository;


@Service
public class UsuariService {

	
	private IUsuarioRepository usuarioRepository;
	 
	 
	 public Usuario guardar(Usuario usuario) {
	        return usuarioRepository.save(usuario);
	    }

	 public void eliminar(Long id) {
	        usuarioRepository.deleteById(id);
	    }
	 
	 public Usuario editar(Usuario usuario) {
		 	Usuario aux = usuarioRepository.findById(usuario.getCedulaUsuario()).orElse(null);
		 	usuarioRepository.deleteById(aux.getCedulaUsuario());
	       return usuarioRepository.save(usuario);
	    }
	 
	 
	 public Usuario obtenerPorId(Long id) {
	        return usuarioRepository.findById(id).orElse(null);
	    }
	 

	    public String autenticarUsuario(String correo, String contrasena) {
	        Usuario usuario = usuarioRepository.findByEmailUsuario(correo);

	        if (usuario != null && usuario.getConstrasenia().equals(contrasena)) {
	            // Aquí, puedes implementar la lógica para determinar el tipo de usuario
	            // basándote en los roles o cualquier otro criterio que tengas en tu sistema.
	            String tipoUsuario = usuario.getTipoUsuario();
	            return tipoUsuario;
	        } else {
	            return null; // Devolver null si la autenticación falla
	        }
	    }
	 
	
}
