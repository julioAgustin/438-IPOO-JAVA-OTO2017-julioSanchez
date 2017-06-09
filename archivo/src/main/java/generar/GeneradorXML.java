package generar;

// Import de tipo de archivo y del Try Catch.
import java.io.File;
import java.io.FileNotFoundException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;

// Import de los archivos para ejecutar el XML.
import org.jespxml.JespXML;
import org.jespxml.modelo.Atributo;
import org.jespxml.modelo.Encoding;
import org.jespxml.modelo.Tag;
// Clase
public class GeneradorXML {
	// Método para ejecutar la clase.
	public static void main(String[] args) {
		
		// Se añade el Tag Raiz y sus atributos.
		Tag raiz= new Tag("Informe_Personas");
		
		raiz.addAtributo(new Atributo ("IdInstitucion","1"));
		raiz.addAtributo(new Atributo ("Fecha_Informe","2017-04-01"));
		
		// Se añade los demás Tag con sus atributo que posteriormente serán hijo de Tag Raiz.
		
		Tag Persona= new Tag("Persona");
		
		Persona.addAtributo(new Atributo ("PrimerNombre","Juan"));
		Persona.addAtributo(new Atributo ("SegundoNombre","Ramon"));
		Persona.addAtributo(new Atributo ("PrimerApellido","Scognamiglio"));
		Persona.addAtributo(new Atributo ("SegundoApellido","Bermúdez"));
		Persona.addAtributo(new Atributo ("NombreCompleto","Juan Ramón Scognamiglio Bermúdez"));
		Persona.addAtributo(new Atributo ("Género","M"));
		Persona.addAtributo(new Atributo ("IdNacionalidad","UY"));
		Persona.addAtributo(new Atributo ("NroDoc","29125364"));
		
		Tag DatosConyuge= new Tag("DatosConyuge");
		
		DatosConyuge.addAtributo(new Atributo ("PrimerNombre","Maria"));
		DatosConyuge.addAtributo(new Atributo ("SegundoNombre","Antonieta"));
		DatosConyuge.addAtributo(new Atributo ("PrimerApellido","Rodriguez"));
		DatosConyuge.addAtributo(new Atributo ("SegundoApellido","Bas"));
		DatosConyuge.addAtributo(new Atributo ("NombreCompleto","Maria Antonieta Rodriguez Bas"));
		DatosConyuge.addAtributo(new Atributo ("IdTipoDoc","2"));
		DatosConyuge.addAtributo(new Atributo ("IdPaisDoc","UY"));
		DatosConyuge.addAtributo(new Atributo ("NroDoc","29125364"));
		
		Tag Estudios= new Tag("Estudios");
		
		Estudios.addAtributo(new Atributo ("TipoEstudioCursado","Primario"));
		Estudios.addAtributo(new Atributo ("TipoEstudioCursado","Secundario"));
		Estudios.addAtributo(new Atributo ("TipoEstudioCursado","Terciario"));
		Estudios.addAtributo(new Atributo ("FechaInformado","1989-01-01"));
		Estudios.addAtributo(new Atributo ("FechaInformado","2016-01-01"));
		Estudios.addAtributo(new Atributo ("FechaInformado","2016-01-01"));
		
		Tag Documentos= new Tag("Documentos");
		
		Documentos.addAtributo(new Atributo ("IdTipoDoc","2"));
		Documentos.addAtributo(new Atributo ("IdPaisDoc","UY"));
		Documentos.addAtributo(new Atributo ("NroDoc","43625846"));
		Documentos.addAtributo(new Atributo ("VersionDocumento","Original"));
		Documentos.addAtributo(new Atributo ("FechaVencimiento","2020-01-01"));
		
		Tag Direcciones= new Tag("Direcciones");
		
		Direcciones.addAtributo(new Atributo ("Direccion_Libre","Cap. Tula"));
		Direcciones.addAtributo(new Atributo ("NroPuerta","1957"));
		Direcciones.addAtributo(new Atributo ("NroApartamento","2"));
		Direcciones.addAtributo(new Atributo ("Edificio","3"));
		Direcciones.addAtributo(new Atributo ("CodigoPostal","12400"));
		Direcciones.addAtributo(new Atributo ("IdPais","UY"));
		Direcciones.addAtributo(new Atributo ("Ciudad","Montevideo"));
		Direcciones.addAtributo(new Atributo ("Barrio","Colon"));
		Direcciones.addAtributo(new Atributo ("Telefono","055365073"));
		Direcciones.addAtributo(new Atributo ("FechaRegistrada","2017-04-18"));
		Direcciones.addAtributo(new Atributo ("IdTipoDireccion","1"));
		
		Tag Trabajos= new Tag("Trabajos");
		
		Trabajos.addAtributo(new Atributo ("FechaInformado","2017-04-18"));
		Trabajos.addAtributo(new Atributo ("EsDependiente","1"));
		Trabajos.addAtributo(new Atributo ("CargoTrabajo","Gerente Proyecto"));
		Trabajos.addAtributo(new Atributo ("Salario","1000000"));
		Trabajos.addAtributo(new Atributo ("ComprobanteIngreso","1"));
		
		Tag OperacionesActivas= new Tag("OperacionesActivas");
		
		OperacionesActivas.addAtributo(new Atributo ("IdTipoOperacion","1"));
		OperacionesActivas.addAtributo(new Atributo ("FechaOperacion","2017-04-18"));
		OperacionesActivas.addAtributo(new Atributo ("NumeroOperacion","1234"));
		OperacionesActivas.addAtributo(new Atributo ("CapitalOriginal","1000"));
		OperacionesActivas.addAtributo(new Atributo ("InteresOriginal","110"));
		OperacionesActivas.addAtributo(new Atributo ("CapitalAdeudadoActual","15"));
		OperacionesActivas.addAtributo(new Atributo ("InteresPendienteDeDevengar","5"));
		OperacionesActivas.addAtributo(new Atributo ("CapitalAtrasado","15"));
		OperacionesActivas.addAtributo(new Atributo ("InteresAtrasado","10"));
		OperacionesActivas.addAtributo(new Atributo ("MoraPendienteDePago","5"));
		OperacionesActivas.addAtributo(new Atributo ("MoraPaga","10"));
		OperacionesActivas.addAtributo(new Atributo ("PlazoTotalEnPeriodos","3"));
		OperacionesActivas.addAtributo(new Atributo ("PlazoRemanenteEnPeriodos","2"));
		OperacionesActivas.addAtributo(new Atributo ("IdPeriodoPrestamo","1"));
		OperacionesActivas.addAtributo(new Atributo ("DiasAtraso","8"));
		OperacionesActivas.addAtributo(new Atributo ("IdMoneda","USD"));
		OperacionesActivas.addAtributo(new Atributo ("IdTipoTitular","1"));
		
		Tag OperacionesCanceladas= new Tag("OperacionesCanceladas");
		
		OperacionesCanceladas.addAtributo(new Atributo ("IdTipoOperacion","1"));
		OperacionesCanceladas.addAtributo(new Atributo ("FechaOperacion","2017-04-18"));
		OperacionesCanceladas.addAtributo(new Atributo ("CapitalOriginal","1800000000000000.32"));
		OperacionesCanceladas.addAtributo(new Atributo ("IdTipoCancelacion","3"));
		OperacionesCanceladas.addAtributo(new Atributo ("DiasAtrasoMaximo","10"));
		OperacionesCanceladas.addAtributo(new Atributo ("MontoMoraGenerada","0"));
		OperacionesCanceladas.addAtributo(new Atributo ("MontoQuitaMora","192000"));
		OperacionesCanceladas.addAtributo(new Atributo ("MontoQuitaInteres","1"));
		OperacionesCanceladas.addAtributo(new Atributo ("MontoQuitaCapital","1"));
		OperacionesCanceladas.addAtributo(new Atributo ("MontoInteresGenerado","1"));
		
		Tag DeclaracionesPatrimoniales= new Tag("DeclaracionesPatrimoniales");
		
		DeclaracionesPatrimoniales.addAtributo(new Atributo ("Propio_Ganancial","P"));
		DeclaracionesPatrimoniales.addAtributo(new Atributo ("Tipo","AV"));
		DeclaracionesPatrimoniales.addAtributo(new Atributo ("Valor_Estimado_USD","900000000.32"));
		DeclaracionesPatrimoniales.addAtributo(new Atributo ("Propio_Ganancial","G"));
		DeclaracionesPatrimoniales.addAtributo(new Atributo ("Tipo","AO"));
		DeclaracionesPatrimoniales.addAtributo(new Atributo ("Valor_Estimado_USD","780000000.32"));
		
		// Hacer Persona hijo de Informe_Personas.
		
		raiz.addTagHijo(Persona);
		Persona.addTagHijo(DatosConyuge);
		Persona.addTagHijo(Estudios);
		Persona.addTagHijo(Documentos);
		Persona.addTagHijo(Direcciones);
		Persona.addTagHijo(Trabajos);
		Persona.addTagHijo(OperacionesActivas);
		Persona.addTagHijo(OperacionesCanceladas);
		Persona.addTagHijo(DeclaracionesPatrimoniales);
		
		// Crear el archivo XML.
		
		JespXML xml= new JespXML(new File ("Informe_Personas.xml"), Encoding.UTF_8);
		
		// Escribir el archivo XML.
		
		try {
			xml.escribirXML(raiz);
		} catch (TransformerConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TransformerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
