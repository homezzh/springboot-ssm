package com.oracle.springboot.ssm.mapper;

import com.oracle.springboot.ssm.po.Reciver;

public interface ReciverMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Reciver record);

    int insertSelective(Reciver record);

    Reciver selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Reciver record);

    int updateByPrimaryKey(Reciver record);
}