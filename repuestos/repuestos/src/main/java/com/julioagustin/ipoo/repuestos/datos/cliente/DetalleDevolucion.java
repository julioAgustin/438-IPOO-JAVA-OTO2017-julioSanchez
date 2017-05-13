package com.julioagustin.ipoo.repuestos.datos.cliente;

public class DetalleDevolucion {
	
	private int id;
	private int cantidad;
	private String nrosDeSerie;
	private String morivoDevolucion;
	private Producto producto;
	public DetalleDevolucion(int id, int cantidad, String nrosDeSerie, String morivoDevolucion, Producto producto) {
		super();
		this.id = id;
		this.cantidad = cantidad;
		this.nrosDeSerie = nrosDeSerie;
		this.morivoDevolucion = morivoDevolucion;
		this.producto = producto;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public String getNrosDeSerie() {
		return nrosDeSerie;
	}
	public void setNrosDeSerie(String nrosDeSerie) {
		this.nrosDeSerie = nrosDeSerie;
	}
	public String getMorivoDevolucion() {
		return morivoDevolucion;
	}
	public void setMorivoDevolucion(String morivoDevolucion) {
		this.morivoDevolucion = morivoDevolucion;
	}
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	
	
	
}