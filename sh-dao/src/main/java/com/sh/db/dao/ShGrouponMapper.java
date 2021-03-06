package com.sh.db.dao;

import com.sh.db.domain.ShGroupon;
import com.sh.db.domain.ShGrouponExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShGrouponMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_groupon
     *
     * @mbg.generated
     */
    long countByExample(ShGrouponExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_groupon
     *
     * @mbg.generated
     */
    int deleteByExample(ShGrouponExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_groupon
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_groupon
     *
     * @mbg.generated
     */
    int insert(ShGroupon record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_groupon
     *
     * @mbg.generated
     */
    int insertSelective(ShGroupon record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_groupon
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    ShGroupon selectOneByExample(ShGrouponExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_groupon
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    ShGroupon selectOneByExampleSelective(@Param("example") ShGrouponExample example, @Param("selective") ShGroupon.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_groupon
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<ShGroupon> selectByExampleSelective(@Param("example") ShGrouponExample example, @Param("selective") ShGroupon.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_groupon
     *
     * @mbg.generated
     */
    List<ShGroupon> selectByExample(ShGrouponExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_groupon
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    ShGroupon selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") ShGroupon.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_groupon
     *
     * @mbg.generated
     */
    ShGroupon selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_groupon
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    ShGroupon selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_groupon
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") ShGroupon record, @Param("example") ShGrouponExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_groupon
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") ShGroupon record, @Param("example") ShGrouponExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_groupon
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(ShGroupon record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_groupon
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(ShGroupon record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_groupon
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByExample(@Param("example") ShGrouponExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_groupon
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByPrimaryKey(Integer id);
}