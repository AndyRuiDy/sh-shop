package com.sh.db.dao;

import com.sh.db.domain.ShSystem;
import com.sh.db.domain.ShSystemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShSystemMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_system
     *
     * @mbg.generated
     */
    long countByExample(ShSystemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_system
     *
     * @mbg.generated
     */
    int deleteByExample(ShSystemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_system
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_system
     *
     * @mbg.generated
     */
    int insert(ShSystem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_system
     *
     * @mbg.generated
     */
    int insertSelective(ShSystem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_system
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    ShSystem selectOneByExample(ShSystemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_system
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    ShSystem selectOneByExampleSelective(@Param("example") ShSystemExample example, @Param("selective") ShSystem.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_system
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<ShSystem> selectByExampleSelective(@Param("example") ShSystemExample example, @Param("selective") ShSystem.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_system
     *
     * @mbg.generated
     */
    List<ShSystem> selectByExample(ShSystemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_system
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    ShSystem selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") ShSystem.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_system
     *
     * @mbg.generated
     */
    ShSystem selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_system
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    ShSystem selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_system
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") ShSystem record, @Param("example") ShSystemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_system
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") ShSystem record, @Param("example") ShSystemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_system
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(ShSystem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_system
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(ShSystem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_system
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByExample(@Param("example") ShSystemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_system
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByPrimaryKey(Integer id);
}