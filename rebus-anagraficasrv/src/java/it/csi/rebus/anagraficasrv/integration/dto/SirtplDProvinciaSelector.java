/*
* SPDX-FileCopyrightText: (C) Copyright 2022 Regione Piemonte
* SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.rebus.anagraficasrv.integration.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SirtplDProvinciaSelector {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table sirtpl_d_provincia
	 * @mbg.generated  Mon Nov 04 11:33:48 CET 2019
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table sirtpl_d_provincia
	 * @mbg.generated  Mon Nov 04 11:33:48 CET 2019
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table sirtpl_d_provincia
	 * @mbg.generated  Mon Nov 04 11:33:48 CET 2019
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sirtpl_d_provincia
	 * @mbg.generated  Mon Nov 04 11:33:48 CET 2019
	 */
	public SirtplDProvinciaSelector() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sirtpl_d_provincia
	 * @mbg.generated  Mon Nov 04 11:33:48 CET 2019
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sirtpl_d_provincia
	 * @mbg.generated  Mon Nov 04 11:33:48 CET 2019
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sirtpl_d_provincia
	 * @mbg.generated  Mon Nov 04 11:33:48 CET 2019
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sirtpl_d_provincia
	 * @mbg.generated  Mon Nov 04 11:33:48 CET 2019
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sirtpl_d_provincia
	 * @mbg.generated  Mon Nov 04 11:33:48 CET 2019
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sirtpl_d_provincia
	 * @mbg.generated  Mon Nov 04 11:33:48 CET 2019
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sirtpl_d_provincia
	 * @mbg.generated  Mon Nov 04 11:33:48 CET 2019
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sirtpl_d_provincia
	 * @mbg.generated  Mon Nov 04 11:33:48 CET 2019
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sirtpl_d_provincia
	 * @mbg.generated  Mon Nov 04 11:33:48 CET 2019
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sirtpl_d_provincia
	 * @mbg.generated  Mon Nov 04 11:33:48 CET 2019
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table sirtpl_d_provincia
	 * @mbg.generated  Mon Nov 04 11:33:48 CET 2019
	 */
	protected abstract static class GeneratedCriteria {
		protected List<Criterion> criteria;

		protected GeneratedCriteria() {
			super();
			criteria = new ArrayList<Criterion>();
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

		protected void addCriterionForJDBCDate(String condition, Date value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			addCriterion(condition, new java.sql.Date(value.getTime()), property);
		}

		protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
			if (values == null || values.size() == 0) {
				throw new RuntimeException("Value list for " + property + " cannot be null or empty");
			}
			List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
			Iterator<Date> iter = values.iterator();
			while (iter.hasNext()) {
				dateList.add(new java.sql.Date(iter.next().getTime()));
			}
			addCriterion(condition, dateList, property);
		}

		protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
		}

		public Criteria andIdProvinciaIsNull() {
			addCriterion("id_provincia is null");
			return (Criteria) this;
		}

		public Criteria andIdProvinciaIsNotNull() {
			addCriterion("id_provincia is not null");
			return (Criteria) this;
		}

		public Criteria andIdProvinciaEqualTo(Long value) {
			addCriterion("id_provincia =", value, "idProvincia");
			return (Criteria) this;
		}

		public Criteria andIdProvinciaNotEqualTo(Long value) {
			addCriterion("id_provincia <>", value, "idProvincia");
			return (Criteria) this;
		}

		public Criteria andIdProvinciaGreaterThan(Long value) {
			addCriterion("id_provincia >", value, "idProvincia");
			return (Criteria) this;
		}

		public Criteria andIdProvinciaGreaterThanOrEqualTo(Long value) {
			addCriterion("id_provincia >=", value, "idProvincia");
			return (Criteria) this;
		}

		public Criteria andIdProvinciaLessThan(Long value) {
			addCriterion("id_provincia <", value, "idProvincia");
			return (Criteria) this;
		}

		public Criteria andIdProvinciaLessThanOrEqualTo(Long value) {
			addCriterion("id_provincia <=", value, "idProvincia");
			return (Criteria) this;
		}

		public Criteria andIdProvinciaIn(List<Long> values) {
			addCriterion("id_provincia in", values, "idProvincia");
			return (Criteria) this;
		}

		public Criteria andIdProvinciaNotIn(List<Long> values) {
			addCriterion("id_provincia not in", values, "idProvincia");
			return (Criteria) this;
		}

		public Criteria andIdProvinciaBetween(Long value1, Long value2) {
			addCriterion("id_provincia between", value1, value2, "idProvincia");
			return (Criteria) this;
		}

		public Criteria andIdProvinciaNotBetween(Long value1, Long value2) {
			addCriterion("id_provincia not between", value1, value2, "idProvincia");
			return (Criteria) this;
		}

		public Criteria andCodIstatProvinciaIsNull() {
			addCriterion("cod_istat_provincia is null");
			return (Criteria) this;
		}

		public Criteria andCodIstatProvinciaIsNotNull() {
			addCriterion("cod_istat_provincia is not null");
			return (Criteria) this;
		}

		public Criteria andCodIstatProvinciaEqualTo(String value) {
			addCriterion("cod_istat_provincia =", value, "codIstatProvincia");
			return (Criteria) this;
		}

		public Criteria andCodIstatProvinciaNotEqualTo(String value) {
			addCriterion("cod_istat_provincia <>", value, "codIstatProvincia");
			return (Criteria) this;
		}

		public Criteria andCodIstatProvinciaGreaterThan(String value) {
			addCriterion("cod_istat_provincia >", value, "codIstatProvincia");
			return (Criteria) this;
		}

		public Criteria andCodIstatProvinciaGreaterThanOrEqualTo(String value) {
			addCriterion("cod_istat_provincia >=", value, "codIstatProvincia");
			return (Criteria) this;
		}

		public Criteria andCodIstatProvinciaLessThan(String value) {
			addCriterion("cod_istat_provincia <", value, "codIstatProvincia");
			return (Criteria) this;
		}

		public Criteria andCodIstatProvinciaLessThanOrEqualTo(String value) {
			addCriterion("cod_istat_provincia <=", value, "codIstatProvincia");
			return (Criteria) this;
		}

		public Criteria andCodIstatProvinciaLike(String value) {
			addCriterion("cod_istat_provincia like", value, "codIstatProvincia");
			return (Criteria) this;
		}

		public Criteria andCodIstatProvinciaNotLike(String value) {
			addCriterion("cod_istat_provincia not like", value, "codIstatProvincia");
			return (Criteria) this;
		}

		public Criteria andCodIstatProvinciaIn(List<String> values) {
			addCriterion("cod_istat_provincia in", values, "codIstatProvincia");
			return (Criteria) this;
		}

		public Criteria andCodIstatProvinciaNotIn(List<String> values) {
			addCriterion("cod_istat_provincia not in", values, "codIstatProvincia");
			return (Criteria) this;
		}

		public Criteria andCodIstatProvinciaBetween(String value1, String value2) {
			addCriterion("cod_istat_provincia between", value1, value2, "codIstatProvincia");
			return (Criteria) this;
		}

		public Criteria andCodIstatProvinciaNotBetween(String value1, String value2) {
			addCriterion("cod_istat_provincia not between", value1, value2, "codIstatProvincia");
			return (Criteria) this;
		}

		public Criteria andDenomProvinciaIsNull() {
			addCriterion("denom_provincia is null");
			return (Criteria) this;
		}

		public Criteria andDenomProvinciaIsNotNull() {
			addCriterion("denom_provincia is not null");
			return (Criteria) this;
		}

		public Criteria andDenomProvinciaEqualTo(String value) {
			addCriterion("denom_provincia =", value, "denomProvincia");
			return (Criteria) this;
		}

		public Criteria andDenomProvinciaNotEqualTo(String value) {
			addCriterion("denom_provincia <>", value, "denomProvincia");
			return (Criteria) this;
		}

		public Criteria andDenomProvinciaGreaterThan(String value) {
			addCriterion("denom_provincia >", value, "denomProvincia");
			return (Criteria) this;
		}

		public Criteria andDenomProvinciaGreaterThanOrEqualTo(String value) {
			addCriterion("denom_provincia >=", value, "denomProvincia");
			return (Criteria) this;
		}

		public Criteria andDenomProvinciaLessThan(String value) {
			addCriterion("denom_provincia <", value, "denomProvincia");
			return (Criteria) this;
		}

		public Criteria andDenomProvinciaLessThanOrEqualTo(String value) {
			addCriterion("denom_provincia <=", value, "denomProvincia");
			return (Criteria) this;
		}

		public Criteria andDenomProvinciaLike(String value) {
			addCriterion("denom_provincia like", value, "denomProvincia");
			return (Criteria) this;
		}

		public Criteria andDenomProvinciaNotLike(String value) {
			addCriterion("denom_provincia not like", value, "denomProvincia");
			return (Criteria) this;
		}

		public Criteria andDenomProvinciaIn(List<String> values) {
			addCriterion("denom_provincia in", values, "denomProvincia");
			return (Criteria) this;
		}

		public Criteria andDenomProvinciaNotIn(List<String> values) {
			addCriterion("denom_provincia not in", values, "denomProvincia");
			return (Criteria) this;
		}

		public Criteria andDenomProvinciaBetween(String value1, String value2) {
			addCriterion("denom_provincia between", value1, value2, "denomProvincia");
			return (Criteria) this;
		}

		public Criteria andDenomProvinciaNotBetween(String value1, String value2) {
			addCriterion("denom_provincia not between", value1, value2, "denomProvincia");
			return (Criteria) this;
		}

		public Criteria andSiglaProvinciaIsNull() {
			addCriterion("sigla_provincia is null");
			return (Criteria) this;
		}

		public Criteria andSiglaProvinciaIsNotNull() {
			addCriterion("sigla_provincia is not null");
			return (Criteria) this;
		}

		public Criteria andSiglaProvinciaEqualTo(String value) {
			addCriterion("sigla_provincia =", value, "siglaProvincia");
			return (Criteria) this;
		}

		public Criteria andSiglaProvinciaNotEqualTo(String value) {
			addCriterion("sigla_provincia <>", value, "siglaProvincia");
			return (Criteria) this;
		}

		public Criteria andSiglaProvinciaGreaterThan(String value) {
			addCriterion("sigla_provincia >", value, "siglaProvincia");
			return (Criteria) this;
		}

		public Criteria andSiglaProvinciaGreaterThanOrEqualTo(String value) {
			addCriterion("sigla_provincia >=", value, "siglaProvincia");
			return (Criteria) this;
		}

		public Criteria andSiglaProvinciaLessThan(String value) {
			addCriterion("sigla_provincia <", value, "siglaProvincia");
			return (Criteria) this;
		}

		public Criteria andSiglaProvinciaLessThanOrEqualTo(String value) {
			addCriterion("sigla_provincia <=", value, "siglaProvincia");
			return (Criteria) this;
		}

		public Criteria andSiglaProvinciaLike(String value) {
			addCriterion("sigla_provincia like", value, "siglaProvincia");
			return (Criteria) this;
		}

		public Criteria andSiglaProvinciaNotLike(String value) {
			addCriterion("sigla_provincia not like", value, "siglaProvincia");
			return (Criteria) this;
		}

		public Criteria andSiglaProvinciaIn(List<String> values) {
			addCriterion("sigla_provincia in", values, "siglaProvincia");
			return (Criteria) this;
		}

		public Criteria andSiglaProvinciaNotIn(List<String> values) {
			addCriterion("sigla_provincia not in", values, "siglaProvincia");
			return (Criteria) this;
		}

		public Criteria andSiglaProvinciaBetween(String value1, String value2) {
			addCriterion("sigla_provincia between", value1, value2, "siglaProvincia");
			return (Criteria) this;
		}

		public Criteria andSiglaProvinciaNotBetween(String value1, String value2) {
			addCriterion("sigla_provincia not between", value1, value2, "siglaProvincia");
			return (Criteria) this;
		}

		public Criteria andIdRegioneIsNull() {
			addCriterion("id_regione is null");
			return (Criteria) this;
		}

		public Criteria andIdRegioneIsNotNull() {
			addCriterion("id_regione is not null");
			return (Criteria) this;
		}

		public Criteria andIdRegioneEqualTo(Long value) {
			addCriterion("id_regione =", value, "idRegione");
			return (Criteria) this;
		}

		public Criteria andIdRegioneNotEqualTo(Long value) {
			addCriterion("id_regione <>", value, "idRegione");
			return (Criteria) this;
		}

		public Criteria andIdRegioneGreaterThan(Long value) {
			addCriterion("id_regione >", value, "idRegione");
			return (Criteria) this;
		}

		public Criteria andIdRegioneGreaterThanOrEqualTo(Long value) {
			addCriterion("id_regione >=", value, "idRegione");
			return (Criteria) this;
		}

		public Criteria andIdRegioneLessThan(Long value) {
			addCriterion("id_regione <", value, "idRegione");
			return (Criteria) this;
		}

		public Criteria andIdRegioneLessThanOrEqualTo(Long value) {
			addCriterion("id_regione <=", value, "idRegione");
			return (Criteria) this;
		}

		public Criteria andIdRegioneIn(List<Long> values) {
			addCriterion("id_regione in", values, "idRegione");
			return (Criteria) this;
		}

		public Criteria andIdRegioneNotIn(List<Long> values) {
			addCriterion("id_regione not in", values, "idRegione");
			return (Criteria) this;
		}

		public Criteria andIdRegioneBetween(Long value1, Long value2) {
			addCriterion("id_regione between", value1, value2, "idRegione");
			return (Criteria) this;
		}

		public Criteria andIdRegioneNotBetween(Long value1, Long value2) {
			addCriterion("id_regione not between", value1, value2, "idRegione");
			return (Criteria) this;
		}

		public Criteria andDataInizioValiditaIsNull() {
			addCriterion("data_inizio_validita is null");
			return (Criteria) this;
		}

		public Criteria andDataInizioValiditaIsNotNull() {
			addCriterion("data_inizio_validita is not null");
			return (Criteria) this;
		}

		public Criteria andDataInizioValiditaEqualTo(Date value) {
			addCriterionForJDBCDate("data_inizio_validita =", value, "dataInizioValidita");
			return (Criteria) this;
		}

		public Criteria andDataInizioValiditaNotEqualTo(Date value) {
			addCriterionForJDBCDate("data_inizio_validita <>", value, "dataInizioValidita");
			return (Criteria) this;
		}

		public Criteria andDataInizioValiditaGreaterThan(Date value) {
			addCriterionForJDBCDate("data_inizio_validita >", value, "dataInizioValidita");
			return (Criteria) this;
		}

		public Criteria andDataInizioValiditaGreaterThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("data_inizio_validita >=", value, "dataInizioValidita");
			return (Criteria) this;
		}

		public Criteria andDataInizioValiditaLessThan(Date value) {
			addCriterionForJDBCDate("data_inizio_validita <", value, "dataInizioValidita");
			return (Criteria) this;
		}

		public Criteria andDataInizioValiditaLessThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("data_inizio_validita <=", value, "dataInizioValidita");
			return (Criteria) this;
		}

		public Criteria andDataInizioValiditaIn(List<Date> values) {
			addCriterionForJDBCDate("data_inizio_validita in", values, "dataInizioValidita");
			return (Criteria) this;
		}

		public Criteria andDataInizioValiditaNotIn(List<Date> values) {
			addCriterionForJDBCDate("data_inizio_validita not in", values, "dataInizioValidita");
			return (Criteria) this;
		}

		public Criteria andDataInizioValiditaBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("data_inizio_validita between", value1, value2, "dataInizioValidita");
			return (Criteria) this;
		}

		public Criteria andDataInizioValiditaNotBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("data_inizio_validita not between", value1, value2, "dataInizioValidita");
			return (Criteria) this;
		}

		public Criteria andDataFineValiditaIsNull() {
			addCriterion("data_fine_validita is null");
			return (Criteria) this;
		}

		public Criteria andDataFineValiditaIsNotNull() {
			addCriterion("data_fine_validita is not null");
			return (Criteria) this;
		}

		public Criteria andDataFineValiditaEqualTo(Date value) {
			addCriterionForJDBCDate("data_fine_validita =", value, "dataFineValidita");
			return (Criteria) this;
		}

		public Criteria andDataFineValiditaNotEqualTo(Date value) {
			addCriterionForJDBCDate("data_fine_validita <>", value, "dataFineValidita");
			return (Criteria) this;
		}

		public Criteria andDataFineValiditaGreaterThan(Date value) {
			addCriterionForJDBCDate("data_fine_validita >", value, "dataFineValidita");
			return (Criteria) this;
		}

		public Criteria andDataFineValiditaGreaterThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("data_fine_validita >=", value, "dataFineValidita");
			return (Criteria) this;
		}

		public Criteria andDataFineValiditaLessThan(Date value) {
			addCriterionForJDBCDate("data_fine_validita <", value, "dataFineValidita");
			return (Criteria) this;
		}

		public Criteria andDataFineValiditaLessThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("data_fine_validita <=", value, "dataFineValidita");
			return (Criteria) this;
		}

		public Criteria andDataFineValiditaIn(List<Date> values) {
			addCriterionForJDBCDate("data_fine_validita in", values, "dataFineValidita");
			return (Criteria) this;
		}

		public Criteria andDataFineValiditaNotIn(List<Date> values) {
			addCriterionForJDBCDate("data_fine_validita not in", values, "dataFineValidita");
			return (Criteria) this;
		}

		public Criteria andDataFineValiditaBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("data_fine_validita between", value1, value2, "dataFineValidita");
			return (Criteria) this;
		}

		public Criteria andDataFineValiditaNotBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("data_fine_validita not between", value1, value2, "dataFineValidita");
			return (Criteria) this;
		}

		public Criteria andCodIstatProvinciaLikeInsensitive(String value) {
			addCriterion("upper(cod_istat_provincia) like", value.toUpperCase(), "codIstatProvincia");
			return (Criteria) this;
		}

		public Criteria andDenomProvinciaLikeInsensitive(String value) {
			addCriterion("upper(denom_provincia) like", value.toUpperCase(), "denomProvincia");
			return (Criteria) this;
		}

		public Criteria andSiglaProvinciaLikeInsensitive(String value) {
			addCriterion("upper(sigla_provincia) like", value.toUpperCase(), "siglaProvincia");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table sirtpl_d_provincia
	 * @mbg.generated  Mon Nov 04 11:33:48 CET 2019
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
     * This class corresponds to the database table sirtpl_d_provincia
     *
     * @mbg.generated do_not_delete_during_merge Mon Oct 21 14:07:51 CEST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}