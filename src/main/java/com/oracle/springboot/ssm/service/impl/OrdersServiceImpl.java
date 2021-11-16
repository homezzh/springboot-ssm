package com.oracle.springboot.ssm.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.oracle.springboot.ssm.mapper.OrdersMapper;
import com.oracle.springboot.ssm.po.Orders;
import com.oracle.springboot.ssm.service.OrdersService;
@Service
public class OrdersServiceImpl implements OrdersService{

    @Resource
    private OrdersMapper ordersMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return ordersMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Orders record) {
        return ordersMapper.insert(record);
    }

    @Override
    public int insertSelective(Orders record) {
        return ordersMapper.insertSelective(record);
    }

    @Override
    public Orders selectByPrimaryKey(Integer id) {
        return ordersMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Orders record) {
        return ordersMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Orders record) {
        return ordersMapper.updateByPrimaryKey(record);
    }

}
