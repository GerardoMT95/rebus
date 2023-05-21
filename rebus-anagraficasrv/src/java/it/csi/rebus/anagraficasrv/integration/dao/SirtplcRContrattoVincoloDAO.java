/*
* SPDX-FileCopyrightText: (C) Copyright 2022 Regione Piemonte
* SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.rebus.anagraficasrv.integration.dao;

import it.csi.rebus.anagraficasrv.integration.dto.SirtplcRContrattoVincoloDTO;
import it.csi.rebus.anagraficasrv.integration.dto.SirtplcRContrattoVincoloSelector;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SirtplcRContrattoVincoloDAO extends ParentDAO {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sirtplc_r_contratto_vincolo
     *
     * @mbg.generated Mon Nov 04 11:33:48 CET 2019
     */
    long countByExample(SirtplcRContrattoVincoloSelector example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sirtplc_r_contratto_vincolo
     *
     * @mbg.generated Mon Nov 04 11:33:48 CET 2019
     */
    int deleteByExample(SirtplcRContrattoVincoloSelector example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sirtplc_r_contratto_vincolo
     *
     * @mbg.generated Mon Nov 04 11:33:48 CET 2019
     */
    int deleteByPrimaryKey(Long idContrattoVincolo);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sirtplc_r_contratto_vincolo
     *
     * @mbg.generated Mon Nov 04 11:33:48 CET 2019
     */
    int insert(SirtplcRContrattoVincoloDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sirtplc_r_contratto_vincolo
     *
     * @mbg.generated Mon Nov 04 11:33:48 CET 2019
     */
    int insertSelective(SirtplcRContrattoVincoloDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sirtplc_r_contratto_vincolo
     *
     * @mbg.generated Mon Nov 04 11:33:48 CET 2019
     */
    List<SirtplcRContrattoVincoloDTO> selectByExample(SirtplcRContrattoVincoloSelector example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sirtplc_r_contratto_vincolo
     *
     * @mbg.generated Mon Nov 04 11:33:48 CET 2019
     */
    SirtplcRContrattoVincoloDTO selectByPrimaryKey(Long idContrattoVincolo);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sirtplc_r_contratto_vincolo
     *
     * @mbg.generated Mon Nov 04 11:33:48 CET 2019
     */
    int updateByExampleSelective(@Param("record") SirtplcRContrattoVincoloDTO record, @Param("example") SirtplcRContrattoVincoloSelector example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sirtplc_r_contratto_vincolo
     *
     * @mbg.generated Mon Nov 04 11:33:48 CET 2019
     */
    int updateByExample(@Param("record") SirtplcRContrattoVincoloDTO record, @Param("example") SirtplcRContrattoVincoloSelector example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sirtplc_r_contratto_vincolo
     *
     * @mbg.generated Mon Nov 04 11:33:48 CET 2019
     */
    int updateByPrimaryKeySelective(SirtplcRContrattoVincoloDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sirtplc_r_contratto_vincolo
     *
     * @mbg.generated Mon Nov 04 11:33:48 CET 2019
     */
    int updateByPrimaryKey(SirtplcRContrattoVincoloDTO record);
}