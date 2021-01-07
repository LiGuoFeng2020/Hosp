package com.zking.ssm.service;

import com.zking.ssm.model.Medicina;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface IMedicinaSeivice {
    int deleteByPrimaryKey(Integer mediNo);

    int insert(Medicina record);

    int insertSelective(Medicina record);

    Medicina selectByPrimaryKey(Integer mediNo);

    int updateByPrimaryKeySelective(Medicina record);

    int updateByPrimaryKey(Medicina record);

    List<Medicina> list(Medicina medicina);
}