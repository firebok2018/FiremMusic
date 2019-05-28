package Services;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;

import Interfaces.Sign_In;
import model.Usuarios;
import utils.Database;

/**
 * Servlet implementation class SignIn
 */
@WebServlet("/SignIn")
public class SignIn extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignIn() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user=request.getParameter("user_name");
		String pwd=request.getParameter("user_pwd");
		
		Database db=Database.getTipo(Database.MYSQL);
		Sign_In login =db.getSignIn();
		
		Usuarios x=null;
		try {
			x=login.signin(user, pwd);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "error");
		}
		if(x==null){
			request.setAttribute("MENSAJE", "Usuario o Contraseña incorrectos.");
			request.getRequestDispatcher("/SignIn.jsp").forward(request, response);
			
		}else{
			HttpSession xs=request.getSession();
			xs.setAttribute("USUARIO", x);
			
			//false implemetar menus
			
			request.getRequestDispatcher("/Home.jsp").forward(request, response);
		}
		
	}

}
