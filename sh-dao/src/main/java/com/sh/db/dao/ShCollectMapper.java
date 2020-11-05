package com.sh.db.dao;

import com.sh.db.domain.ShCollect;
import com.sh.db.domain.ShCollectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShCollectMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_collect
     *
     * @mbg.generated
     */
    long countByExample(ShCollectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_collect
     *
     * @mbg.generated
     */
    int deleteByExample(ShCollectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_collect
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_collect
     *
     * @mbg.generated
     */
    int insert(ShCollect record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_collect
     *
     * @mbg.generated
     */
    int insertSelective(ShCollect record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_collect
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    ShCollect selectOneByExample(ShCollectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_collect
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    ShCollect selectOneByExampleSelective(@Param("example") ShCollectExample example, @Param("selective") ShCollect.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_collect
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<ShCollect> selectByExampleSelective(@Param("example") ShCollectExample example, @Param("selective") ShCollect.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_collect
     *
     * @mbg.generated
     */
    List<ShCollect> selectByExample(ShCollectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_collect
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    ShCollect selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") ShCollect.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_collect
     *
     * @mbg.generated
     */
    ShCollect selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_collect
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    ShCollect selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_collect
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") ShCollect record, @Param("example") ShCollectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_collect
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") ShCollect record, @Param("example") ShCollectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_collect
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(ShCollect record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_collect
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(ShCollect record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_collect
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByExample(@Param("example") ShCollectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_collect
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByPrimaryKey(Integer id);
}