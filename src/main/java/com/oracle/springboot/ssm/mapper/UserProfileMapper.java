package com.oracle.springboot.ssm.mapper;

import com.oracle.springboot.ssm.po.UserProfile;

public interface UserProfileMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserProfile record);

    int insertSelective(UserProfile record);

    UserProfile selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserProfile record);

    int updateByPrimaryKey(UserProfile record);
}