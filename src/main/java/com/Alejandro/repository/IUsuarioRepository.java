package com.Alejandro.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.Alejandro.models.Usuario;


public interface IUsuarioRepository  extends JpaRepository<Usuario, Long>{

	
	
}
