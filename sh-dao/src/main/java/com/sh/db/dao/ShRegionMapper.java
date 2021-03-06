package com.sh.db.dao;

import com.sh.db.domain.ShRegion;
import com.sh.db.domain.ShRegionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShRegionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_region
     *
     * @mbg.generated
     */
    long countByExample(ShRegionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_region
     *
     * @mbg.generated
     */
    int deleteByExample(ShRegionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_region
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_region
     *
     * @mbg.generated
     */
    int insert(ShRegion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_region
     *
     * @mbg.generated
     */
    int insertSelective(ShRegion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_region
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    ShRegion selectOneByExample(ShRegionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_region
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    ShRegion selectOneByExampleSelective(@Param("example") ShRegionExample example, @Param("selective") ShRegion.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_region
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<ShRegion> selectByExampleSelective(@Param("example") ShRegionExample example, @Param("selective") ShRegion.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_region
     *
     * @mbg.generated
     */
    List<ShRegion> selectByExample(ShRegionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_region
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    ShRegion selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") ShRegion.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_region
     *
     * @mbg.generated
     */
    ShRegion selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_region
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") ShRegion record, @Param("example") ShRegionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_region
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") ShRegion record, @Param("example") ShRegionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_region
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(ShRegion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_region
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(ShRegion record);
}