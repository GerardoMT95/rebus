/*
* SPDX-FileCopyrightText: (C) Copyright 2022 Regione Piemonte
* SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.rebus.rebuscrus.integration.dto;

import java.io.Serializable;
import java.util.Date;

public class SirtplaTDepositoDTO extends ParentDTO implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sirtpla_t_deposito.id_deposito
     *
     * @mbg.generated Tue Aug 25 12:39:41 CEST 2020
     */
    private Long idDeposito;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sirtpla_t_deposito.denom_deposito
     *
     * @mbg.generated Tue Aug 25 12:39:41 CEST 2020
     */
    private String denomDeposito;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sirtpla_t_deposito.toponimo_deposito
     *
     * @mbg.generated Tue Aug 25 12:39:41 CEST 2020
     */
    private String toponimoDeposito;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sirtpla_t_deposito.indirizzo_deposito
     *
     * @mbg.generated Tue Aug 25 12:39:41 CEST 2020
     */
    private String indirizzoDeposito;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sirtpla_t_deposito.num_civico_deposito
     *
     * @mbg.generated Tue Aug 25 12:39:41 CEST 2020
     */
    private String numCivicoDeposito;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sirtpla_t_deposito.cap_deposito
     *
     * @mbg.generated Tue Aug 25 12:39:41 CEST 2020
     */
    private String capDeposito;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sirtpla_t_deposito.id_comune_deposito
     *
     * @mbg.generated Tue Aug 25 12:39:41 CEST 2020
     */
    private Long idComuneDeposito;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sirtpla_t_deposito.telefono_deposito
     *
     * @mbg.generated Tue Aug 25 12:39:41 CEST 2020
     */
    private String telefonoDeposito;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sirtpla_t_deposito.id_utente_aggiornamento
     *
     * @mbg.generated Tue Aug 25 12:39:41 CEST 2020
     */
    private Long idUtenteAggiornamento;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sirtpla_t_deposito.data_aggiornamento
     *
     * @mbg.generated Tue Aug 25 12:39:41 CEST 2020
     */
    private Date dataAggiornamento;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sirtpla_t_deposito.flag_deposito_prevalente
     *
     * @mbg.generated Tue Aug 25 12:39:41 CEST 2020
     */
    private Boolean flagDepositoPrevalente;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sirtpla_t_deposito
     *
     * @mbg.generated Tue Aug 25 12:39:41 CEST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sirtpla_t_deposito.id_deposito
     *
     * @return the value of sirtpla_t_deposito.id_deposito
     *
     * @mbg.generated Tue Aug 25 12:39:41 CEST 2020
     */
    public Long getIdDeposito() {
        return idDeposito;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sirtpla_t_deposito.id_deposito
     *
     * @param idDeposito the value for sirtpla_t_deposito.id_deposito
     *
     * @mbg.generated Tue Aug 25 12:39:41 CEST 2020
     */
    public void setIdDeposito(Long idDeposito) {
        this.idDeposito = idDeposito;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sirtpla_t_deposito.denom_deposito
     *
     * @return the value of sirtpla_t_deposito.denom_deposito
     *
     * @mbg.generated Tue Aug 25 12:39:41 CEST 2020
     */
    public String getDenomDeposito() {
        return denomDeposito;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sirtpla_t_deposito.denom_deposito
     *
     * @param denomDeposito the value for sirtpla_t_deposito.denom_deposito
     *
     * @mbg.generated Tue Aug 25 12:39:41 CEST 2020
     */
    public void setDenomDeposito(String denomDeposito) {
        this.denomDeposito = denomDeposito == null ? null : denomDeposito.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sirtpla_t_deposito.toponimo_deposito
     *
     * @return the value of sirtpla_t_deposito.toponimo_deposito
     *
     * @mbg.generated Tue Aug 25 12:39:41 CEST 2020
     */
    public String getToponimoDeposito() {
        return toponimoDeposito;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sirtpla_t_deposito.toponimo_deposito
     *
     * @param toponimoDeposito the value for sirtpla_t_deposito.toponimo_deposito
     *
     * @mbg.generated Tue Aug 25 12:39:41 CEST 2020
     */
    public void setToponimoDeposito(String toponimoDeposito) {
        this.toponimoDeposito = toponimoDeposito == null ? null : toponimoDeposito.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sirtpla_t_deposito.indirizzo_deposito
     *
     * @return the value of sirtpla_t_deposito.indirizzo_deposito
     *
     * @mbg.generated Tue Aug 25 12:39:41 CEST 2020
     */
    public String getIndirizzoDeposito() {
        return indirizzoDeposito;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sirtpla_t_deposito.indirizzo_deposito
     *
     * @param indirizzoDeposito the value for sirtpla_t_deposito.indirizzo_deposito
     *
     * @mbg.generated Tue Aug 25 12:39:41 CEST 2020
     */
    public void setIndirizzoDeposito(String indirizzoDeposito) {
        this.indirizzoDeposito = indirizzoDeposito == null ? null : indirizzoDeposito.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sirtpla_t_deposito.num_civico_deposito
     *
     * @return the value of sirtpla_t_deposito.num_civico_deposito
     *
     * @mbg.generated Tue Aug 25 12:39:41 CEST 2020
     */
    public String getNumCivicoDeposito() {
        return numCivicoDeposito;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sirtpla_t_deposito.num_civico_deposito
     *
     * @param numCivicoDeposito the value for sirtpla_t_deposito.num_civico_deposito
     *
     * @mbg.generated Tue Aug 25 12:39:41 CEST 2020
     */
    public void setNumCivicoDeposito(String numCivicoDeposito) {
        this.numCivicoDeposito = numCivicoDeposito == null ? null : numCivicoDeposito.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sirtpla_t_deposito.cap_deposito
     *
     * @return the value of sirtpla_t_deposito.cap_deposito
     *
     * @mbg.generated Tue Aug 25 12:39:41 CEST 2020
     */
    public String getCapDeposito() {
        return capDeposito;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sirtpla_t_deposito.cap_deposito
     *
     * @param capDeposito the value for sirtpla_t_deposito.cap_deposito
     *
     * @mbg.generated Tue Aug 25 12:39:41 CEST 2020
     */
    public void setCapDeposito(String capDeposito) {
        this.capDeposito = capDeposito == null ? null : capDeposito.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sirtpla_t_deposito.id_comune_deposito
     *
     * @return the value of sirtpla_t_deposito.id_comune_deposito
     *
     * @mbg.generated Tue Aug 25 12:39:41 CEST 2020
     */
    public Long getIdComuneDeposito() {
        return idComuneDeposito;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sirtpla_t_deposito.id_comune_deposito
     *
     * @param idComuneDeposito the value for sirtpla_t_deposito.id_comune_deposito
     *
     * @mbg.generated Tue Aug 25 12:39:41 CEST 2020
     */
    public void setIdComuneDeposito(Long idComuneDeposito) {
        this.idComuneDeposito = idComuneDeposito;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sirtpla_t_deposito.telefono_deposito
     *
     * @return the value of sirtpla_t_deposito.telefono_deposito
     *
     * @mbg.generated Tue Aug 25 12:39:41 CEST 2020
     */
    public String getTelefonoDeposito() {
        return telefonoDeposito;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sirtpla_t_deposito.telefono_deposito
     *
     * @param telefonoDeposito the value for sirtpla_t_deposito.telefono_deposito
     *
     * @mbg.generated Tue Aug 25 12:39:41 CEST 2020
     */
    public void setTelefonoDeposito(String telefonoDeposito) {
        this.telefonoDeposito = telefonoDeposito == null ? null : telefonoDeposito.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sirtpla_t_deposito.id_utente_aggiornamento
     *
     * @return the value of sirtpla_t_deposito.id_utente_aggiornamento
     *
     * @mbg.generated Tue Aug 25 12:39:41 CEST 2020
     */
    public Long getIdUtenteAggiornamento() {
        return idUtenteAggiornamento;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sirtpla_t_deposito.id_utente_aggiornamento
     *
     * @param idUtenteAggiornamento the value for sirtpla_t_deposito.id_utente_aggiornamento
     *
     * @mbg.generated Tue Aug 25 12:39:41 CEST 2020
     */
    public void setIdUtenteAggiornamento(Long idUtenteAggiornamento) {
        this.idUtenteAggiornamento = idUtenteAggiornamento;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sirtpla_t_deposito.data_aggiornamento
     *
     * @return the value of sirtpla_t_deposito.data_aggiornamento
     *
     * @mbg.generated Tue Aug 25 12:39:41 CEST 2020
     */
    public Date getDataAggiornamento() {
        return dataAggiornamento;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sirtpla_t_deposito.data_aggiornamento
     *
     * @param dataAggiornamento the value for sirtpla_t_deposito.data_aggiornamento
     *
     * @mbg.generated Tue Aug 25 12:39:41 CEST 2020
     */
    public void setDataAggiornamento(Date dataAggiornamento) {
        this.dataAggiornamento = dataAggiornamento;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sirtpla_t_deposito.flag_deposito_prevalente
     *
     * @return the value of sirtpla_t_deposito.flag_deposito_prevalente
     *
     * @mbg.generated Tue Aug 25 12:39:41 CEST 2020
     */
    public Boolean getFlagDepositoPrevalente() {
        return flagDepositoPrevalente;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sirtpla_t_deposito.flag_deposito_prevalente
     *
     * @param flagDepositoPrevalente the value for sirtpla_t_deposito.flag_deposito_prevalente
     *
     * @mbg.generated Tue Aug 25 12:39:41 CEST 2020
     */
    public void setFlagDepositoPrevalente(Boolean flagDepositoPrevalente) {
        this.flagDepositoPrevalente = flagDepositoPrevalente;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sirtpla_t_deposito
     *
     * @mbg.generated Tue Aug 25 12:39:41 CEST 2020
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", idDeposito=").append(idDeposito);
        sb.append(", denomDeposito=").append(denomDeposito);
        sb.append(", toponimoDeposito=").append(toponimoDeposito);
        sb.append(", indirizzoDeposito=").append(indirizzoDeposito);
        sb.append(", numCivicoDeposito=").append(numCivicoDeposito);
        sb.append(", capDeposito=").append(capDeposito);
        sb.append(", idComuneDeposito=").append(idComuneDeposito);
        sb.append(", telefonoDeposito=").append(telefonoDeposito);
        sb.append(", idUtenteAggiornamento=").append(idUtenteAggiornamento);
        sb.append(", dataAggiornamento=").append(dataAggiornamento);
        sb.append(", flagDepositoPrevalente=").append(flagDepositoPrevalente);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}