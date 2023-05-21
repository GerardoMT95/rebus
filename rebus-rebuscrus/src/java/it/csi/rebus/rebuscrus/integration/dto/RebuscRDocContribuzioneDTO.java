/*
* SPDX-FileCopyrightText: (C) Copyright 2022 Regione Piemonte
* SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.rebus.rebuscrus.integration.dto;

import java.io.Serializable;
import java.util.Date;

public class RebuscRDocContribuzioneDTO extends ParentDTO implements Serializable {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column rebusc_r_doc_contribuzione.id_doc_contribuzione
	 * @mbg.generated  Thu Dec 16 16:26:20 CET 2021
	 */
	private Long idDocContribuzione;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column rebusc_r_doc_contribuzione.id_tipo_documento
	 * @mbg.generated  Thu Dec 16 16:26:20 CET 2021
	 */
	private Long idTipoDocumento;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column rebusc_r_doc_contribuzione.nome_file
	 * @mbg.generated  Thu Dec 16 16:26:20 CET 2021
	 */
	private String nomeFile;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column rebusc_r_doc_contribuzione.data_caricamento
	 * @mbg.generated  Thu Dec 16 16:26:20 CET 2021
	 */
	private Date dataCaricamento;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column rebusc_r_doc_contribuzione.id_utente_aggiornamento
	 * @mbg.generated  Thu Dec 16 16:26:20 CET 2021
	 */
	private Long idUtenteAggiornamento;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column rebusc_r_doc_contribuzione.documento
	 * @mbg.generated  Thu Dec 16 16:26:20 CET 2021
	 */
	private byte[] documento;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table rebusc_r_doc_contribuzione
	 * @mbg.generated  Thu Dec 16 16:26:20 CET 2021
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column rebusc_r_doc_contribuzione.id_doc_contribuzione
	 * @return  the value of rebusc_r_doc_contribuzione.id_doc_contribuzione
	 * @mbg.generated  Thu Dec 16 16:26:20 CET 2021
	 */
	public Long getIdDocContribuzione() {
		return idDocContribuzione;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column rebusc_r_doc_contribuzione.id_doc_contribuzione
	 * @param idDocContribuzione  the value for rebusc_r_doc_contribuzione.id_doc_contribuzione
	 * @mbg.generated  Thu Dec 16 16:26:20 CET 2021
	 */
	public void setIdDocContribuzione(Long idDocContribuzione) {
		this.idDocContribuzione = idDocContribuzione;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column rebusc_r_doc_contribuzione.id_tipo_documento
	 * @return  the value of rebusc_r_doc_contribuzione.id_tipo_documento
	 * @mbg.generated  Thu Dec 16 16:26:20 CET 2021
	 */
	public Long getIdTipoDocumento() {
		return idTipoDocumento;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column rebusc_r_doc_contribuzione.id_tipo_documento
	 * @param idTipoDocumento  the value for rebusc_r_doc_contribuzione.id_tipo_documento
	 * @mbg.generated  Thu Dec 16 16:26:20 CET 2021
	 */
	public void setIdTipoDocumento(Long idTipoDocumento) {
		this.idTipoDocumento = idTipoDocumento;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column rebusc_r_doc_contribuzione.nome_file
	 * @return  the value of rebusc_r_doc_contribuzione.nome_file
	 * @mbg.generated  Thu Dec 16 16:26:20 CET 2021
	 */
	public String getNomeFile() {
		return nomeFile;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column rebusc_r_doc_contribuzione.nome_file
	 * @param nomeFile  the value for rebusc_r_doc_contribuzione.nome_file
	 * @mbg.generated  Thu Dec 16 16:26:20 CET 2021
	 */
	public void setNomeFile(String nomeFile) {
		this.nomeFile = nomeFile == null ? null : nomeFile.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column rebusc_r_doc_contribuzione.data_caricamento
	 * @return  the value of rebusc_r_doc_contribuzione.data_caricamento
	 * @mbg.generated  Thu Dec 16 16:26:20 CET 2021
	 */
	public Date getDataCaricamento() {
		return dataCaricamento;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column rebusc_r_doc_contribuzione.data_caricamento
	 * @param dataCaricamento  the value for rebusc_r_doc_contribuzione.data_caricamento
	 * @mbg.generated  Thu Dec 16 16:26:20 CET 2021
	 */
	public void setDataCaricamento(Date dataCaricamento) {
		this.dataCaricamento = dataCaricamento;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column rebusc_r_doc_contribuzione.id_utente_aggiornamento
	 * @return  the value of rebusc_r_doc_contribuzione.id_utente_aggiornamento
	 * @mbg.generated  Thu Dec 16 16:26:20 CET 2021
	 */
	public Long getIdUtenteAggiornamento() {
		return idUtenteAggiornamento;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column rebusc_r_doc_contribuzione.id_utente_aggiornamento
	 * @param idUtenteAggiornamento  the value for rebusc_r_doc_contribuzione.id_utente_aggiornamento
	 * @mbg.generated  Thu Dec 16 16:26:20 CET 2021
	 */
	public void setIdUtenteAggiornamento(Long idUtenteAggiornamento) {
		this.idUtenteAggiornamento = idUtenteAggiornamento;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column rebusc_r_doc_contribuzione.documento
	 * @return  the value of rebusc_r_doc_contribuzione.documento
	 * @mbg.generated  Thu Dec 16 16:26:20 CET 2021
	 */
	public byte[] getDocumento() {
		return documento;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column rebusc_r_doc_contribuzione.documento
	 * @param documento  the value for rebusc_r_doc_contribuzione.documento
	 * @mbg.generated  Thu Dec 16 16:26:20 CET 2021
	 */
	public void setDocumento(byte[] documento) {
		this.documento = documento;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table rebusc_r_doc_contribuzione
	 * @mbg.generated  Thu Dec 16 16:26:20 CET 2021
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", idDocContribuzione=").append(idDocContribuzione);
		sb.append(", idTipoDocumento=").append(idTipoDocumento);
		sb.append(", nomeFile=").append(nomeFile);
		sb.append(", dataCaricamento=").append(dataCaricamento);
		sb.append(", idUtenteAggiornamento=").append(idUtenteAggiornamento);
		sb.append(", documento=").append(documento);
		sb.append(", serialVersionUID=").append(serialVersionUID);
		sb.append("]");
		return sb.toString();
	}
}