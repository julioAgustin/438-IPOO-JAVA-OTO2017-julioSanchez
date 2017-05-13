package com.julioagustin.ipoo.repuestos.datos.cliente;

import java.util.Date;

public class HistoricoEstadoPedido {
	private int id;
	private Date fechaHora;
	private EstadoPedido estadoPedido;
	private Pedido pedido;
	
	//constructor
	public HistoricoEstadoPedido (){
	
	}
	//constructor 2
	public HistoricoEstadoPedido(int id, Date fechaHora, EstadoPedido estadoPedido, Pedido pedido) {
		super();
		this.id = id;
		this.fechaHora = fechaHora;
		this.estadoPedido = estadoPedido;
		this.pedido = pedido;
	}
	
	//Metodos
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getFechaHora() {
		return fechaHora;
	}
	public void setFechaHora(Date fechaHora) {
		this.fechaHora = fechaHora;
	}
	public EstadoPedido getEstadoPedido() {
		return estadoPedido;
	}
	public void setEstadoPedido(EstadoPedido estadoPedido) {
		this.estadoPedido = estadoPedido;
	}
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	
	
	

}
