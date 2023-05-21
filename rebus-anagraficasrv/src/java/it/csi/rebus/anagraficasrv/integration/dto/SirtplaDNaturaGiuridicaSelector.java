/*
* SPDX-FileCopyrightText: (C) Copyright 2022 Regione Piemonte
* SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.rebus.anagraficasrv.integration.dto;

import java.util.ArrayList;
import java.util.List;

public class SirtplaDNaturaGiuridicaSelector {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table sirtpla_d_natura_giuridica
	 * @mbg.generated  Thu May 07 10:24:01 CEST 2020
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table sirtpla_d_natura_giuridica
	 * @mbg.generated  Thu May 07 10:24:01 CEST 2020
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table sirtpla_d_natura_giuridica
	 * @mbg.generated  Thu May 07 10:24:01 CEST 2020
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sirtpla_d_natura_giuridica
	 * @mbg.generated  Thu May 07 10:24:01 CEST 2020
	 */
	public SirtplaDNaturaGiuridicaSelector() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sirtpla_d_natura_giuridica
	 * @mbg.generated  Thu May 07 10:24:01 CEST 2020
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sirtpla_d_natura_giuridica
	 * @mbg.generated  Thu May 07 10:24:01 CEST 2020
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sirtpla_d_natura_giuridica
	 * @mbg.generated  Thu May 07 10:24:01 CEST 2020
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sirtpla_d_natura_giuridica
	 * @mbg.generated  Thu May 07 10:24:01 CEST 2020
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sirtpla_d_natura_giuridica
	 * @mbg.generated  Thu May 07 10:24:01 CEST 2020
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sirtpla_d_natura_giuridica
	 * @mbg.generated  Thu May 07 10:24:01 CEST 2020
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sirtpla_d_natura_giuridica
	 * @mbg.generated  Thu May 07 10:24:01 CEST 2020
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sirtpla_d_natura_giuridica
	 * @mbg.generated  Thu May 07 10:24:01 CEST 2020
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sirtpla_d_natura_giuridica
	 * @mbg.generated  Thu May 07 10:24:01 CEST 2020
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sirtpla_d_natura_giuridica
	 * @mbg.generated  Thu May 07 10:24:01 CEST 2020
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table sirtpla_d_natura_giuridica
	 * @mbg.generated  Thu May 07 10:24:01 CEST 2020
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

		public Criteria andIdNaturaGiuridicaIsNull() {
			addCriterion("id_natura_giuridica is null");
			return (Criteria) this;
		}

		public Criteria andIdNaturaGiuridicaIsNotNull() {
			addCriterion("id_natura_giuridica is not null");
			return (Criteria) this;
		}

		public Criteria andIdNaturaGiuridicaEqualTo(Long value) {
			addCriterion("id_natura_giuridica =", value, "idNaturaGiuridica");
			return (Criteria) this;
		}

		public Criteria andIdNaturaGiuridicaNotEqualTo(Long value) {
			addCriterion("id_natura_giuridica <>", value, "idNaturaGiuridica");
			return (Criteria) this;
		}

		public Criteria andIdNaturaGiuridicaGreaterThan(Long value) {
			addCriterion("id_natura_giuridica >", value, "idNaturaGiuridica");
			return (Criteria) this;
		}

		public Criteria andIdNaturaGiuridicaGreaterThanOrEqualTo(Long value) {
			addCriterion("id_natura_giuridica >=", value, "idNaturaGiuridica");
			return (Criteria) this;
		}

		public Criteria andIdNaturaGiuridicaLessThan(Long value) {
			addCriterion("id_natura_giuridica <", value, "idNaturaGiuridica");
			return (Criteria) this;
		}

		public Criteria andIdNaturaGiuridicaLessThanOrEqualTo(Long value) {
			addCriterion("id_natura_giuridica <=", value, "idNaturaGiuridica");
			return (Criteria) this;
		}

		public Criteria andIdNaturaGiuridicaIn(List<Long> values) {
			addCriterion("id_natura_giuridica in", values, "idNaturaGiuridica");
			return (Criteria) this;
		}

		public Criteria andIdNaturaGiuridicaNotIn(List<Long> values) {
			addCriterion("id_natura_giuridica not in", values, "idNaturaGiuridica");
			return (Criteria) this;
		}

		public Criteria andIdNaturaGiuridicaBetween(Long value1, Long value2) {
			addCriterion("id_natura_giuridica between", value1, value2, "idNaturaGiuridica");
			return (Criteria) this;
		}

		public Criteria andIdNaturaGiuridicaNotBetween(Long value1, Long value2) {
			addCriterion("id_natura_giuridica not between", value1, value2, "idNaturaGiuridica");
			return (Criteria) this;
		}

		public Criteria andCodNaturaGiuridicaIsNull() {
			addCriterion("cod_natura_giuridica is null");
			return (Criteria) this;
		}

		public Criteria andCodNaturaGiuridicaIsNotNull() {
			addCriterion("cod_natura_giuridica is not null");
			return (Criteria) this;
		}

		public Criteria andCodNaturaGiuridicaEqualTo(String value) {
			addCriterion("cod_natura_giuridica =", value, "codNaturaGiuridica");
			return (Criteria) this;
		}

		public Criteria andCodNaturaGiuridicaNotEqualTo(String value) {
			addCriterion("cod_natura_giuridica <>", value, "codNaturaGiuridica");
			return (Criteria) this;
		}

		public Criteria andCodNaturaGiuridicaGreaterThan(String value) {
			addCriterion("cod_natura_giuridica >", value, "codNaturaGiuridica");
			return (Criteria) this;
		}

		public Criteria andCodNaturaGiuridicaGreaterThanOrEqualTo(String value) {
			addCriterion("cod_natura_giuridica >=", value, "codNaturaGiuridica");
			return (Criteria) this;
		}

		public Criteria andCodNaturaGiuridicaLessThan(String value) {
			addCriterion("cod_natura_giuridica <", value, "codNaturaGiuridica");
			return (Criteria) this;
		}

		public Criteria andCodNaturaGiuridicaLessThanOrEqualTo(String value) {
			addCriterion("cod_natura_giuridica <=", value, "codNaturaGiuridica");
			return (Criteria) this;
		}

		public Criteria andCodNaturaGiuridicaLike(String value) {
			addCriterion("cod_natura_giuridica like", value, "codNaturaGiuridica");
			return (Criteria) this;
		}

		public Criteria andCodNaturaGiuridicaNotLike(String value) {
			addCriterion("cod_natura_giuridica not like", value, "codNaturaGiuridica");
			return (Criteria) this;
		}

		public Criteria andCodNaturaGiuridicaIn(List<String> values) {
			addCriterion("cod_natura_giuridica in", values, "codNaturaGiuridica");
			return (Criteria) this;
		}

		public Criteria andCodNaturaGiuridicaNotIn(List<String> values) {
			addCriterion("cod_natura_giuridica not in", values, "codNaturaGiuridica");
			return (Criteria) this;
		}

		public Criteria andCodNaturaGiuridicaBetween(String value1, String value2) {
			addCriterion("cod_natura_giuridica between", value1, value2, "codNaturaGiuridica");
			return (Criteria) this;
		}

		public Criteria andCodNaturaGiuridicaNotBetween(String value1, String value2) {
			addCriterion("cod_natura_giuridica not between", value1, value2, "codNaturaGiuridica");
			return (Criteria) this;
		}

		public Criteria andDescNaturaGiuridicaIsNull() {
			addCriterion("desc_natura_giuridica is null");
			return (Criteria) this;
		}

		public Criteria andDescNaturaGiuridicaIsNotNull() {
			addCriterion("desc_natura_giuridica is not null");
			return (Criteria) this;
		}

		public Criteria andDescNaturaGiuridicaEqualTo(String value) {
			addCriterion("desc_natura_giuridica =", value, "descNaturaGiuridica");
			return (Criteria) this;
		}

		public Criteria andDescNaturaGiuridicaNotEqualTo(String value) {
			addCriterion("desc_natura_giuridica <>", value, "descNaturaGiuridica");
			return (Criteria) this;
		}

		public Criteria andDescNaturaGiuridicaGreaterThan(String value) {
			addCriterion("desc_natura_giuridica >", value, "descNaturaGiuridica");
			return (Criteria) this;
		}

		public Criteria andDescNaturaGiuridicaGreaterThanOrEqualTo(String value) {
			addCriterion("desc_natura_giuridica >=", value, "descNaturaGiuridica");
			return (Criteria) this;
		}

		public Criteria andDescNaturaGiuridicaLessThan(String value) {
			addCriterion("desc_natura_giuridica <", value, "descNaturaGiuridica");
			return (Criteria) this;
		}

		public Criteria andDescNaturaGiuridicaLessThanOrEqualTo(String value) {
			addCriterion("desc_natura_giuridica <=", value, "descNaturaGiuridica");
			return (Criteria) this;
		}

		public Criteria andDescNaturaGiuridicaLike(String value) {
			addCriterion("desc_natura_giuridica like", value, "descNaturaGiuridica");
			return (Criteria) this;
		}

		public Criteria andDescNaturaGiuridicaNotLike(String value) {
			addCriterion("desc_natura_giuridica not like", value, "descNaturaGiuridica");
			return (Criteria) this;
		}

		public Criteria andDescNaturaGiuridicaIn(List<String> values) {
			addCriterion("desc_natura_giuridica in", values, "descNaturaGiuridica");
			return (Criteria) this;
		}

		public Criteria andDescNaturaGiuridicaNotIn(List<String> values) {
			addCriterion("desc_natura_giuridica not in", values, "descNaturaGiuridica");
			return (Criteria) this;
		}

		public Criteria andDescNaturaGiuridicaBetween(String value1, String value2) {
			addCriterion("desc_natura_giuridica between", value1, value2, "descNaturaGiuridica");
			return (Criteria) this;
		}

		public Criteria andDescNaturaGiuridicaNotBetween(String value1, String value2) {
			addCriterion("desc_natura_giuridica not between", value1, value2, "descNaturaGiuridica");
			return (Criteria) this;
		}

		public Criteria andDescBreveNaturaGiuridicaIsNull() {
			addCriterion("desc_breve_natura_giuridica is null");
			return (Criteria) this;
		}

		public Criteria andDescBreveNaturaGiuridicaIsNotNull() {
			addCriterion("desc_breve_natura_giuridica is not null");
			return (Criteria) this;
		}

		public Criteria andDescBreveNaturaGiuridicaEqualTo(String value) {
			addCriterion("desc_breve_natura_giuridica =", value, "descBreveNaturaGiuridica");
			return (Criteria) this;
		}

		public Criteria andDescBreveNaturaGiuridicaNotEqualTo(String value) {
			addCriterion("desc_breve_natura_giuridica <>", value, "descBreveNaturaGiuridica");
			return (Criteria) this;
		}

		public Criteria andDescBreveNaturaGiuridicaGreaterThan(String value) {
			addCriterion("desc_breve_natura_giuridica >", value, "descBreveNaturaGiuridica");
			return (Criteria) this;
		}

		public Criteria andDescBreveNaturaGiuridicaGreaterThanOrEqualTo(String value) {
			addCriterion("desc_breve_natura_giuridica >=", value, "descBreveNaturaGiuridica");
			return (Criteria) this;
		}

		public Criteria andDescBreveNaturaGiuridicaLessThan(String value) {
			addCriterion("desc_breve_natura_giuridica <", value, "descBreveNaturaGiuridica");
			return (Criteria) this;
		}

		public Criteria andDescBreveNaturaGiuridicaLessThanOrEqualTo(String value) {
			addCriterion("desc_breve_natura_giuridica <=", value, "descBreveNaturaGiuridica");
			return (Criteria) this;
		}

		public Criteria andDescBreveNaturaGiuridicaLike(String value) {
			addCriterion("desc_breve_natura_giuridica like", value, "descBreveNaturaGiuridica");
			return (Criteria) this;
		}

		public Criteria andDescBreveNaturaGiuridicaNotLike(String value) {
			addCriterion("desc_breve_natura_giuridica not like", value, "descBreveNaturaGiuridica");
			return (Criteria) this;
		}

		public Criteria andDescBreveNaturaGiuridicaIn(List<String> values) {
			addCriterion("desc_breve_natura_giuridica in", values, "descBreveNaturaGiuridica");
			return (Criteria) this;
		}

		public Criteria andDescBreveNaturaGiuridicaNotIn(List<String> values) {
			addCriterion("desc_breve_natura_giuridica not in", values, "descBreveNaturaGiuridica");
			return (Criteria) this;
		}

		public Criteria andDescBreveNaturaGiuridicaBetween(String value1, String value2) {
			addCriterion("desc_breve_natura_giuridica between", value1, value2, "descBreveNaturaGiuridica");
			return (Criteria) this;
		}

		public Criteria andDescBreveNaturaGiuridicaNotBetween(String value1, String value2) {
			addCriterion("desc_breve_natura_giuridica not between", value1, value2, "descBreveNaturaGiuridica");
			return (Criteria) this;
		}

		public Criteria andCodNaturaGiuridicaLikeInsensitive(String value) {
			addCriterion("upper(cod_natura_giuridica) like", value.toUpperCase(), "codNaturaGiuridica");
			return (Criteria) this;
		}

		public Criteria andDescNaturaGiuridicaLikeInsensitive(String value) {
			addCriterion("upper(desc_natura_giuridica) like", value.toUpperCase(), "descNaturaGiuridica");
			return (Criteria) this;
		}

		public Criteria andDescBreveNaturaGiuridicaLikeInsensitive(String value) {
			addCriterion("upper(desc_breve_natura_giuridica) like", value.toUpperCase(), "descBreveNaturaGiuridica");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table sirtpla_d_natura_giuridica
	 * @mbg.generated  Thu May 07 10:24:01 CEST 2020
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
     * This class corresponds to the database table sirtpla_d_natura_giuridica
     *
     * @mbg.generated do_not_delete_during_merge Mon Oct 21 14:07:51 CEST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}