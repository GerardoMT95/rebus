/*
* SPDX-FileCopyrightText: (C) Copyright 2022 Regione Piemonte
* SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.rebus.rebuscrus.integration.dto;

import java.io.Serializable;
import java.util.Date;

public class RebuscTDatoFatturaDTO extends ParentDTO implements Serializable {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column rebusc_t_dato_fattura.id_dato_fattura
	 * @mbg.generated  Thu Dec 16 16:26:20 CET 2021
	 */
	private Long idDatoFattura;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column rebusc_t_dato_fattura.id_dato_spesa
	 * @mbg.generated  Thu Dec 16 16:26:20 CET 2021
	 */
	private Long idDatoSpesa;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column rebusc_t_dato_fattura.id_doc_contribuzione
	 * @mbg.generated  Thu Dec 16 16:26:20 CET 2021
	 */
	private Long idDocContribuzione;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column rebusc_t_dato_fattura.numero
	 * @mbg.generated  Thu Dec 16 16:26:20 CET 2021
	 */
	private String numero;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column rebusc_t_dato_fattura.data
	 * @mbg.generated  Thu Dec 16 16:26:20 CET 2021
	 */
	private Date data;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column rebusc_t_dato_fattura.importo
	 * @mbg.generated  Thu Dec 16 16:26:20 CET 2021
	 */
	private Double importo;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column rebusc_t_dato_fattura.nr_quietanza_az_forn
	 * @mbg.generated  Thu Dec 16 16:26:20 CET 2021
	 */
	private String nrQuietanzaAzForn;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column rebusc_t_dato_fattura.data_quietanza_az_forn
	 * @mbg.generated  Thu Dec 16 16:26:20 CET 2021
	 */
	private Date dataQuietanzaAzForn;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column rebusc_t_dato_fattura.id_tipo_doc_quietanza
	 * @mbg.generated  Thu Dec 16 16:26:20 CET 2021
	 */
	private Double idTipoDocQuietanza;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table rebusc_t_dato_fattura
	 * @mbg.generated  Thu Dec 16 16:26:20 CET 2021
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column rebusc_t_dato_fattura.id_dato_fattura
	 * @return  the value of rebusc_t_dato_fattura.id_dato_fattura
	 * @mbg.generated  Thu Dec 16 16:26:20 CET 2021
	 */
	public Long getIdDatoFattura() {
		return idDatoFattura;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column rebusc_t_dato_fattura.id_dato_fattura
	 * @param idDatoFattura  the value for rebusc_t_dato_fattura.id_dato_fattura
	 * @mbg.generated  Thu Dec 16 16:26:20 CET 2021
	 */
	public void setIdDatoFattura(Long idDatoFattura) {
		this.idDatoFattura = idDatoFattura;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column rebusc_t_dato_fattura.id_dato_spesa
	 * @return  the value of rebusc_t_dato_fattura.id_dato_spesa
	 * @mbg.generated  Thu Dec 16 16:26:20 CET 2021
	 */
	public Long getIdDatoSpesa() {
		return idDatoSpesa;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column rebusc_t_dato_fattura.id_dato_spesa
	 * @param idDatoSpesa  the value for rebusc_t_dato_fattura.id_dato_spesa
	 * @mbg.generated  Thu Dec 16 16:26:20 CET 2021
	 */
	public void setIdDatoSpesa(Long idDatoSpesa) {
		this.idDatoSpesa = idDatoSpesa;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column rebusc_t_dato_fattura.id_doc_contribuzione
	 * @return  the value of rebusc_t_dato_fattura.id_doc_contribuzione
	 * @mbg.generated  Thu Dec 16 16:26:20 CET 2021
	 */
	public Long getIdDocContribuzione() {
		return idDocContribuzione;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column rebusc_t_dato_fattura.id_doc_contribuzione
	 * @param idDocContribuzione  the value for rebusc_t_dato_fattura.id_doc_contribuzione
	 * @mbg.generated  Thu Dec 16 16:26:20 CET 2021
	 */
	public void setIdDocContribuzione(Long idDocContribuzione) {
		this.idDocContribuzione = idDocContribuzione;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column rebusc_t_dato_fattura.numero
	 * @return  the value of rebusc_t_dato_fattura.numero
	 * @mbg.generated  Thu Dec 16 16:26:20 CET 2021
	 */
	public String getNumero() {
		return numero;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column rebusc_t_dato_fattura.numero
	 * @param numero  the value for rebusc_t_dato_fattura.numero
	 * @mbg.generated  Thu Dec 16 16:26:20 CET 2021
	 */
	public void setNumero(String numero) {
		this.numero = numero == null ? null : numero.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column rebusc_t_dato_fattura.data
	 * @return  the value of rebusc_t_dato_fattura.data
	 * @mbg.generated  Thu Dec 16 16:26:20 CET 2021
	 */
	public Date getData() {
		return data;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column rebusc_t_dato_fattura.data
	 * @param data  the value for rebusc_t_dato_fattura.data
	 * @mbg.generated  Thu Dec 16 16:26:20 CET 2021
	 */
	public void setData(Date data) {
		this.data = data;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column rebusc_t_dato_fattura.importo
	 * @return  the value of rebusc_t_dato_fattura.importo
	 * @mbg.generated  Thu Dec 16 16:26:20 CET 2021
	 */
	public Double getImporto() {
		return importo;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column rebusc_t_dato_fattura.importo
	 * @param importo  the value for rebusc_t_dato_fattura.importo
	 * @mbg.generated  Thu Dec 16 16:26:20 CET 2021
	 */
	public void setImporto(Double importo) {
		this.importo = importo;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column rebusc_t_dato_fattura.nr_quietanza_az_forn
	 * @return  the value of rebusc_t_dato_fattura.nr_quietanza_az_forn
	 * @mbg.generated  Thu Dec 16 16:26:20 CET 2021
	 */
	public String getNrQuietanzaAzForn() {
		return nrQuietanzaAzForn;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column rebusc_t_dato_fattura.nr_quietanza_az_forn
	 * @param nrQuietanzaAzForn  the value for rebusc_t_dato_fattura.nr_quietanza_az_forn
	 * @mbg.generated  Thu Dec 16 16:26:20 CET 2021
	 */
	public void setNrQuietanzaAzForn(String nrQuietanzaAzForn) {
		this.nrQuietanzaAzForn = nrQuietanzaAzForn == null ? null : nrQuietanzaAzForn.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column rebusc_t_dato_fattura.data_quietanza_az_forn
	 * @return  the value of rebusc_t_dato_fattura.data_quietanza_az_forn
	 * @mbg.generated  Thu Dec 16 16:26:20 CET 2021
	 */
	public Date getDataQuietanzaAzForn() {
		return dataQuietanzaAzForn;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column rebusc_t_dato_fattura.data_quietanza_az_forn
	 * @param dataQuietanzaAzForn  the value for rebusc_t_dato_fattura.data_quietanza_az_forn
	 * @mbg.generated  Thu Dec 16 16:26:20 CET 2021
	 */
	public void setDataQuietanzaAzForn(Date dataQuietanzaAzForn) {
		this.dataQuietanzaAzForn = dataQuietanzaAzForn;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column rebusc_t_dato_fattura.id_tipo_doc_quietanza
	 * @return  the value of rebusc_t_dato_fattura.id_tipo_doc_quietanza
	 * @mbg.generated  Thu Dec 16 16:26:20 CET 2021
	 */
	public Double getIdTipoDocQuietanza() {
		return idTipoDocQuietanza;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column rebusc_t_dato_fattura.id_tipo_doc_quietanza
	 * @param idTipoDocQuietanza  the value for rebusc_t_dato_fattura.id_tipo_doc_quietanza
	 * @mbg.generated  Thu Dec 16 16:26:20 CET 2021
	 */
	public void setIdTipoDocQuietanza(Double idTipoDocQuietanza) {
		this.idTipoDocQuietanza = idTipoDocQuietanza;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table rebusc_t_dato_fattura
	 * @mbg.generated  Thu Dec 16 16:26:20 CET 2021
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", idDatoFattura=").append(idDatoFattura);
		sb.append(", idDatoSpesa=").append(idDatoSpesa);
		sb.append(", idDocContribuzione=").append(idDocContribuzione);
		sb.append(", numero=").append(numero);
		sb.append(", data=").append(data);
		sb.append(", importo=").append(importo);
		sb.append(", nrQuietanzaAzForn=").append(nrQuietanzaAzForn);
		sb.append(", dataQuietanzaAzForn=").append(dataQuietanzaAzForn);
		sb.append(", idTipoDocQuietanza=").append(idTipoDocQuietanza);
		sb.append(", serialVersionUID=").append(serialVersionUID);
		sb.append("]");
		return sb.toString();
	}
}