package com.zking.ssm.mapper;

import com.zking.ssm.model.Medicina;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MedicinaMapper {
    int deleteByPrimaryKey(Integer mediNo);

    int insert(Medicina record);

    int insertSelective(Medicina record);

    Medicina selectByPrimaryKey(Integer mediNo);

    int updateByPrimaryKeySelective(Medicina record);

    int updateByPrimaryKey(Medicina record);

    List<Medicina> list(Medicina medicina);
}