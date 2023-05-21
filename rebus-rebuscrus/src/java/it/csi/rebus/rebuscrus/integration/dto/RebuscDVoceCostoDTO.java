/*
* SPDX-FileCopyrightText: (C) Copyright 2022 Regione Piemonte
* SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.rebus.rebuscrus.integration.dto;

import java.io.Serializable;
import java.util.Date;

public class RebuscDVoceCostoDTO extends ParentDTO implements Serializable {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column rebusc_d_voce_costo.id_voce_costo
	 * @mbg.generated  Fri Nov 19 15:37:42 CET 2021
	 */
	private Long idVoceCosto;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column rebusc_d_voce_costo.desc_voce_costo
	 * @mbg.generated  Fri Nov 19 15:37:42 CET 2021
	 */
	private String descVoceCosto;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column rebusc_d_voce_costo.data_inizio_validita
	 * @mbg.generated  Fri Nov 19 15:37:42 CET 2021
	 */
	private Date dataInizioValidita;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column rebusc_d_voce_costo.data_fine_validita
	 * @mbg.generated  Fri Nov 19 15:37:42 CET 2021
	 */
	private Date dataFineValidita;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table rebusc_d_voce_costo
	 * @mbg.generated  Fri Nov 19 15:37:42 CET 2021
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column rebusc_d_voce_costo.id_voce_costo
	 * @return  the value of rebusc_d_voce_costo.id_voce_costo
	 * @mbg.generated  Fri Nov 19 15:37:42 CET 2021
	 */
	public Long getIdVoceCosto() {
		return idVoceCosto;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column rebusc_d_voce_costo.id_voce_costo
	 * @param idVoceCosto  the value for rebusc_d_voce_costo.id_voce_costo
	 * @mbg.generated  Fri Nov 19 15:37:42 CET 2021
	 */
	public void setIdVoceCosto(Long idVoceCosto) {
		this.idVoceCosto = idVoceCosto;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column rebusc_d_voce_costo.desc_voce_costo
	 * @return  the value of rebusc_d_voce_costo.desc_voce_costo
	 * @mbg.generated  Fri Nov 19 15:37:42 CET 2021
	 */
	public String getDescVoceCosto() {
		return descVoceCosto;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column rebusc_d_voce_costo.desc_voce_costo
	 * @param descVoceCosto  the value for rebusc_d_voce_costo.desc_voce_costo
	 * @mbg.generated  Fri Nov 19 15:37:42 CET 2021
	 */
	public void setDescVoceCosto(String descVoceCosto) {
		this.descVoceCosto = descVoceCosto == null ? null : descVoceCosto.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column rebusc_d_voce_costo.data_inizio_validita
	 * @return  the value of rebusc_d_voce_costo.data_inizio_validita
	 * @mbg.generated  Fri Nov 19 15:37:42 CET 2021
	 */
	public Date getDataInizioValidita() {
		return dataInizioValidita;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column rebusc_d_voce_costo.data_inizio_validita
	 * @param dataInizioValidita  the value for rebusc_d_voce_costo.data_inizio_validita
	 * @mbg.generated  Fri Nov 19 15:37:42 CET 2021
	 */
	public void setDataInizioValidita(Date dataInizioValidita) {
		this.dataInizioValidita = dataInizioValidita;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column rebusc_d_voce_costo.data_fine_validita
	 * @return  the value of rebusc_d_voce_costo.data_fine_validita
	 * @mbg.generated  Fri Nov 19 15:37:42 CET 2021
	 */
	public Date getDataFineValidita() {
		return dataFineValidita;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column rebusc_d_voce_costo.data_fine_validita
	 * @param dataFineValidita  the value for rebusc_d_voce_costo.data_fine_validita
	 * @mbg.generated  Fri Nov 19 15:37:42 CET 2021
	 */
	public void setDataFineValidita(Date dataFineValidita) {
		this.dataFineValidita = dataFineValidita;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table rebusc_d_voce_costo
	 * @mbg.generated  Fri Nov 19 15:37:42 CET 2021
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", idVoceCosto=").append(idVoceCosto);
		sb.append(", descVoceCosto=").append(descVoceCosto);
		sb.append(", dataInizioValidita=").append(dataInizioValidita);
		sb.append(", dataFineValidita=").append(dataFineValidita);
		sb.append(", serialVersionUID=").append(serialVersionUID);
		sb.append("]");
		return sb.toString();
	}
}