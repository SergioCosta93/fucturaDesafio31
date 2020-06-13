package controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import dao.MateriaDAO;
import dao.MateriaDAOImp;
import model.Materia;

@ManagedBean(name = "HomeBean")
@SessionScoped
public class HomeBean {
	Materia materia = new Materia();
	MateriaDAO materiaDAO;
	List<Materia> listaMateria;
	
	public HomeBean(){
		this.materia=new Materia();
		this.listaMateria=new ArrayList<Materia>();
		this.materiaDAO=new MateriaDAOImp();
	}

	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}


}
