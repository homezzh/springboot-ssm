package com.oracle.springboot.ssm.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.oracle.springboot.ssm.po.UserProfilePhoto;
import com.oracle.springboot.ssm.mapper.UserProfilePhotoMapper;
import com.oracle.springboot.ssm.service.UserProfilePhotoService;
@Service
public class UserProfilePhotoServiceImpl implements UserProfilePhotoService{

    @Resource
    private UserProfilePhotoMapper userProfilePhotoMapper;

    @Override
    public int insert(UserProfilePhoto record) {
        return userProfilePhotoMapper.insert(record);
    }

    @Override
    public int insertSelective(UserProfilePhoto record) {
        return userProfilePhotoMapper.insertSelective(record);
    }

}
