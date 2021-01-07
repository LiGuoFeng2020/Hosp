package com.zking.ssm.mapper;

import com.zking.ssm.model.Permission;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PermissionMapper {
    int deleteByPrimaryKey(Integer treeNodeId);

    int insert(Permission record);

    int insertSelective(Permission record);

    Permission selectByPrimaryKey(Integer treeNodeId);

    int updateByPrimaryKeySelective(Permission record);

    int updateByPrimaryKey(Permission record);

    List<Permission> list(Permission permission);
}