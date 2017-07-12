package baseDeDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Create {

	public static void main(String[] args) {
		
		// Informacion necesaria
				// Usuario
				String usuario="postgres";
				// Contraseña
				String password="postgres";
				// URL
				String url="jdbc:postgresql://localhost:5432/repuestos";
				// Clase del driver
				String driver="org.postgresql.Driver";
				
				// Clase que representa la conexión
				Connection con=null;
				// Clase que representa una sentencia SQL
				Statement s=null;
				// Clase que representa un resultado 
				// de la ejecución de una sentencia SQL
				ResultSet rs=null;
		
		// Sentencia parametrizable
		PreparedStatement psCreate=null;
		
		try{
			// Se levanta el .class del driver
			Class.forName(driver);
			// Se crea la conexión, pasandole los datos
			con = DriverManager.getConnection(url, usuario, password);
			// Creamos la sentencia
			psCreate=con.prepareStatement(
					"CREATE TABLE personas("
					+"id SERIAL PRIMARY KEY,"
					+"lugar_de_nacimiento VARCHAR(255), fecha_de_nacimiento DATE, " 
					+"nacionalidad VARCHAR(5), tipo_doc VARCHAR(5), nro_doc VARCHAR, " 
					+"direccion_particular VARCHAR(255), telefono VARCHAR, nombre VARCHAR(30)) ");
			
			// Ejecutamos
			psCreate.executeUpdate();
			
			System.out.println("Tabla creada.");
			
			// recorremos el resultado
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			
				try {
					if(psCreate!=null) psCreate.close();
					if(con!=null) con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
	
		}

	}

}
