package com.oracle.springboot.ssm.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.oracle.springboot.ssm.mapper.ReciverMapper;
import com.oracle.springboot.ssm.po.Reciver;
import com.oracle.springboot.ssm.service.ReciverService;
@Service
public class ReciverServiceImpl implements ReciverService{

    @Resource
    private ReciverMapper reciverMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return reciverMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Reciver record) {
        return reciverMapper.insert(record);
    }

    @Override
    public int insertSelective(Reciver record) {
        return reciverMapper.insertSelective(record);
    }

    @Override
    public Reciver selectByPrimaryKey(Integer id) {
        return reciverMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Reciver record) {
        return reciverMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Reciver record) {
        return reciverMapper.updateByPrimaryKey(record);
    }

}
