package com.julioagustin.ipoo.repuestos.datos.cliente;

public class Modelo<Marca> {
	// Propiedades
	private long id;
	private String nombre;
	private String descripcion;
	private Marca Marca;
	
	// Constructor 1
	public Modelo(){
		
	}
	
	// Constructor 2
	public Modelo(long id, String nombre, String descripcion, Marca marca) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		Marca= marca;
	}

	// Métodos
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

	public Marca getMarca() {
		return Marca;
	}

	public void setMarca(Marca marca) {
		Marca = marca;
	}
}