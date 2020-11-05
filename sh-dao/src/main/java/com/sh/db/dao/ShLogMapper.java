package com.sh.db.dao;

import com.sh.db.domain.ShLog;
import com.sh.db.domain.ShLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_log
     *
     * @mbg.generated
     */
    long countByExample(ShLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_log
     *
     * @mbg.generated
     */
    int deleteByExample(ShLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_log
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_log
     *
     * @mbg.generated
     */
    int insert(ShLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_log
     *
     * @mbg.generated
     */
    int insertSelective(ShLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_log
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    ShLog selectOneByExample(ShLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_log
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    ShLog selectOneByExampleSelective(@Param("example") ShLogExample example, @Param("selective") ShLog.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_log
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<ShLog> selectByExampleSelective(@Param("example") ShLogExample example, @Param("selective") ShLog.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_log
     *
     * @mbg.generated
     */
    List<ShLog> selectByExample(ShLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_log
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    ShLog selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") ShLog.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_log
     *
     * @mbg.generated
     */
    ShLog selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_log
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    ShLog selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_log
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") ShLog record, @Param("example") ShLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_log
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") ShLog record, @Param("example") ShLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_log
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(ShLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_log
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(ShLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_log
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByExample(@Param("example") ShLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_log
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByPrimaryKey(Integer id);
}