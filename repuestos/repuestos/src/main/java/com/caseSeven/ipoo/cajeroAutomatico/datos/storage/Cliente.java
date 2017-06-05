package com.caseSeven.ipoo.cajeroAutomatico.datos.storage;

import java.util.List;

public class Cliente {
	
	private long id;
	private String tipoDoc;
	private String nroDoc;
	private String password;
	private String nombre;
	
	private List<Cuenta> cuenta;
	private List<Tarjeta> tarjeta;
	private List<Prestamo> prestamo;
	
	public Cliente(){
		
	}

	public Cliente(long id, String tipoDoc, String nroDoc, String password, String nombre, List<Cuenta> cuenta,
			List<Tarjeta> tarjeta, List<Prestamo> prestamo) {
		super();
		this.id = id;
		this.tipoDoc = tipoDoc;
		this.nroDoc = nroDoc;
		this.password = password;
		this.nombre = nombre;
		this.cuenta = cuenta;
		this.tarjeta = tarjeta;
		this.prestamo = prestamo;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTipoDoc() {
		return tipoDoc;
	}

	public void setTipoDoc(String tipoDoc) {
		this.tipoDoc = tipoDoc;
	}

	public String getNroDoc() {
		return nroDoc;
	}

	public void setNroDoc(String nroDoc) {
		this.nroDoc = nroDoc;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Cuenta> getCuenta() {
		return cuenta;
	}

	public void setCuenta(List<Cuenta> cuenta) {
		this.cuenta = cuenta;
	}

	public List<Tarjeta> getTarjeta() {
		return tarjeta;
	}

	public void setTarjeta(List<Tarjeta> tarjeta) {
		this.tarjeta = tarjeta;
	}

	public List<Prestamo> getPrestamo() {
		return prestamo;
	}

	public void setPrestamo(List<Prestamo> prestamo) {
		this.prestamo = prestamo;
	}
	
	

}
