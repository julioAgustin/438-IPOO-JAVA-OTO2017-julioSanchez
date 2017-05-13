package com.julioagustin.ipoo.repuestos.datos.storage;

import java.util.ArrayList;
import java.util.List;

import com.julioagustin.ipoo.repuestos.datos.cliente.Cliente;

public class DummyStorage implements Storage{
	
	// Lista de clientes ficticia
	
	private List<Cliente> clientes;
	
	public DummyStorage(){
		
		// Variable para simular un autonumérico en una base de datos
		long id=0;
		
		
		// Inicializar el vector
		clientes=new ArrayList<>();
		
		Cliente c=new Cliente();
		c.setId(++id);
		c.setNombre("Julio Sánchez");
		c.setNroDoc("4900905");
		c.setTipoDoc("CI");
		c.setPassword("123");
		
		clientes.add(c);
		
	}
	
	@Override
	public Cliente obtCliente(String tipoDoc, String nroDoc, String password){
		// Por cada cliente en el sector de clientes
		for(Cliente c: clientes){
			if(
					c.getTipoDoc().equals(tipoDoc) &&
					c.getNroDoc().equals(nroDoc) &&
					c.getPassword().equals(password)
				){
					return c;
		         }
			}
		    return null;
	}
	
	public static void main (String[] args){
		
			Storage s=new DummyStorage();
			Cliente c=s.obtCliente("CI","4900905","123");
			System.out.println("Cliente es null: " + c);
			System.out.println("Nombre Cliente: " + c.getNombre());
	}
}