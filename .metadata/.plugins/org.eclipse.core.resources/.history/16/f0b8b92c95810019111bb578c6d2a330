package conexion;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import Interfaces.InterfacesUsuarios;
import utils.Conexion;
import model.Usuarios;

public class Conexion_Usuario implements InterfacesUsuarios{

	@Override
	public List<Usuarios> listarUsuarios() {
		return null;

	}

	@Override
	public void addUsuarios(Usuarios x) {
		// TODO Auto-generated method stub
		
		Connection con=null;
		CallableStatement sp=null;
		try{
			con=new Conexion().getConexion();
			String calls="{ call add_user (?,?,?,?,?,?,?) }";
			sp=con.prepareCall(calls);
			sp.setInt(1, x.getID());
			sp.setString(2, x.getName());
			sp.setString(3, x.getLast_name());
			sp.setString(4, x.getNick());
			sp.setString(5, x.getEmail());
			sp.setString(6, x.getFecha_Registro());
			sp.setString(7, x.getPassword());
			sp.execute();
			con.commit();
			
			
		}catch(SQLException e){
			try {
				con.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				System.out.println(e1.getMessage() +
				e1.getErrorCode()+
				e1.getSQLState());
			}
			System.out.println(e.getMessage() +
					e.getErrorCode()+
					e.getSQLState());
		}finally {
			try {
				con.close();
				sp.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage() +
						e.getErrorCode()+
						e.getSQLState());
			}
		}
	}

	@Override
	public void updateUsuarios(Usuarios y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUsuarios(Usuarios z) {
		// TODO Auto-generated method stub
		
	}
	
}
