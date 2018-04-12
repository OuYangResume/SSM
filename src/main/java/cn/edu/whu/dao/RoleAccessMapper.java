package cn.edu.whu.dao;

import cn.edu.whu.bean.RoleAccess;
import cn.edu.whu.bean.RoleAccessExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleAccessMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_access
     *
     * @mbggenerated
     */
    int countByExample(RoleAccessExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_access
     *
     * @mbggenerated
     */
    int deleteByExample(RoleAccessExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_access
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_access
     *
     * @mbggenerated
     */
    int insert(RoleAccess record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_access
     *
     * @mbggenerated
     */
    int insertSelective(RoleAccess record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_access
     *
     * @mbggenerated
     */
    List<RoleAccess> selectByExample(RoleAccessExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_access
     *
     * @mbggenerated
     */
    RoleAccess selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_access
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") RoleAccess record, @Param("example") RoleAccessExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_access
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") RoleAccess record, @Param("example") RoleAccessExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_access
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(RoleAccess record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_access
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(RoleAccess record);
}