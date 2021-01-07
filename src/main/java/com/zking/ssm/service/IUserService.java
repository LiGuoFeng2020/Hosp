package com.zking.ssm.service;

import com.zking.ssm.model.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;

@Transactional
public interface IUserService {
    int deleteByPrimaryKey(Integer userid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    User login(String username);

    //    获取用户角色信息
    Set<String> findRoles(String username);
    //    获取用户权限信息
    Set<String> findPermissions(String username);
}