package com.Alejandro.models;


import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity(name ="ventas")
public class Venta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codVenta")
	private long codVenta;
	
	@Column(name = "valor")
	private int valor;
	

	@OneToMany(mappedBy="venta")
	private List <Producto> listaVendidos;
	
	@Column(name = "direccion")
	private String direccion;
	
	@Column(name = "telefono")
	private String telefono;
	
	@ManyToOne
	@JoinColumn(name = "cedulaCliente") 
	Usuario usuario;

	public Venta() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Venta(long codVenta, int valor, List<Producto> listaVendidos, String direccion, String telefono,
			Usuario usuario) {
		super();
		this.codVenta = codVenta;
		this.valor = valor;
		this.listaVendidos = listaVendidos;
		this.direccion = direccion;
		this.telefono = telefono;
		this.usuario = usuario;
	}

	public long getCodVenta() {
		return codVenta;
	}

	public void setCodVenta(long codVenta) {
		this.codVenta = codVenta;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public List<Producto> getListaVendidos() {
		return listaVendidos;
	}

	public void setListaVendidos(List<Producto> listaVendidos) {
		this.listaVendidos = listaVendidos;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Usuario getCliente() {
		return usuario;
	}

	public void setCliente(Usuario usuario) {
		this.usuario = usuario;
	}

	

	
	
}
