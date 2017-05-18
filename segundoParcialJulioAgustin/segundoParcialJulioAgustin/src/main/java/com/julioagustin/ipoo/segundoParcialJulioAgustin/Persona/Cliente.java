package com.julioagustin.ipoo.segundoParcialJulioAgustin.Persona;

public class Cliente {
	private Cliente cliente;
	private LugarDeTrabajo lugarDeTrabajo;
	
	public Cliente () {
		
	}

	public Cliente(Cliente cliente, LugarDeTrabajo lugarDeTrabajo) {
		super();
		this.cliente = cliente;
		this.lugarDeTrabajo = lugarDeTrabajo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public LugarDeTrabajo getLugarDeTrabajo() {
		return lugarDeTrabajo;
	}

	public void setLugarDeTrabajo(LugarDeTrabajo lugarDeTrabajo) {
		this.lugarDeTrabajo = lugarDeTrabajo;
	}
	
}
