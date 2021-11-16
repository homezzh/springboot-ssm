package com.oracle.springboot.ssm.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.oracle.springboot.ssm.mapper.SeckillSeqMapper;
import com.oracle.springboot.ssm.po.SeckillSeq;
import com.oracle.springboot.ssm.service.SeckillSeqService;
@Service
public class SeckillSeqServiceImpl implements SeckillSeqService{

    @Resource
    private SeckillSeqMapper seckillSeqMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return seckillSeqMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(SeckillSeq record) {
        return seckillSeqMapper.insert(record);
    }

    @Override
    public int insertSelective(SeckillSeq record) {
        return seckillSeqMapper.insertSelective(record);
    }

    @Override
    public SeckillSeq selectByPrimaryKey(Integer id) {
        return seckillSeqMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(SeckillSeq record) {
        return seckillSeqMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SeckillSeq record) {
        return seckillSeqMapper.updateByPrimaryKey(record);
    }

}
