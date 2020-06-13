package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "materias")
public class Materia {
	@Id
	@Column(name = "id_materia", nullable = false)
	@GeneratedValue(generator = "S_materias")
	@SequenceGenerator(name = "S_materias", sequenceName = "S_materias", allocationSize = 1)
	private long idMateria;

	@Column(name = "nome_materia", nullable = false)
	private String nomeMateria;

	public Materia() {
		super();
	}

	public long getIdMateria() {
		return idMateria;
	}

	public void setIdMateria(long idMateria) {
		this.idMateria = idMateria;
	}

	public String getNomeMateria() {
		return nomeMateria;
	}

	public void setNomeMateria(String nomeMateria) {
		this.nomeMateria = nomeMateria;
	}

}
