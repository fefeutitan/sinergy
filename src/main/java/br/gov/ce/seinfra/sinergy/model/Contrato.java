package br.gov.ce.seinfra.sinergy.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

import br.gov.ce.seinfra.model.BaseModel;

@Entity
@Table(name = "tb_contrato", schema = "bdsinergy")
public class Contrato  extends BaseModel {
	
	private Date dataContrato;
	
	private Number numeroContrato;	

	private transient List<Uc> faturas = new ArrayList<Uc>();
	
	private enum demandaContratada{
		SIM, NAO;
	}
	
	private enum tipoTarifa {
		BT, OPTANTE, DEMANDA_CONTRATADA;
	}
	
	private enum tipoContrato{
		AT, BT;
	}

	public Date getDataContrato() {
		return dataContrato;
	}

	public void setDataContrato(Date dataContrato) {
		this.dataContrato = dataContrato;
	}

	public Number getNumeroContrato() {
		return numeroContrato;
	}

	public void setNumeroContrato(Number numeroContrato) {
		this.numeroContrato = numeroContrato;
	}

	public List<Uc> getFaturas() {
		return faturas;
	}

	public void setFaturas(List<Uc> faturas) {
		this.faturas = faturas;
	}
	

}
