package util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConnectionFactory {
	private static EntityManagerFactory fabricaGerenciadoraDeConexao = Persistence.createEntityManagerFactory("desafio0302");

	public static EntityManager abrirConexao() {
		return fabricaGerenciadoraDeConexao.createEntityManager();
	}

	public static void fecharConexao() {
		fabricaGerenciadoraDeConexao.close();
	}
}
