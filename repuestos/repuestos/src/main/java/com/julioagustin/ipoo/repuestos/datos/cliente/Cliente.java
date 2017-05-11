package com.julioagustin.ipoo.repuestos.datos.cliente;

// Inicio de la clase
// nomenclatura: visibilidad class nombre de la clase
public class Cliente {
	
	//atributos
	private long id;
	private String nroDoc;
	private String tipoDoc;
	private String nombre;
	private String direccion;
	private String telefono;
	private String password;
	
	// constructor 1
	public Cliente(){
		
	}
	// constructor 2
	public Cliente(int id, String nroDoc, String tipoDoc, String nombre, String direccion, String telefono,
			String password) {
		super();
		this.id = id;
		this.nroDoc = nroDoc;
		this.tipoDoc = tipoDoc;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.password = password;
	}
	
	//métodos
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNroDoc() {
		return nroDoc;
	}
	public void setNroDoc(String nroDoc) {
		this.nroDoc = nroDoc;
	}
	public String getTipoDoc() {
		return tipoDoc;
	}
	public void setTipoDoc(String tipoDoc) {
		this.tipoDoc = tipoDoc;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
// fin de la clase
