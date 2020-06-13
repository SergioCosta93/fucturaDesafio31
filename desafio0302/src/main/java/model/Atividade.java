package model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "atividade")
public class Atividade {

	@Id
	@Column(name = "id_atividade", nullable = false)
	@GeneratedValue(generator = "S_atividade")
	@SequenceGenerator(name = "S_atividade", sequenceName = "S_atividade", allocationSize = 1)
	private long idAtividade;

	@Column(name = "nome_anotacao", nullable = false)
	private String nomeAnotacao;

	@Column(name = "anotacao", nullable = false)
	private String anotacao;

	@OneToOne(cascade = CascadeType.ALL)
	@Column(name = "usuario_login", nullable = false)
	private Usuario usuario;

	@OneToOne(cascade = CascadeType.ALL)
	@Column(name = "materia_id_materia", nullable = false)
	private Materia materia;

	public Atividade() {
		super();
	}

	public long getIdAtividade() {
		return idAtividade;
	}

	public void setIdAtividade(long idAtividade) {
		this.idAtividade = idAtividade;
	}

	public String getNomeAnotacao() {
		return nomeAnotacao;
	}

	public void setNomeAnotacao(String nomeAnotacao) {
		this.nomeAnotacao = nomeAnotacao;
	}

	public String getAnotacao() {
		return anotacao;
	}

	public void setAnotacao(String anotacao) {
		this.anotacao = anotacao;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}

}
