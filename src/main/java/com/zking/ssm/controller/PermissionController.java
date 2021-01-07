package com.zking.ssm.controller;

import com.zking.ssm.model.Permission;
import com.zking.ssm.service.IPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/treenode")
public class PermissionController {

    @Autowired
    private IPermissionService permissionService;

    @RequestMapping("/list")
    @ResponseBody
    public Map<String,Object> list(){
        Permission permission=new Permission();
        List<Permission> list = permissionService.list(permission);
        for (Permission p : list) {
            System.out.println(p);
        }
        Map<String,Object> map =new HashMap<>();
        map.put("result",list);
        return map;
    }
}
