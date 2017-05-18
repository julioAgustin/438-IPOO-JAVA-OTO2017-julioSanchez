package com.julioagustin.ipoo.segundoParcialJulioAgustin.Acceso;

import java.util.Date;
import java.util.List;

public class AccesoAgente {
	private long id;
	private Date fechaHoraInicio;
	private Date fechahoraFin;
	private List<Agente> agente;
	
	public AccesoAgente(){
		
	}

	public AccesoAgente(long id, Date fechaHoraInicio, Date fechahoraFin,
			List<Agente> agente) {
		super();
		this.id = id;
		this.fechaHoraInicio = fechaHoraInicio;
		this.fechahoraFin = fechahoraFin;
		this.agente = agente;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getFechaHoraInicio() {
		return fechaHoraInicio;
	}

	public void setFechaHoraInicio(Date fechaHoraInicio) {
		this.fechaHoraInicio = fechaHoraInicio;
	}

	public Date getFechahoraFin() {
		return fechahoraFin;
	}

	public void setFechahoraFin(Date fechahoraFin) {
		this.fechahoraFin = fechahoraFin;
	}

	public List<Agente> getAgente() {
		return agente;
	}

	public void setAgente(List<Agente> agente) {
		this.agente = agente;
	}
	
	
}
