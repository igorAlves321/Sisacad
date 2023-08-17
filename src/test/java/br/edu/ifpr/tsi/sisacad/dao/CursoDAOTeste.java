package br.edu.ifpr.tsi.sisacad.dao;

import java.math.BigDecimal;

import org.junit.Test;

import br.edu.ifpr.tsi.sisacad.domain.Curso;

public class CursoDAOTeste {
	
	@Test
	public void salvar() {
		
		//instancia de um objeto de classe curso
		Curso curso = new Curso();
		
		curso.setDescricao("Direito");
		curso.setCargaHoraria(new BigDecimal(35));
		
		CursoDAO cursoDAO = new CursoDAO();
		
		cursoDAO.salvar(curso);
		
		
	}
	
	
}
