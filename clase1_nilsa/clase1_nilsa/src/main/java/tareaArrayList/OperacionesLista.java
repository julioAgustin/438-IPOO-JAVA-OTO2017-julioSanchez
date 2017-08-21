package tareaArrayList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class OperacionesLista {
	List<Producto> listaProducto = new ArrayList<>();
	BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
	
	public void menu()throws NumberFormatException, IOException{
		int opcion=0;
		
		while (opcion != 6){
			System.out.println("Escoja una opcion.");
			System.out.println("1. Agregar producto.");
			System.out.println("2. Actualizar la cantidad de stock dado un código: ");
			System.out.println("3. Eliminar los productos que coincidan con un nombre dado: ");
			System.out.println("4. Ordenar producto en forma ASC por precio: ");
			System.out.println("5. Imprimir lista de producto.");
			System.out.println("6. Salir.");
			
			opcion = Integer.parseInt(entrada.readLine());
			
			switch (opcion){
			case 1:
				agregarProducto();
				break;
			case 2:
				actualizarStock();
				break;
			case 3:
				eliminarProducto();
				break;
			case 4:
				ordenarListaProductoASC();
				break;
			case 5:
				imprimirListaDeProductos();
				break;
			case 6:
				break;
			}	
		}
	}
	
	private void agregarProducto() throws IOException{
		System.out.print("Ingrese el código del producto: ");
		String codigo = entrada.readLine();
		System.out.print("Ingrese el nombre del producto: ");
		String nombre = entrada.readLine();
		System.out.print("Ingrese procedencia del producto: ");
		String procedencia = entrada.readLine();
		System.out.print("Ingrese cantidad en stock: ");
		Integer cantidadStock = Integer.parseInt(entrada.readLine());
		System.out.print("Ingrese precio: ");
		Integer precio = Integer.parseInt(entrada.readLine());
		listaProducto.add(new Producto(codigo, nombre, procedencia, cantidadStock, precio));
		
	}
	
	private void actualizarStock() throws IOException{
		System.out.print("Ingrese el código del producto que quiere modificar: ");
		String codigo = entrada.readLine();
		Iterator<Producto> it = listaProducto.iterator();
		int contador = 0;
		
		while (it.hasNext()){
			Producto productoActual = it.next();
			if (productoActual.getCodigo().equalsIgnoreCase(codigo)){
				System.out.print("El stock anterior es: " + productoActual.getCantidadStock());
				System.out.print("Ingrese el stock actual: ");
				Integer cantidadStock = Integer.parseInt(entrada.readLine());
				productoActual.setCantidadStock(cantidadStock);
				listaProducto.set(contador, productoActual);
				return;
			}
			contador ++;
		}
	}
	
	private void eliminarProducto() throws IOException{
		System.out.print("Ingrese el nombre del producto a eliminar: ");
		String nombre = entrada.readLine();
		Iterator<Producto> it = listaProducto.iterator();
		while (it.hasNext()){
			Producto productoActual = it.next();
			if (productoActual.getNombre().equalsIgnoreCase(nombre)){
				it.remove();
				return;
			}
		}
		System.err.print("El nombre proveído no existe o no se encuentra.");
	}
	
	private void ordenarListaProductoASC(){
		Collections.sort(listaProducto, ORDENASC);
	}
	
	static final Comparator<Producto> ORDENASC = new Comparator<Producto>(){
		@Override
		public int compare (Producto o1, Producto o2){
			return new Integer(o2.getPrecio().compareTo(o1.getPrecio()));
		}
	};
	
	private void imprimirListaDeProductos(){
		System.out.println("La list resultante es: ");
		for (Producto producto : listaProducto){
			System.out.printf("El producto con Código %s con Nombre %s con procedencia %s cantidad %d,"
					+ "valor del producto precio por cantidad %s\n  ", producto.getCodigo(), 
					producto.getNombre(), producto.getProcedencia(), 
					producto.getCantidadStock(), producto.getCantidadStock() * producto.getPrecio());
		}
	}
	
	public static void main(String[] args) {
		

	}

}
