package com.julioagustin.ipoo.segundoParcialJulioAgustin.Persona;

public class Empresa {
	
	private long id;
	private String Nombre;
	private String telefono;
	private String direccion;
  public Empresa(){
	  
  }
public Empresa(long id, String nombre, String telefono, String direccion) {
	super();
	this.id = id;
	Nombre = nombre;
	this.telefono = telefono;
	this.direccion = direccion;
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getNombre() {
	return Nombre;
}
public void setNombre(String nombre) {
	Nombre = nombre;
}
public String getTelefono() {
	return telefono;
}
public void setTelefono(String telefono) {
	this.telefono = telefono;
}
public String getDireccion() {
	return direccion;
}
public void setDireccion(String direccion) {
	this.direccion = direccion;
}
  
}
