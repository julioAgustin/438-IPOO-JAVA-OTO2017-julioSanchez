package com.julioagustin.ipoo.repuestos.storage;

import com.julioagustin.ipoo.repuestos.cliente.Cliente;

public interface Storage {
	
	Cliente obtCliente(String tipoDoc, String nroDoc, String password);

}
