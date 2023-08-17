package br.edu.ifpr.tsi.sisacad.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.omnifaces.util.Messages;


import br.edu.ifpr.tsi.sisacad.dao.AlunoDAO;
import br.edu.ifpr.tsi.sisacad.domain.Aluno;

@ManagedBean
@ViewScoped
public class AlunoBean {

	private Aluno aluno;

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	
	//instancia um novo objeto do tipo Curso
	public void novo() {
		
		aluno = new Aluno();
	}
	
	public void salvar() {
		
		AlunoDAO alunoDAO = new AlunoDAO();
		
		try {
		  alunoDAO.salvar(aluno);
		  aluno = new Aluno();
		  Messages.addGlobalInfo("Aluno salvo com sucesso.");
		} catch (Exception e) {
	      
		}
	
		
	}
}
