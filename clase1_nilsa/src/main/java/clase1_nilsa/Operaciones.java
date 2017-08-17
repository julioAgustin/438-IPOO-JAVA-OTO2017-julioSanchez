package clase1_nilsa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Operaciones {
	List<Funcionario> listaFuncionarios = new ArrayList<>();
	BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
	
	public void menu() throws NumberFormatException, IOException{
		
		int opcion = 0;
		while (opcion != 7){
			System.out.println("Escoja una opcion");
			System.out.println("1. Agregar funcionario");
			System.out.println("2. Eliminar funcionario dado Nro. CI: ");
			System.out.println("3. Actualizar salario dado Nro. Cédula");
			System.out.println("4. Ordenar por antiguedad ASC");
			System.out.println("5. Ordenar por salario DESC");
			System.out.println("6. Imprimir lista");
			System.out.println("7. Salir");
			
			opcion = Integer.parseInt(entrada.readLine());
			
			switch (opcion){
			case 1:
				agregarFuncionario();
				break;
			case 2: 
				eliminarFuncionario();
				break;
			case 3:
				actualizarFuncionario();
				break;
			case 4:
				ordenarlistaASC();
				break;
			case 6:
				imprimirLista();
				break;
			case 7:
				break;
			}
			
				
		}
	}
	private void agregarFuncionario() throws IOException{
		System.out.println("Ingrese el Nro. de cedula: ");
		String cedula = entrada.readLine();
		System.out.println("Ingrese nombre completo: ");
		String nombreCompleto = entrada.readLine();
		System.out.println("Ingrese la edad: ");
		Integer edad = Integer.parseInt(entrada.readLine());
		System.out.println("Ingrese el cargo: ");
		String cargo = entrada.readLine();
		System.out.println("Ingrese la antiguedad: ");
		Integer antiguedad = Integer.parseInt(entrada.readLine());
		System.out.println("Ingrese el salario: ");
		Integer salario = Integer.parseInt(entrada.readLine());
		listaFuncionarios.add(new Funcionario(cedula, nombreCompleto, edad, cargo, antiguedad, salario));
		
	}
	private void eliminarFuncionario() throws IOException{
		System.out.println("Ingrese el Nro. de cedula del funcionario a eliminar: ");
		String cedula = entrada.readLine();
		Iterator<Funcionario> it = listaFuncionarios.iterator();
		
		while(it.hasNext()){
			Funcionario funcionarioActual = it.next();
			  if (funcionarioActual.getNroCedula().equalsIgnoreCase(cedula)){
				  it.remove();
				  return;
			  }		  
			
		}
		System.err.println("El numero de documento interesado no forma parte de la lista: ");
		
	}
	
	private void actualizarFuncionario() throws IOException{
		System.out.println("Ingrese el Nro. de cedula del funcionario a actualizar: ");
		String cedula = entrada.readLine();
		Iterator<Funcionario> it = listaFuncionarios.iterator();
		int contador = 0;
		while(it.hasNext()){
			Funcionario funcionarioActual = it.next();
			  if (funcionarioActual.getNroCedula().equalsIgnoreCase(cedula)){
				  System.out.println("Su salario actual es de:" + funcionarioActual.getSalario());
				  System.out.println("Ingrese el nuevo salario: ");
				  Integer salario = Integer.parseInt(entrada.readLine());
				  funcionarioActual.setSalario(salario);
				  listaFuncionarios.set(contador, funcionarioActual);
				  return;
			  }		  
			  	contador ++;
		}
	}
	private void imprimirLista() {
		System.out.println("La list resultante es: ");
		for (Funcionario funcionario : listaFuncionarios){
			System.out.printf("El funcionario %s con CI %s con %s años tiene una antiguedad "
					+ "de %d se desempeña en el cargo %s con un salario de %s\n", funcionario.getNombreCompleto(), 
					funcionario.getNroCedula(), funcionario.getEdad(), 
					funcionario.getAntiguedad(), funcionario.getCargo(), funcionario.getSalario());
		}
	}
	private void ordenarlistaASC(){
		Collections.sort(listaFuncionarios, ORDENASC);
	}
	
	static final Comparator<Funcionario> ORDENASC = new Comparator<Funcionario>(){
		@Override
		public int compare (Funcionario o1, Funcionario o2){
			return new Integer(o2.getAntiguedad().compareTo(o1.getAntiguedad()));
		}
	};	
	public static void main(String[] args) {
		

	}

}
