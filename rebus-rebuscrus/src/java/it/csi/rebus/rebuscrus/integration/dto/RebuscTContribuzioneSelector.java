/*
* SPDX-FileCopyrightText: (C) Copyright 2022 Regione Piemonte
* SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.rebus.rebuscrus.integration.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RebuscTContribuzioneSelector {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table rebusc_t_contribuzione
	 * @mbg.generated  Wed Mar 02 17:39:34 CET 2022
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table rebusc_t_contribuzione
	 * @mbg.generated  Wed Mar 02 17:39:34 CET 2022
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table rebusc_t_contribuzione
	 * @mbg.generated  Wed Mar 02 17:39:34 CET 2022
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table rebusc_t_contribuzione
	 * @mbg.generated  Wed Mar 02 17:39:34 CET 2022
	 */
	public RebuscTContribuzioneSelector() {
		oredCriteria = new ArrayList<>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table rebusc_t_contribuzione
	 * @mbg.generated  Wed Mar 02 17:39:34 CET 2022
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table rebusc_t_contribuzione
	 * @mbg.generated  Wed Mar 02 17:39:34 CET 2022
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table rebusc_t_contribuzione
	 * @mbg.generated  Wed Mar 02 17:39:34 CET 2022
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table rebusc_t_contribuzione
	 * @mbg.generated  Wed Mar 02 17:39:34 CET 2022
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table rebusc_t_contribuzione
	 * @mbg.generated  Wed Mar 02 17:39:34 CET 2022
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table rebusc_t_contribuzione
	 * @mbg.generated  Wed Mar 02 17:39:34 CET 2022
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table rebusc_t_contribuzione
	 * @mbg.generated  Wed Mar 02 17:39:34 CET 2022
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table rebusc_t_contribuzione
	 * @mbg.generated  Wed Mar 02 17:39:34 CET 2022
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table rebusc_t_contribuzione
	 * @mbg.generated  Wed Mar 02 17:39:34 CET 2022
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table rebusc_t_contribuzione
	 * @mbg.generated  Wed Mar 02 17:39:34 CET 2022
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table rebusc_t_contribuzione
	 * @mbg.generated  Wed Mar 02 17:39:34 CET 2022
	 */
	protected abstract static class GeneratedCriteria {
		protected List<Criterion> criteria;

		protected GeneratedCriteria() {
			super();
			criteria = new ArrayList<>();
		}

		public boolean isValid() {
			return criteria.size() > 0;
		}

		public List<Criterion> getAllCriteria() {
			return criteria;
		}

		public List<Criterion> getCriteria() {
			return criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteria.add(new Criterion(condition));
		}

		protected void addCriterion(String condition, Object value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1, Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		public Criteria andIdContribuzioneIsNull() {
			addCriterion("id_contribuzione is null");
			return (Criteria) this;
		}

		public Criteria andIdContribuzioneIsNotNull() {
			addCriterion("id_contribuzione is not null");
			return (Criteria) this;
		}

		public Criteria andIdContribuzioneEqualTo(Long value) {
			addCriterion("id_contribuzione =", value, "idContribuzione");
			return (Criteria) this;
		}

		public Criteria andIdContribuzioneNotEqualTo(Long value) {
			addCriterion("id_contribuzione <>", value, "idContribuzione");
			return (Criteria) this;
		}

		public Criteria andIdContribuzioneGreaterThan(Long value) {
			addCriterion("id_contribuzione >", value, "idContribuzione");
			return (Criteria) this;
		}

		public Criteria andIdContribuzioneGreaterThanOrEqualTo(Long value) {
			addCriterion("id_contribuzione >=", value, "idContribuzione");
			return (Criteria) this;
		}

		public Criteria andIdContribuzioneLessThan(Long value) {
			addCriterion("id_contribuzione <", value, "idContribuzione");
			return (Criteria) this;
		}

		public Criteria andIdContribuzioneLessThanOrEqualTo(Long value) {
			addCriterion("id_contribuzione <=", value, "idContribuzione");
			return (Criteria) this;
		}

		public Criteria andIdContribuzioneIn(List<Long> values) {
			addCriterion("id_contribuzione in", values, "idContribuzione");
			return (Criteria) this;
		}

		public Criteria andIdContribuzioneNotIn(List<Long> values) {
			addCriterion("id_contribuzione not in", values, "idContribuzione");
			return (Criteria) this;
		}

		public Criteria andIdContribuzioneBetween(Long value1, Long value2) {
			addCriterion("id_contribuzione between", value1, value2, "idContribuzione");
			return (Criteria) this;
		}

		public Criteria andIdContribuzioneNotBetween(Long value1, Long value2) {
			addCriterion("id_contribuzione not between", value1, value2, "idContribuzione");
			return (Criteria) this;
		}

		public Criteria andIdAssegnazioneRisorseIsNull() {
			addCriterion("id_assegnazione_risorse is null");
			return (Criteria) this;
		}

		public Criteria andIdAssegnazioneRisorseIsNotNull() {
			addCriterion("id_assegnazione_risorse is not null");
			return (Criteria) this;
		}

		public Criteria andIdAssegnazioneRisorseEqualTo(Long value) {
			addCriterion("id_assegnazione_risorse =", value, "idAssegnazioneRisorse");
			return (Criteria) this;
		}

		public Criteria andIdAssegnazioneRisorseNotEqualTo(Long value) {
			addCriterion("id_assegnazione_risorse <>", value, "idAssegnazioneRisorse");
			return (Criteria) this;
		}

		public Criteria andIdAssegnazioneRisorseGreaterThan(Long value) {
			addCriterion("id_assegnazione_risorse >", value, "idAssegnazioneRisorse");
			return (Criteria) this;
		}

		public Criteria andIdAssegnazioneRisorseGreaterThanOrEqualTo(Long value) {
			addCriterion("id_assegnazione_risorse >=", value, "idAssegnazioneRisorse");
			return (Criteria) this;
		}

		public Criteria andIdAssegnazioneRisorseLessThan(Long value) {
			addCriterion("id_assegnazione_risorse <", value, "idAssegnazioneRisorse");
			return (Criteria) this;
		}

		public Criteria andIdAssegnazioneRisorseLessThanOrEqualTo(Long value) {
			addCriterion("id_assegnazione_risorse <=", value, "idAssegnazioneRisorse");
			return (Criteria) this;
		}

		public Criteria andIdAssegnazioneRisorseIn(List<Long> values) {
			addCriterion("id_assegnazione_risorse in", values, "idAssegnazioneRisorse");
			return (Criteria) this;
		}

		public Criteria andIdAssegnazioneRisorseNotIn(List<Long> values) {
			addCriterion("id_assegnazione_risorse not in", values, "idAssegnazioneRisorse");
			return (Criteria) this;
		}

		public Criteria andIdAssegnazioneRisorseBetween(Long value1, Long value2) {
			addCriterion("id_assegnazione_risorse between", value1, value2, "idAssegnazioneRisorse");
			return (Criteria) this;
		}

		public Criteria andIdAssegnazioneRisorseNotBetween(Long value1, Long value2) {
			addCriterion("id_assegnazione_risorse not between", value1, value2, "idAssegnazioneRisorse");
			return (Criteria) this;
		}

		public Criteria andIdOrdineAcquistoIsNull() {
			addCriterion("id_ordine_acquisto is null");
			return (Criteria) this;
		}

		public Criteria andIdOrdineAcquistoIsNotNull() {
			addCriterion("id_ordine_acquisto is not null");
			return (Criteria) this;
		}

		public Criteria andIdOrdineAcquistoEqualTo(Long value) {
			addCriterion("id_ordine_acquisto =", value, "idOrdineAcquisto");
			return (Criteria) this;
		}

		public Criteria andIdOrdineAcquistoNotEqualTo(Long value) {
			addCriterion("id_ordine_acquisto <>", value, "idOrdineAcquisto");
			return (Criteria) this;
		}

		public Criteria andIdOrdineAcquistoGreaterThan(Long value) {
			addCriterion("id_ordine_acquisto >", value, "idOrdineAcquisto");
			return (Criteria) this;
		}

		public Criteria andIdOrdineAcquistoGreaterThanOrEqualTo(Long value) {
			addCriterion("id_ordine_acquisto >=", value, "idOrdineAcquisto");
			return (Criteria) this;
		}

		public Criteria andIdOrdineAcquistoLessThan(Long value) {
			addCriterion("id_ordine_acquisto <", value, "idOrdineAcquisto");
			return (Criteria) this;
		}

		public Criteria andIdOrdineAcquistoLessThanOrEqualTo(Long value) {
			addCriterion("id_ordine_acquisto <=", value, "idOrdineAcquisto");
			return (Criteria) this;
		}

		public Criteria andIdOrdineAcquistoIn(List<Long> values) {
			addCriterion("id_ordine_acquisto in", values, "idOrdineAcquisto");
			return (Criteria) this;
		}

		public Criteria andIdOrdineAcquistoNotIn(List<Long> values) {
			addCriterion("id_ordine_acquisto not in", values, "idOrdineAcquisto");
			return (Criteria) this;
		}

		public Criteria andIdOrdineAcquistoBetween(Long value1, Long value2) {
			addCriterion("id_ordine_acquisto between", value1, value2, "idOrdineAcquisto");
			return (Criteria) this;
		}

		public Criteria andIdOrdineAcquistoNotBetween(Long value1, Long value2) {
			addCriterion("id_ordine_acquisto not between", value1, value2, "idOrdineAcquisto");
			return (Criteria) this;
		}

		public Criteria andIdCostoFornituraIsNull() {
			addCriterion("id_costo_fornitura is null");
			return (Criteria) this;
		}

		public Criteria andIdCostoFornituraIsNotNull() {
			addCriterion("id_costo_fornitura is not null");
			return (Criteria) this;
		}

		public Criteria andIdCostoFornituraEqualTo(Long value) {
			addCriterion("id_costo_fornitura =", value, "idCostoFornitura");
			return (Criteria) this;
		}

		public Criteria andIdCostoFornituraNotEqualTo(Long value) {
			addCriterion("id_costo_fornitura <>", value, "idCostoFornitura");
			return (Criteria) this;
		}

		public Criteria andIdCostoFornituraGreaterThan(Long value) {
			addCriterion("id_costo_fornitura >", value, "idCostoFornitura");
			return (Criteria) this;
		}

		public Criteria andIdCostoFornituraGreaterThanOrEqualTo(Long value) {
			addCriterion("id_costo_fornitura >=", value, "idCostoFornitura");
			return (Criteria) this;
		}

		public Criteria andIdCostoFornituraLessThan(Long value) {
			addCriterion("id_costo_fornitura <", value, "idCostoFornitura");
			return (Criteria) this;
		}

		public Criteria andIdCostoFornituraLessThanOrEqualTo(Long value) {
			addCriterion("id_costo_fornitura <=", value, "idCostoFornitura");
			return (Criteria) this;
		}

		public Criteria andIdCostoFornituraIn(List<Long> values) {
			addCriterion("id_costo_fornitura in", values, "idCostoFornitura");
			return (Criteria) this;
		}

		public Criteria andIdCostoFornituraNotIn(List<Long> values) {
			addCriterion("id_costo_fornitura not in", values, "idCostoFornitura");
			return (Criteria) this;
		}

		public Criteria andIdCostoFornituraBetween(Long value1, Long value2) {
			addCriterion("id_costo_fornitura between", value1, value2, "idCostoFornitura");
			return (Criteria) this;
		}

		public Criteria andIdCostoFornituraNotBetween(Long value1, Long value2) {
			addCriterion("id_costo_fornitura not between", value1, value2, "idCostoFornitura");
			return (Criteria) this;
		}

		public Criteria andIdDatoSpesaIsNull() {
			addCriterion("id_dato_spesa is null");
			return (Criteria) this;
		}

		public Criteria andIdDatoSpesaIsNotNull() {
			addCriterion("id_dato_spesa is not null");
			return (Criteria) this;
		}

		public Criteria andIdDatoSpesaEqualTo(Long value) {
			addCriterion("id_dato_spesa =", value, "idDatoSpesa");
			return (Criteria) this;
		}

		public Criteria andIdDatoSpesaNotEqualTo(Long value) {
			addCriterion("id_dato_spesa <>", value, "idDatoSpesa");
			return (Criteria) this;
		}

		public Criteria andIdDatoSpesaGreaterThan(Long value) {
			addCriterion("id_dato_spesa >", value, "idDatoSpesa");
			return (Criteria) this;
		}

		public Criteria andIdDatoSpesaGreaterThanOrEqualTo(Long value) {
			addCriterion("id_dato_spesa >=", value, "idDatoSpesa");
			return (Criteria) this;
		}

		public Criteria andIdDatoSpesaLessThan(Long value) {
			addCriterion("id_dato_spesa <", value, "idDatoSpesa");
			return (Criteria) this;
		}

		public Criteria andIdDatoSpesaLessThanOrEqualTo(Long value) {
			addCriterion("id_dato_spesa <=", value, "idDatoSpesa");
			return (Criteria) this;
		}

		public Criteria andIdDatoSpesaIn(List<Long> values) {
			addCriterion("id_dato_spesa in", values, "idDatoSpesa");
			return (Criteria) this;
		}

		public Criteria andIdDatoSpesaNotIn(List<Long> values) {
			addCriterion("id_dato_spesa not in", values, "idDatoSpesa");
			return (Criteria) this;
		}

		public Criteria andIdDatoSpesaBetween(Long value1, Long value2) {
			addCriterion("id_dato_spesa between", value1, value2, "idDatoSpesa");
			return (Criteria) this;
		}

		public Criteria andIdDatoSpesaNotBetween(Long value1, Long value2) {
			addCriterion("id_dato_spesa not between", value1, value2, "idDatoSpesa");
			return (Criteria) this;
		}

		public Criteria andIdDatoMessaServizioIsNull() {
			addCriterion("id_dato_messa_servizio is null");
			return (Criteria) this;
		}

		public Criteria andIdDatoMessaServizioIsNotNull() {
			addCriterion("id_dato_messa_servizio is not null");
			return (Criteria) this;
		}

		public Criteria andIdDatoMessaServizioEqualTo(Long value) {
			addCriterion("id_dato_messa_servizio =", value, "idDatoMessaServizio");
			return (Criteria) this;
		}

		public Criteria andIdDatoMessaServizioNotEqualTo(Long value) {
			addCriterion("id_dato_messa_servizio <>", value, "idDatoMessaServizio");
			return (Criteria) this;
		}

		public Criteria andIdDatoMessaServizioGreaterThan(Long value) {
			addCriterion("id_dato_messa_servizio >", value, "idDatoMessaServizio");
			return (Criteria) this;
		}

		public Criteria andIdDatoMessaServizioGreaterThanOrEqualTo(Long value) {
			addCriterion("id_dato_messa_servizio >=", value, "idDatoMessaServizio");
			return (Criteria) this;
		}

		public Criteria andIdDatoMessaServizioLessThan(Long value) {
			addCriterion("id_dato_messa_servizio <", value, "idDatoMessaServizio");
			return (Criteria) this;
		}

		public Criteria andIdDatoMessaServizioLessThanOrEqualTo(Long value) {
			addCriterion("id_dato_messa_servizio <=", value, "idDatoMessaServizio");
			return (Criteria) this;
		}

		public Criteria andIdDatoMessaServizioIn(List<Long> values) {
			addCriterion("id_dato_messa_servizio in", values, "idDatoMessaServizio");
			return (Criteria) this;
		}

		public Criteria andIdDatoMessaServizioNotIn(List<Long> values) {
			addCriterion("id_dato_messa_servizio not in", values, "idDatoMessaServizio");
			return (Criteria) this;
		}

		public Criteria andIdDatoMessaServizioBetween(Long value1, Long value2) {
			addCriterion("id_dato_messa_servizio between", value1, value2, "idDatoMessaServizio");
			return (Criteria) this;
		}

		public Criteria andIdDatoMessaServizioNotBetween(Long value1, Long value2) {
			addCriterion("id_dato_messa_servizio not between", value1, value2, "idDatoMessaServizio");
			return (Criteria) this;
		}

		public Criteria andIdProcedimentoIsNull() {
			addCriterion("id_procedimento is null");
			return (Criteria) this;
		}

		public Criteria andIdProcedimentoIsNotNull() {
			addCriterion("id_procedimento is not null");
			return (Criteria) this;
		}

		public Criteria andIdProcedimentoEqualTo(Long value) {
			addCriterion("id_procedimento =", value, "idProcedimento");
			return (Criteria) this;
		}

		public Criteria andIdProcedimentoNotEqualTo(Long value) {
			addCriterion("id_procedimento <>", value, "idProcedimento");
			return (Criteria) this;
		}

		public Criteria andIdProcedimentoGreaterThan(Long value) {
			addCriterion("id_procedimento >", value, "idProcedimento");
			return (Criteria) this;
		}

		public Criteria andIdProcedimentoGreaterThanOrEqualTo(Long value) {
			addCriterion("id_procedimento >=", value, "idProcedimento");
			return (Criteria) this;
		}

		public Criteria andIdProcedimentoLessThan(Long value) {
			addCriterion("id_procedimento <", value, "idProcedimento");
			return (Criteria) this;
		}

		public Criteria andIdProcedimentoLessThanOrEqualTo(Long value) {
			addCriterion("id_procedimento <=", value, "idProcedimento");
			return (Criteria) this;
		}

		public Criteria andIdProcedimentoIn(List<Long> values) {
			addCriterion("id_procedimento in", values, "idProcedimento");
			return (Criteria) this;
		}

		public Criteria andIdProcedimentoNotIn(List<Long> values) {
			addCriterion("id_procedimento not in", values, "idProcedimento");
			return (Criteria) this;
		}

		public Criteria andIdProcedimentoBetween(Long value1, Long value2) {
			addCriterion("id_procedimento between", value1, value2, "idProcedimento");
			return (Criteria) this;
		}

		public Criteria andIdProcedimentoNotBetween(Long value1, Long value2) {
			addCriterion("id_procedimento not between", value1, value2, "idProcedimento");
			return (Criteria) this;
		}

		public Criteria andIdUtenteAggiornamentoIsNull() {
			addCriterion("id_utente_aggiornamento is null");
			return (Criteria) this;
		}

		public Criteria andIdUtenteAggiornamentoIsNotNull() {
			addCriterion("id_utente_aggiornamento is not null");
			return (Criteria) this;
		}

		public Criteria andIdUtenteAggiornamentoEqualTo(Long value) {
			addCriterion("id_utente_aggiornamento =", value, "idUtenteAggiornamento");
			return (Criteria) this;
		}

		public Criteria andIdUtenteAggiornamentoNotEqualTo(Long value) {
			addCriterion("id_utente_aggiornamento <>", value, "idUtenteAggiornamento");
			return (Criteria) this;
		}

		public Criteria andIdUtenteAggiornamentoGreaterThan(Long value) {
			addCriterion("id_utente_aggiornamento >", value, "idUtenteAggiornamento");
			return (Criteria) this;
		}

		public Criteria andIdUtenteAggiornamentoGreaterThanOrEqualTo(Long value) {
			addCriterion("id_utente_aggiornamento >=", value, "idUtenteAggiornamento");
			return (Criteria) this;
		}

		public Criteria andIdUtenteAggiornamentoLessThan(Long value) {
			addCriterion("id_utente_aggiornamento <", value, "idUtenteAggiornamento");
			return (Criteria) this;
		}

		public Criteria andIdUtenteAggiornamentoLessThanOrEqualTo(Long value) {
			addCriterion("id_utente_aggiornamento <=", value, "idUtenteAggiornamento");
			return (Criteria) this;
		}

		public Criteria andIdUtenteAggiornamentoIn(List<Long> values) {
			addCriterion("id_utente_aggiornamento in", values, "idUtenteAggiornamento");
			return (Criteria) this;
		}

		public Criteria andIdUtenteAggiornamentoNotIn(List<Long> values) {
			addCriterion("id_utente_aggiornamento not in", values, "idUtenteAggiornamento");
			return (Criteria) this;
		}

		public Criteria andIdUtenteAggiornamentoBetween(Long value1, Long value2) {
			addCriterion("id_utente_aggiornamento between", value1, value2, "idUtenteAggiornamento");
			return (Criteria) this;
		}

		public Criteria andIdUtenteAggiornamentoNotBetween(Long value1, Long value2) {
			addCriterion("id_utente_aggiornamento not between", value1, value2, "idUtenteAggiornamento");
			return (Criteria) this;
		}

		public Criteria andDataAggiornamentoIsNull() {
			addCriterion("data_aggiornamento is null");
			return (Criteria) this;
		}

		public Criteria andDataAggiornamentoIsNotNull() {
			addCriterion("data_aggiornamento is not null");
			return (Criteria) this;
		}

		public Criteria andDataAggiornamentoEqualTo(Date value) {
			addCriterion("data_aggiornamento =", value, "dataAggiornamento");
			return (Criteria) this;
		}

		public Criteria andDataAggiornamentoNotEqualTo(Date value) {
			addCriterion("data_aggiornamento <>", value, "dataAggiornamento");
			return (Criteria) this;
		}

		public Criteria andDataAggiornamentoGreaterThan(Date value) {
			addCriterion("data_aggiornamento >", value, "dataAggiornamento");
			return (Criteria) this;
		}

		public Criteria andDataAggiornamentoGreaterThanOrEqualTo(Date value) {
			addCriterion("data_aggiornamento >=", value, "dataAggiornamento");
			return (Criteria) this;
		}

		public Criteria andDataAggiornamentoLessThan(Date value) {
			addCriterion("data_aggiornamento <", value, "dataAggiornamento");
			return (Criteria) this;
		}

		public Criteria andDataAggiornamentoLessThanOrEqualTo(Date value) {
			addCriterion("data_aggiornamento <=", value, "dataAggiornamento");
			return (Criteria) this;
		}

		public Criteria andDataAggiornamentoIn(List<Date> values) {
			addCriterion("data_aggiornamento in", values, "dataAggiornamento");
			return (Criteria) this;
		}

		public Criteria andDataAggiornamentoNotIn(List<Date> values) {
			addCriterion("data_aggiornamento not in", values, "dataAggiornamento");
			return (Criteria) this;
		}

		public Criteria andDataAggiornamentoBetween(Date value1, Date value2) {
			addCriterion("data_aggiornamento between", value1, value2, "dataAggiornamento");
			return (Criteria) this;
		}

		public Criteria andDataAggiornamentoNotBetween(Date value1, Date value2) {
			addCriterion("data_aggiornamento not between", value1, value2, "dataAggiornamento");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table rebusc_t_contribuzione
	 * @mbg.generated  Wed Mar 02 17:39:34 CET 2022
	 */
	public static class Criterion {
		private String condition;
		private Object value;
		private Object secondValue;
		private boolean noValue;
		private boolean singleValue;
		private boolean betweenValue;
		private boolean listValue;
		private String typeHandler;

		public String getCondition() {
			return condition;
		}

		public Object getValue() {
			return value;
		}

		public Object getSecondValue() {
			return secondValue;
		}

		public boolean isNoValue() {
			return noValue;
		}

		public boolean isSingleValue() {
			return singleValue;
		}

		public boolean isBetweenValue() {
			return betweenValue;
		}

		public boolean isListValue() {
			return listValue;
		}

		public String getTypeHandler() {
			return typeHandler;
		}

		protected Criterion(String condition) {
			super();
			this.condition = condition;
			this.typeHandler = null;
			this.noValue = true;
		}

		protected Criterion(String condition, Object value, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.typeHandler = typeHandler;
			if (value instanceof List<?>) {
				this.listValue = true;
			} else {
				this.singleValue = true;
			}
		}

		protected Criterion(String condition, Object value) {
			this(condition, value, null);
		}

		protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.secondValue = secondValue;
			this.typeHandler = typeHandler;
			this.betweenValue = true;
		}

		protected Criterion(String condition, Object value, Object secondValue) {
			this(condition, value, secondValue, null);
		}
	}

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table rebusc_t_contribuzione
     *
     * @mbg.generated do_not_delete_during_merge Wed Nov 24 17:39:06 CET 2021
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }
}