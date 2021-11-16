package com.oracle.springboot.ssm.service;

import com.oracle.springboot.ssm.po.Menu;
public interface MenuService{


    int deleteByPrimaryKey(Integer id);

    int insert(Menu record);

    int insertSelective(Menu record);

    Menu selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Menu record);

    int updateByPrimaryKey(Menu record);

}
