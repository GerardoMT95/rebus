/*
* SPDX-FileCopyrightText: (C) Copyright 2022 Regione Piemonte
* SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.rebus.rebuscrus.integration.dto;

import java.io.Serializable;

public class SirtplaDNaturaGiuridicaDTO extends ParentDTO implements Serializable {

	
	private Long idNaturaGiuridica;

	private String codNaturaGiuridica;

	private String descNaturaGiuridica;
	
	private String descBreveNaturaGiuridica;
	
	private String flgPatrimonio;


	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", idNaturaGiuridica=").append(idNaturaGiuridica);
		sb.append(", codNaturaGiuridica=").append(codNaturaGiuridica);
		sb.append(", descNaturaGiuridica=").append(descNaturaGiuridica);
		sb.append(", descBreveNaturaGiuridica=").append(descBreveNaturaGiuridica);
		sb.append(", flgPatrimonio=").append(flgPatrimonio);
		sb.append("]");
		return sb.toString();
	}



	public Long getIdNaturaGiuridica() {
		return idNaturaGiuridica;
	}



	public void setIdNaturaGiuridica(Long idNaturaGiuridica) {
		this.idNaturaGiuridica = idNaturaGiuridica;
	}



	public String getCodNaturaGiuridica() {
		return codNaturaGiuridica;
	}



	public void setCodNaturaGiuridica(String codNaturaGiuridica) {
		this.codNaturaGiuridica = codNaturaGiuridica;
	}



	public String getDescNaturaGiuridica() {
		return descNaturaGiuridica;
	}



	public void setDescNaturaGiuridica(String descNaturaGiuridica) {
		this.descNaturaGiuridica = descNaturaGiuridica;
	}



	public String getDescBreveNaturaGiuridica() {
		return descBreveNaturaGiuridica;
	}



	public void setDescBreveNaturaGiuridica(String descBreveNaturaGiuridica) {
		this.descBreveNaturaGiuridica = descBreveNaturaGiuridica;
	}



	public String getFlgPatrimonio() {
		return flgPatrimonio;
	}



	public void setFlgPatrimonio(String flgPatrimonio) {
		this.flgPatrimonio = flgPatrimonio;
	}
}