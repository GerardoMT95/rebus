/*
* SPDX-FileCopyrightText: (C) Copyright 2022 Regione Piemonte
* SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.rebus.rebuscrus.integration.dao;

import it.csi.rebus.rebuscrus.integration.dto.VExportRicercaAutobusDTO;
import it.csi.rebus.rebuscrus.integration.dto.VExportRicercaAutobusSelector;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VExportRicercaAutobusDAO extends ParentDAO {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table v_export_ricerca_autobus
	 * @mbg.generated  Fri Mar 11 09:31:48 CET 2022
	 */
	long countByExample(VExportRicercaAutobusSelector example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table v_export_ricerca_autobus
	 * @mbg.generated  Fri Mar 11 09:31:48 CET 2022
	 */
	int deleteByExample(VExportRicercaAutobusSelector example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table v_export_ricerca_autobus
	 * @mbg.generated  Fri Mar 11 09:31:48 CET 2022
	 */
	int insert(VExportRicercaAutobusDTO record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table v_export_ricerca_autobus
	 * @mbg.generated  Fri Mar 11 09:31:48 CET 2022
	 */
	int insertSelective(VExportRicercaAutobusDTO record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table v_export_ricerca_autobus
	 * @mbg.generated  Fri Mar 11 09:31:48 CET 2022
	 */
	List<VExportRicercaAutobusDTO> selectByExample(VExportRicercaAutobusSelector example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table v_export_ricerca_autobus
	 * @mbg.generated  Fri Mar 11 09:31:48 CET 2022
	 */
	int updateByExampleSelective(@Param("record") VExportRicercaAutobusDTO record,
			@Param("example") VExportRicercaAutobusSelector example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table v_export_ricerca_autobus
	 * @mbg.generated  Fri Mar 11 09:31:48 CET 2022
	 */
	int updateByExample(@Param("record") VExportRicercaAutobusDTO record,
			@Param("example") VExportRicercaAutobusSelector example);
}