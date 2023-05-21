/*
* SPDX-FileCopyrightText: (C) Copyright 2022 Regione Piemonte
* SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.rebus.anagraficasrv.integration.dto;

import java.io.Serializable;
import java.util.Date;

public class SirtplaTSoggettoGiuridicoDTO extends ParentDTO implements Serializable {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sirtpla_t_soggetto_giuridico.id_soggetto_giuridico
	 * @mbg.generated  Tue Jan 12 09:58:42 CET 2021
	 */
	private Long idSoggettoGiuridico;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sirtpla_t_soggetto_giuridico.id_tipo_sog_giuridico
	 * @mbg.generated  Tue Jan 12 09:58:42 CET 2021
	 */
	private Long idTipoSogGiuridico;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sirtpla_t_soggetto_giuridico.id_natura_giuridica
	 * @mbg.generated  Tue Jan 12 09:58:42 CET 2021
	 */
	private Long idNaturaGiuridica;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sirtpla_t_soggetto_giuridico.denominazione_breve
	 * @mbg.generated  Tue Jan 12 09:58:42 CET 2021
	 */
	private String denominazioneBreve;
	
	private String denominazioneRicerca;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sirtpla_t_soggetto_giuridico.denominazione_aaep
	 * @mbg.generated  Tue Jan 12 09:58:42 CET 2021
	 */
	private String denominazioneAaep;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sirtpla_t_soggetto_giuridico.denom_soggetto_giuridico
	 * @mbg.generated  Tue Jan 12 09:58:42 CET 2021
	 */
	private String denomSoggettoGiuridico;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sirtpla_t_soggetto_giuridico.partita_iva
	 * @mbg.generated  Tue Jan 12 09:58:42 CET 2021
	 */
	private String partitaIva;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sirtpla_t_soggetto_giuridico.codice_fiscale
	 * @mbg.generated  Tue Jan 12 09:58:42 CET 2021
	 */
	private String codiceFiscale;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sirtpla_t_soggetto_giuridico.cod_osservatorio_naz
	 * @mbg.generated  Tue Jan 12 09:58:42 CET 2021
	 */
	private String codOsservatorioNaz;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sirtpla_t_soggetto_giuridico.nome_rappr_legale
	 * @mbg.generated  Tue Jan 12 09:58:42 CET 2021
	 */
	private String nomeRapprLegale;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sirtpla_t_soggetto_giuridico.cognome_rappr_legale
	 * @mbg.generated  Tue Jan 12 09:58:42 CET 2021
	 */
	private String cognomeRapprLegale;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sirtpla_t_soggetto_giuridico.toponimo_sede_legale
	 * @mbg.generated  Tue Jan 12 09:58:42 CET 2021
	 */
	private String toponimoSedeLegale;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sirtpla_t_soggetto_giuridico.indirizzo_sede_legale
	 * @mbg.generated  Tue Jan 12 09:58:42 CET 2021
	 */
	private String indirizzoSedeLegale;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sirtpla_t_soggetto_giuridico.num_civico_sede_legale
	 * @mbg.generated  Tue Jan 12 09:58:42 CET 2021
	 */
	private String numCivicoSedeLegale;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sirtpla_t_soggetto_giuridico.cap_sede_legale
	 * @mbg.generated  Tue Jan 12 09:58:42 CET 2021
	 */
	private String capSedeLegale;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sirtpla_t_soggetto_giuridico.id_comune_sede_legale
	 * @mbg.generated  Tue Jan 12 09:58:42 CET 2021
	 */
	private Long idComuneSedeLegale;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sirtpla_t_soggetto_giuridico.telefono_sede_legale
	 * @mbg.generated  Tue Jan 12 09:58:42 CET 2021
	 */
	private String telefonoSedeLegale;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sirtpla_t_soggetto_giuridico.fax_sede_legale
	 * @mbg.generated  Tue Jan 12 09:58:42 CET 2021
	 */
	private String faxSedeLegale;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sirtpla_t_soggetto_giuridico.email_sede_legale
	 * @mbg.generated  Tue Jan 12 09:58:42 CET 2021
	 */
	private String emailSedeLegale;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sirtpla_t_soggetto_giuridico.pec_sede_legale
	 * @mbg.generated  Tue Jan 12 09:58:42 CET 2021
	 */
	private String pecSedeLegale;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sirtpla_t_soggetto_giuridico.indirizzo_web
	 * @mbg.generated  Tue Jan 12 09:58:42 CET 2021
	 */
	private String indirizzoWeb;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sirtpla_t_soggetto_giuridico.numero_verde
	 * @mbg.generated  Tue Jan 12 09:58:42 CET 2021
	 */
	private String numeroVerde;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sirtpla_t_soggetto_giuridico.note
	 * @mbg.generated  Tue Jan 12 09:58:42 CET 2021
	 */
	private String note;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sirtpla_t_soggetto_giuridico.id_tipo_ente
	 * @mbg.generated  Tue Jan 12 09:58:42 CET 2021
	 */
	private Long idTipoEnte;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sirtpla_t_soggetto_giuridico.descrizione
	 * @mbg.generated  Tue Jan 12 09:58:42 CET 2021
	 */
	private String descrizione;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sirtpla_t_soggetto_giuridico.data_inizio_attivita
	 * @mbg.generated  Tue Jan 12 09:58:42 CET 2021
	 */
	private Date dataInizioAttivita;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sirtpla_t_soggetto_giuridico.data_cessazione
	 * @mbg.generated  Tue Jan 12 09:58:42 CET 2021
	 */
	private Date dataCessazione;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sirtpla_t_soggetto_giuridico.id_omnibus
	 * @mbg.generated  Tue Jan 12 09:58:42 CET 2021
	 */
	private Long idOmnibus;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sirtpla_t_soggetto_giuridico.id_utente_aggiornamento
	 * @mbg.generated  Tue Jan 12 09:58:42 CET 2021
	 */
	private Long idUtenteAggiornamento;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sirtpla_t_soggetto_giuridico.data_aggiornamento
	 * @mbg.generated  Tue Jan 12 09:58:42 CET 2021
	 */
	private Date dataAggiornamento;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sirtpla_t_soggetto_giuridico.cod_id_regionale
	 * @mbg.generated  Tue Jan 12 09:58:42 CET 2021
	 */
	private String codIdRegionale;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sirtpla_t_soggetto_giuridico.logo
	 * @mbg.generated  Tue Jan 12 09:58:42 CET 2021
	 */
	
	private Long codCsrBip;
	
	private Boolean attivoTpl;
	
	private Boolean cessato;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sirtpla_t_soggetto_giuridico.logo
	 * @mbg.generated  Tue Jan 12 09:58:42 CET 2021
	 */
	private byte[] logo;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table sirtpla_t_soggetto_giuridico
	 * @mbg.generated  Tue Jan 12 09:58:42 CET 2021
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sirtpla_t_soggetto_giuridico.id_soggetto_giuridico
	 * @return  the value of sirtpla_t_soggetto_giuridico.id_soggetto_giuridico
	 * @mbg.generated  Tue Jan 12 09:58:42 CET 2021
	 */
	public Long getIdSoggettoGiuridico() {
		return idSoggettoGiuridico;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sirtpla_t_soggetto_giuridico.id_soggetto_giuridico
	 * @param idSoggettoGiuridico  the value for sirtpla_t_soggetto_giuridico.id_soggetto_giuridico
	 * @mbg.generated  Tue Jan 12 09:58:42 CET 2021
	 */
	public void setIdSoggettoGiuridico(Long idSoggettoGiuridico) {
		this.idSoggettoGiuridico = idSoggettoGiuridico;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sirtpla_t_soggetto_giuridico.id_tipo_sog_giuridico
	 * @return  the value of sirtpla_t_soggetto_giuridico.id_tipo_sog_giuridico
	 * @mbg.generated  Tue Jan 12 09:58:42 CET 2021
	 */
	public Long getIdTipoSogGiuridico() {
		return idTipoSogGiuridico;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sirtpla_t_soggetto_giuridico.id_tipo_sog_giuridico
	 * @param idTipoSogGiuridico  the value for sirtpla_t_soggetto_giuridico.id_tipo_sog_giuridico
	 * @mbg.generated  Tue Jan 12 09:58:42 CET 2021
	 */
	public void setIdTipoSogGiuridico(Long idTipoSogGiuridico) {
		this.idTipoSogGiuridico = idTipoSogGiuridico;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sirtpla_t_soggetto_giuridico.id_natura_giuridica
	 * @return  the value of sirtpla_t_soggetto_giuridico.id_natura_giuridica
	 * @mbg.generated  Tue Jan 12 09:58:42 CET 2021
	 */
	public Long getIdNaturaGiuridica() {
		return idNaturaGiuridica;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sirtpla_t_soggetto_giuridico.id_natura_giuridica
	 * @param idNaturaGiuridica  the value for sirtpla_t_soggetto_giuridico.id_natura_giuridica
	 * @mbg.generated  Tue Jan 12 09:58:42 CET 2021
	 */
	public void setIdNaturaGiuridica(Long idNaturaGiuridica) {
		this.idNaturaGiuridica = idNaturaGiuridica;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sirtpla_t_soggetto_giuridico.denominazione_breve
	 * @return  the value of sirtpla_t_soggetto_giuridico.denominazione_breve
	 * @mbg.generated  Tue Jan 12 09:58:42 CET 2021
	 */
	public String getDenominazioneBreve() {
		return denominazioneBreve;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sirtpla_t_soggetto_giuridico.denominazione_breve
	 * @param denominazioneBreve  the value for sirtpla_t_soggetto_giuridico.denominazione_breve
	 * @mbg.generated  Tue Jan 12 09:58:42 CET 2021
	 */
	public void setDenominazioneBreve(String denominazioneBreve) {
		this.denominazioneBreve = denominazioneBreve == null ? null : denominazioneBreve.trim();
	}

	public String getDenominazioneRicerca() {
		return denominazioneRicerca;
	}

	public void setDenominazioneRicerca(String denominazioneRicerca) {
		this.denominazioneRicerca = denominazioneRicerca;
	}
	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sirtpla_t_soggetto_giuridico.denominazione_aaep
	 * @return  the value of sirtpla_t_soggetto_giuridico.denominazione_aaep
	 * @mbg.generated  Tue Jan 12 09:58:42 CET 2021
	 */
	public String getDenominazioneAaep() {
		return denominazioneAaep;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sirtpla_t_soggetto_giuridico.denominazione_aaep
	 * @param denominazioneAaep  the value for sirtpla_t_soggetto_giuridico.denominazione_aaep
	 * @mbg.generated  Tue Jan 12 09:58:42 CET 2021
	 */
	public void setDenominazioneAaep(String denominazioneAaep) {
		this.denominazioneAaep = denominazioneAaep == null ? null : denominazioneAaep.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sirtpla_t_soggetto_giuridico.denom_soggetto_giuridico
	 * @return  the value of sirtpla_t_soggetto_giuridico.denom_soggetto_giuridico
	 * @mbg.generated  Tue Jan 12 09:58:42 CET 2021
	 */
	public String getDenomSoggettoGiuridico() {
		return denomSoggettoGiuridico;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sirtpla_t_soggetto_giuridico.denom_soggetto_giuridico
	 * @param denomSoggettoGiuridico  the value for sirtpla_t_soggetto_giuridico.denom_soggetto_giuridico
	 * @mbg.generated  Tue Jan 12 09:58:42 CET 2021
	 */
	public void setDenomSoggettoGiuridico(String denomSoggettoGiuridico) {
		this.denomSoggettoGiuridico = denomSoggettoGiuridico == null ? null : denomSoggettoGiuridico.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sirtpla_t_soggetto_giuridico.partita_iva
	 * @return  the value of sirtpla_t_soggetto_giuridico.partita_iva
	 * @mbg.generated  Tue Jan 12 09:58:42 CET 2021
	 */
	public String getPartitaIva() {
		return partitaIva;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sirtpla_t_soggetto_giuridico.partita_iva
	 * @param partitaIva  the value for sirtpla_t_soggetto_giuridico.partita_iva
	 * @mbg.generated  Tue Jan 12 09:58:42 CET 2021
	 */
	public void setPartitaIva(String partitaIva) {
		this.partitaIva = partitaIva == null ? null : partitaIva.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sirtpla_t_soggetto_giuridico.codice_fiscale
	 * @return  the value of sirtpla_t_soggetto_giuridico.codice_fiscale
	 * @mbg.generated  Tue Jan 12 09:58:42 CET 2021
	 */
	public String getCodiceFiscale() {
		return codiceFiscale;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sirtpla_t_soggetto_giuridico.codice_fiscale
	 * @param codiceFiscale  the value for sirtpla_t_soggetto_giuridico.codice_fiscale
	 * @mbg.generated  Tue Jan 12 09:58:42 CET 2021
	 */
	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale == null ? null : codiceFiscale.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sirtpla_t_soggetto_giuridico.cod_osservatorio_naz
	 * @return  the value of sirtpla_t_soggetto_giuridico.cod_osservatorio_naz
	 * @mbg.generated  Tue Jan 12 09:58:42 CET 2021
	 */
	public String getCodOsservatorioNaz() {
		return codOsservatorioNaz;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sirtpla_t_soggetto_giuridico.cod_osservatorio_naz
	 * @param codOsservatorioNaz  the value for sirtpla_t_soggetto_giuridico.cod_osservatorio_naz
	 * @mbg.generated  Tue Jan 12 09:58:42 CET 2021
	 */
	public void setCodOsservatorioNaz(String codOsservatorioNaz) {
		this.codOsservatorioNaz = codOsservatorioNaz == null ? null : codOsservatorioNaz.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sirtpla_t_soggetto_giuridico.nome_rappr_legale
	 * @return  the value of sirtpla_t_soggetto_giuridico.nome_rappr_legale
	 * @mbg.generated  Tue Jan 12 09:58:42 CET 2021
	 */
	public String getNomeRapprLegale() {
		return nomeRapprLegale;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sirtpla_t_soggetto_giuridico.nome_rappr_legale
	 * @param nomeRapprLegale  the value for sirtpla_t_soggetto_giuridico.nome_rappr_legale
	 * @mbg.generated  Tue Jan 12 09:58:42 CET 2021
	 */
	public void setNomeRapprLegale(String nomeRapprLegale) {
		this.nomeRapprLegale = nomeRapprLegale == null ? null : nomeRapprLegale.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sirtpla_t_soggetto_giuridico.cognome_rappr_legale
	 * @return  the value of sirtpla_t_soggetto_giuridico.cognome_rappr_legale
	 * @mbg.generated  Tue Jan 12 09:58:42 CET 2021
	 */
	public String getCognomeRapprLegale() {
		return cognomeRapprLegale;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sirtpla_t_soggetto_giuridico.cognome_rappr_legale
	 * @param cognomeRapprLegale  the value for sirtpla_t_soggetto_giuridico.cognome_rappr_legale
	 * @mbg.generated  Tue Jan 12 09:58:42 CET 2021
	 */
	public void setCognomeRapprLegale(String cognomeRapprLegale) {
		this.cognomeRapprLegale = cognomeRapprLegale == null ? null : cognomeRapprLegale.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sirtpla_t_soggetto_giuridico.toponimo_sede_legale
	 * @return  the value of sirtpla_t_soggetto_giuridico.toponimo_sede_legale
	 * @mbg.generated  Tue Jan 12 09:58:42 CET 2021
	 */
	public String getToponimoSedeLegale() {
		return toponimoSedeLegale;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sirtpla_t_soggetto_giuridico.toponimo_sede_legale
	 * @param toponimoSedeLegale  the value for sirtpla_t_soggetto_giuridico.toponimo_sede_legale
	 * @mbg.generated  Tue Jan 12 09:58:42 CET 2021
	 */
	public void setToponimoSedeLegale(String toponimoSedeLegale) {
		this.toponimoSedeLegale = toponimoSedeLegale == null ? null : toponimoSedeLegale.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sirtpla_t_soggetto_giuridico.indirizzo_sede_legale
	 * @return  the value of sirtpla_t_soggetto_giuridico.indirizzo_sede_legale
	 * @mbg.generated  Tue Jan 12 09:58:42 CET 2021
	 */
	public String getIndirizzoSedeLegale() {
		return indirizzoSedeLegale;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sirtpla_t_soggetto_giuridico.indirizzo_sede_legale
	 * @param indirizzoSedeLegale  the value for sirtpla_t_soggetto_giuridico.indirizzo_sede_legale
	 * @mbg.generated  Tue Jan 12 09:58:42 CET 2021
	 */
	public void setIndirizzoSedeLegale(String indirizzoSedeLegale) {
		this.indirizzoSedeLegale = indirizzoSedeLegale == null ? null : indirizzoSedeLegale.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sirtpla_t_soggetto_giuridico.num_civico_sede_legale
	 * @return  the value of sirtpla_t_soggetto_giuridico.num_civico_sede_legale
	 * @mbg.generated  Tue Jan 12 09:58:42 CET 2021
	 */
	public String getNumCivicoSedeLegale() {
		return numCivicoSedeLegale;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sirtpla_t_soggetto_giuridico.num_civico_sede_legale
	 * @param numCivicoSedeLegale  the value for sirtpla_t_soggetto_giuridico.num_civico_sede_legale
	 * @mbg.generated  Tue Jan 12 09:58:42 CET 2021
	 */
	public void setNumCivicoSedeLegale(String numCivicoSedeLegale) {
		this.numCivicoSedeLegale = numCivicoSedeLegale == null ? null : numCivicoSedeLegale.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sirtpla_t_soggetto_giuridico.cap_sede_legale
	 * @return  the value of sirtpla_t_soggetto_giuridico.cap_sede_legale
	 * @mbg.generated  Tue Jan 12 09:58:42 CET 2021
	 */
	public String getCapSedeLegale() {
		return capSedeLegale;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sirtpla_t_soggetto_giuridico.cap_sede_legale
	 * @param capSedeLegale  the value for sirtpla_t_soggetto_giuridico.cap_sede_legale
	 * @mbg.generated  Tue Jan 12 09:58:42 CET 2021
	 */
	public void setCapSedeLegale(String capSedeLegale) {
		this.capSedeLegale = capSedeLegale == null ? null : capSedeLegale.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sirtpla_t_soggetto_giuridico.id_comune_sede_legale
	 * @return  the value of sirtpla_t_soggetto_giuridico.id_comune_sede_legale
	 * @mbg.generated  Tue Jan 12 09:58:42 CET 2021
	 */
	public Long getIdComuneSedeLegale() {
		return idComuneSedeLegale;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sirtpla_t_soggetto_giuridico.id_comune_sede_legale
	 * @param idComuneSedeLegale  the value for sirtpla_t_soggetto_giuridico.id_comune_sede_legale
	 * @mbg.generated  Tue Jan 12 09:58:42 CET 2021
	 */
	public void setIdComuneSedeLegale(Long idComuneSedeLegale) {
		this.idComuneSedeLegale = idComuneSedeLegale;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sirtpla_t_soggetto_giuridico.telefono_sede_legale
	 * @return  the value of sirtpla_t_soggetto_giuridico.telefono_sede_legale
	 * @mbg.generated  Tue Jan 12 09:58:42 CET 2021
	 */
	public String getTelefonoSedeLegale() {
		return telefonoSedeLegale;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sirtpla_t_soggetto_giuridico.telefono_sede_legale
	 * @param telefonoSedeLegale  the value for sirtpla_t_soggetto_giuridico.telefono_sede_legale
	 * @mbg.generated  Tue Jan 12 09:58:42 CET 2021
	 */
	public void setTelefonoSedeLegale(String telefonoSedeLegale) {
		this.telefonoSedeLegale = telefonoSedeLegale == null ? null : telefonoSedeLegale.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sirtpla_t_soggetto_giuridico.fax_sede_legale
	 * @return  the value of sirtpla_t_soggetto_giuridico.fax_sede_legale
	 * @mbg.generated  Tue Jan 12 09:58:42 CET 2021
	 */
	public String getFaxSedeLegale() {
		return faxSedeLegale;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sirtpla_t_soggetto_giuridico.fax_sede_legale
	 * @param faxSedeLegale  the value for sirtpla_t_soggetto_giuridico.fax_sede_legale
	 * @mbg.generated  Tue Jan 12 09:58:42 CET 2021
	 */
	public void setFaxSedeLegale(String faxSedeLegale) {
		this.faxSedeLegale = faxSedeLegale == null ? null : faxSedeLegale.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sirtpla_t_soggetto_giuridico.email_sede_legale
	 * @return  the value of sirtpla_t_soggetto_giuridico.email_sede_legale
	 * @mbg.generated  Tue Jan 12 09:58:42 CET 2021
	 */
	public String getEmailSedeLegale() {
		return emailSedeLegale;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sirtpla_t_soggetto_giuridico.email_sede_legale
	 * @param emailSedeLegale  the value for sirtpla_t_soggetto_giuridico.email_sede_legale
	 * @mbg.generated  Tue Jan 12 09:58:42 CET 2021
	 */
	public void setEmailSedeLegale(String emailSedeLegale) {
		this.emailSedeLegale = emailSedeLegale == null ? null : emailSedeLegale.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sirtpla_t_soggetto_giuridico.pec_sede_legale
	 * @return  the value of sirtpla_t_soggetto_giuridico.pec_sede_legale
	 * @mbg.generated  Tue Jan 12 09:58:42 CET 2021
	 */
	public String getPecSedeLegale() {
		return pecSedeLegale;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sirtpla_t_soggetto_giuridico.pec_sede_legale
	 * @param pecSedeLegale  the value for sirtpla_t_soggetto_giuridico.pec_sede_legale
	 * @mbg.generated  Tue Jan 12 09:58:42 CET 2021
	 */
	public void setPecSedeLegale(String pecSedeLegale) {
		this.pecSedeLegale = pecSedeLegale == null ? null : pecSedeLegale.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sirtpla_t_soggetto_giuridico.indirizzo_web
	 * @return  the value of sirtpla_t_soggetto_giuridico.indirizzo_web
	 * @mbg.generated  Tue Jan 12 09:58:42 CET 2021
	 */
	public String getIndirizzoWeb() {
		return indirizzoWeb;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sirtpla_t_soggetto_giuridico.indirizzo_web
	 * @param indirizzoWeb  the value for sirtpla_t_soggetto_giuridico.indirizzo_web
	 * @mbg.generated  Tue Jan 12 09:58:42 CET 2021
	 */
	public void setIndirizzoWeb(String indirizzoWeb) {
		this.indirizzoWeb = indirizzoWeb == null ? null : indirizzoWeb.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sirtpla_t_soggetto_giuridico.numero_verde
	 * @return  the value of sirtpla_t_soggetto_giuridico.numero_verde
	 * @mbg.generated  Tue Jan 12 09:58:42 CET 2021
	 */
	public String getNumeroVerde() {
		return numeroVerde;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sirtpla_t_soggetto_giuridico.numero_verde
	 * @param numeroVerde  the value for sirtpla_t_soggetto_giuridico.numero_verde
	 * @mbg.generated  Tue Jan 12 09:58:42 CET 2021
	 */
	public void setNumeroVerde(String numeroVerde) {
		this.numeroVerde = numeroVerde == null ? null : numeroVerde.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sirtpla_t_soggetto_giuridico.note
	 * @return  the value of sirtpla_t_soggetto_giuridico.note
	 * @mbg.generated  Tue Jan 12 09:58:42 CET 2021
	 */
	public String getNote() {
		return note;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sirtpla_t_soggetto_giuridico.note
	 * @param note  the value for sirtpla_t_soggetto_giuridico.note
	 * @mbg.generated  Tue Jan 12 09:58:42 CET 2021
	 */
	public void setNote(String note) {
		this.note = note == null ? null : note.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sirtpla_t_soggetto_giuridico.id_tipo_ente
	 * @return  the value of sirtpla_t_soggetto_giuridico.id_tipo_ente
	 * @mbg.generated  Tue Jan 12 09:58:42 CET 2021
	 */
	public Long getIdTipoEnte() {
		return idTipoEnte;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sirtpla_t_soggetto_giuridico.id_tipo_ente
	 * @param idTipoEnte  the value for sirtpla_t_soggetto_giuridico.id_tipo_ente
	 * @mbg.generated  Tue Jan 12 09:58:42 CET 2021
	 */
	public void setIdTipoEnte(Long idTipoEnte) {
		this.idTipoEnte = idTipoEnte;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sirtpla_t_soggetto_giuridico.descrizione
	 * @return  the value of sirtpla_t_soggetto_giuridico.descrizione
	 * @mbg.generated  Tue Jan 12 09:58:42 CET 2021
	 */
	public String getDescrizione() {
		return descrizione;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sirtpla_t_soggetto_giuridico.descrizione
	 * @param descrizione  the value for sirtpla_t_soggetto_giuridico.descrizione
	 * @mbg.generated  Tue Jan 12 09:58:42 CET 2021
	 */
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione == null ? null : descrizione.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sirtpla_t_soggetto_giuridico.data_inizio_attivita
	 * @return  the value of sirtpla_t_soggetto_giuridico.data_inizio_attivita
	 * @mbg.generated  Tue Jan 12 09:58:42 CET 2021
	 */
	public Date getDataInizioAttivita() {
		return dataInizioAttivita;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sirtpla_t_soggetto_giuridico.data_inizio_attivita
	 * @param dataInizioAttivita  the value for sirtpla_t_soggetto_giuridico.data_inizio_attivita
	 * @mbg.generated  Tue Jan 12 09:58:42 CET 2021
	 */
	public void setDataInizioAttivita(Date dataInizioAttivita) {
		this.dataInizioAttivita = dataInizioAttivita;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sirtpla_t_soggetto_giuridico.data_cessazione
	 * @return  the value of sirtpla_t_soggetto_giuridico.data_cessazione
	 * @mbg.generated  Tue Jan 12 09:58:42 CET 2021
	 */
	public Date getDataCessazione() {
		return dataCessazione;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sirtpla_t_soggetto_giuridico.data_cessazione
	 * @param dataCessazione  the value for sirtpla_t_soggetto_giuridico.data_cessazione
	 * @mbg.generated  Tue Jan 12 09:58:42 CET 2021
	 */
	public void setDataCessazione(Date dataCessazione) {
		this.dataCessazione = dataCessazione;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sirtpla_t_soggetto_giuridico.id_omnibus
	 * @return  the value of sirtpla_t_soggetto_giuridico.id_omnibus
	 * @mbg.generated  Tue Jan 12 09:58:42 CET 2021
	 */
	public Long getIdOmnibus() {
		return idOmnibus;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sirtpla_t_soggetto_giuridico.id_omnibus
	 * @param idOmnibus  the value for sirtpla_t_soggetto_giuridico.id_omnibus
	 * @mbg.generated  Tue Jan 12 09:58:42 CET 2021
	 */
	public void setIdOmnibus(Long idOmnibus) {
		this.idOmnibus = idOmnibus;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sirtpla_t_soggetto_giuridico.id_utente_aggiornamento
	 * @return  the value of sirtpla_t_soggetto_giuridico.id_utente_aggiornamento
	 * @mbg.generated  Tue Jan 12 09:58:42 CET 2021
	 */
	public Long getIdUtenteAggiornamento() {
		return idUtenteAggiornamento;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sirtpla_t_soggetto_giuridico.id_utente_aggiornamento
	 * @param idUtenteAggiornamento  the value for sirtpla_t_soggetto_giuridico.id_utente_aggiornamento
	 * @mbg.generated  Tue Jan 12 09:58:42 CET 2021
	 */
	public void setIdUtenteAggiornamento(Long idUtenteAggiornamento) {
		this.idUtenteAggiornamento = idUtenteAggiornamento;
	}


	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sirtpla_t_soggetto_giuridico.data_aggiornamento
	 * @return  the value of sirtpla_t_soggetto_giuridico.data_aggiornamento
	 * @mbg.generated  Tue Jan 12 09:58:42 CET 2021
	 */
	public Date getDataAggiornamento() {
		return dataAggiornamento;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sirtpla_t_soggetto_giuridico.data_aggiornamento
	 * @param dataAggiornamento  the value for sirtpla_t_soggetto_giuridico.data_aggiornamento
	 * @mbg.generated  Tue Jan 12 09:58:42 CET 2021
	 */
	public void setDataAggiornamento(Date dataAggiornamento) {
		this.dataAggiornamento = dataAggiornamento;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sirtpla_t_soggetto_giuridico.cod_id_regionale
	 * @return  the value of sirtpla_t_soggetto_giuridico.cod_id_regionale
	 * @mbg.generated  Tue Jan 12 09:58:42 CET 2021
	 */
	public String getCodIdRegionale() {
		return codIdRegionale;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sirtpla_t_soggetto_giuridico.cod_id_regionale
	 * @param codIdRegionale  the value for sirtpla_t_soggetto_giuridico.cod_id_regionale
	 * @mbg.generated  Tue Jan 12 09:58:42 CET 2021
	 */
	public void setCodIdRegionale(String codIdRegionale) {
		this.codIdRegionale = codIdRegionale == null ? null : codIdRegionale.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sirtpla_t_soggetto_giuridico.logo
	 * @return  the value of sirtpla_t_soggetto_giuridico.logo
	 * @mbg.generated  Tue Jan 12 09:58:42 CET 2021
	 */
	public byte[] getLogo() {
		return logo;
	}
	
	public Long getCodCsrBip() {
		return codCsrBip;
	}
	
	public void setCodCsrBip(Long codCsrBip) {
		this.codCsrBip=codCsrBip;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sirtpla_t_soggetto_giuridico.logo
	 * @param logo  the value for sirtpla_t_soggetto_giuridico.logo
	 * @mbg.generated  Tue Jan 12 09:58:42 CET 2021
	 */
	public void setLogo(byte[] logo) {
		this.logo = logo;
	}
	

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sirtpla_t_soggetto_giuridico
	 * @mbg.generated  Tue Jan 12 09:58:42 CET 2021
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", idSoggettoGiuridico=").append(idSoggettoGiuridico);
		sb.append(", idTipoSogGiuridico=").append(idTipoSogGiuridico);
		sb.append(", idNaturaGiuridica=").append(idNaturaGiuridica);
		sb.append(", denominazioneBreve=").append(denominazioneBreve);
		sb.append(", denominazioneRicerca=").append(denominazioneRicerca);
		sb.append(", denominazioneAaep=").append(denominazioneAaep);
		sb.append(", denomSoggettoGiuridico=").append(denomSoggettoGiuridico);
		sb.append(", partitaIva=").append(partitaIva);
		sb.append(", codiceFiscale=").append(codiceFiscale);
		sb.append(", codOsservatorioNaz=").append(codOsservatorioNaz);
		sb.append(", nomeRapprLegale=").append(nomeRapprLegale);
		sb.append(", cognomeRapprLegale=").append(cognomeRapprLegale);
		sb.append(", toponimoSedeLegale=").append(toponimoSedeLegale);
		sb.append(", indirizzoSedeLegale=").append(indirizzoSedeLegale);
		sb.append(", numCivicoSedeLegale=").append(numCivicoSedeLegale);
		sb.append(", capSedeLegale=").append(capSedeLegale);
		sb.append(", idComuneSedeLegale=").append(idComuneSedeLegale);
		sb.append(", telefonoSedeLegale=").append(telefonoSedeLegale);
		sb.append(", faxSedeLegale=").append(faxSedeLegale);
		sb.append(", emailSedeLegale=").append(emailSedeLegale);
		sb.append(", pecSedeLegale=").append(pecSedeLegale);
		sb.append(", indirizzoWeb=").append(indirizzoWeb);
		sb.append(", numeroVerde=").append(numeroVerde);
		sb.append(", note=").append(note);
		sb.append(", idTipoEnte=").append(idTipoEnte);
		sb.append(", descrizione=").append(descrizione);
		sb.append(", dataInizioAttivita=").append(dataInizioAttivita);
		sb.append(", dataCessazione=").append(dataCessazione);
		sb.append(", idOmnibus=").append(idOmnibus);
		sb.append(", idUtenteAggiornamento=").append(idUtenteAggiornamento);
		sb.append(", dataAggiornamento=").append(dataAggiornamento);
		sb.append(", codIdRegionale=").append(codIdRegionale);
		sb.append(", codCsrBip=").append(codCsrBip);
		sb.append(", logo=").append(logo);
		sb.append(", cessato=").append(cessato);
		sb.append(", serialVersionUID=").append(serialVersionUID);
		sb.append("]");
		return sb.toString();
	}

	public Boolean getAttivoTpl() {
		return attivoTpl;
	}

	public void setAttivoTpl(Boolean attivoTpl) {
		this.attivoTpl = attivoTpl;
	}

	public Boolean getCessato() {
		return cessato;
	}

	public void setCessato(Boolean cessato) {
		this.cessato = cessato;
	}
}