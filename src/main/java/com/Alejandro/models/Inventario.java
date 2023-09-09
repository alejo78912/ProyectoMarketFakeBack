package com.Alejandro.models;


import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity(name ="inventarios")
public class Inventario {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codInventario")
	private long idInventario;
	
	
	@OneToMany(mappedBy="inventario")
	private List <Producto> listaInventario;


	public Inventario(long idInventario, List<Producto> listaInventario) {
		super();
		this.idInventario = idInventario;
		this.listaInventario = listaInventario;
	}


	public Inventario() {
		super();
		// TODO Auto-generated constructor stub
	}


	public long getIdInventario() {
		return idInventario;
	}


	public void setIdInventario(long idInventario) {
		this.idInventario = idInventario;
	}


	public List<Producto> getListaInventario() {
		return listaInventario;
	}


	public void setListaInventario(List<Producto> listaInventario) {
		this.listaInventario = listaInventario;
	}
	
	
	
}
