/*
* SPDX-FileCopyrightText: (C) Copyright 2022 Regione Piemonte
* SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.rebus.rebuscrus.integration.dao;

import it.csi.rebus.rebuscrus.integration.dto.RebusDCategoriaVeicoloDTO;
import it.csi.rebus.rebuscrus.integration.dto.RebusDCategoriaVeicoloSelector;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RebusDCategoriaVeicoloDAO extends ParentDAO {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table rebus_d_categoria_veicolo
	 * @mbg.generated  Fri Mar 11 10:23:20 CET 2022
	 */
	long countByExample(RebusDCategoriaVeicoloSelector example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table rebus_d_categoria_veicolo
	 * @mbg.generated  Fri Mar 11 10:23:20 CET 2022
	 */
	int deleteByExample(RebusDCategoriaVeicoloSelector example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table rebus_d_categoria_veicolo
	 * @mbg.generated  Fri Mar 11 10:23:20 CET 2022
	 */
	int deleteByPrimaryKey(Long idCategoriaVeicolo);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table rebus_d_categoria_veicolo
	 * @mbg.generated  Fri Mar 11 10:23:20 CET 2022
	 */
	int insert(RebusDCategoriaVeicoloDTO record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table rebus_d_categoria_veicolo
	 * @mbg.generated  Fri Mar 11 10:23:20 CET 2022
	 */
	int insertSelective(RebusDCategoriaVeicoloDTO record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table rebus_d_categoria_veicolo
	 * @mbg.generated  Fri Mar 11 10:23:20 CET 2022
	 */
	List<RebusDCategoriaVeicoloDTO> selectByExample(RebusDCategoriaVeicoloSelector example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table rebus_d_categoria_veicolo
	 * @mbg.generated  Fri Mar 11 10:23:20 CET 2022
	 */
	RebusDCategoriaVeicoloDTO selectByPrimaryKey(Long idCategoriaVeicolo);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table rebus_d_categoria_veicolo
	 * @mbg.generated  Fri Mar 11 10:23:20 CET 2022
	 */
	int updateByExampleSelective(@Param("record") RebusDCategoriaVeicoloDTO record,
			@Param("example") RebusDCategoriaVeicoloSelector example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table rebus_d_categoria_veicolo
	 * @mbg.generated  Fri Mar 11 10:23:20 CET 2022
	 */
	int updateByExample(@Param("record") RebusDCategoriaVeicoloDTO record,
			@Param("example") RebusDCategoriaVeicoloSelector example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table rebus_d_categoria_veicolo
	 * @mbg.generated  Fri Mar 11 10:23:20 CET 2022
	 */
	int updateByPrimaryKeySelective(RebusDCategoriaVeicoloDTO record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table rebus_d_categoria_veicolo
	 * @mbg.generated  Fri Mar 11 10:23:20 CET 2022
	 */
	int updateByPrimaryKey(RebusDCategoriaVeicoloDTO record);
}