package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
public Connection getConexion(){
		
		String database="FireMusic";
		String url="jdbc:mysql://localhost:3306/"+database;
		String user="root";
		String pwr= "mysql";
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			try {
				con= DriverManager.getConnection(url,user,pwr);
				System.out.println("Conectado con la base de datos");
			} catch (SQLException e) {
				System.out.println("ERROR DE CONECCIÓN"+e.getErrorCode()+e.getLocalizedMessage()+e.getMessage()+e.getSQLState());
				System.out.println("La conexión a la base de datos falló.");
			}
			return con;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			
			return null;
		}
	}
}
