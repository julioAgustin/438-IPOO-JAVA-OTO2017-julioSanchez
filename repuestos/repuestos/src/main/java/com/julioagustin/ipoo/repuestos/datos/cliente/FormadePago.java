package com.julioagustin.ipoo.repuestos.datos.cliente;

public class FormadePago {
private int id;
private int tasa;
private String nombre;
private int plazo;


	public FormadePago(){
		
	}
	//constructor


	public FormadePago(int id, int tasa, String nombre, int plazo) {
		super();
		this.id = id;
		this.tasa = tasa;
		this.nombre = nombre;
		this.plazo = plazo;
	}
	//metodos


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getTasa() {
		return tasa;
	}


	public void setTasa(int tasa) {
		this.tasa = tasa;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getPlazo() {
		return plazo;
	}


	public void setPlazo(int plazo) {
		this.plazo = plazo;
	}
	
}
