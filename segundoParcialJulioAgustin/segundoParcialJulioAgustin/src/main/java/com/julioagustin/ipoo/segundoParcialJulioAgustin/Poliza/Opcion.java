package com.julioagustin.ipoo.segundoParcialJulioAgustin.Poliza;

public class Opcion {
	private long id;
	private String nombre;
	private String descripcion;
	private Double importeCobertura;
	
	public Opcion (){
		
	}

	public Opcion(long id, String nombre, String descripcion,
			Double importeCobertura) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.importeCobertura = importeCobertura;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Double getImporteCobertura() {
		return importeCobertura;
	}

	public void setImporteCobertura(Double importeCobertura) {
		this.importeCobertura = importeCobertura;
	}
	
}
