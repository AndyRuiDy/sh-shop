package com.sh.db.dao;

import com.sh.db.domain.ShAgencyShare;
import com.sh.db.domain.ShAgencyShareExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShAgencyShareMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_agency_share
     *
     * @mbg.generated
     */
    long countByExample(ShAgencyShareExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_agency_share
     *
     * @mbg.generated
     */
    int deleteByExample(ShAgencyShareExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_agency_share
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_agency_share
     *
     * @mbg.generated
     */
    int insert(ShAgencyShare record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_agency_share
     *
     * @mbg.generated
     */
    int insertSelective(ShAgencyShare record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_agency_share
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    ShAgencyShare selectOneByExample(ShAgencyShareExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_agency_share
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    ShAgencyShare selectOneByExampleSelective(@Param("example") ShAgencyShareExample example, @Param("selective") ShAgencyShare.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_agency_share
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<ShAgencyShare> selectByExampleSelective(@Param("example") ShAgencyShareExample example, @Param("selective") ShAgencyShare.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_agency_share
     *
     * @mbg.generated
     */
    List<ShAgencyShare> selectByExample(ShAgencyShareExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_agency_share
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    ShAgencyShare selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") ShAgencyShare.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_agency_share
     *
     * @mbg.generated
     */
    ShAgencyShare selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_agency_share
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") ShAgencyShare record, @Param("example") ShAgencyShareExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_agency_share
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") ShAgencyShare record, @Param("example") ShAgencyShareExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_agency_share
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(ShAgencyShare record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_agency_share
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(ShAgencyShare record);
}