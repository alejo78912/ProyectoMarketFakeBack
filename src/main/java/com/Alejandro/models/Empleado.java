package com.Alejandro.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name ="empleados")
public class Empleado {

	

	@Id
	@Column(name = "cedulaEmpleado")
	private long cedulaEmpleado;
	
	@Column(name = "nombreEmpleado")
	private String nombreEmpleado;
	
	@Column(name = "apellidoEmpleado")
	private String apellidoEmpleado;
	
	@Column(name = "emailEmpleado")
	private String emailEmpleado;
	
	@Column(name = "constrasenia_empleado")
	private String constrasenia_empleado;
	
	@Column(name = "telefonoEmpleado")
	private String telefonoEmpleado;
	

	@Column(name = "isAdmin")
	private boolean isAdmin;


	public Empleado(long cedulaEmpleado, String nombreEmpleado, String apellidoEmpleado, String emailEmpleado,
			String constrasenia_empleado, String telefonoEmpleado, boolean isAdmin) {
		super();
		this.cedulaEmpleado = cedulaEmpleado;
		this.nombreEmpleado = nombreEmpleado;
		this.apellidoEmpleado = apellidoEmpleado;
		this.emailEmpleado = emailEmpleado;
		this.constrasenia_empleado = constrasenia_empleado;
		this.telefonoEmpleado = telefonoEmpleado;
		this.isAdmin = isAdmin;
	}


	public Empleado() {
		super();
		// TODO Auto-generated constructor stub
	}


	public long getCedulaEmpleado() {
		return cedulaEmpleado;
	}


	public void setCedulaEmpleado(long cedulaEmpleado) {
		this.cedulaEmpleado = cedulaEmpleado;
	}


	public String getNombreEmpleado() {
		return nombreEmpleado;
	}


	public void setNombreEmpleado(String nombreEmpleado) {
		this.nombreEmpleado = nombreEmpleado;
	}


	public String getApellidoEmpleado() {
		return apellidoEmpleado;
	}


	public void setApellidoEmpleado(String apellidoEmpleado) {
		this.apellidoEmpleado = apellidoEmpleado;
	}


	public String getEmailEmpleado() {
		return emailEmpleado;
	}


	public void setEmailEmpleado(String emailEmpleado) {
		this.emailEmpleado = emailEmpleado;
	}


	public String getConstrasenia_empleado() {
		return constrasenia_empleado;
	}


	public void setConstrasenia_empleado(String constrasenia_empleado) {
		this.constrasenia_empleado = constrasenia_empleado;
	}


	public String getTelefonoEmpleado() {
		return telefonoEmpleado;
	}


	public void setTelefonoEmpleado(String telefonoEmpleado) {
		this.telefonoEmpleado = telefonoEmpleado;
	}


	public boolean isAdmin() {
		return isAdmin;
	}


	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
	
	


}