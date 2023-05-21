/*
* SPDX-FileCopyrightText: (C) Copyright 2022 Regione Piemonte
* SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.rebus.rebuscrus.integration.dto;

import java.io.Serializable;

public class RebusDImpiantiAudioDTO extends ParentDTO implements Serializable {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column rebus_d_impianti_audio.id_impianti_audio
	 * @mbg.generated  Mon Oct 21 17:24:13 CEST 2019
	 */
	private Long idImpiantiAudio;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column rebus_d_impianti_audio.descrizione
	 * @mbg.generated  Mon Oct 21 17:24:13 CEST 2019
	 */
	private String descrizione;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table rebus_d_impianti_audio
	 * @mbg.generated  Mon Oct 21 17:24:13 CEST 2019
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column rebus_d_impianti_audio.id_impianti_audio
	 * @return  the value of rebus_d_impianti_audio.id_impianti_audio
	 * @mbg.generated  Mon Oct 21 17:24:13 CEST 2019
	 */
	public Long getIdImpiantiAudio() {
		return idImpiantiAudio;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column rebus_d_impianti_audio.id_impianti_audio
	 * @param idImpiantiAudio  the value for rebus_d_impianti_audio.id_impianti_audio
	 * @mbg.generated  Mon Oct 21 17:24:13 CEST 2019
	 */
	public void setIdImpiantiAudio(Long idImpiantiAudio) {
		this.idImpiantiAudio = idImpiantiAudio;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column rebus_d_impianti_audio.descrizione
	 * @return  the value of rebus_d_impianti_audio.descrizione
	 * @mbg.generated  Mon Oct 21 17:24:13 CEST 2019
	 */
	public String getDescrizione() {
		return descrizione;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column rebus_d_impianti_audio.descrizione
	 * @param descrizione  the value for rebus_d_impianti_audio.descrizione
	 * @mbg.generated  Mon Oct 21 17:24:13 CEST 2019
	 */
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione == null ? null : descrizione.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table rebus_d_impianti_audio
	 * @mbg.generated  Mon Oct 21 17:24:13 CEST 2019
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", idImpiantiAudio=").append(idImpiantiAudio);
		sb.append(", descrizione=").append(descrizione);
		sb.append(", serialVersionUID=").append(serialVersionUID);
		sb.append("]");
		return sb.toString();
	}
}