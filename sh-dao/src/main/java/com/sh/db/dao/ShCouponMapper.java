package com.sh.db.dao;

import com.sh.db.domain.ShCoupon;
import com.sh.db.domain.ShCouponExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShCouponMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_coupon
     *
     * @mbg.generated
     */
    long countByExample(ShCouponExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_coupon
     *
     * @mbg.generated
     */
    int deleteByExample(ShCouponExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_coupon
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_coupon
     *
     * @mbg.generated
     */
    int insert(ShCoupon record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_coupon
     *
     * @mbg.generated
     */
    int insertSelective(ShCoupon record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_coupon
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    ShCoupon selectOneByExample(ShCouponExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_coupon
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    ShCoupon selectOneByExampleSelective(@Param("example") ShCouponExample example, @Param("selective") ShCoupon.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_coupon
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<ShCoupon> selectByExampleSelective(@Param("example") ShCouponExample example, @Param("selective") ShCoupon.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_coupon
     *
     * @mbg.generated
     */
    List<ShCoupon> selectByExample(ShCouponExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_coupon
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    ShCoupon selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") ShCoupon.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_coupon
     *
     * @mbg.generated
     */
    ShCoupon selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_coupon
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    ShCoupon selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_coupon
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") ShCoupon record, @Param("example") ShCouponExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_coupon
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") ShCoupon record, @Param("example") ShCouponExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_coupon
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(ShCoupon record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_coupon
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(ShCoupon record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_coupon
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByExample(@Param("example") ShCouponExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_coupon
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByPrimaryKey(Integer id);
}