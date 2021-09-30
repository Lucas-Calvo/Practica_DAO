package es.iestetuan.lcs;

import es.iestetuan.lcs.dao.iUsuario;
import es.iestetuan.lcs.dao.fictexto.UsuarioFicheroDAO;
import es.iestetuan.lcs.dao.vo.Usuario;

public class AplicaciondeUsuarios {

	public static void main(String[] args) {
		
		iUsuario clasellamada = new UsuarioFicheroDAO();
		Usuario user = clasellamada.getUsuario(2);
		System.out.println(user);
	}

}
