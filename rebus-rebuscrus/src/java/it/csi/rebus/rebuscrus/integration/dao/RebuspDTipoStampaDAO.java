/*
* SPDX-FileCopyrightText: (C) Copyright 2022 Regione Piemonte
* SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.rebus.rebuscrus.integration.dao;

import it.csi.rebus.rebuscrus.integration.dto.RebuspDTipoStampaDTO;
import it.csi.rebus.rebuscrus.integration.dto.RebuspDTipoStampaSelector;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RebuspDTipoStampaDAO extends ParentDAO {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rebusp_d_tipo_stampa
     *
     * @mbg.generated Tue Mar 03 17:30:32 CET 2020
     */
    long countByExample(RebuspDTipoStampaSelector example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rebusp_d_tipo_stampa
     *
     * @mbg.generated Tue Mar 03 17:30:32 CET 2020
     */
    int deleteByExample(RebuspDTipoStampaSelector example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rebusp_d_tipo_stampa
     *
     * @mbg.generated Tue Mar 03 17:30:32 CET 2020
     */
    int deleteByPrimaryKey(Long idTipoStampa);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rebusp_d_tipo_stampa
     *
     * @mbg.generated Tue Mar 03 17:30:32 CET 2020
     */
    int insert(RebuspDTipoStampaDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rebusp_d_tipo_stampa
     *
     * @mbg.generated Tue Mar 03 17:30:32 CET 2020
     */
    int insertSelective(RebuspDTipoStampaDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rebusp_d_tipo_stampa
     *
     * @mbg.generated Tue Mar 03 17:30:32 CET 2020
     */
    List<RebuspDTipoStampaDTO> selectByExampleWithBLOBs(RebuspDTipoStampaSelector example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rebusp_d_tipo_stampa
     *
     * @mbg.generated Tue Mar 03 17:30:32 CET 2020
     */
    List<RebuspDTipoStampaDTO> selectByExample(RebuspDTipoStampaSelector example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rebusp_d_tipo_stampa
     *
     * @mbg.generated Tue Mar 03 17:30:32 CET 2020
     */
    RebuspDTipoStampaDTO selectByPrimaryKey(Long idTipoStampa);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rebusp_d_tipo_stampa
     *
     * @mbg.generated Tue Mar 03 17:30:32 CET 2020
     */
    int updateByExampleSelective(@Param("record") RebuspDTipoStampaDTO record, @Param("example") RebuspDTipoStampaSelector example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rebusp_d_tipo_stampa
     *
     * @mbg.generated Tue Mar 03 17:30:32 CET 2020
     */
    int updateByExampleWithBLOBs(@Param("record") RebuspDTipoStampaDTO record, @Param("example") RebuspDTipoStampaSelector example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rebusp_d_tipo_stampa
     *
     * @mbg.generated Tue Mar 03 17:30:32 CET 2020
     */
    int updateByExample(@Param("record") RebuspDTipoStampaDTO record, @Param("example") RebuspDTipoStampaSelector example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rebusp_d_tipo_stampa
     *
     * @mbg.generated Tue Mar 03 17:30:32 CET 2020
     */
    int updateByPrimaryKeySelective(RebuspDTipoStampaDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rebusp_d_tipo_stampa
     *
     * @mbg.generated Tue Mar 03 17:30:32 CET 2020
     */
    int updateByPrimaryKeyWithBLOBs(RebuspDTipoStampaDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rebusp_d_tipo_stampa
     *
     * @mbg.generated Tue Mar 03 17:30:32 CET 2020
     */
    int updateByPrimaryKey(RebuspDTipoStampaDTO record);
}