package com.zking.ssm.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@ToString
@Data
public class Role implements Serializable {
    private Integer roleid;

    private String rolename;

    private String description;
//一对多关联关系映射
    @JsonIgnore
    private List<User> users =new ArrayList<>();
    //多对多关联关系映射
    @JsonIgnore
    private List<TreeNode> treeNodes =new ArrayList<>();

    public Role(Integer roleid, String rolename, String description) {
        this.roleid = roleid;
        this.rolename = rolename;
        this.description = description;
    }

    public Role() {
        super();
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}