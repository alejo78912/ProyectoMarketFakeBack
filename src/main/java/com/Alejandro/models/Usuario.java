package com.Alejandro.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name ="usuarios")
public class Usuario {
	
	
	@Id
	@Column(name = "cedulaUsuario")
	private long cedulaUsuario;
	
	@Column(name = "nombreUsuario")
	private String nombreUsuario;
	
	@Column(name = "apellidoUsuario")
	private String apellidoUsuario;
	
	@Column(name = "emailUsuario")
	private String emailUsuario;
	
	@Column(name = "constrasenia")
	private String constrasenia;
	
	@Column(name = "telefonoUsuario")
	private String telefonoUsuario;

	public Usuario(long cedulaUsuario, String nombreUsuario, String apellidoUsuario, String emailUsuario,
			String constrasenia, String telefonoUsuario) {
		super();
		this.cedulaUsuario = cedulaUsuario;
		this.nombreUsuario = nombreUsuario;
		this.apellidoUsuario = apellidoUsuario;
		this.emailUsuario = emailUsuario;
		this.constrasenia = constrasenia;
		this.telefonoUsuario = telefonoUsuario;
	}

	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getCedulaUsuario() {
		return cedulaUsuario;
	}

	public void setCedulaUsuario(long cedulaUsuario) {
		this.cedulaUsuario = cedulaUsuario;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getApellidoUsuario() {
		return apellidoUsuario;
	}

	public void setApellidoUsuario(String apellidoUsuario) {
		this.apellidoUsuario = apellidoUsuario;
	}

	public String getEmailUsuario() {
		return emailUsuario;
	}

	public void setEmailUsuario(String emailUsuario) {
		this.emailUsuario = emailUsuario;
	}

	public String getConstrasenia() {
		return constrasenia;
	}

	public void setConstrasenia(String constrasenia) {
		this.constrasenia = constrasenia;
	}

	public String getTelefonoUsuario() {
		return telefonoUsuario;
	}

	public void setTelefonoUsuario(String telefonoUsuario) {
		this.telefonoUsuario = telefonoUsuario;
	} 
			
	
	
	
	

}
