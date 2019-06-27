package com.example.controller;

import com.example.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * UserController 用户控制层 .
 *
 * @author yanyue, 2019/6/21
 * @version shiro v1.0
 */
@Slf4j
@RestController
@RequestMapping("/account")
public class UserController {
    @RequestMapping("/login")
    public String login(@RequestBody  User user){
        Subject subject=SecurityUtils.getSubject();
        UsernamePasswordToken usernamePasswordToken=new UsernamePasswordToken(user.getUsername(),user.getPassword());
        log.info(usernamePasswordToken.toString());
        try {
            subject.login(usernamePasswordToken);
        } catch (AuthenticationException e) {
            return e.getMessage();
        }
        return "登录成功";
    }

    @RequestMapping("/manager/add")
    @RequiresRoles({"admin"})
    public String add(){
        return "add";
    }
    @RequestMapping("/manager/show")
    @RequiresPermissions("account:managerShow")
    public String show(){
        return "show";
    }

    @RequiresRoles("admin")
    @RequiresPermissions("account:managerModify")
    @RequestMapping("/manager/modify")
    public String modify(){
        return "modify";
    }
    @RequestMapping("/manager/delete")
    @RequiresPermissions("account:managerDelete")
    public String delete(){
        return "delete";
    }

}
