package conexion;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Interfaces.InterfacesUsuarios;
import utils.Conexion;
import model.Usuarios;

public class Conexion_Usuario implements InterfacesUsuarios{
	Conexion xd= new Conexion();
	Connection con=null;
	CallableStatement sp=null;
	ResultSet rs= null;
	Usuarios x = new Usuarios();
	@Override
	public List<Usuarios> listarUsuarios() {
		ArrayList<Usuarios> listX= new ArrayList<>();
		String calls="{  }";
		try {
			con=xd.getConexion();
			sp=con.prepareCall(calls);
			rs=sp.executeQuery();
			Usuarios userx=null;
			while (rs.next()) {
				
				userx = new Usuarios();
				userx.setID(rs.getInt("IDUsuario"));
				userx.setName(rs.getString("Nombre"));
				userx.setLast_name(rs.getString("Apellidos"));
				userx.setNick(rs.getString("Nick "));
				userx.setEmail(rs.getString("Correo electronico"));
				userx.setFecha_Registro(rs.getString("Fecha Registro"));
				userx.setPassword(rs.getString("Contraseņa"));
				listX.add(userx);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return listX;

	}

	@Override
	public void addUsuarios(Usuarios x) {
		// TODO Auto-generated method stub
		
		
		try{
			con=xd.getConexion();
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
