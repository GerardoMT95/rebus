/*
* SPDX-FileCopyrightText: (C) Copyright 2022 Regione Piemonte
* SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.rebus.rebuscrus.integration.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RebuspRProcContrattoSelector {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table rebusp_r_proc_contratto
     *
     * @mbg.generated Wed Jan 22 16:49:54 CET 2020
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table rebusp_r_proc_contratto
     *
     * @mbg.generated Wed Jan 22 16:49:54 CET 2020
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table rebusp_r_proc_contratto
     *
     * @mbg.generated Wed Jan 22 16:49:54 CET 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rebusp_r_proc_contratto
     *
     * @mbg.generated Wed Jan 22 16:49:54 CET 2020
     */
    public RebuspRProcContrattoSelector() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rebusp_r_proc_contratto
     *
     * @mbg.generated Wed Jan 22 16:49:54 CET 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rebusp_r_proc_contratto
     *
     * @mbg.generated Wed Jan 22 16:49:54 CET 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rebusp_r_proc_contratto
     *
     * @mbg.generated Wed Jan 22 16:49:54 CET 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rebusp_r_proc_contratto
     *
     * @mbg.generated Wed Jan 22 16:49:54 CET 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rebusp_r_proc_contratto
     *
     * @mbg.generated Wed Jan 22 16:49:54 CET 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rebusp_r_proc_contratto
     *
     * @mbg.generated Wed Jan 22 16:49:54 CET 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rebusp_r_proc_contratto
     *
     * @mbg.generated Wed Jan 22 16:49:54 CET 2020
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rebusp_r_proc_contratto
     *
     * @mbg.generated Wed Jan 22 16:49:54 CET 2020
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rebusp_r_proc_contratto
     *
     * @mbg.generated Wed Jan 22 16:49:54 CET 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rebusp_r_proc_contratto
     *
     * @mbg.generated Wed Jan 22 16:49:54 CET 2020
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table rebusp_r_proc_contratto
     *
     * @mbg.generated Wed Jan 22 16:49:54 CET 2020
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

        public Criteria andIdProcContrattoIsNull() {
            addCriterion("id_proc_contratto is null");
            return (Criteria) this;
        }

        public Criteria andIdProcContrattoIsNotNull() {
            addCriterion("id_proc_contratto is not null");
            return (Criteria) this;
        }

        public Criteria andIdProcContrattoEqualTo(Long value) {
            addCriterion("id_proc_contratto =", value, "idProcContratto");
            return (Criteria) this;
        }

        public Criteria andIdProcContrattoNotEqualTo(Long value) {
            addCriterion("id_proc_contratto <>", value, "idProcContratto");
            return (Criteria) this;
        }

        public Criteria andIdProcContrattoGreaterThan(Long value) {
            addCriterion("id_proc_contratto >", value, "idProcContratto");
            return (Criteria) this;
        }

        public Criteria andIdProcContrattoGreaterThanOrEqualTo(Long value) {
            addCriterion("id_proc_contratto >=", value, "idProcContratto");
            return (Criteria) this;
        }

        public Criteria andIdProcContrattoLessThan(Long value) {
            addCriterion("id_proc_contratto <", value, "idProcContratto");
            return (Criteria) this;
        }

        public Criteria andIdProcContrattoLessThanOrEqualTo(Long value) {
            addCriterion("id_proc_contratto <=", value, "idProcContratto");
            return (Criteria) this;
        }

        public Criteria andIdProcContrattoIn(List<Long> values) {
            addCriterion("id_proc_contratto in", values, "idProcContratto");
            return (Criteria) this;
        }

        public Criteria andIdProcContrattoNotIn(List<Long> values) {
            addCriterion("id_proc_contratto not in", values, "idProcContratto");
            return (Criteria) this;
        }

        public Criteria andIdProcContrattoBetween(Long value1, Long value2) {
            addCriterion("id_proc_contratto between", value1, value2, "idProcContratto");
            return (Criteria) this;
        }

        public Criteria andIdProcContrattoNotBetween(Long value1, Long value2) {
            addCriterion("id_proc_contratto not between", value1, value2, "idProcContratto");
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

        public Criteria andIdContrattoIsNull() {
            addCriterion("id_contratto is null");
            return (Criteria) this;
        }

        public Criteria andIdContrattoIsNotNull() {
            addCriterion("id_contratto is not null");
            return (Criteria) this;
        }

        public Criteria andIdContrattoEqualTo(Long value) {
            addCriterion("id_contratto =", value, "idContratto");
            return (Criteria) this;
        }

        public Criteria andIdContrattoNotEqualTo(Long value) {
            addCriterion("id_contratto <>", value, "idContratto");
            return (Criteria) this;
        }

        public Criteria andIdContrattoGreaterThan(Long value) {
            addCriterion("id_contratto >", value, "idContratto");
            return (Criteria) this;
        }

        public Criteria andIdContrattoGreaterThanOrEqualTo(Long value) {
            addCriterion("id_contratto >=", value, "idContratto");
            return (Criteria) this;
        }

        public Criteria andIdContrattoLessThan(Long value) {
            addCriterion("id_contratto <", value, "idContratto");
            return (Criteria) this;
        }

        public Criteria andIdContrattoLessThanOrEqualTo(Long value) {
            addCriterion("id_contratto <=", value, "idContratto");
            return (Criteria) this;
        }

        public Criteria andIdContrattoIn(List<Long> values) {
            addCriterion("id_contratto in", values, "idContratto");
            return (Criteria) this;
        }

        public Criteria andIdContrattoNotIn(List<Long> values) {
            addCriterion("id_contratto not in", values, "idContratto");
            return (Criteria) this;
        }

        public Criteria andIdContrattoBetween(Long value1, Long value2) {
            addCriterion("id_contratto between", value1, value2, "idContratto");
            return (Criteria) this;
        }

        public Criteria andIdContrattoNotBetween(Long value1, Long value2) {
            addCriterion("id_contratto not between", value1, value2, "idContratto");
            return (Criteria) this;
        }

        public Criteria andIdTipoContrattoIsNull() {
            addCriterion("id_tipo_contratto is null");
            return (Criteria) this;
        }

        public Criteria andIdTipoContrattoIsNotNull() {
            addCriterion("id_tipo_contratto is not null");
            return (Criteria) this;
        }

        public Criteria andIdTipoContrattoEqualTo(Long value) {
            addCriterion("id_tipo_contratto =", value, "idTipoContratto");
            return (Criteria) this;
        }

        public Criteria andIdTipoContrattoNotEqualTo(Long value) {
            addCriterion("id_tipo_contratto <>", value, "idTipoContratto");
            return (Criteria) this;
        }

        public Criteria andIdTipoContrattoGreaterThan(Long value) {
            addCriterion("id_tipo_contratto >", value, "idTipoContratto");
            return (Criteria) this;
        }

        public Criteria andIdTipoContrattoGreaterThanOrEqualTo(Long value) {
            addCriterion("id_tipo_contratto >=", value, "idTipoContratto");
            return (Criteria) this;
        }

        public Criteria andIdTipoContrattoLessThan(Long value) {
            addCriterion("id_tipo_contratto <", value, "idTipoContratto");
            return (Criteria) this;
        }

        public Criteria andIdTipoContrattoLessThanOrEqualTo(Long value) {
            addCriterion("id_tipo_contratto <=", value, "idTipoContratto");
            return (Criteria) this;
        }

        public Criteria andIdTipoContrattoIn(List<Long> values) {
            addCriterion("id_tipo_contratto in", values, "idTipoContratto");
            return (Criteria) this;
        }

        public Criteria andIdTipoContrattoNotIn(List<Long> values) {
            addCriterion("id_tipo_contratto not in", values, "idTipoContratto");
            return (Criteria) this;
        }

        public Criteria andIdTipoContrattoBetween(Long value1, Long value2) {
            addCriterion("id_tipo_contratto between", value1, value2, "idTipoContratto");
            return (Criteria) this;
        }

        public Criteria andIdTipoContrattoNotBetween(Long value1, Long value2) {
            addCriterion("id_tipo_contratto not between", value1, value2, "idTipoContratto");
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
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table rebusp_r_proc_contratto
     *
     * @mbg.generated do_not_delete_during_merge Wed Jan 22 16:49:54 CET 2020
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table rebusp_r_proc_contratto
     *
     * @mbg.generated Wed Jan 22 16:49:54 CET 2020
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
}