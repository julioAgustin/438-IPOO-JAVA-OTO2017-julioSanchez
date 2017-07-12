package baseDeDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Select {

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
				
				try{
					// Se levanta el .class del driver
					Class.forName(driver);
					// Se crea la conexión, pasandole los datos
					con = DriverManager.getConnection(url, usuario, password);
					// Creamos la sentencia
					s=con.createStatement();
					// Ejecutamos
					rs=s.executeQuery("SELECT * FROM personas");
					// recorremos el resultado
					while(rs.next()){
						System.out.print(rs.getString(1) + " ");
						System.out.print(rs.getString(2) + " ");
						System.out.print(rs.getString(3) + " ");
						System.out.print(rs.getString(4) + " ");
						System.out.print(rs.getString(5) + " ");
						System.out.print(rs.getString(6) + " ");
						System.out.print(rs.getString(7) + " ");
						System.out.print(rs.getString(8) + " ");
						System.out.print(rs.getString(9) + " ");
						System.out.println();
					}
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				} catch (SQLException e) {
					e.printStackTrace();
				}finally{
					
						try {
							if(rs!=null)rs.close();
							if(s!=null) s.close();
							if(con!=null) con.close();
						} catch (SQLException e) {
							e.printStackTrace();
						}
			
				}
				

	}

}
