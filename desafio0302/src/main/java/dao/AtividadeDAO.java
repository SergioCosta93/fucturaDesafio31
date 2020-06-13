package dao;

import java.util.List;

import model.Atividade;

public interface AtividadeDAO {

	public void cadastrarAtividade(Atividade atividade);

	public Atividade buscarAtividade(long idAtividade);

	public void alterarAtividade(Atividade atividade);

	public void deletarAtividade(Atividade ativdade);

	public List<Atividade> listarTodosAtividade();

}
