package com.oracle.springboot.ssm.mapper;

import com.oracle.springboot.ssm.po.UserProfilePhoto;

public interface UserProfilePhotoMapper {
    int insert(UserProfilePhoto record);

    int insertSelective(UserProfilePhoto record);
}