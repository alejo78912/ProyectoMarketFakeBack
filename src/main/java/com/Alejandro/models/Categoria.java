package com.Alejandro.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name ="categorias")
public class Categoria {

	
	

	@Id
	@Column(name = "nombreCategoria")
	private String nombreCategoria;

	public Categoria(String nombreCategoria) {
		super();
		this.nombreCategoria = nombreCategoria;
	}

	public Categoria() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getNombreCategoria() {
		return nombreCategoria;
	}

	public void setNombreCategoria(String nombreCategoria) {
		this.nombreCategoria = nombreCategoria;
	}
	
	
	
	
}
