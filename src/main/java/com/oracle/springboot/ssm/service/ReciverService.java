package com.oracle.springboot.ssm.service;

import com.oracle.springboot.ssm.po.Reciver;
public interface ReciverService{


    int deleteByPrimaryKey(Integer id);

    int insert(Reciver record);

    int insertSelective(Reciver record);

    Reciver selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Reciver record);

    int updateByPrimaryKey(Reciver record);

}
