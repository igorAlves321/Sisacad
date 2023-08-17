package br.edu.ifpr.tsi.sisacad.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.omnifaces.util.Messages;


import br.edu.ifpr.tsi.sisacad.dao.DepartamentoDAO;
import br.edu.ifpr.tsi.sisacad.domain.Departamento;

@ManagedBean
@ViewScoped
public class DepartamentoBean {

	private Departamento departamento;

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	
	//instancia um novo objeto do tipo Curso
	public void novo() {
		
		departamento = new Departamento();
	}
	
	public void salvar() {
		
		DepartamentoDAO DepartamentoDAO = new DepartamentoDAO();
		
		try {
		  departamentoDAO.salvar(departamento);
		  departamento = new Departamento();
		  Messages.addGlobalInfo("Curso salvo com sucesso.");
		} catch (Exception e) {
	      
		}
	
		
	}
}
