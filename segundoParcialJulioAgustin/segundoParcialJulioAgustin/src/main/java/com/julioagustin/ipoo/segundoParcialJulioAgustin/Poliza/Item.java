package com.julioagustin.ipoo.segundoParcialJulioAgustin.Poliza;

import com.julioagustin.ipoo.segundoParcialJulioAgustin.Persona.Electrodomestico;

public class Item {
	private long id;
	private Double valor;
	private String descripcion;
	private Mueble mueble;
	private Electrodomestico electrodomestico;
	public Item(){
		
	}
	public Item(long id, Double valor, String descripcion, Mueble mueble,
			Electrodomestico electrodomestico) {
		super();
		this.id = id;
		this.valor = valor;
		this.descripcion = descripcion;
		this.mueble = mueble;
		this.electrodomestico = electrodomestico;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Mueble getMueble() {
		return mueble;
	}
	public void setMueble(Mueble mueble) {
		this.mueble = mueble;
	}
	public Electrodomestico getElectrodomestico() {
		return electrodomestico;
	}
	public void setElectrodomestico(Electrodomestico electrodomestico) {
		this.electrodomestico = electrodomestico;
	}
	
	
}
