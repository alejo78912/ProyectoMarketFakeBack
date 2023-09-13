package com.Alejandro.Service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Alejandro.models.Usuario;
import com.Alejandro.repository.IUsuarioRepository;




@Service
public class UsuariService {

    @Autowired
	private IUsuarioRepository usuarioRepository;
	 
    public List<Usuario> usuarios() {
        return usuarioRepository.findAll();
    }
	 
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
	 

	  
	 
	
}
