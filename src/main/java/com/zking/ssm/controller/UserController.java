package com.zking.ssm.controller;

import com.zking.ssm.model.User;
import com.zking.ssm.service.IUserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/login")
    @ResponseBody
    public Map<String,Object> login(String username,String password){
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token=new UsernamePasswordToken(
                username,password
        );
        User user = userService.login(username);
        Map<String,Object> map =new HashMap<>();
        System.out.println("ok");
        try {
            subject.login(token);
            map.put("user",user);
            map.put("msg","登录成功");
            map.put("code",1);
            return map;
        }catch (AuthenticationException e) {
            e.printStackTrace();
            map.put("msg","登录失败");
            return map;
        }


    }

}
