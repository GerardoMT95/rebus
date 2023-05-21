/*
* SPDX-FileCopyrightText: (C) Copyright 2022 Regione Piemonte
* SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.rebus.anagraficasrv.integration.dao;

import it.csi.rebus.anagraficasrv.integration.dto.SirtplcDVincoloDTO;
import it.csi.rebus.anagraficasrv.integration.dto.SirtplcDVincoloSelector;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SirtplcDVincoloDAO extends ParentDAO {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sirtplc_d_vincolo
     *
     * @mbg.generated Mon Nov 04 11:33:48 CET 2019
     */
    long countByExample(SirtplcDVincoloSelector example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sirtplc_d_vincolo
     *
     * @mbg.generated Mon Nov 04 11:33:48 CET 2019
     */
    int deleteByExample(SirtplcDVincoloSelector example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sirtplc_d_vincolo
     *
     * @mbg.generated Mon Nov 04 11:33:48 CET 2019
     */
    int deleteByPrimaryKey(Long idVincolo);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sirtplc_d_vincolo
     *
     * @mbg.generated Mon Nov 04 11:33:48 CET 2019
     */
    int insert(SirtplcDVincoloDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sirtplc_d_vincolo
     *
     * @mbg.generated Mon Nov 04 11:33:48 CET 2019
     */
    int insertSelective(SirtplcDVincoloDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sirtplc_d_vincolo
     *
     * @mbg.generated Mon Nov 04 11:33:48 CET 2019
     */
    List<SirtplcDVincoloDTO> selectByExample(SirtplcDVincoloSelector example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sirtplc_d_vincolo
     *
     * @mbg.generated Mon Nov 04 11:33:48 CET 2019
     */
    SirtplcDVincoloDTO selectByPrimaryKey(Long idVincolo);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sirtplc_d_vincolo
     *
     * @mbg.generated Mon Nov 04 11:33:48 CET 2019
     */
    int updateByExampleSelective(@Param("record") SirtplcDVincoloDTO record, @Param("example") SirtplcDVincoloSelector example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sirtplc_d_vincolo
     *
     * @mbg.generated Mon Nov 04 11:33:48 CET 2019
     */
    int updateByExample(@Param("record") SirtplcDVincoloDTO record, @Param("example") SirtplcDVincoloSelector example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sirtplc_d_vincolo
     *
     * @mbg.generated Mon Nov 04 11:33:48 CET 2019
     */
    int updateByPrimaryKeySelective(SirtplcDVincoloDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sirtplc_d_vincolo
     *
     * @mbg.generated Mon Nov 04 11:33:48 CET 2019
     */
    int updateByPrimaryKey(SirtplcDVincoloDTO record);
}