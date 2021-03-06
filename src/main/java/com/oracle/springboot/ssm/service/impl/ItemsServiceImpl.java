package com.oracle.springboot.ssm.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.oracle.springboot.ssm.mapper.ItemsMapper;
import com.oracle.springboot.ssm.po.Items;
import com.oracle.springboot.ssm.service.ItemsService;
@Service
public class ItemsServiceImpl implements ItemsService{

    @Resource
    private ItemsMapper itemsMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return itemsMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Items record) {
        return itemsMapper.insert(record);
    }

    @Override
    public int insertSelective(Items record) {
        return itemsMapper.insertSelective(record);
    }

    @Override
    public Items selectByPrimaryKey(Integer id) {
        return itemsMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Items record) {
        return itemsMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Items record) {
        return itemsMapper.updateByPrimaryKey(record);
    }

}
