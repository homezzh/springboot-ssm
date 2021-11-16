package com.oracle.springboot.ssm.mapper;

import com.oracle.springboot.ssm.po.SeckillSeq;

public interface SeckillSeqMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SeckillSeq record);

    int insertSelective(SeckillSeq record);

    SeckillSeq selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SeckillSeq record);

    int updateByPrimaryKey(SeckillSeq record);
}