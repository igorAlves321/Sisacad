package br.edu.ifpr.tsi.sisacad.domain;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;

@SuppressWarnings("serial")
@Entity 
public class Curso extends GenericDomain {

	@Column (nullable = false, length = 30)
	private String descricao;
	
	
	@Column (nullable = true, precision = 5, scale = 2  )
	private BigDecimal cargaHoraria;


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public BigDecimal getCargaHoraria() {
		return cargaHoraria;
	}


	public void setCargaHoraria(BigDecimal cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	
	
}
