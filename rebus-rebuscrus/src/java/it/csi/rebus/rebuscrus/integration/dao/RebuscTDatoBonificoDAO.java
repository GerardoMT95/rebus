/*
* SPDX-FileCopyrightText: (C) Copyright 2022 Regione Piemonte
* SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.rebus.rebuscrus.integration.dao;

import it.csi.rebus.rebuscrus.integration.dto.RebuscTDatoBonificoDTO;
import it.csi.rebus.rebuscrus.integration.dto.RebuscTDatoBonificoSelector;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RebuscTDatoBonificoDAO extends ParentDAO {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table rebusc_t_dato_bonifico
	 * @mbg.generated  Fri Mar 04 15:16:01 CET 2022
	 */
	long countByExample(RebuscTDatoBonificoSelector example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table rebusc_t_dato_bonifico
	 * @mbg.generated  Fri Mar 04 15:16:01 CET 2022
	 */
	int deleteByExample(RebuscTDatoBonificoSelector example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table rebusc_t_dato_bonifico
	 * @mbg.generated  Fri Mar 04 15:16:01 CET 2022
	 */
	int deleteByPrimaryKey(Long idDatoBonifico);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table rebusc_t_dato_bonifico
	 * @mbg.generated  Fri Mar 04 15:16:01 CET 2022
	 */
	int insert(RebuscTDatoBonificoDTO record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table rebusc_t_dato_bonifico
	 * @mbg.generated  Fri Mar 04 15:16:01 CET 2022
	 */
	int insertSelective(RebuscTDatoBonificoDTO record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table rebusc_t_dato_bonifico
	 * @mbg.generated  Fri Mar 04 15:16:01 CET 2022
	 */
	List<RebuscTDatoBonificoDTO> selectByExample(RebuscTDatoBonificoSelector example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table rebusc_t_dato_bonifico
	 * @mbg.generated  Fri Mar 04 15:16:01 CET 2022
	 */
	RebuscTDatoBonificoDTO selectByPrimaryKey(Long idDatoBonifico);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table rebusc_t_dato_bonifico
	 * @mbg.generated  Fri Mar 04 15:16:01 CET 2022
	 */
	int updateByExampleSelective(@Param("record") RebuscTDatoBonificoDTO record,
			@Param("example") RebuscTDatoBonificoSelector example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table rebusc_t_dato_bonifico
	 * @mbg.generated  Fri Mar 04 15:16:01 CET 2022
	 */
	int updateByExample(@Param("record") RebuscTDatoBonificoDTO record,
			@Param("example") RebuscTDatoBonificoSelector example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table rebusc_t_dato_bonifico
	 * @mbg.generated  Fri Mar 04 15:16:01 CET 2022
	 */
	int updateByPrimaryKeySelective(RebuscTDatoBonificoDTO record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table rebusc_t_dato_bonifico
	 * @mbg.generated  Fri Mar 04 15:16:01 CET 2022
	 */
	int updateByPrimaryKey(RebuscTDatoBonificoDTO record);
}