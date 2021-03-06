package com.sh.db.dao;

import com.sh.db.domain.ShComment;
import com.sh.db.domain.ShCommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShCommentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_comment
     *
     * @mbg.generated
     */
    long countByExample(ShCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_comment
     *
     * @mbg.generated
     */
    int deleteByExample(ShCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_comment
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_comment
     *
     * @mbg.generated
     */
    int insert(ShComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_comment
     *
     * @mbg.generated
     */
    int insertSelective(ShComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_comment
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    ShComment selectOneByExample(ShCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_comment
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    ShComment selectOneByExampleSelective(@Param("example") ShCommentExample example, @Param("selective") ShComment.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_comment
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<ShComment> selectByExampleSelective(@Param("example") ShCommentExample example, @Param("selective") ShComment.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_comment
     *
     * @mbg.generated
     */
    List<ShComment> selectByExample(ShCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_comment
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    ShComment selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") ShComment.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_comment
     *
     * @mbg.generated
     */
    ShComment selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_comment
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    ShComment selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_comment
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") ShComment record, @Param("example") ShCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_comment
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") ShComment record, @Param("example") ShCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_comment
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(ShComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_comment
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(ShComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_comment
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByExample(@Param("example") ShCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_comment
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByPrimaryKey(Integer id);
}