package com.sh.db.dao;

import com.sh.db.domain.ShGoods;
import com.sh.db.domain.ShGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShGoodsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_goods
     *
     * @mbg.generated
     */
    long countByExample(ShGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_goods
     *
     * @mbg.generated
     */
    int deleteByExample(ShGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_goods
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_goods
     *
     * @mbg.generated
     */
    int insert(ShGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_goods
     *
     * @mbg.generated
     */
    int insertSelective(ShGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_goods
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    ShGoods selectOneByExample(ShGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_goods
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    ShGoods selectOneByExampleSelective(@Param("example") ShGoodsExample example, @Param("selective") ShGoods.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_goods
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    ShGoods selectOneByExampleWithBLOBs(ShGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_goods
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<ShGoods> selectByExampleSelective(@Param("example") ShGoodsExample example, @Param("selective") ShGoods.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_goods
     *
     * @mbg.generated
     */
    List<ShGoods> selectByExampleWithBLOBs(ShGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_goods
     *
     * @mbg.generated
     */
    List<ShGoods> selectByExample(ShGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_goods
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    ShGoods selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") ShGoods.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_goods
     *
     * @mbg.generated
     */
    ShGoods selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_goods
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    ShGoods selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_goods
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") ShGoods record, @Param("example") ShGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_goods
     *
     * @mbg.generated
     */
    int updateByExampleWithBLOBs(@Param("record") ShGoods record, @Param("example") ShGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_goods
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") ShGoods record, @Param("example") ShGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_goods
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(ShGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_goods
     *
     * @mbg.generated
     */
    int updateByPrimaryKeyWithBLOBs(ShGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_goods
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(ShGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_goods
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByExample(@Param("example") ShGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_goods
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByPrimaryKey(Integer id);
}