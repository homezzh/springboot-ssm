package com.oracle.springboot.ssm.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.oracle.springboot.ssm.mapper.UserProfileMapper;
import com.oracle.springboot.ssm.po.UserProfile;
import com.oracle.springboot.ssm.service.UserProfileService;
@Service
public class UserProfileServiceImpl implements UserProfileService{

    @Resource
    private UserProfileMapper userProfileMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return userProfileMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(UserProfile record) {
        return userProfileMapper.insert(record);
    }

    @Override
    public int insertSelective(UserProfile record) {
        return userProfileMapper.insertSelective(record);
    }

    @Override
    public UserProfile selectByPrimaryKey(Integer id) {
        return userProfileMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(UserProfile record) {
        return userProfileMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(UserProfile record) {
        return userProfileMapper.updateByPrimaryKey(record);
    }

}
