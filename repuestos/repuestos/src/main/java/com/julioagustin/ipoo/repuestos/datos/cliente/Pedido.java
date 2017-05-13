package com.julioagustin.ipoo.repuestos.datos.cliente;

import java.util.Date;
import java.util.List;

public class Pedido {
	private int id;
	private Date fechaHora;
	private Acceso acceso;
	private List<DetallePedido> DetallePedido;
	private List<HistoricoEstadoPedido> HistoricoEstadoPedido;
	private Cliente cliente;
	
	//Constructor1
	public Pedido() {
	
	}
	//Constructor 2
	public Pedido(int id, Date fechaHora, Acceso acceso,
			List<com.julioagustin.ipoo.repuestos.datos.cliente.DetallePedido> detallePedido,
			List<com.julioagustin.ipoo.repuestos.datos.cliente.HistoricoEstadoPedido> historicoEstadoPedido,
			Cliente cliente) {
		super();
		this.id = id;
		this.fechaHora = fechaHora;
		this.acceso = acceso;
		DetallePedido = detallePedido;
		HistoricoEstadoPedido = historicoEstadoPedido;
		this.cliente = cliente;
	}
	// Métodos
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
	public Acceso getAcceso() {
		return acceso;
	}
	public void setAcceso(Acceso acceso) {
		this.acceso = acceso;
	}
	public List<DetallePedido> getDetallePedido() {
		return DetallePedido;
	}
	public void setDetallePedido(List<DetallePedido> detallePedido) {
		DetallePedido = detallePedido;
	}
	public List<HistoricoEstadoPedido> getHistoricoEstadoPedido() {
		return HistoricoEstadoPedido;
	}
	public void setHistoricoEstadoPedido(List<HistoricoEstadoPedido> historicoEstadoPedido) {
		HistoricoEstadoPedido = historicoEstadoPedido;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	


}