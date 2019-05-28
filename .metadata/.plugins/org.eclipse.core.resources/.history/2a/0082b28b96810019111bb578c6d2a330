package Services;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import Interfaces.InterfacesUsuarios;
import jdk.nashorn.internal.runtime.ListAdapter;
import model.Usuarios;
import utils.Database;

/**
 * Servlet implementation class Usuarios_X
 */
@WebServlet("/usuario")
public class Usuarios_X extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Usuarios_X() {
        super();
        // TODO Auto-generated constructor stub
    }
    protected void services(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String met =request.getParameter("metodo");
		
		if (met.equals("lista")) {
			Lista(request,response);
		}else if(met.equals("agregar")){
			Add(request, response);
		}else if(met.equals("actulizar")){
			Update(request,response);
		}
		else if(met.equals("eliminar")){
			Delete(request,response);
		}
	}
	
	
	
	private void Lista(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}
	protected void Add(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id=request.getParameter("id_x");
		String nombre=request.getParameter("name_x");
		String apellidos=request.getParameter("lastName_x");
		String nick=request.getParameter("nick_x");
		String email=request.getParameter("email_x");
		String fec_reg=request.getParameter("fec_reg");
		String contraseña=request.getParameter("pwd_x");
		
		Usuarios x= new Usuarios();
		x.setID(Integer.parseInt(id));
		x.setName(nombre);
		x.setLast_name(apellidos);
		x.setNick(nick);
		x.setEmail(email);
		x.setFecha_Registro(fec_reg);
		x.setPassword(contraseña);
		
		Database db=Database.getTipo(Database.MYSQL);
		InterfacesUsuarios userx= db.getUsuarios();
		userx.addUsuarios(x);
		
		Add(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void Update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	/**
	 * @see HttpServlet#doDelete(HttpServletRequest, HttpServletResponse)
	 */
	protected void Delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
