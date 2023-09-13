package com.Alejandro.models;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity(name ="productos")
public class Producto {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codProducto")
	private long codProducto;
	
	@Column(name = "valor")
	private int valor;
	
	@ManyToOne // Esta anotación indica una relación ManyToOne
	@JoinColumn(name = "idCarrito") // Nombre de la columna que almacena la relación en la tabla de Producto
	private Carrito carrito;
	
	@ManyToOne // Esta anotación indica una relación ManyToOne
	@JoinColumn(name = "codVenta") // Nombre de la columna que almacena la relación en la tabla de Producto
	private Venta venta;
	
	@ManyToOne // Esta anotación indica una relación ManyToOne
	@JoinColumn(name = "codInventario") // Nombre de la columna que almacena la relación en la tabla de Producto
	private Inventario inventario;
	
	@Column(name = "url_photo")
	private String url_photo;
	
	@Column(name = "cantidadAVender")
	private int cantidadAVender;
	
	@ManyToOne
	@JoinColumn(name = "idCategoria")
	Categoria categoria;
	
	@Column(name = "nombreProducto")
	private String nombreProducto;
	
	@Column(name = "descripcionProducto")
	private String descripcionProducto;

	public Producto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Producto(long codProducto, int valor, String url_photo, int cantidadAVender, Categoria categoria,
			String nombreProducto, String descripcionProducto) {
		super();
		this.codProducto = codProducto;
		this.valor = valor;
		this.url_photo = url_photo;
		this.cantidadAVender = cantidadAVender;
		this.categoria = categoria;
		this.nombreProducto = nombreProducto;
		this.descripcionProducto = descripcionProducto;
	}

	public long getCodProducto() {
		return codProducto;
	}

	public void setCodProducto(long codProducto) {
		this.codProducto = codProducto;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public String getUrl_photo() {
		return url_photo;
	}

	public void setUrl_photo(String url_photo) {
		this.url_photo = url_photo;
	}

	public int getCantidadAVender() {
		return cantidadAVender;
	}

	public void setCantidadAVender(int cantidadAVender) {
		this.cantidadAVender = cantidadAVender;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public String getDescripcionProducto() {
		return descripcionProducto;
	}

	public void setDescripcionProducto(String descripcionProducto) {
		this.descripcionProducto = descripcionProducto;
	}
	
	
	
	

}
