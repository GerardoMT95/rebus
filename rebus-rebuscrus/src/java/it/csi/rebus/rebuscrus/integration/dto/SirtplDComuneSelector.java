/*
* SPDX-FileCopyrightText: (C) Copyright 2022 Regione Piemonte
* SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.rebus.rebuscrus.integration.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SirtplDComuneSelector {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sirtpl_d_comune
     *
     * @mbg.generated Tue Mar 10 12:11:55 CET 2020
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sirtpl_d_comune
     *
     * @mbg.generated Tue Mar 10 12:11:55 CET 2020
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sirtpl_d_comune
     *
     * @mbg.generated Tue Mar 10 12:11:55 CET 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sirtpl_d_comune
     *
     * @mbg.generated Tue Mar 10 12:11:55 CET 2020
     */
    public SirtplDComuneSelector() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sirtpl_d_comune
     *
     * @mbg.generated Tue Mar 10 12:11:55 CET 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sirtpl_d_comune
     *
     * @mbg.generated Tue Mar 10 12:11:55 CET 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sirtpl_d_comune
     *
     * @mbg.generated Tue Mar 10 12:11:55 CET 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sirtpl_d_comune
     *
     * @mbg.generated Tue Mar 10 12:11:55 CET 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sirtpl_d_comune
     *
     * @mbg.generated Tue Mar 10 12:11:55 CET 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sirtpl_d_comune
     *
     * @mbg.generated Tue Mar 10 12:11:55 CET 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sirtpl_d_comune
     *
     * @mbg.generated Tue Mar 10 12:11:55 CET 2020
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sirtpl_d_comune
     *
     * @mbg.generated Tue Mar 10 12:11:55 CET 2020
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
     * This method corresponds to the database table sirtpl_d_comune
     *
     * @mbg.generated Tue Mar 10 12:11:55 CET 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sirtpl_d_comune
     *
     * @mbg.generated Tue Mar 10 12:11:55 CET 2020
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table sirtpl_d_comune
     *
     * @mbg.generated Tue Mar 10 12:11:55 CET 2020
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

        public Criteria andIdComuneIsNull() {
            addCriterion("id_comune is null");
            return (Criteria) this;
        }

        public Criteria andIdComuneIsNotNull() {
            addCriterion("id_comune is not null");
            return (Criteria) this;
        }

        public Criteria andIdComuneEqualTo(Long value) {
            addCriterion("id_comune =", value, "idComune");
            return (Criteria) this;
        }

        public Criteria andIdComuneNotEqualTo(Long value) {
            addCriterion("id_comune <>", value, "idComune");
            return (Criteria) this;
        }

        public Criteria andIdComuneGreaterThan(Long value) {
            addCriterion("id_comune >", value, "idComune");
            return (Criteria) this;
        }

        public Criteria andIdComuneGreaterThanOrEqualTo(Long value) {
            addCriterion("id_comune >=", value, "idComune");
            return (Criteria) this;
        }

        public Criteria andIdComuneLessThan(Long value) {
            addCriterion("id_comune <", value, "idComune");
            return (Criteria) this;
        }

        public Criteria andIdComuneLessThanOrEqualTo(Long value) {
            addCriterion("id_comune <=", value, "idComune");
            return (Criteria) this;
        }

        public Criteria andIdComuneIn(List<Long> values) {
            addCriterion("id_comune in", values, "idComune");
            return (Criteria) this;
        }

        public Criteria andIdComuneNotIn(List<Long> values) {
            addCriterion("id_comune not in", values, "idComune");
            return (Criteria) this;
        }

        public Criteria andIdComuneBetween(Long value1, Long value2) {
            addCriterion("id_comune between", value1, value2, "idComune");
            return (Criteria) this;
        }

        public Criteria andIdComuneNotBetween(Long value1, Long value2) {
            addCriterion("id_comune not between", value1, value2, "idComune");
            return (Criteria) this;
        }

        public Criteria andCodIstatComuneIsNull() {
            addCriterion("cod_istat_comune is null");
            return (Criteria) this;
        }

        public Criteria andCodIstatComuneIsNotNull() {
            addCriterion("cod_istat_comune is not null");
            return (Criteria) this;
        }

        public Criteria andCodIstatComuneEqualTo(String value) {
            addCriterion("cod_istat_comune =", value, "codIstatComune");
            return (Criteria) this;
        }

        public Criteria andCodIstatComuneNotEqualTo(String value) {
            addCriterion("cod_istat_comune <>", value, "codIstatComune");
            return (Criteria) this;
        }

        public Criteria andCodIstatComuneGreaterThan(String value) {
            addCriterion("cod_istat_comune >", value, "codIstatComune");
            return (Criteria) this;
        }

        public Criteria andCodIstatComuneGreaterThanOrEqualTo(String value) {
            addCriterion("cod_istat_comune >=", value, "codIstatComune");
            return (Criteria) this;
        }

        public Criteria andCodIstatComuneLessThan(String value) {
            addCriterion("cod_istat_comune <", value, "codIstatComune");
            return (Criteria) this;
        }

        public Criteria andCodIstatComuneLessThanOrEqualTo(String value) {
            addCriterion("cod_istat_comune <=", value, "codIstatComune");
            return (Criteria) this;
        }

        public Criteria andCodIstatComuneLike(String value) {
            addCriterion("cod_istat_comune like", value, "codIstatComune");
            return (Criteria) this;
        }

        public Criteria andCodIstatComuneNotLike(String value) {
            addCriterion("cod_istat_comune not like", value, "codIstatComune");
            return (Criteria) this;
        }

        public Criteria andCodIstatComuneIn(List<String> values) {
            addCriterion("cod_istat_comune in", values, "codIstatComune");
            return (Criteria) this;
        }

        public Criteria andCodIstatComuneNotIn(List<String> values) {
            addCriterion("cod_istat_comune not in", values, "codIstatComune");
            return (Criteria) this;
        }

        public Criteria andCodIstatComuneBetween(String value1, String value2) {
            addCriterion("cod_istat_comune between", value1, value2, "codIstatComune");
            return (Criteria) this;
        }

        public Criteria andCodIstatComuneNotBetween(String value1, String value2) {
            addCriterion("cod_istat_comune not between", value1, value2, "codIstatComune");
            return (Criteria) this;
        }

        public Criteria andCodBelfioreComuneIsNull() {
            addCriterion("cod_belfiore_comune is null");
            return (Criteria) this;
        }

        public Criteria andCodBelfioreComuneIsNotNull() {
            addCriterion("cod_belfiore_comune is not null");
            return (Criteria) this;
        }

        public Criteria andCodBelfioreComuneEqualTo(String value) {
            addCriterion("cod_belfiore_comune =", value, "codBelfioreComune");
            return (Criteria) this;
        }

        public Criteria andCodBelfioreComuneNotEqualTo(String value) {
            addCriterion("cod_belfiore_comune <>", value, "codBelfioreComune");
            return (Criteria) this;
        }

        public Criteria andCodBelfioreComuneGreaterThan(String value) {
            addCriterion("cod_belfiore_comune >", value, "codBelfioreComune");
            return (Criteria) this;
        }

        public Criteria andCodBelfioreComuneGreaterThanOrEqualTo(String value) {
            addCriterion("cod_belfiore_comune >=", value, "codBelfioreComune");
            return (Criteria) this;
        }

        public Criteria andCodBelfioreComuneLessThan(String value) {
            addCriterion("cod_belfiore_comune <", value, "codBelfioreComune");
            return (Criteria) this;
        }

        public Criteria andCodBelfioreComuneLessThanOrEqualTo(String value) {
            addCriterion("cod_belfiore_comune <=", value, "codBelfioreComune");
            return (Criteria) this;
        }

        public Criteria andCodBelfioreComuneLike(String value) {
            addCriterion("cod_belfiore_comune like", value, "codBelfioreComune");
            return (Criteria) this;
        }

        public Criteria andCodBelfioreComuneNotLike(String value) {
            addCriterion("cod_belfiore_comune not like", value, "codBelfioreComune");
            return (Criteria) this;
        }

        public Criteria andCodBelfioreComuneIn(List<String> values) {
            addCriterion("cod_belfiore_comune in", values, "codBelfioreComune");
            return (Criteria) this;
        }

        public Criteria andCodBelfioreComuneNotIn(List<String> values) {
            addCriterion("cod_belfiore_comune not in", values, "codBelfioreComune");
            return (Criteria) this;
        }

        public Criteria andCodBelfioreComuneBetween(String value1, String value2) {
            addCriterion("cod_belfiore_comune between", value1, value2, "codBelfioreComune");
            return (Criteria) this;
        }

        public Criteria andCodBelfioreComuneNotBetween(String value1, String value2) {
            addCriterion("cod_belfiore_comune not between", value1, value2, "codBelfioreComune");
            return (Criteria) this;
        }

        public Criteria andDenomComuneIsNull() {
            addCriterion("denom_comune is null");
            return (Criteria) this;
        }

        public Criteria andDenomComuneIsNotNull() {
            addCriterion("denom_comune is not null");
            return (Criteria) this;
        }

        public Criteria andDenomComuneEqualTo(String value) {
            addCriterion("denom_comune =", value, "denomComune");
            return (Criteria) this;
        }

        public Criteria andDenomComuneNotEqualTo(String value) {
            addCriterion("denom_comune <>", value, "denomComune");
            return (Criteria) this;
        }

        public Criteria andDenomComuneGreaterThan(String value) {
            addCriterion("denom_comune >", value, "denomComune");
            return (Criteria) this;
        }

        public Criteria andDenomComuneGreaterThanOrEqualTo(String value) {
            addCriterion("denom_comune >=", value, "denomComune");
            return (Criteria) this;
        }

        public Criteria andDenomComuneLessThan(String value) {
            addCriterion("denom_comune <", value, "denomComune");
            return (Criteria) this;
        }

        public Criteria andDenomComuneLessThanOrEqualTo(String value) {
            addCriterion("denom_comune <=", value, "denomComune");
            return (Criteria) this;
        }

        public Criteria andDenomComuneLike(String value) {
            addCriterion("denom_comune like", value, "denomComune");
            return (Criteria) this;
        }

        public Criteria andDenomComuneNotLike(String value) {
            addCriterion("denom_comune not like", value, "denomComune");
            return (Criteria) this;
        }

        public Criteria andDenomComuneIn(List<String> values) {
            addCriterion("denom_comune in", values, "denomComune");
            return (Criteria) this;
        }

        public Criteria andDenomComuneNotIn(List<String> values) {
            addCriterion("denom_comune not in", values, "denomComune");
            return (Criteria) this;
        }

        public Criteria andDenomComuneBetween(String value1, String value2) {
            addCriterion("denom_comune between", value1, value2, "denomComune");
            return (Criteria) this;
        }

        public Criteria andDenomComuneNotBetween(String value1, String value2) {
            addCriterion("denom_comune not between", value1, value2, "denomComune");
            return (Criteria) this;
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

        public Criteria andDtIdComuneIsNull() {
            addCriterion("dt_id_comune is null");
            return (Criteria) this;
        }

        public Criteria andDtIdComuneIsNotNull() {
            addCriterion("dt_id_comune is not null");
            return (Criteria) this;
        }

        public Criteria andDtIdComuneEqualTo(Double value) {
            addCriterion("dt_id_comune =", value, "dtIdComune");
            return (Criteria) this;
        }

        public Criteria andDtIdComuneNotEqualTo(Double value) {
            addCriterion("dt_id_comune <>", value, "dtIdComune");
            return (Criteria) this;
        }

        public Criteria andDtIdComuneGreaterThan(Double value) {
            addCriterion("dt_id_comune >", value, "dtIdComune");
            return (Criteria) this;
        }

        public Criteria andDtIdComuneGreaterThanOrEqualTo(Double value) {
            addCriterion("dt_id_comune >=", value, "dtIdComune");
            return (Criteria) this;
        }

        public Criteria andDtIdComuneLessThan(Double value) {
            addCriterion("dt_id_comune <", value, "dtIdComune");
            return (Criteria) this;
        }

        public Criteria andDtIdComuneLessThanOrEqualTo(Double value) {
            addCriterion("dt_id_comune <=", value, "dtIdComune");
            return (Criteria) this;
        }

        public Criteria andDtIdComuneIn(List<Double> values) {
            addCriterion("dt_id_comune in", values, "dtIdComune");
            return (Criteria) this;
        }

        public Criteria andDtIdComuneNotIn(List<Double> values) {
            addCriterion("dt_id_comune not in", values, "dtIdComune");
            return (Criteria) this;
        }

        public Criteria andDtIdComuneBetween(Double value1, Double value2) {
            addCriterion("dt_id_comune between", value1, value2, "dtIdComune");
            return (Criteria) this;
        }

        public Criteria andDtIdComuneNotBetween(Double value1, Double value2) {
            addCriterion("dt_id_comune not between", value1, value2, "dtIdComune");
            return (Criteria) this;
        }

        public Criteria andDtIdComunePrevIsNull() {
            addCriterion("dt_id_comune_prev is null");
            return (Criteria) this;
        }

        public Criteria andDtIdComunePrevIsNotNull() {
            addCriterion("dt_id_comune_prev is not null");
            return (Criteria) this;
        }

        public Criteria andDtIdComunePrevEqualTo(Double value) {
            addCriterion("dt_id_comune_prev =", value, "dtIdComunePrev");
            return (Criteria) this;
        }

        public Criteria andDtIdComunePrevNotEqualTo(Double value) {
            addCriterion("dt_id_comune_prev <>", value, "dtIdComunePrev");
            return (Criteria) this;
        }

        public Criteria andDtIdComunePrevGreaterThan(Double value) {
            addCriterion("dt_id_comune_prev >", value, "dtIdComunePrev");
            return (Criteria) this;
        }

        public Criteria andDtIdComunePrevGreaterThanOrEqualTo(Double value) {
            addCriterion("dt_id_comune_prev >=", value, "dtIdComunePrev");
            return (Criteria) this;
        }

        public Criteria andDtIdComunePrevLessThan(Double value) {
            addCriterion("dt_id_comune_prev <", value, "dtIdComunePrev");
            return (Criteria) this;
        }

        public Criteria andDtIdComunePrevLessThanOrEqualTo(Double value) {
            addCriterion("dt_id_comune_prev <=", value, "dtIdComunePrev");
            return (Criteria) this;
        }

        public Criteria andDtIdComunePrevIn(List<Double> values) {
            addCriterion("dt_id_comune_prev in", values, "dtIdComunePrev");
            return (Criteria) this;
        }

        public Criteria andDtIdComunePrevNotIn(List<Double> values) {
            addCriterion("dt_id_comune_prev not in", values, "dtIdComunePrev");
            return (Criteria) this;
        }

        public Criteria andDtIdComunePrevBetween(Double value1, Double value2) {
            addCriterion("dt_id_comune_prev between", value1, value2, "dtIdComunePrev");
            return (Criteria) this;
        }

        public Criteria andDtIdComunePrevNotBetween(Double value1, Double value2) {
            addCriterion("dt_id_comune_prev not between", value1, value2, "dtIdComunePrev");
            return (Criteria) this;
        }

        public Criteria andDtIdComuneNextIsNull() {
            addCriterion("dt_id_comune_next is null");
            return (Criteria) this;
        }

        public Criteria andDtIdComuneNextIsNotNull() {
            addCriterion("dt_id_comune_next is not null");
            return (Criteria) this;
        }

        public Criteria andDtIdComuneNextEqualTo(Double value) {
            addCriterion("dt_id_comune_next =", value, "dtIdComuneNext");
            return (Criteria) this;
        }

        public Criteria andDtIdComuneNextNotEqualTo(Double value) {
            addCriterion("dt_id_comune_next <>", value, "dtIdComuneNext");
            return (Criteria) this;
        }

        public Criteria andDtIdComuneNextGreaterThan(Double value) {
            addCriterion("dt_id_comune_next >", value, "dtIdComuneNext");
            return (Criteria) this;
        }

        public Criteria andDtIdComuneNextGreaterThanOrEqualTo(Double value) {
            addCriterion("dt_id_comune_next >=", value, "dtIdComuneNext");
            return (Criteria) this;
        }

        public Criteria andDtIdComuneNextLessThan(Double value) {
            addCriterion("dt_id_comune_next <", value, "dtIdComuneNext");
            return (Criteria) this;
        }

        public Criteria andDtIdComuneNextLessThanOrEqualTo(Double value) {
            addCriterion("dt_id_comune_next <=", value, "dtIdComuneNext");
            return (Criteria) this;
        }

        public Criteria andDtIdComuneNextIn(List<Double> values) {
            addCriterion("dt_id_comune_next in", values, "dtIdComuneNext");
            return (Criteria) this;
        }

        public Criteria andDtIdComuneNextNotIn(List<Double> values) {
            addCriterion("dt_id_comune_next not in", values, "dtIdComuneNext");
            return (Criteria) this;
        }

        public Criteria andDtIdComuneNextBetween(Double value1, Double value2) {
            addCriterion("dt_id_comune_next between", value1, value2, "dtIdComuneNext");
            return (Criteria) this;
        }

        public Criteria andDtIdComuneNextNotBetween(Double value1, Double value2) {
            addCriterion("dt_id_comune_next not between", value1, value2, "dtIdComuneNext");
            return (Criteria) this;
        }

        public Criteria andCodIstatComuneLikeInsensitive(String value) {
            addCriterion("upper(cod_istat_comune) like", value.toUpperCase(), "codIstatComune");
            return (Criteria) this;
        }

        public Criteria andCodBelfioreComuneLikeInsensitive(String value) {
            addCriterion("upper(cod_belfiore_comune) like", value.toUpperCase(), "codBelfioreComune");
            return (Criteria) this;
        }

        public Criteria andDenomComuneLikeInsensitive(String value) {
            addCriterion("upper(denom_comune) like", value.toUpperCase(), "denomComune");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table sirtpl_d_comune
     *
     * @mbg.generated do_not_delete_during_merge Tue Mar 10 12:11:55 CET 2020
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table sirtpl_d_comune
     *
     * @mbg.generated Tue Mar 10 12:11:55 CET 2020
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