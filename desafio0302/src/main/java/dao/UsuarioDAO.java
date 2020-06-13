package dao;

import java.util.List;

import model.Usuario;

public interface UsuarioDAO {
	public void cadastrarUsuario(Usuario usuario);

	public Usuario buscarUsuario(String login);

	public void alterarUsuario(Usuario usuario);

	public void deletarUsuario(Usuario usuario);

	public List<Usuario> listarTodosUsuario();
}
