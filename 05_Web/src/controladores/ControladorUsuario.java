package controladores;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.entidades.Usuario;
import modelo.negocio.GestorUsuario;

/**
 * Para la creacionde serlets se usa un concepto llamado inversion de control
 * esto nos dice que nosotros no vamos a gestionar directamente el ciclo de vida de este objeto servlet
 * va a ser el servidor el que lo gestione
 */

/**
 * 
 * la anotacion webservlet le dice al servidor que tiene que gestionar el ciclo de vida de este
 * objeto 
 * La forma de acceder a este servlet va a ser segun el nombre que este dentro de la anotacion
 *
 */
@WebServlet("/ControladorUsuario")
public class ControladorUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nombre = request.getParameter("nombreUsuario");
		String password = request.getParameter("passwordUsuario");
		
		Usuario usuario = new Usuario();
		usuario.setNombre(nombre);
		usuario.setPassword(password);
		
		GestorUsuario gu = new GestorUsuario();
		if (gu.validarUsuario(usuario)) {
			//bien
			request.setAttribute("usuario", usuario);
			request.getRequestDispatcher("principal.jsp").forward(request, response);
		}else {
			//mal
			request.getRequestDispatcher("error.html").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
