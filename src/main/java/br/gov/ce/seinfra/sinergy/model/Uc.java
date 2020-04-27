package br.gov.ce.seinfra.sinergy.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import br.gov.ce.seinfra.model.BaseModel;

@Entity
@Table(name = "tb_uc", schema = "bdsinergy")
public class Uc  extends BaseModel {
	
	private Number numeroUc;
	
	private String nomeUc;
	
	private String EnderecoUc;

	public Number getNumeroUc() {
		return numeroUc;
	}

	public void setNumeroUc(Number numeroUc) {
		this.numeroUc = numeroUc;
	}

	public String getNomeUc() {
		return nomeUc;
	}

	public void setNomeUc(String nomeUc) {
		this.nomeUc = nomeUc;
	}

	public String getEnderecoUc() {
		return EnderecoUc;
	}

	public void setEnderecoUc(String enderecoUc) {
		EnderecoUc = enderecoUc;
	}
	

}
