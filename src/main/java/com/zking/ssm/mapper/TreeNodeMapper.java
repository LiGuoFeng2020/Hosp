package com.zking.ssm.mapper;

import com.zking.ssm.model.TreeNode;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TreeNodeMapper {
    int deleteByPrimaryKey(Integer treeNodeId);

    int insert(TreeNode record);

    int insertSelective(TreeNode record);

    TreeNode selectByPrimaryKey(Integer treeNodeId);

    int updateByPrimaryKeySelective(TreeNode record);

    int updateByPrimaryKey(TreeNode record);

    /**
     * 查询所有的父集合
     * @return
     */
    List<TreeNode> listParent();

    /**
     * 查询所有的子集合
     * @return
     */
    List<TreeNode> listchildren(int parentNodeId);

}