package programarJavaDeitel;
import java.util.Scanner;

public class Comparacion {
	
	// Método que ejecuta la clase
	public static void main(String[] args) {
		// Crea objeto scanner para obtener la entrada de la ventana de comandos
		
		Scanner entrada= new Scanner(System.in);
		
		int numero1; // Primer número a sumar
		int numero2; // Segundo número a sumar
		
		
		System.out.print("Escriba el primer entero: "); // Indicador
		numero1= entrada.nextInt(); // lee el primer número del usuario
	
		System.out.print("Escriba el segundo entero: "); // Indicador
		numero2= entrada.nextInt(); // lee el segundo número del usuario
		
	 while (numero1!=-1 & numero2 !=-1){ // Se usa un while para que funcione más de una vez
		 // y que la condición de fin sea que numero1 o numero2 sea de valor -1
		 
		if (numero1==numero2){
			System.out.printf("%d==%d\n", numero1, numero2); // Igualdad del valor a con el b
		}
		
		
		if (numero1!=numero2){
			System.out.printf("%d!=%d\n", numero1, numero2); // Desigualdad del valor a con el b
		}
		
		if (numero1>numero2){
			System.out.printf("%d>%d\n", numero1, numero2); // Valor A mayor a B
		}
		
		if (numero1<numero2){
			System.out.printf("%d<%d\n", numero1, numero2); // Valor A menor a B
		}
		
		if (numero1>=numero2){
			System.out.printf("%d>=%d\n", numero1, numero2); // Valor A mayor o igual a B
		}
		if (numero1<=numero2){
			System.out.printf("%d<=%d\n", numero1, numero2); // Valor A menor o igual a B
		}
		
		System.out.print("Escriba el primer entero: "); // Indicador
		numero1= entrada.nextInt(); // lee el primer número del usuario
	
		System.out.print("Escriba el segundo entero: "); // Indicador
		numero2= entrada.nextInt(); // lee el segundo número del usuario
	 } // Fin del ciclo mientras
	 	
	} // Fin del método

} // Fin de la clase