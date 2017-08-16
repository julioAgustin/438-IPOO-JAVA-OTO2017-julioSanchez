package clase1_nilsa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Operaciones {
	List<Funcionario> listaFuncionarios = new ArrayList<>();
	BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
	
	public void menu(){
		int opcion = 0;
		while (opcion != 7){
			System.out.println("Escoja una opcion");
			System.out.println("1. Agregar funcionario");
			System.out.println("2. Eliminar funcionario");
			System.out.println("3. Actualizar salario dado Nro. Cédula");
			System.out.println("4. Ordenar por antiguedad ASC");
			System.out.println("5. Ordenar por salario DESC");
			System.out.println("6. Imprimir lista");
			System.out.println("7. Salir");
			try {
				opcion = Integer.parseInt(entrada.readLine());
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				System.err.println("La opcion ingresada no es válida");
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		

	}

}
