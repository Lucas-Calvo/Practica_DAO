package es.iestetuan.lcs.dao.bo;

import java.util.List;

import es.iestetuan.lcs.dao.iUsuario;
import es.iestetuan.lcs.dao.fictexto.UsuarioFicheroDAO;
import es.iestetuan.lcs.dao.vo.Usuario;

public class GestorUsuario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GestorUsuario gu = new GestorUsuario();
		gu.imprimirUsuario();
		// gu.imprimirUsuarios();
	}
	public void imprimirUsuario() {
		iUsuario usuarioDAO = new UsuarioFicheroDAO();
		
		Usuario usuario =usuarioDAO.getUsuario(2);
		
		System.out.println(usuario.getId() + " - " + usuario.getNombre() + " - " + usuario.getCorreo());
		
	}
	
	public void imprimirUsuarios() {
		iUsuario usuarioDAO = new UsuarioFicheroDAO();
		List<Usuario> listaUsuarios =usuarioDAO.getListaUsuarios();
		
		for (Usuario user :listaUsuarios) {
			System.out.println(user.getId() + " - " + user.getNombre() + " - " + user.getCorreo());
		}
	}

}