package modelo.negocio;

import java.util.ArrayList;

import modelo.entidades.Usuario;
import modelo.persistencia.DaoUsuario;

//esta capa se encarga de llevar la logica de negocio de nuestra aplicacion
//se encarga de toda la funcionalidad de nuestra aplicacion
public class GestorUsuario {
	
	/**
	 * metodo que valida si el usuario esta registrado en el sistema
	 * @param user
	 * @return true si esta registrado, false en otro caso
	 */
	
	public boolean validarUsuario(Usuario user) {
		//esta capa se comunica con la BBDD 
		
		//validar que el usuario o password no este vacio
		if (user.getNombre().equals("") || user.getPassword().equals("")) {
			return false;
		}
		
		DaoUsuario daoUsuario = new DaoUsuario();
		ArrayList<Usuario> ListaUsuario = daoUsuario.getListaUsuarios();
		
		//comprobamos si coincide
		for (Usuario usuarioAux : ListaUsuario) {
			if (usuarioAux.getNombre().equals(user.getNombre()) && 
					usuarioAux.getPassword().equals(user.getPassword()) ) {
				return true;
			}
		}
		
		return false;
	}

}
