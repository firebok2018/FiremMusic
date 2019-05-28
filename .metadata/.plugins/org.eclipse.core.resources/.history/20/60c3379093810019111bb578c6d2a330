package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private String database="FireMusic";
	private String url="jdbc:mysql://localhost:3306/"+database;
	private String user="root";
	private String pwd="mysql";

	public Connection getConexion(){
		
		Connection con=null;
		try {
			con=DriverManager.getConnection(url,user,pwd);
			System.out.println("Conexion exitosa  con la base de datos");
		} catch (SQLException e) {
			System.out.println(e.getMessage()+e.getErrorCode());
		}
		return con;
	}
}
