/*
* SPDX-FileCopyrightText: (C) Copyright 2022 Regione Piemonte
* SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.rebus.rebuscrus.integration.dto;

import java.io.Serializable;
import java.util.Date;

public class RebuscDSistemaVideosorveglianzaDTO extends ParentDTO implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rebusc_d_sistema_videosorveglianza.id_sistema_videosorveglianza
     *
     * @mbg.generated Tue Jan 04 08:25:47 CET 2022
     */
    private Double idSistemaVideosorveglianza;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rebusc_d_sistema_videosorveglianza.desc_sistema_videosorveglianza
     *
     * @mbg.generated Tue Jan 04 08:25:47 CET 2022
     */
    private String descSistemaVideosorveglianza;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rebusc_d_sistema_videosorveglianza.data_inizio_validita
     *
     * @mbg.generated Tue Jan 04 08:25:47 CET 2022
     */
    private Date dataInizioValidita;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rebusc_d_sistema_videosorveglianza.data_fine_validita
     *
     * @mbg.generated Tue Jan 04 08:25:47 CET 2022
     */
    private Date dataFineValidita;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table rebusc_d_sistema_videosorveglianza
     *
     * @mbg.generated Tue Jan 04 08:25:47 CET 2022
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rebusc_d_sistema_videosorveglianza.id_sistema_videosorveglianza
     *
     * @return the value of rebusc_d_sistema_videosorveglianza.id_sistema_videosorveglianza
     *
     * @mbg.generated Tue Jan 04 08:25:47 CET 2022
     */
    public Double getIdSistemaVideosorveglianza() {
        return idSistemaVideosorveglianza;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rebusc_d_sistema_videosorveglianza.id_sistema_videosorveglianza
     *
     * @param idSistemaVideosorveglianza the value for rebusc_d_sistema_videosorveglianza.id_sistema_videosorveglianza
     *
     * @mbg.generated Tue Jan 04 08:25:47 CET 2022
     */
    public void setIdSistemaVideosorveglianza(Double idSistemaVideosorveglianza) {
        this.idSistemaVideosorveglianza = idSistemaVideosorveglianza;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rebusc_d_sistema_videosorveglianza.desc_sistema_videosorveglianza
     *
     * @return the value of rebusc_d_sistema_videosorveglianza.desc_sistema_videosorveglianza
     *
     * @mbg.generated Tue Jan 04 08:25:47 CET 2022
     */
    public String getDescSistemaVideosorveglianza() {
        return descSistemaVideosorveglianza;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rebusc_d_sistema_videosorveglianza.desc_sistema_videosorveglianza
     *
     * @param descSistemaVideosorveglianza the value for rebusc_d_sistema_videosorveglianza.desc_sistema_videosorveglianza
     *
     * @mbg.generated Tue Jan 04 08:25:47 CET 2022
     */
    public void setDescSistemaVideosorveglianza(String descSistemaVideosorveglianza) {
        this.descSistemaVideosorveglianza = descSistemaVideosorveglianza == null ? null : descSistemaVideosorveglianza.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rebusc_d_sistema_videosorveglianza.data_inizio_validita
     *
     * @return the value of rebusc_d_sistema_videosorveglianza.data_inizio_validita
     *
     * @mbg.generated Tue Jan 04 08:25:47 CET 2022
     */
    public Date getDataInizioValidita() {
        return dataInizioValidita;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rebusc_d_sistema_videosorveglianza.data_inizio_validita
     *
     * @param dataInizioValidita the value for rebusc_d_sistema_videosorveglianza.data_inizio_validita
     *
     * @mbg.generated Tue Jan 04 08:25:47 CET 2022
     */
    public void setDataInizioValidita(Date dataInizioValidita) {
        this.dataInizioValidita = dataInizioValidita;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rebusc_d_sistema_videosorveglianza.data_fine_validita
     *
     * @return the value of rebusc_d_sistema_videosorveglianza.data_fine_validita
     *
     * @mbg.generated Tue Jan 04 08:25:47 CET 2022
     */
    public Date getDataFineValidita() {
        return dataFineValidita;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rebusc_d_sistema_videosorveglianza.data_fine_validita
     *
     * @param dataFineValidita the value for rebusc_d_sistema_videosorveglianza.data_fine_validita
     *
     * @mbg.generated Tue Jan 04 08:25:47 CET 2022
     */
    public void setDataFineValidita(Date dataFineValidita) {
        this.dataFineValidita = dataFineValidita;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rebusc_d_sistema_videosorveglianza
     *
     * @mbg.generated Tue Jan 04 08:25:47 CET 2022
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", idSistemaVideosorveglianza=").append(idSistemaVideosorveglianza);
        sb.append(", descSistemaVideosorveglianza=").append(descSistemaVideosorveglianza);
        sb.append(", dataInizioValidita=").append(dataInizioValidita);
        sb.append(", dataFineValidita=").append(dataFineValidita);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}