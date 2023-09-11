package com.Alejandro.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity(name ="informes")
public class Informe {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codInforme")
	private long codInforme;
	
	@Column(name = "tipoInforme")
	private String tipoInforme;
	
	@Column(name = "descripcion")
	private String descripcion;
	
	 @ManyToOne
	 @JoinColumn(name = "cedulaEmpleado")
	 private Usuario empleado;

		public Informe(long codInforme, String tipoInforme, String descripcion, Usuario empleado) {
			super();
			this.codInforme = codInforme;
			this.tipoInforme = tipoInforme;
			this.descripcion = descripcion;
			this.empleado = empleado;
		}

		public Informe() {
			super();
			// TODO Auto-generated constructor stub
		}

		public long getCodInforme() {
			return codInforme;
		}

		public void setCodInforme(long codInforme) {
			this.codInforme = codInforme;
		}

		public String getTipoInforme() {
			return tipoInforme;
		}

		public void setTipoInforme(String tipoInforme) {
			this.tipoInforme = tipoInforme;
		}

		public String getDescripcion() {
			return descripcion;
		}

		public void setDescripcion(String descripcion) {
			this.descripcion = descripcion;
		}

		public Usuario getEmpleado() {
			return empleado;
		}

		public void setEmpleado(Usuario empleado) {
			this.empleado = empleado;
		}

		

	    
}