package com.Alejandro.models;


import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity(name ="carritos")
public class Carrito {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idCarrito")
	private long idCarrito;
	

	@OneToMany(mappedBy="carrito")
	private List <Producto> listaCarrito;


	public Carrito(long idCarrito, List<Producto> listaCarrito) {
		super();
		this.idCarrito = idCarrito;
		this.listaCarrito = listaCarrito;
	}


	public Carrito() {
		super();
		// TODO Auto-generated constructor stub
	}


	public long getIdCarrito() {
		return idCarrito;
	}


	public void setIdCarrito(long idCarrito) {
		this.idCarrito = idCarrito;
	}


	public List<Producto> getListaCarrito() {
		return listaCarrito;
	}


	public void setListaCarrito(List<Producto> listaCarrito) {
		this.listaCarrito = listaCarrito;
	}
	
	
	
	
}
