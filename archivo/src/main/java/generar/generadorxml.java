package generar;
// Import de los archivos para ejecutar el XML.
import org.jespxml.JespXML;
import org.jespxml.modelo.Atributo;
import org.jespxml.modelo.Tag;
// Clase
public class generadorxml {
	// Método para ejecutar la clase.
	public static void main(String[] args) {
		
		// Se añade el Tag Raiz y sus atributos.
		Tag raiz= new Tag("informe_Personas");
		
		raiz.addAtributo(new Atributo ("IdInstitucion","1"));
		raiz.addAtributo(new Atributo ("Fecha_Informe","2017-04-01"));
		
		// Se añade los demás Tag con sus atributo que posteriormente serán hijo de Tag Raiz.
		
		
		 

	}

}
