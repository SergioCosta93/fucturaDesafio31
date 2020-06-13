package controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import model.Usuario;

@ManagedBean(name = "CadastroLoginBean")
@SessionScoped
public class CadastroLoginBean {
	// ATRIBUTOS
	Usuario usuario=new Usuario();
	
	public void cadastrar() {
		
	}

}
