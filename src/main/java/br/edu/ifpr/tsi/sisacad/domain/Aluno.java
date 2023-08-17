package br.edu.ifpr.tsi.sisacad.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

@SuppressWarnings("serial")
@Entity
public class Aluno extends GenericDomain {

	@Column(nullable = false, length = 30)
	private String nome;
	
	@Column (nullable = false, length = 16)
	private String cpf;
	
	@Column (nullable = false, length = 50)
	private String email;
	
	@Column (nullable = false, length = 20)
	private String ra;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRa() {
		return ra;
	}

	public void setRa(String ra) {
		this.ra = ra;
	}
	
	
}
