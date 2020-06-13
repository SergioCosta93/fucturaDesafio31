package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import model.Usuario;
import util.ConnectionFactory;

public class UsuarioDAOImp implements UsuarioDAO {
	EntityManager gerenciadorConexao = null;
	EntityTransaction requisicao = null;

	@Override
	public void cadastrarUsuario(Usuario usuario) {
		gerenciadorConexao = ConnectionFactory.abrirConexao();
		requisicao = gerenciadorConexao.getTransaction();
		requisicao.begin();
		gerenciadorConexao.persist(usuario);
		requisicao.commit();
		ConnectionFactory.fecharConexao();

	}

	@Override
	public Usuario buscarUsuario(String login) {
		gerenciadorConexao = ConnectionFactory.abrirConexao();
		Usuario usuario = gerenciadorConexao.find(Usuario.class, login);
		return usuario;
	}

	@Override
	public void alterarUsuario(Usuario usuario) {
		gerenciadorConexao = ConnectionFactory.abrirConexao();
		requisicao = gerenciadorConexao.getTransaction();
		requisicao.begin();
		gerenciadorConexao.merge(usuario);
		requisicao.commit();
		ConnectionFactory.fecharConexao();

	}

	@Override
	public void deletarUsuario(Usuario usuario) {
		gerenciadorConexao = ConnectionFactory.abrirConexao();
		requisicao = gerenciadorConexao.getTransaction();
		requisicao.begin();
		gerenciadorConexao.remove(usuario);
		requisicao.commit();
		ConnectionFactory.fecharConexao();

	}

	@Override
	public List<Usuario> listarTodosUsuario() {
		gerenciadorConexao = ConnectionFactory.abrirConexao();
		Query query = gerenciadorConexao.createQuery("from usuarios u");
		List<Usuario> listausuarios = query.getResultList();
		return listausuarios;
	}

}
