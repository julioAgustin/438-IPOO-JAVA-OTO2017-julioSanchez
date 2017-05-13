package com.julioagustin.ipoo.repuestos.datos.cliente;

import java.util.List;

public class Devolucion {
	private int id;
	private Pedido pedido;
	private List<DetalleDevolucion> DetalleDevolucion;
	// Constructor 1
	public Devolucion(){
		
	}
	//Constructor 2
	public Devolucion(int id, Pedido pedido,
			List<com.julioagustin.ipoo.repuestos.datos.cliente.DetalleDevolucion> detalleDevolucion) {
		super();
		this.id = id;
		this.pedido = pedido;
		DetalleDevolucion = detalleDevolucion;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	public List<DetalleDevolucion> getDetalleDevolucion() {
		return DetalleDevolucion;
	}
	public void setDetalleDevolucion(List<DetalleDevolucion> detalleDevolucion) {
		DetalleDevolucion = detalleDevolucion;
	}
	
	
}
