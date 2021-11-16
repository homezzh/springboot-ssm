package com.oracle.springboot.ssm.service;

import com.oracle.springboot.ssm.po.Items;
public interface ItemsService{


    int deleteByPrimaryKey(Integer id);

    int insert(Items record);

    int insertSelective(Items record);

    Items selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Items record);

    int updateByPrimaryKey(Items record);

}
