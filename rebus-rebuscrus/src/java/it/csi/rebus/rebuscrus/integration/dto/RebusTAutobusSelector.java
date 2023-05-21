/*
* SPDX-FileCopyrightText: (C) Copyright 2022 Regione Piemonte
* SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.rebus.rebuscrus.integration.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class RebusTAutobusSelector {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table rebus_t_autobus
	 * @mbg.generated  Mon Jan 03 15:45:40 CET 2022
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table rebus_t_autobus
	 * @mbg.generated  Mon Jan 03 15:45:40 CET 2022
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table rebus_t_autobus
	 * @mbg.generated  Mon Jan 03 15:45:40 CET 2022
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table rebus_t_autobus
	 * @mbg.generated  Mon Jan 03 15:45:40 CET 2022
	 */
	public RebusTAutobusSelector() {
		oredCriteria = new ArrayList<>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table rebus_t_autobus
	 * @mbg.generated  Mon Jan 03 15:45:40 CET 2022
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table rebus_t_autobus
	 * @mbg.generated  Mon Jan 03 15:45:40 CET 2022
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table rebus_t_autobus
	 * @mbg.generated  Mon Jan 03 15:45:40 CET 2022
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table rebus_t_autobus
	 * @mbg.generated  Mon Jan 03 15:45:40 CET 2022
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table rebus_t_autobus
	 * @mbg.generated  Mon Jan 03 15:45:40 CET 2022
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table rebus_t_autobus
	 * @mbg.generated  Mon Jan 03 15:45:40 CET 2022
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table rebus_t_autobus
	 * @mbg.generated  Mon Jan 03 15:45:40 CET 2022
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table rebus_t_autobus
	 * @mbg.generated  Mon Jan 03 15:45:40 CET 2022
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table rebus_t_autobus
	 * @mbg.generated  Mon Jan 03 15:45:40 CET 2022
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table rebus_t_autobus
	 * @mbg.generated  Mon Jan 03 15:45:40 CET 2022
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table rebus_t_autobus
	 * @mbg.generated  Mon Jan 03 15:45:40 CET 2022
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
			List<java.sql.Date> dateList = new ArrayList<>();
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

		public Criteria andPrimoTelaioIsNull() {
			addCriterion("primo_telaio is null");
			return (Criteria) this;
		}

		public Criteria andPrimoTelaioIsNotNull() {
			addCriterion("primo_telaio is not null");
			return (Criteria) this;
		}

		public Criteria andPrimoTelaioEqualTo(String value) {
			addCriterion("primo_telaio =", value, "primoTelaio");
			return (Criteria) this;
		}

		public Criteria andPrimoTelaioNotEqualTo(String value) {
			addCriterion("primo_telaio <>", value, "primoTelaio");
			return (Criteria) this;
		}

		public Criteria andPrimoTelaioGreaterThan(String value) {
			addCriterion("primo_telaio >", value, "primoTelaio");
			return (Criteria) this;
		}

		public Criteria andPrimoTelaioGreaterThanOrEqualTo(String value) {
			addCriterion("primo_telaio >=", value, "primoTelaio");
			return (Criteria) this;
		}

		public Criteria andPrimoTelaioLessThan(String value) {
			addCriterion("primo_telaio <", value, "primoTelaio");
			return (Criteria) this;
		}

		public Criteria andPrimoTelaioLessThanOrEqualTo(String value) {
			addCriterion("primo_telaio <=", value, "primoTelaio");
			return (Criteria) this;
		}

		public Criteria andPrimoTelaioLike(String value) {
			addCriterion("primo_telaio like", value, "primoTelaio");
			return (Criteria) this;
		}

		public Criteria andPrimoTelaioNotLike(String value) {
			addCriterion("primo_telaio not like", value, "primoTelaio");
			return (Criteria) this;
		}

		public Criteria andPrimoTelaioIn(List<String> values) {
			addCriterion("primo_telaio in", values, "primoTelaio");
			return (Criteria) this;
		}

		public Criteria andPrimoTelaioNotIn(List<String> values) {
			addCriterion("primo_telaio not in", values, "primoTelaio");
			return (Criteria) this;
		}

		public Criteria andPrimoTelaioBetween(String value1, String value2) {
			addCriterion("primo_telaio between", value1, value2, "primoTelaio");
			return (Criteria) this;
		}

		public Criteria andPrimoTelaioNotBetween(String value1, String value2) {
			addCriterion("primo_telaio not between", value1, value2, "primoTelaio");
			return (Criteria) this;
		}

		public Criteria andFkBandoIsNull() {
			addCriterion("fk_bando is null");
			return (Criteria) this;
		}

		public Criteria andFkBandoIsNotNull() {
			addCriterion("fk_bando is not null");
			return (Criteria) this;
		}

		public Criteria andFkBandoEqualTo(Long value) {
			addCriterion("fk_bando =", value, "fkBando");
			return (Criteria) this;
		}

		public Criteria andFkBandoNotEqualTo(Long value) {
			addCriterion("fk_bando <>", value, "fkBando");
			return (Criteria) this;
		}

		public Criteria andFkBandoGreaterThan(Long value) {
			addCriterion("fk_bando >", value, "fkBando");
			return (Criteria) this;
		}

		public Criteria andFkBandoGreaterThanOrEqualTo(Long value) {
			addCriterion("fk_bando >=", value, "fkBando");
			return (Criteria) this;
		}

		public Criteria andFkBandoLessThan(Long value) {
			addCriterion("fk_bando <", value, "fkBando");
			return (Criteria) this;
		}

		public Criteria andFkBandoLessThanOrEqualTo(Long value) {
			addCriterion("fk_bando <=", value, "fkBando");
			return (Criteria) this;
		}

		public Criteria andFkBandoIn(List<Long> values) {
			addCriterion("fk_bando in", values, "fkBando");
			return (Criteria) this;
		}

		public Criteria andFkBandoNotIn(List<Long> values) {
			addCriterion("fk_bando not in", values, "fkBando");
			return (Criteria) this;
		}

		public Criteria andFkBandoBetween(Long value1, Long value2) {
			addCriterion("fk_bando between", value1, value2, "fkBando");
			return (Criteria) this;
		}

		public Criteria andFkBandoNotBetween(Long value1, Long value2) {
			addCriterion("fk_bando not between", value1, value2, "fkBando");
			return (Criteria) this;
		}

		public Criteria andDataPrimaImmatricolazioneIsNull() {
			addCriterion("data_prima_immatricolazione is null");
			return (Criteria) this;
		}

		public Criteria andDataPrimaImmatricolazioneIsNotNull() {
			addCriterion("data_prima_immatricolazione is not null");
			return (Criteria) this;
		}

		public Criteria andDataPrimaImmatricolazioneEqualTo(Date value) {
			addCriterionForJDBCDate("data_prima_immatricolazione =", value, "dataPrimaImmatricolazione");
			return (Criteria) this;
		}

		public Criteria andDataPrimaImmatricolazioneNotEqualTo(Date value) {
			addCriterionForJDBCDate("data_prima_immatricolazione <>", value, "dataPrimaImmatricolazione");
			return (Criteria) this;
		}

		public Criteria andDataPrimaImmatricolazioneGreaterThan(Date value) {
			addCriterionForJDBCDate("data_prima_immatricolazione >", value, "dataPrimaImmatricolazione");
			return (Criteria) this;
		}

		public Criteria andDataPrimaImmatricolazioneGreaterThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("data_prima_immatricolazione >=", value, "dataPrimaImmatricolazione");
			return (Criteria) this;
		}

		public Criteria andDataPrimaImmatricolazioneLessThan(Date value) {
			addCriterionForJDBCDate("data_prima_immatricolazione <", value, "dataPrimaImmatricolazione");
			return (Criteria) this;
		}

		public Criteria andDataPrimaImmatricolazioneLessThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("data_prima_immatricolazione <=", value, "dataPrimaImmatricolazione");
			return (Criteria) this;
		}

		public Criteria andDataPrimaImmatricolazioneIn(List<Date> values) {
			addCriterionForJDBCDate("data_prima_immatricolazione in", values, "dataPrimaImmatricolazione");
			return (Criteria) this;
		}

		public Criteria andDataPrimaImmatricolazioneNotIn(List<Date> values) {
			addCriterionForJDBCDate("data_prima_immatricolazione not in", values, "dataPrimaImmatricolazione");
			return (Criteria) this;
		}

		public Criteria andDataPrimaImmatricolazioneBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("data_prima_immatricolazione between", value1, value2, "dataPrimaImmatricolazione");
			return (Criteria) this;
		}

		public Criteria andDataPrimaImmatricolazioneNotBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("data_prima_immatricolazione not between", value1, value2,
					"dataPrimaImmatricolazione");
			return (Criteria) this;
		}

		public Criteria andMarcaIsNull() {
			addCriterion("marca is null");
			return (Criteria) this;
		}

		public Criteria andMarcaIsNotNull() {
			addCriterion("marca is not null");
			return (Criteria) this;
		}

		public Criteria andMarcaEqualTo(String value) {
			addCriterion("marca =", value, "marca");
			return (Criteria) this;
		}

		public Criteria andMarcaNotEqualTo(String value) {
			addCriterion("marca <>", value, "marca");
			return (Criteria) this;
		}

		public Criteria andMarcaGreaterThan(String value) {
			addCriterion("marca >", value, "marca");
			return (Criteria) this;
		}

		public Criteria andMarcaGreaterThanOrEqualTo(String value) {
			addCriterion("marca >=", value, "marca");
			return (Criteria) this;
		}

		public Criteria andMarcaLessThan(String value) {
			addCriterion("marca <", value, "marca");
			return (Criteria) this;
		}

		public Criteria andMarcaLessThanOrEqualTo(String value) {
			addCriterion("marca <=", value, "marca");
			return (Criteria) this;
		}

		public Criteria andMarcaLike(String value) {
			addCriterion("marca like", value, "marca");
			return (Criteria) this;
		}

		public Criteria andMarcaNotLike(String value) {
			addCriterion("marca not like", value, "marca");
			return (Criteria) this;
		}

		public Criteria andMarcaIn(List<String> values) {
			addCriterion("marca in", values, "marca");
			return (Criteria) this;
		}

		public Criteria andMarcaNotIn(List<String> values) {
			addCriterion("marca not in", values, "marca");
			return (Criteria) this;
		}

		public Criteria andMarcaBetween(String value1, String value2) {
			addCriterion("marca between", value1, value2, "marca");
			return (Criteria) this;
		}

		public Criteria andMarcaNotBetween(String value1, String value2) {
			addCriterion("marca not between", value1, value2, "marca");
			return (Criteria) this;
		}

		public Criteria andModelloIsNull() {
			addCriterion("modello is null");
			return (Criteria) this;
		}

		public Criteria andModelloIsNotNull() {
			addCriterion("modello is not null");
			return (Criteria) this;
		}

		public Criteria andModelloEqualTo(String value) {
			addCriterion("modello =", value, "modello");
			return (Criteria) this;
		}

		public Criteria andModelloNotEqualTo(String value) {
			addCriterion("modello <>", value, "modello");
			return (Criteria) this;
		}

		public Criteria andModelloGreaterThan(String value) {
			addCriterion("modello >", value, "modello");
			return (Criteria) this;
		}

		public Criteria andModelloGreaterThanOrEqualTo(String value) {
			addCriterion("modello >=", value, "modello");
			return (Criteria) this;
		}

		public Criteria andModelloLessThan(String value) {
			addCriterion("modello <", value, "modello");
			return (Criteria) this;
		}

		public Criteria andModelloLessThanOrEqualTo(String value) {
			addCriterion("modello <=", value, "modello");
			return (Criteria) this;
		}

		public Criteria andModelloLike(String value) {
			addCriterion("modello like", value, "modello");
			return (Criteria) this;
		}

		public Criteria andModelloNotLike(String value) {
			addCriterion("modello not like", value, "modello");
			return (Criteria) this;
		}

		public Criteria andModelloIn(List<String> values) {
			addCriterion("modello in", values, "modello");
			return (Criteria) this;
		}

		public Criteria andModelloNotIn(List<String> values) {
			addCriterion("modello not in", values, "modello");
			return (Criteria) this;
		}

		public Criteria andModelloBetween(String value1, String value2) {
			addCriterion("modello between", value1, value2, "modello");
			return (Criteria) this;
		}

		public Criteria andModelloNotBetween(String value1, String value2) {
			addCriterion("modello not between", value1, value2, "modello");
			return (Criteria) this;
		}

		public Criteria andPrimoTelaioLikeInsensitive(String value) {
			addCriterion("upper(primo_telaio) like", value.toUpperCase(), "primoTelaio");
			return (Criteria) this;
		}

		public Criteria andMarcaLikeInsensitive(String value) {
			addCriterion("upper(marca) like", value.toUpperCase(), "marca");
			return (Criteria) this;
		}

		public Criteria andModelloLikeInsensitive(String value) {
			addCriterion("upper(modello) like", value.toUpperCase(), "modello");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table rebus_t_autobus
	 * @mbg.generated  Mon Jan 03 15:45:40 CET 2022
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
     * This class corresponds to the database table rebus_t_autobus
     *
     * @mbg.generated do_not_delete_during_merge Mon Oct 21 17:22:07 CEST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}