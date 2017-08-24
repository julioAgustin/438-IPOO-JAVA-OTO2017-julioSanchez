package practicaSet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Operaciones {
	
	private Set<VideoClub> listaDeVideoClub = new HashSet<>();
	private BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
	private SortedSet<VideoClub> listaVideoClub = new TreeSet<>();
	
	public void menu()throws NumberFormatException, IOException{
		int opcion=0;
		
		while (opcion != 6){
			System.out.println("Opciones de menú.");
			System.out.println("1. Agregar películas.");
			System.out.println("2. Actualizar precio de películas: ");
			System.out.println("3. Eliminar películas según año: ");
			System.out.println("4. Lista película por Director: ");
			System.out.println("5. Imprimir lista de películas.");
			System.out.println("6. Salir.");
			
			opcion = Integer.parseInt(entrada.readLine());
			
			switch (opcion){
			case 1:
				agregarPelicula();
				break;
			case 2:
				actualizarPrecio();
				break;
			case 3:
				eliminarPelicula();
				break;
			case 4:
				listarPeliculaPorDirector();
				break;
			case 5:
				imprimirListaDePelicula();
				break;
			case 6:
				break;
			}	
		}
	}
	
	private void agregarPelicula() throws IOException {
		System.out.print("Ingrese el código de la película: ");
		Integer codigo = Integer.parseInt(entrada.readLine());
		System.out.print("Ingrese el nombre de la película: ");
		String nombrePelicula = entrada.readLine();
		System.out.print("Ingrese procedencia del producto: ");
		String director = entrada.readLine();
		System.out.print("Ingrese el director de la película: ");
		Integer anhoEstreno = Integer.parseInt(entrada.readLine());
		System.out.print("Ingrese cantidad en stock: ");
		Integer precioMercado = Integer.parseInt(entrada.readLine());
		System.out.print("Ingrese precio: ");
		Integer cantidad = Integer.parseInt(entrada.readLine());
		listaVideoClub.add(new VideoClub(codigo, nombrePelicula, director, anhoEstreno, precioMercado, cantidad));
	}
	
	private void actualizarPrecio() throws IOException  {
		System.out.print("Ingrese el código de la película que quiere modificar: ");
		Integer codigo = Integer.parseInt(entrada.readLine());
		Iterator<VideoClub> it = listaVideoClub.iterator();
		
		while (it.hasNext()) {
			VideoClub peliculaActual = it.next();
			if (peliculaActual.getCodigo()== codigo){
				System.out.print("El precio de mercado anterior es: " + peliculaActual.getPrecioMercado());
				System.out.print("Ingrese el nuevo precio: ");
				Integer precioMercado = Integer.parseInt(entrada.readLine());
				peliculaActual.setPrecioMercado(precioMercado);
				it.remove();
				listaVideoClub.add(peliculaActual);
				return;
			}
		}
	}

	private void imprimirListaDePelicula() {
		System.out.println("La list resultante es: ");
		for (VideoClub videoClub : listaVideoClub){
			System.out.printf("%d Películas -> d% - s% dirigida por -> %s año de"
					+ "estreno %d y su precio es: $d", videoClub.getCodigo(), 
					videoClub.getNombrePelicula(), videoClub.getDirector(), 
					videoClub.getAnhoEstreno(), videoClub.getPrecioMercado(), videoClub.getCantidad());
		}
	}
	
	private void eliminarPelicula() {
		System.out.print("Ingrese película a eliminar según año: ");
		String nombre = entrada.readLine();
		Iterator<VideoClub> it = listaVideoClub.iterator();
		while (it.hasNext()){
			VideoClub peliculaActual= it.next();
			if (peliculaActual.getAnhoEstreno().equals(anhoEstreno)){
				it.remove();
			}else {
				System.err.print("El nombre proveído no existe o no se encuentra.");
			}
		}
	}
	
	private void listarPeliculaPorDirector() throws IOException {
		System.out.println("Ingrese el nombre del director: ");
		String director = entrada.readLine();
		  
		for (VideoClub videoClub : listaVideoClub) {
			if (videoClub.getDirector().equalsIgnoreCase(director)) {
				listaVideoClub.add(videoClub);
			}
		}
		for (VideoClub videoClub : listaVideoClub) {
			System.out.printf("%d Películas -> d% - s% dirigida por -> %s año de"
					+ "estreno %d y su precio es: $d", videoClub.getCodigo(), 
					videoClub.getNombrePelicula(), videoClub.getDirector(), 
					videoClub.getAnhoEstreno(), videoClub.getPrecioMercado(), videoClub.getCantidad());
		}
	}
	public static void main(String[] args) {
		
		}
 }
