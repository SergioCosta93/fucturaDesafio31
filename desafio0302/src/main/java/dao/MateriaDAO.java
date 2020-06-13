package dao;

import java.util.List;

import model.Materia;

public interface MateriaDAO {
	public void cadastrarMateria(Materia materia);

	public Materia buscarMateria(long idMateria);

	public void alterarMateria(Materia materia);

	public void deletarMateria(Materia materia);

	public List<Materia> listarTodosMateria();
}
