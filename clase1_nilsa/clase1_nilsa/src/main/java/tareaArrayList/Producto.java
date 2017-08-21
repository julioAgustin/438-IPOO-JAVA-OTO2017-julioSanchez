package tareaArrayList;

import java.io.IOException;

public class Producto {
	
	private String codigo;
	private String nombre;
	private String procedencia;
	private Integer cantidadStock;
	private Integer precio;
	
public Producto() {
	
}

	public Producto(String codigo, String nombre, String procedencia, Integer cantidadStock, Integer precio) {
	super();
	this.codigo = codigo;
	this.nombre = nombre;
	this.procedencia = procedencia;
	this.cantidadStock = cantidadStock;
	this.precio = precio;
}



	public String getCodigo() {
	return codigo;
}



public void setCodigo(String codigo) {
	this.codigo = codigo;
}



public String getNombre() {
	return nombre;
}



public void setNombre(String nombre) {
	this.nombre = nombre;
}



public String getProcedencia() {
	return procedencia;
}



public void setProcedencia(String procedencia) {
	this.procedencia = procedencia;
}



public Integer getCantidadStock() {
	return cantidadStock;
}



public void setCantidadStock(Integer cantidadStock) {
	this.cantidadStock = cantidadStock;
}



public Integer getPrecio() {
	return precio;
}



public void setPrecio(Integer precio) {
	this.precio = precio;
}



	public static void main(String[] args) {
		OperacionesLista operacionesLista = new OperacionesLista();
		try {
			operacionesLista.menu();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
