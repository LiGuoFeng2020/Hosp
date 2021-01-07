package com.zking.ssm.service.impl;

import com.zking.ssm.mapper.MedicinaMapper;
import com.zking.ssm.model.Medicina;
import com.zking.ssm.service.IMedicinaSeivice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MedicinaSeiviceImpl implements IMedicinaSeivice {

    @Autowired
    private MedicinaMapper medicinaMapper;
    @Override
    public int deleteByPrimaryKey(Integer mediNo) {
        return medicinaMapper.deleteByPrimaryKey(mediNo);
    }

    @Override
    public int insert(Medicina record) {
        return medicinaMapper.insert(record);
    }

    @Override
    public int insertSelective(Medicina record) {
        return medicinaMapper.insertSelective(record);
    }

    @Override
    public Medicina selectByPrimaryKey(Integer mediNo) {
        return medicinaMapper.selectByPrimaryKey(mediNo);
    }

    @Override
    public int updateByPrimaryKeySelective(Medicina record) {
        return medicinaMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Medicina record) {
        return medicinaMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Medicina> list(Medicina medicina) {
        return medicinaMapper.list(medicina);
    }
}
