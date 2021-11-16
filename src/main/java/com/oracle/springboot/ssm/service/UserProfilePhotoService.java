package com.oracle.springboot.ssm.service;

import com.oracle.springboot.ssm.po.UserProfilePhoto;
public interface UserProfilePhotoService{


    int insert(UserProfilePhoto record);

    int insertSelective(UserProfilePhoto record);

}
