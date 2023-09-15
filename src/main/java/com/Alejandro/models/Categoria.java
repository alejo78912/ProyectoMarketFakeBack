package com.Alejandro.models;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Data
@Entity(name ="categorias")
public class Categoria {

	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idCategoria")
	private Long idCategoria;
	
	
	
	@Column(name = "nombreCategoria")
	private String nombreCategoria;
	

	public Categoria(Long idCategoria, String nombreCategoria) {
		super();
		this.idCategoria = idCategoria;
		this.nombreCategoria = nombreCategoria;
		
	}


	public Categoria() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Long getIdCategoria() {
		return idCategoria;
	}


	public void setIdCategoria(Long idCategoria) {
		this.idCategoria = idCategoria;
	}


	public String getNombreCategoria() {
		return nombreCategoria;
	}


	public void setNombreCategoria(String nombreCategoria) {
		this.nombreCategoria = nombreCategoria;
	}


	

	
	
	
}
