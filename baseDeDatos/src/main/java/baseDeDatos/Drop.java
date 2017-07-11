package baseDeDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Drop {

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
		PreparedStatement psInsert=null;
		
		try{
			// Se levanta el .class del driver
			Class.forName(driver);
			// Se crea la conexión, pasandole los datos
			con = DriverManager.getConnection(url, usuario, password);
			// Creamos la sentencia
			psInsert=con.prepareStatement(
					"INSERT INTO personas(" +
					"lugar_de_nacimiento, fecha_de_nacimiento, " + 
					"nacionalidad, tipo_doc, nro_doc, " + 
					"direccion_particular, telefono, nombre) " +
					"VALUES (?, ?, ?, ?, ?, ?, ?, ?)"
				);
				
				psInsert.setDate(2, new java.sql.Date(new java.util.Date().getTime()));
				psInsert.setString(3, "PY");
				psInsert.setString(4, "CI");
				psInsert.setString(5, "99999999");
				psInsert.setString(6, "Palma");
				psInsert.setString(7, "999999");
				psInsert.setString(8, "Diego Bonnin");
				psInsert.setString(1, "Asunción");
			
			// Ejecutamos
			psInsert.executeUpdate();
			// recorremos el resultado
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			
				try {
					if(psInsert!=null) psInsert.close();
					if(con!=null) con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
	
		}

	}

}
