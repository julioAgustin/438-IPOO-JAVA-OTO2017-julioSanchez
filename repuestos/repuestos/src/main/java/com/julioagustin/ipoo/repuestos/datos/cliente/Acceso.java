package com.julioagustin.ipoo.repuestos.datos.cliente;

// Inicio de la clase
// Nomenclatura: visibilidad class nombre de la clase
import java.util.Date;

public class Acceso {

	// Atributos
	private Date fechaHoraInicio;
	private Date fechaHoraFin; 
	private String ip;
	private Cliente cliente;
	
	// Constructor 1
	public Acceso(){
		
	}
	// Constructor 2
	public Acceso(Date fechaHoraInicio, Date fechaHoraFin, String ip, Cliente cliente) {
		super();
		this.fechaHoraInicio = fechaHoraInicio;
		this.fechaHoraFin = fechaHoraFin;
		this.ip = ip;
		this.cliente = cliente;
	// Métodos	
	}
	public Date getFechaHoraInicio() {
		return fechaHoraInicio;
	}
	public void setFechaHoraInicio(Date fechaHoraInicio) {
		this.fechaHoraInicio = fechaHoraInicio;
	}
	public Date getFechaHoraFin() {
		return fechaHoraFin;
	}
	public void setFechaHoraFin(Date fechaHoraFin) {
		this.fechaHoraFin = fechaHoraFin;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
}
