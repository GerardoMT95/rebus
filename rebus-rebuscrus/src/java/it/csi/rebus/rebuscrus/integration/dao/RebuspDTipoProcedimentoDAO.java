/*
* SPDX-FileCopyrightText: (C) Copyright 2022 Regione Piemonte
* SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.rebus.rebuscrus.integration.dao;

import it.csi.rebus.rebuscrus.integration.dto.RebuspDTipoProcedimentoDTO;
import it.csi.rebus.rebuscrus.integration.dto.RebuspDTipoProcedimentoSelector;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RebuspDTipoProcedimentoDAO extends ParentDAO {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table rebusp_d_tipo_procedimento
	 * @mbg.generated  Tue Apr 21 10:30:14 CEST 2020
	 */
	long countByExample(RebuspDTipoProcedimentoSelector example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table rebusp_d_tipo_procedimento
	 * @mbg.generated  Tue Apr 21 10:30:14 CEST 2020
	 */
	int deleteByExample(RebuspDTipoProcedimentoSelector example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table rebusp_d_tipo_procedimento
	 * @mbg.generated  Tue Apr 21 10:30:14 CEST 2020
	 */
	int deleteByPrimaryKey(Long idTipoProcedimento);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table rebusp_d_tipo_procedimento
	 * @mbg.generated  Tue Apr 21 10:30:14 CEST 2020
	 */
	int insert(RebuspDTipoProcedimentoDTO record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table rebusp_d_tipo_procedimento
	 * @mbg.generated  Tue Apr 21 10:30:14 CEST 2020
	 */
	int insertSelective(RebuspDTipoProcedimentoDTO record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table rebusp_d_tipo_procedimento
	 * @mbg.generated  Tue Apr 21 10:30:14 CEST 2020
	 */
	List<RebuspDTipoProcedimentoDTO> selectByExample(RebuspDTipoProcedimentoSelector example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table rebusp_d_tipo_procedimento
	 * @mbg.generated  Tue Apr 21 10:30:14 CEST 2020
	 */
	RebuspDTipoProcedimentoDTO selectByPrimaryKey(Long idTipoProcedimento);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table rebusp_d_tipo_procedimento
	 * @mbg.generated  Tue Apr 21 10:30:14 CEST 2020
	 */
	int updateByExampleSelective(@Param("record") RebuspDTipoProcedimentoDTO record, @Param("example") RebuspDTipoProcedimentoSelector example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table rebusp_d_tipo_procedimento
	 * @mbg.generated  Tue Apr 21 10:30:14 CEST 2020
	 */
	int updateByExample(@Param("record") RebuspDTipoProcedimentoDTO record, @Param("example") RebuspDTipoProcedimentoSelector example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table rebusp_d_tipo_procedimento
	 * @mbg.generated  Tue Apr 21 10:30:14 CEST 2020
	 */
	int updateByPrimaryKeySelective(RebuspDTipoProcedimentoDTO record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table rebusp_d_tipo_procedimento
	 * @mbg.generated  Tue Apr 21 10:30:14 CEST 2020
	 */
	int updateByPrimaryKey(RebuspDTipoProcedimentoDTO record);
}