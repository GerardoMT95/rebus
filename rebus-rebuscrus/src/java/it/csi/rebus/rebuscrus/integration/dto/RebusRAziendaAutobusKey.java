/*
* SPDX-FileCopyrightText: (C) Copyright 2022 Regione Piemonte
* SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.rebus.rebuscrus.integration.dto;

import java.io.Serializable;
import java.util.Date;

public class RebusRAziendaAutobusKey extends ParentDTO implements Serializable {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column rebus_r_azienda_autobus.primo_telaio
	 * @mbg.generated  Mon Oct 21 17:24:13 CEST 2019
	 */
	private String primoTelaio;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column rebus_r_azienda_autobus.fk_azienda
	 * @mbg.generated  Mon Oct 21 17:24:13 CEST 2019
	 */
	private Long fkAzienda;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column rebus_r_azienda_autobus.data_aggiornamento
	 * @mbg.generated  Mon Oct 21 17:24:13 CEST 2019
	 */
	private Date dataAggiornamento;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table rebus_r_azienda_autobus
	 * @mbg.generated  Mon Oct 21 17:24:13 CEST 2019
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column rebus_r_azienda_autobus.primo_telaio
	 * @return  the value of rebus_r_azienda_autobus.primo_telaio
	 * @mbg.generated  Mon Oct 21 17:24:13 CEST 2019
	 */
	public String getPrimoTelaio() {
		return primoTelaio;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column rebus_r_azienda_autobus.primo_telaio
	 * @param primoTelaio  the value for rebus_r_azienda_autobus.primo_telaio
	 * @mbg.generated  Mon Oct 21 17:24:13 CEST 2019
	 */
	public void setPrimoTelaio(String primoTelaio) {
		this.primoTelaio = primoTelaio == null ? null : primoTelaio.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column rebus_r_azienda_autobus.fk_azienda
	 * @return  the value of rebus_r_azienda_autobus.fk_azienda
	 * @mbg.generated  Mon Oct 21 17:24:13 CEST 2019
	 */
	public Long getFkAzienda() {
		return fkAzienda;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column rebus_r_azienda_autobus.fk_azienda
	 * @param fkAzienda  the value for rebus_r_azienda_autobus.fk_azienda
	 * @mbg.generated  Mon Oct 21 17:24:13 CEST 2019
	 */
	public void setFkAzienda(Long fkAzienda) {
		this.fkAzienda = fkAzienda;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column rebus_r_azienda_autobus.data_aggiornamento
	 * @return  the value of rebus_r_azienda_autobus.data_aggiornamento
	 * @mbg.generated  Mon Oct 21 17:24:13 CEST 2019
	 */
	public Date getDataAggiornamento() {
		return dataAggiornamento;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column rebus_r_azienda_autobus.data_aggiornamento
	 * @param dataAggiornamento  the value for rebus_r_azienda_autobus.data_aggiornamento
	 * @mbg.generated  Mon Oct 21 17:24:13 CEST 2019
	 */
	public void setDataAggiornamento(Date dataAggiornamento) {
		this.dataAggiornamento = dataAggiornamento;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table rebus_r_azienda_autobus
	 * @mbg.generated  Mon Oct 21 17:24:13 CEST 2019
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", primoTelaio=").append(primoTelaio);
		sb.append(", fkAzienda=").append(fkAzienda);
		sb.append(", dataAggiornamento=").append(dataAggiornamento);
		sb.append(", serialVersionUID=").append(serialVersionUID);
		sb.append("]");
		return sb.toString();
	}
}