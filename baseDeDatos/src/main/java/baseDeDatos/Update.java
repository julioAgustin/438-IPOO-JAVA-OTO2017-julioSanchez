package baseDeDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Update {

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
		PreparedStatement psUpdate=null;

		try{
			// Se levanta el .class del driver
			Class.forName(driver);
			// Se crea la conexión, pasandole los datos
			con = DriverManager.getConnection(url, usuario, password);
			// Creamos la sentencia
			psUpdate=con.prepareStatement("UPDATE personas SET nacionalidad=? WHERE id=? ");
			
			psUpdate.setString(1, "PY");
			psUpdate.setInt	  (2, 7);
		//Cantidad de filas afectadas
		int actualizado=psUpdate.executeUpdate();
		
		if(actualizado > 0){
			System.out.println("Actualizado.");
		}
		
		// recorremos el resultado
		} catch (ClassNotFoundException e) {
				e.printStackTrace();
		} catch (SQLException e) {
				e.printStackTrace();
		}finally{
	
			try {
				if(psUpdate!=null) psUpdate.close();
				if(con!=null) con.close();
			}catch (SQLException e) {
				e.printStackTrace();
			}

		}

}
}