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
	 
	 
	
}
