/*
* SPDX-FileCopyrightText: (C) Copyright 2022 Regione Piemonte
* SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.rebus.rebuscrus.integration.dao;

import it.csi.rebus.rebuscrus.integration.dto.VAutobusSmallDTO;
import it.csi.rebus.rebuscrus.integration.dto.VAutobusSmallSelector;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VAutobusSmallDAO extends ParentDAO {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table v_autobus_small
	 * @mbg.generated  Mon Oct 21 17:24:13 CEST 2019
	 */
	long countByExample(VAutobusSmallSelector example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table v_autobus_small
	 * @mbg.generated  Mon Oct 21 17:24:13 CEST 2019
	 */
	int deleteByExample(VAutobusSmallSelector example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table v_autobus_small
	 * @mbg.generated  Mon Oct 21 17:24:13 CEST 2019
	 */
	int insert(VAutobusSmallDTO record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table v_autobus_small
	 * @mbg.generated  Mon Oct 21 17:24:13 CEST 2019
	 */
	int insertSelective(VAutobusSmallDTO record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table v_autobus_small
	 * @mbg.generated  Mon Oct 21 17:24:13 CEST 2019
	 */
	List<VAutobusSmallDTO> selectByExample(VAutobusSmallSelector example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table v_autobus_small
	 * @mbg.generated  Mon Oct 21 17:24:13 CEST 2019
	 */
	int updateByExampleSelective(@Param("record") VAutobusSmallDTO record, @Param("example") VAutobusSmallSelector example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table v_autobus_small
	 * @mbg.generated  Mon Oct 21 17:24:13 CEST 2019
	 */
	int updateByExample(@Param("record") VAutobusSmallDTO record, @Param("example") VAutobusSmallSelector example);
}