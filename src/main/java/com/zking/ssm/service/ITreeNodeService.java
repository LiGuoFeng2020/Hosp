package com.zking.ssm.service;

import com.zking.ssm.model.TreeNode;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface ITreeNodeService {
    int deleteByPrimaryKey(Integer treeNodeId);

    int insert(TreeNode record);

    int insertSelective(TreeNode record);

    TreeNode selectByPrimaryKey(Integer treeNodeId);

    int updateByPrimaryKeySelective(TreeNode record);

    int updateByPrimaryKey(TreeNode record);

    List<TreeNode> listParent();

    List<TreeNode> listchildren(int parentNodeId);
}