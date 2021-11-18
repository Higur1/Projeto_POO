package Entities;

import java.time.LocalDate;

public class Consulta {
	
	private Long id;
	private String descricao;
	private String cpf;
	private String crm;
	private LocalDate dataConsult;
	
	
	public Consulta(String descricao, String cpf, String crm, LocalDate dataHoraConsult) {
		this.descricao = descricao;
		this.cpf = cpf;
		this.crm = crm;
		this.dataConsult = dataHoraConsult;
	}
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getDataHoraConsult() {
		return dataConsult;
	}

	public void setDataHoraConsult(LocalDate dataHoraConsult) {
		this.dataConsult = dataHoraConsult;
	}
	
	public LocalDate getDataHoraCons() {
		return dataConsult;
	}
	public void setDataHoraCons(LocalDate dataHoraCons) {
		this.dataConsult = dataHoraCons;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCrm() {
		return crm;
	}
	public void setCrm(String crm) {
		this.crm = crm;
	}
}
