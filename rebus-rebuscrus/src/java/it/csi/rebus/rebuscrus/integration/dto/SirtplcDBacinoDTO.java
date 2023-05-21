/*
* SPDX-FileCopyrightText: (C) Copyright 2022 Regione Piemonte
* SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.rebus.rebuscrus.integration.dto;

import java.io.Serializable;
import java.util.Date;

public class SirtplcDBacinoDTO extends ParentDTO implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sirtplc_d_bacino.id_bacino
     *
     * @mbg.generated Thu Mar 12 11:18:04 CET 2020
     */
    private Long idBacino;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sirtplc_d_bacino.denom_bacino
     *
     * @mbg.generated Thu Mar 12 11:18:04 CET 2020
     */
    private String denomBacino;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sirtplc_d_bacino.desc_bacino
     *
     * @mbg.generated Thu Mar 12 11:18:04 CET 2020
     */
    private String descBacino;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sirtplc_d_bacino.data_inizio_validita
     *
     * @mbg.generated Thu Mar 12 11:18:04 CET 2020
     */
    private Date dataInizioValidita;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sirtplc_d_bacino.data_fine_validita
     *
     * @mbg.generated Thu Mar 12 11:18:04 CET 2020
     */
    private Date dataFineValidita;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sirtplc_d_bacino
     *
     * @mbg.generated Thu Mar 12 11:18:04 CET 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sirtplc_d_bacino.id_bacino
     *
     * @return the value of sirtplc_d_bacino.id_bacino
     *
     * @mbg.generated Thu Mar 12 11:18:04 CET 2020
     */
    public Long getIdBacino() {
        return idBacino;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sirtplc_d_bacino.id_bacino
     *
     * @param idBacino the value for sirtplc_d_bacino.id_bacino
     *
     * @mbg.generated Thu Mar 12 11:18:04 CET 2020
     */
    public void setIdBacino(Long idBacino) {
        this.idBacino = idBacino;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sirtplc_d_bacino.denom_bacino
     *
     * @return the value of sirtplc_d_bacino.denom_bacino
     *
     * @mbg.generated Thu Mar 12 11:18:04 CET 2020
     */
    public String getDenomBacino() {
        return denomBacino;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sirtplc_d_bacino.denom_bacino
     *
     * @param denomBacino the value for sirtplc_d_bacino.denom_bacino
     *
     * @mbg.generated Thu Mar 12 11:18:04 CET 2020
     */
    public void setDenomBacino(String denomBacino) {
        this.denomBacino = denomBacino == null ? null : denomBacino.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sirtplc_d_bacino.desc_bacino
     *
     * @return the value of sirtplc_d_bacino.desc_bacino
     *
     * @mbg.generated Thu Mar 12 11:18:04 CET 2020
     */
    public String getDescBacino() {
        return descBacino;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sirtplc_d_bacino.desc_bacino
     *
     * @param descBacino the value for sirtplc_d_bacino.desc_bacino
     *
     * @mbg.generated Thu Mar 12 11:18:04 CET 2020
     */
    public void setDescBacino(String descBacino) {
        this.descBacino = descBacino == null ? null : descBacino.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sirtplc_d_bacino.data_inizio_validita
     *
     * @return the value of sirtplc_d_bacino.data_inizio_validita
     *
     * @mbg.generated Thu Mar 12 11:18:04 CET 2020
     */
    public Date getDataInizioValidita() {
        return dataInizioValidita;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sirtplc_d_bacino.data_inizio_validita
     *
     * @param dataInizioValidita the value for sirtplc_d_bacino.data_inizio_validita
     *
     * @mbg.generated Thu Mar 12 11:18:04 CET 2020
     */
    public void setDataInizioValidita(Date dataInizioValidita) {
        this.dataInizioValidita = dataInizioValidita;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sirtplc_d_bacino.data_fine_validita
     *
     * @return the value of sirtplc_d_bacino.data_fine_validita
     *
     * @mbg.generated Thu Mar 12 11:18:04 CET 2020
     */
    public Date getDataFineValidita() {
        return dataFineValidita;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sirtplc_d_bacino.data_fine_validita
     *
     * @param dataFineValidita the value for sirtplc_d_bacino.data_fine_validita
     *
     * @mbg.generated Thu Mar 12 11:18:04 CET 2020
     */
    public void setDataFineValidita(Date dataFineValidita) {
        this.dataFineValidita = dataFineValidita;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sirtplc_d_bacino
     *
     * @mbg.generated Thu Mar 12 11:18:04 CET 2020
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", idBacino=").append(idBacino);
        sb.append(", denomBacino=").append(denomBacino);
        sb.append(", descBacino=").append(descBacino);
        sb.append(", dataInizioValidita=").append(dataInizioValidita);
        sb.append(", dataFineValidita=").append(dataFineValidita);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}