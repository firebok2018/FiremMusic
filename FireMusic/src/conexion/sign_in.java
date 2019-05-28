package conexion;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import Interfaces.Sign_In;
import model.Usuarios;
import utils.Conexion;

public class sign_in implements Sign_In{

	@Override
	public Usuarios signin(String name, String pwd) throws SQLException {
		// TODO Auto-generated method stub
		
		Connection con=null;
		CallableStatement sp=null;
		ResultSet rs=null;
		Usuarios x=null;
		
		try {
			con=new Conexion().getConexion();
			String calls="{ call sign_in (?,?) }";
			sp=con.prepareCall(calls);
			sp.setString(1, name);
			sp.setString(2, pwd);
			rs=sp.executeQuery();
			
			while (rs.next()) {
				x=new Usuarios();
			
				System.out.println("sd" + x.setNick(rs.getString("nick")));
				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			try {
				if(rs!= null) rs.close();
				if(sp!= null) sp.close();
				if(sp!= null) sp.close();
			} catch (Exception e2) {
			}
		}
		return x;
	}


}
