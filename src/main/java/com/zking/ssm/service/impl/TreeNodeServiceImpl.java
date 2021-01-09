package com.zking.ssm.service.impl;

import com.zking.ssm.mapper.TreeNodeMapper;
import com.zking.ssm.model.TreeNode;
import com.zking.ssm.service.ITreeNodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TreeNodeServiceImpl implements ITreeNodeService {

    @Autowired
    private TreeNodeMapper treeNodeMapper;

    @Override
    public int deleteByPrimaryKey(Integer treeNodeId) {
        return treeNodeMapper.deleteByPrimaryKey(treeNodeId);
    }

    @Override
    public int insert(TreeNode record) {
        return treeNodeMapper.insert(record);
    }

    @Override
    public int insertSelective(TreeNode record) {
        return treeNodeMapper.insertSelective(record);
    }

    @Override
    public TreeNode selectByPrimaryKey(Integer treeNodeId) {
        return treeNodeMapper.selectByPrimaryKey(treeNodeId);
    }

    @Override
    public int updateByPrimaryKeySelective(TreeNode record) {
        return treeNodeMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TreeNode record) {
        return treeNodeMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<TreeNode> listParent() {
        return treeNodeMapper.listParent();
    }

    @Override
    public List<TreeNode> listchildren(int parentNodeId) {
        return treeNodeMapper.listchildren(parentNodeId);
    }


}
