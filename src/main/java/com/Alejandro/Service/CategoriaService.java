package com.Alejandro.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Alejandro.models.Categoria;
import com.Alejandro.repository.ICategoriaRepository;


@Service
public class CategoriaService {

	@Autowired
	   private ICategoriaRepository categoriaRepository;
	 
	 
	 public List<Categoria> categorias() {
	        return categoriaRepository.findAll();
	    }
	 
	 public Categoria guardar(Categoria categoria) {
	        return categoriaRepository.save(categoria);
	    }
	
}
