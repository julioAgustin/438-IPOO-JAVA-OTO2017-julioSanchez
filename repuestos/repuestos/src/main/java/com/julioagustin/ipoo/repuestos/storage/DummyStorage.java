package com.julioagustin.ipoo.repuestos.storage;

import java.util.ArrayList;
import java.util.List;

import com.julioagustin.ipoo.repuestos.cliente.Cliente;

public class DummyStorage implements Storage{
	
	// declaración vector que contendrá los clientes
	private List<Cliente> clientes;
	
	public DummyStorage(){
		
		// inicialización del vector como un Array List
		clientes=new ArrayList<>();
		
		// contador para generar identificadores únicos
		long id=0;
		
		// Creo el primer cliente
		Cliente c=new Cliente();
		c.setTipoDoc("CI");
		c.setNroDoc("999999");
		c.setPassword("123");
		c.setNombre("Diego Bonnin");
		// Aumento el contador, antes tenia 0, ahora tiene el valor 1
		c.setId(++id);
		
		// Agrego el cliente al vector
		clientes.add(c);
		
		// Creo un segundo cliente
		Cliente c2=new Cliente();
		c2.setTipoDoc("CI");
		c2.setNroDoc("888888");
		c2.setPassword("789");
		c2.setNombre("Otro Cliente");
		// Vuelvo a aumentar el contador, antes tenia 1, ahora tiene el valor 2
		c2.setId(++id);
		
		// agrego el segundo cliente
		clientes.add(c2);
		
		
		// Creo un tercer cliente
		Cliente c3=new Cliente();
		c3.setTipoDoc("CI");
		c3.setNroDoc("111111");
		c3.setPassword("789");
		c3.setNombre("Otro Cliente más");
		// Vuelvo a aumentar el contador, antes tenia 2, ahora tiene el valor 3
		c3.setId(++id);
		
		// agrego el tercer cliente
		clientes.add(c3);		
		
	}

	@Override
	public Cliente obtCliente(String tipoDoc, String nroDoc, String password) {
		
		// Recorro el vector, asignando cada miembro a la variable "c"
		for(Cliente c: clientes){
			// Comparo los tres valores con los recibidos por parámetro, si coinciden, retorno el cliente
			// el método equals compara dos String, el operador "&&" significa "and", o en español "y"
			if(c.getTipoDoc().equals(tipoDoc) && c.getNroDoc().equals(nroDoc) && c.getPassword().equals(password)){
				return c;
			}
		}
		// si no se encontraron coincidencias, retorno null
		return null;
	}
	
	// prueba de la clase
	public static void main(String[] args){
		
		// Creo una instancia de la clase DummyStorage
		Storage s=new DummyStorage();
		// Obtengo el primer cliente
		Cliente c=s.obtCliente("CI", "999999", "123");
		// Imprimo en consola si es null (no encontro el cliente)
		System.out.println("Es null c?: " + (c==null));
		// Imprimo el nombre del cliente si no es null
		if(c!=null) System.out.println("Nombre del cliente: " + c.getNombre());
		else System.out.println("No se encontro el cliente");
		
		// Otro cliente
		
		// Obtengo el segundo cliente
		Cliente c2=s.obtCliente("CI", "888888", "789");
		// Imprimo en consola si es null (no encontro el cliente)
		System.out.println("Es null c2?: " + (c2==null));
		// Imprimo el nombre del cliente si no es null
		if(c2!=null) System.out.println("Nombre del cliente: " + c2.getNombre());
		else System.out.println("No se encontro el cliente");
		
		// Ahora un cliente que no existe
		
		// Obtengo un cliente que no existe, será null (ahora si existe)
		Cliente c3=s.obtCliente("CI", "111111", "789");
		// Imprimo en consola si es null (no encontro el cliente)
		System.out.println("Es null c3?: " + (c3==null));
		// Imprimo el nombre del cliente si no es null
		if(c3!=null) System.out.println("Nombre del cliente: " + c3.getNombre());
		else System.out.println("No se encontro el cliente");
		
		
		
	}
	
	
	

}
