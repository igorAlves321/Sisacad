package br.edu.ifpr.tsi.sisacad.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.omnifaces.util.Messages;

import br.edu.ifpr.tsi.sisacad.dao.CursoDAO;
import br.edu.ifpr.tsi.sisacad.domain.Curso;

@ManagedBean
@ViewScoped
public class CursoBean {

	private Curso curso;

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	// instancia um novo objeto do tipo Curso
	public void novo() {

		curso = new Curso();
	}

	public void salvar() {

		CursoDAO cursoDAO = new CursoDAO();

		try {
			cursoDAO.salvar(curso);
			curso = new Curso();
			Messages.addGlobalInfo("Curso salvo com sucesso.");
		} catch (RuntimeException e) {
Messages.addGlobalError("não foi possível salvar");
e.printStackTrace();
		}

	}
}
