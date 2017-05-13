package com.julioagustin.ipoo.repuestos.datos.cliente;

public class EstadoPedido {
	private int id;
	private String nombre;
	private String descripcion;
	//constructor1
	public EstadoPedido (){
		
	}
	// contructor2
	public EstadoPedido(int id, String nombre, String descripcion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}
	//metodos
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
	
}
	