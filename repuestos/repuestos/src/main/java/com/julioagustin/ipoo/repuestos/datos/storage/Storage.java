package com.julioagustin.ipoo.repuestos.datos.storage;

import com.julioagustin.ipoo.repuestos.datos.cliente.Cliente;

// Declaración de interface
public interface Storage {

	Cliente obtCliente(String tipoDoc, String nroDoc, String password);
}
