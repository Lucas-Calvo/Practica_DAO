package es.iestetuan.lcs.dao;

import java.util.List;

import es.iestetuan.lcs.dao.vo.Usuario;

public interface iUsuario {
	public Usuario getUsuario(int id);
	public List<Usuario> getListaUsuarios();
	public void borrarUsuario(int id);
}
