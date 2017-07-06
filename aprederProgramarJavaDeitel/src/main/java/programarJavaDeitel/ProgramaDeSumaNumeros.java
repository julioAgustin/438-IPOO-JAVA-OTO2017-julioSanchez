package programarJavaDeitel;
import java.util.Scanner;

public class ProgramaDeSumaNumeros {
	
	// Método que ejecuta la clase
	public static void main(String[] args) {
		// Crea objeto scanner para obtener la entrada de la ventana de comandos
		
		Scanner entrada= new Scanner(System.in);
		
		int numero1; // Primer número a sumar
		int numero2; // Segundo número a sumar
		int suma; // La suma del primer valor con el segundo
		System.out.print("Escriba el primer entero: "); // Indicador
		numero1= entrada.nextInt(); // lee el primer número del usuario
	
		System.out.print("Escriba el segundo entero: "); // Indicador
		numero2= entrada.nextInt(); // lee el segundo número del usuario
		
		suma= numero1 + numero2; // Suma del primer valor con el segundo valor
		
		System.out.printf("La suma es %d\n", suma); // muestra la suma
	} // Fin del método

} // Fin de la clase
