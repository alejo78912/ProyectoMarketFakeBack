package com.Alejandro.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Alejandro.models.Categoria;
import com.Alejandro.models.Producto;
import com.Alejandro.models.Usuario;
import com.Alejandro.repository.ICategoriaRepository;
import com.Alejandro.repository.IProductoRepository;


@Service
public class CategoriaService {

	@Autowired
	   private ICategoriaRepository categoriaRepository;
	
	@Autowired
	   private IProductoRepository productoRepository;
	
	 
	 
	 public List<Categoria> categorias() {
	        return categoriaRepository.findAll();
	    }
	 
	 public Categoria guardar(Categoria categoria) {
	        return categoriaRepository.save(categoria);
	    }
	 
	 public Categoria getCategoriaById(Long id) {
	        return categoriaRepository.findById(id).orElse(null);
	    }
	 
	 public List<Producto> getProductsByCategory(long idCategoria){
		 Categoria categoria = new Categoria();
		 categoria.setIdCategoria(idCategoria);
		 List<Producto> listaProductosCategoria =  productoRepository.findByCategoria(categoria);
		 return listaProductosCategoria;
	    
	 }


	
}
