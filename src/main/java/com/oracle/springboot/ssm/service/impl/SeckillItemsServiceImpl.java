package com.oracle.springboot.ssm.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.oracle.springboot.ssm.po.SeckillItems;
import com.oracle.springboot.ssm.mapper.SeckillItemsMapper;
import com.oracle.springboot.ssm.service.SeckillItemsService;
@Service
public class SeckillItemsServiceImpl implements SeckillItemsService{

    @Resource
    private SeckillItemsMapper seckillItemsMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return seckillItemsMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(SeckillItems record) {
        return seckillItemsMapper.insert(record);
    }

    @Override
    public int insertSelective(SeckillItems record) {
        return seckillItemsMapper.insertSelective(record);
    }

    @Override
    public SeckillItems selectByPrimaryKey(Integer id) {
        return seckillItemsMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(SeckillItems record) {
        return seckillItemsMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SeckillItems record) {
        return seckillItemsMapper.updateByPrimaryKey(record);
    }

}
