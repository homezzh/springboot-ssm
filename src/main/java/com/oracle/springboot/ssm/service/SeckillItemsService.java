package com.oracle.springboot.ssm.service;

import com.oracle.springboot.ssm.po.SeckillItems;
public interface SeckillItemsService{


    int deleteByPrimaryKey(Integer id);

    int insert(SeckillItems record);

    int insertSelective(SeckillItems record);

    SeckillItems selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SeckillItems record);

    int updateByPrimaryKey(SeckillItems record);

}
