package utils;

import Interfaces.InterfacesUsuarios;
import Interfaces.Sign_In;

import conexion.mySql;

public abstract class Database {

	public static final int MYSQL=1;
	public static final int SQL_SERVER=2;
	public static final int ORACLE=3;
	
	public abstract Sign_In getSignIn();
	public abstract InterfacesUsuarios getUsuarios();
	
	public static Database getTipo(int tipo){
		switch(tipo){
			case MYSQL:
				return new mySql();
			case SQL_SERVER:
				return null;
			case ORACLE:
				return  null;
		}
		return null;
	}
}
