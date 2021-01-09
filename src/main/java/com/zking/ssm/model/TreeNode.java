package com.zking.ssm.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


@Data
@AllArgsConstructor
public class TreeNode implements Serializable {
    private Integer treeNodeId;

    private String treeNodeName;

    private Integer treeNodeType;

    private Integer parentNodeId;

    private String url;

    private Integer position;

    private String icon;

    // 一对多关系映射
    private List<TreeNode> children = new ArrayList<>();
    // 多对一关系映射
    @JsonIgnore
    private TreeNode parent;

    //多对多关联关系映射
    private List<Role> roles=new ArrayList<>();

    public TreeNode(Integer treeNodeId, String treeNodeName, Integer treeNodeType, Integer parentNodeId, String url, Integer position, String icon) {
        this.treeNodeId = treeNodeId;
        this.treeNodeName = treeNodeName;
        this.treeNodeType = treeNodeType;
        this.parentNodeId = parentNodeId;
        this.url = url;
        this.position = position;
        this.icon = icon;
    }

    public TreeNode() {
        super();
    }

    public Integer getTreeNodeId() {
        return treeNodeId;
    }

    public void setTreeNodeId(Integer treeNodeId) {
        this.treeNodeId = treeNodeId;
    }

    public String getTreeNodeName() {
        return treeNodeName;
    }

    public void setTreeNodeName(String treeNodeName) {
        this.treeNodeName = treeNodeName;
    }

    public Integer getTreeNodeType() {
        return treeNodeType;
    }

    public void setTreeNodeType(Integer treeNodeType) {
        this.treeNodeType = treeNodeType;
    }

    public Integer getParentNodeId() {
        return parentNodeId;
    }

    public void setParentNodeId(Integer parentNodeId) {
        this.parentNodeId = parentNodeId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "treeNodeId=" + treeNodeId +
                ", treeNodeName='" + treeNodeName + '\'' +
                ", treeNodeType=" + treeNodeType +
                ", parentNodeId=" + parentNodeId +
                ", url='" + url + '\'' +
                ", position=" + position +
                ", icon='" + icon + '\'' +
                ", children=" + children +
                ", roles=" + roles +
                '}';
    }
}