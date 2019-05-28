package Interfaces;

import java.sql.SQLException;
import java.util.List;

import model.Usuarios;

public interface Sign_In {
	public Usuarios signin(String name,String pwd) throws SQLException;
	
}
