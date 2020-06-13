package dao;

import java.util.List;

import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
//import javax.persistence.Persistence;
import javax.persistence.Query;

import model.Materia;
import util.ConnectionFactory;

public class MateriaDAOImp implements MateriaDAO {

	EntityManager gerenciadorConexao = null;
	EntityTransaction requisicao = null;

	public MateriaDAOImp() {
	}

	@Override
	public void cadastrarMateria(Materia materia) {
		gerenciadorConexao = ConnectionFactory.abrirConexao();
		requisicao = gerenciadorConexao.getTransaction();
		requisicao.begin();
		gerenciadorConexao.persist(materia);
		requisicao.commit();
		ConnectionFactory.fecharConexao();

	}

	@Override
	public Materia buscarMateria(long idMateria) {
		gerenciadorConexao = ConnectionFactory.abrirConexao();
		Materia materia = gerenciadorConexao.find(Materia.class, idMateria);

		return materia;

	}

	@Override
	public void alterarMateria(Materia materia) {
		gerenciadorConexao = ConnectionFactory.abrirConexao();
		requisicao = gerenciadorConexao.getTransaction();
		requisicao.begin();
		gerenciadorConexao.merge(materia);
		requisicao.commit();
		ConnectionFactory.fecharConexao();

	}

	@Override
	public void deletarMateria(Materia materia) {
		gerenciadorConexao = ConnectionFactory.abrirConexao();
		requisicao = gerenciadorConexao.getTransaction();
		requisicao.begin();
		gerenciadorConexao.remove(materia);
		requisicao.commit();
		ConnectionFactory.fecharConexao();

	}

	@Override
	public List<Materia> listarTodosMateria() {
		gerenciadorConexao = ConnectionFactory.abrirConexao();
		Query query = gerenciadorConexao.createQuery("from materias f");
		List<Materia> materias = query.getResultList();
		return materias;

	}

}
