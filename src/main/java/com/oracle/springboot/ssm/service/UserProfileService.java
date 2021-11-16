package com.oracle.springboot.ssm.service;

import com.oracle.springboot.ssm.po.UserProfile;
public interface UserProfileService{


    int deleteByPrimaryKey(Integer id);

    int insert(UserProfile record);

    int insertSelective(UserProfile record);

    UserProfile selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserProfile record);

    int updateByPrimaryKey(UserProfile record);

}
