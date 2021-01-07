package com.zking.ssm.service;

import com.zking.ssm.model.Permission;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface IPermissionService {
    int deleteByPrimaryKey(Integer treeNodeId);

    int insert(Permission record);

    int insertSelective(Permission record);

    Permission selectByPrimaryKey(Integer treeNodeId);

    int updateByPrimaryKeySelective(Permission record);

    int updateByPrimaryKey(Permission record);

    List<Permission> list(Permission permission);
}