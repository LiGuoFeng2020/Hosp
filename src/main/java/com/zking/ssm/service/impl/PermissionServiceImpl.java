package com.zking.ssm.service.impl;

import com.zking.ssm.mapper.PermissionMapper;
import com.zking.ssm.model.Permission;
import com.zking.ssm.service.IPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PermissionServiceImpl implements IPermissionService {

    @Autowired
    private PermissionMapper permissionMapper;

    @Override
    public int deleteByPrimaryKey(Integer treeNodeId) {
        return permissionMapper.deleteByPrimaryKey(treeNodeId);
    }

    @Override
    public int insert(Permission record) {
        return permissionMapper.insert(record);
    }

    @Override
    public int insertSelective(Permission record) {
        return permissionMapper.insertSelective(record);
    }

    @Override
    public Permission selectByPrimaryKey(Integer treeNodeId) {
        return permissionMapper.selectByPrimaryKey(treeNodeId);
    }

    @Override
    public int updateByPrimaryKeySelective(Permission record) {
        return permissionMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Permission record) {
        return permissionMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Permission> list(Permission permission) {
        return permissionMapper.list(permission);
    }
}
