package com.sh.db.dao;

import com.sh.db.domain.ShOrderGoods;
import com.sh.db.domain.ShOrderGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShOrderGoodsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_order_goods
     *
     * @mbg.generated
     */
    long countByExample(ShOrderGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_order_goods
     *
     * @mbg.generated
     */
    int deleteByExample(ShOrderGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_order_goods
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_order_goods
     *
     * @mbg.generated
     */
    int insert(ShOrderGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_order_goods
     *
     * @mbg.generated
     */
    int insertSelective(ShOrderGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_order_goods
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    ShOrderGoods selectOneByExample(ShOrderGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_order_goods
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    ShOrderGoods selectOneByExampleSelective(@Param("example") ShOrderGoodsExample example, @Param("selective") ShOrderGoods.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_order_goods
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<ShOrderGoods> selectByExampleSelective(@Param("example") ShOrderGoodsExample example, @Param("selective") ShOrderGoods.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_order_goods
     *
     * @mbg.generated
     */
    List<ShOrderGoods> selectByExample(ShOrderGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_order_goods
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    ShOrderGoods selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") ShOrderGoods.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_order_goods
     *
     * @mbg.generated
     */
    ShOrderGoods selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_order_goods
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    ShOrderGoods selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_order_goods
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") ShOrderGoods record, @Param("example") ShOrderGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_order_goods
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") ShOrderGoods record, @Param("example") ShOrderGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_order_goods
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(ShOrderGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_order_goods
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(ShOrderGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_order_goods
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByExample(@Param("example") ShOrderGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_order_goods
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByPrimaryKey(Integer id);
}