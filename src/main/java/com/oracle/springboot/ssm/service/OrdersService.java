package com.oracle.springboot.ssm.service;

import com.oracle.springboot.ssm.po.Orders;
public interface OrdersService{


    int deleteByPrimaryKey(Integer id);

    int insert(Orders record);

    int insertSelective(Orders record);

    Orders selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Orders record);

    int updateByPrimaryKey(Orders record);

}
