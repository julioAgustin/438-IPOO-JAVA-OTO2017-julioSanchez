package com.julioagustin.ipoo.segundoParcialJulioAgustin.Poliza;

import java.util.Date;
import java.util.List;

import com.julioagustin.ipoo.segundoParcialJulioAgustin.Acceso.AccesoAgente;
import com.julioagustin.ipoo.segundoParcialJulioAgustin.Acceso.Agente;

public class Poliza {
	
	private long id;
	private Date fechaHoraEmision;
	private Date fechaInicio;
	private Date fechaFin;
	private Double capitalAsegurado;
	private Double importeTotal;
	private Double cuota;
	private Date fechaVencimientoCuota;
	private List<AccesoAgente> AccesoAgente;
	private List<Agente> Agente;
	
	public Poliza(){
		
	}

	public Poliza(
			long id,
			Date fechaHoraEmision,
			Date fechaInicio,
			Date fechaFin,
			Double capitalAsegurado,
			Double importeTotal,
			Double cuota,
			Date fechaVencimientoCuota,
			List<com.julioagustin.ipoo.segundoParcialJulioAgustin.Acceso.AccesoAgente> accesoAgente,
			List<com.julioagustin.ipoo.segundoParcialJulioAgustin.Acceso.Agente> agente) {
		super();
		this.id = id;
		this.fechaHoraEmision = fechaHoraEmision;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.capitalAsegurado = capitalAsegurado;
		this.importeTotal = importeTotal;
		this.cuota = cuota;
		this.fechaVencimientoCuota = fechaVencimientoCuota;
		AccesoAgente = accesoAgente;
		Agente = agente;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getFechaHoraEmision() {
		return fechaHoraEmision;
	}

	public void setFechaHoraEmision(Date fechaHoraEmision) {
		this.fechaHoraEmision = fechaHoraEmision;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	public Double getCapitalAsegurado() {
		return capitalAsegurado;
	}

	public void setCapitalAsegurado(Double capitalAsegurado) {
		this.capitalAsegurado = capitalAsegurado;
	}

	public Double getImporteTotal() {
		return importeTotal;
	}

	public void setImporteTotal(Double importeTotal) {
		this.importeTotal = importeTotal;
	}

	public Double getCuota() {
		return cuota;
	}

	public void setCuota(Double cuota) {
		this.cuota = cuota;
	}

	public Date getFechaVencimientoCuota() {
		return fechaVencimientoCuota;
	}

	public void setFechaVencimientoCuota(Date fechaVencimientoCuota) {
		this.fechaVencimientoCuota = fechaVencimientoCuota;
	}

	public List<AccesoAgente> getAccesoAgente() {
		return AccesoAgente;
	}

	public void setAccesoAgente(List<AccesoAgente> accesoAgente) {
		AccesoAgente = accesoAgente;
	}

	public List<Agente> getAgente() {
		return Agente;
	}

	public void setAgente(List<Agente> agente) {
		Agente = agente;
	}
	
	
	
}
