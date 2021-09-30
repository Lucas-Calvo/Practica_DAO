package es.iestetuan.lcs.dao.fictexto;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.List;

import es.iestetuan.lcs.dao.iUsuario;
import es.iestetuan.lcs.dao.vo.Usuario;

public class UsuarioFicheroDAO implements iUsuario {

	@Override
	public Usuario getUsuario(int id) {
		File fichero=new File("usuarios.txt");
		FileReader fr = null;
		BufferedReader bf=null;
		String linea=null;
		Usuario usuarioejemplo=new Usuario();
		boolean PRIME=false;
		try {
			fr = new FileReader(fichero);
			bf = new BufferedReader(fr);
			bf.readLine();
			while ((linea=bf.readLine())!= null) {
				String[] partes = linea.split(",");
				
				int ident = Integer.parseInt(partes[0]);
				if(id==ident) {
					usuarioejemplo.setId(ident);
					usuarioejemplo.setNombre(partes[1]);
					usuarioejemplo.setCorreo(partes[2]);
					break;
				}
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return usuarioejemplo;
	}

	@Override
	public List<Usuario> getListaUsuarios() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void borrarUsuario(int id) {
		// TODO Auto-generated method stub
		
	}

}
