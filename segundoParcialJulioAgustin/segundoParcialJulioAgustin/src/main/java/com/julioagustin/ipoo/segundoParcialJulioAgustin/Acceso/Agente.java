package com.julioagustin.ipoo.segundoParcialJulioAgustin.Acceso;

public class Agente {
	private long id;
	private String usuario;
	private String contraseña;
	
	public Agente(){
		
	}

	public Agente(long id, String usuario, String contraseña) {
		super();
		this.id = id;
		this.usuario = usuario;
		this.contraseña = contraseña;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	
}
