package com.chenxi.community.mapper;

import com.chenxi.community.model.Notifications;
import com.chenxi.community.model.NotificationsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface NotificationsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table NOTIFICATIONS
     *
     * @mbg.generated Fri Mar 27 03:41:57 CST 2020
     */
    long countByExample(NotificationsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table NOTIFICATIONS
     *
     * @mbg.generated Fri Mar 27 03:41:57 CST 2020
     */
    int deleteByExample(NotificationsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table NOTIFICATIONS
     *
     * @mbg.generated Fri Mar 27 03:41:57 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table NOTIFICATIONS
     *
     * @mbg.generated Fri Mar 27 03:41:57 CST 2020
     */
    int insert(Notifications record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table NOTIFICATIONS
     *
     * @mbg.generated Fri Mar 27 03:41:57 CST 2020
     */
    int insertSelective(Notifications record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table NOTIFICATIONS
     *
     * @mbg.generated Fri Mar 27 03:41:57 CST 2020
     */
    List<Notifications> selectByExampleWithRowbounds(NotificationsExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table NOTIFICATIONS
     *
     * @mbg.generated Fri Mar 27 03:41:57 CST 2020
     */
    List<Notifications> selectByExample(NotificationsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table NOTIFICATIONS
     *
     * @mbg.generated Fri Mar 27 03:41:57 CST 2020
     */
    Notifications selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table NOTIFICATIONS
     *
     * @mbg.generated Fri Mar 27 03:41:57 CST 2020
     */
    int updateByExampleSelective(@Param("record") Notifications record, @Param("example") NotificationsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table NOTIFICATIONS
     *
     * @mbg.generated Fri Mar 27 03:41:57 CST 2020
     */
    int updateByExample(@Param("record") Notifications record, @Param("example") NotificationsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table NOTIFICATIONS
     *
     * @mbg.generated Fri Mar 27 03:41:57 CST 2020
     */
    int updateByPrimaryKeySelective(Notifications record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table NOTIFICATIONS
     *
     * @mbg.generated Fri Mar 27 03:41:57 CST 2020
     */
    int updateByPrimaryKey(Notifications record);
}