package conexion;

import Interfaces.InterfacesUsuarios;
import Interfaces.Sign_In;
import utils.Database;


public class mySql extends Database {

	@Override
	public Sign_In getSignIn() {
		// TODO Auto-generated method stub
		return new sign_in();
	}

	@Override
	public InterfacesUsuarios getUsuarios() {
		// TODO Auto-generated method stub
		return new Conexion_Usuario();
	}



	

}
