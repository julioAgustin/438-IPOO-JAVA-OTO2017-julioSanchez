package com.julioagustin.ipoo.segundoParcialJulioAgustin.Persona;

public class LugarDeTrabajo {
	private String puesto;
	private Double ingresos;
	private int antiguedad;
	private Empresa empresa;
	
	public LugarDeTrabajo() {
		
	}

	public LugarDeTrabajo(String puesto, Double ingresos, int antiguedad,
			Empresa empresa) {
		super();
		this.puesto = puesto;
		this.ingresos = ingresos;
		this.antiguedad = antiguedad;
		this.empresa = empresa;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public Double getIngresos() {
		return ingresos;
	}

	public void setIngresos(Double ingresos) {
		this.ingresos = ingresos;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	
}
