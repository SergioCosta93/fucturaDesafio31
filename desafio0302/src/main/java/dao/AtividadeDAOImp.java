package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import model.Atividade;
import util.ConnectionFactory;

public class AtividadeDAOImp implements AtividadeDAO {

	EntityManager gerenciadorConexao = null;
	EntityTransaction requisicao = null;

	@Override
	public void cadastrarAtividade(Atividade atividade) {
		gerenciadorConexao = ConnectionFactory.abrirConexao();
		requisicao = gerenciadorConexao.getTransaction();
		requisicao.begin();
		gerenciadorConexao.persist(atividade);
		requisicao.commit();
		ConnectionFactory.fecharConexao();

	}

	@Override
	public Atividade buscarAtividade(long idAtividade) {
		gerenciadorConexao = ConnectionFactory.abrirConexao();
		Atividade atividade = gerenciadorConexao.find(Atividade.class, idAtividade);
		return atividade;
	}

	@Override
	public void alterarAtividade(Atividade atividade) {
		gerenciadorConexao = ConnectionFactory.abrirConexao();
		requisicao = gerenciadorConexao.getTransaction();
		requisicao.begin();
		gerenciadorConexao.merge(atividade);
		requisicao.commit();
		ConnectionFactory.fecharConexao();

	}

	@Override
	public void deletarAtividade(Atividade ativdade) {
		gerenciadorConexao = ConnectionFactory.abrirConexao();
		requisicao = gerenciadorConexao.getTransaction();
		requisicao.begin();
		gerenciadorConexao.remove(ativdade);
		requisicao.commit();
		ConnectionFactory.fecharConexao();

	}

	@Override
	public List<Atividade> listarTodosAtividade() {
		gerenciadorConexao = ConnectionFactory.abrirConexao();
		Query query = gerenciadorConexao.createQuery("from atividade f");
		List<Atividade> atividades = query.getResultList();
		return atividades;
	}

}
