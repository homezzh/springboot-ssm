package com.oracle.springboot.ssm.controller;

import com.oracle.springboot.ssm.annotation.NoAuth;
import com.oracle.springboot.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @Description:
 * @Author: Tu Xu
 * @CreateDate: 2021/8/17 13:49
 * @Version: 1.0
 **/
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;


    @NoAuth
    @RequestMapping("/detail")
    public String detail(int id, HttpServletRequest request){
        request.setAttribute("user", userService.selectByPrimaryKey(id));
        return "user";
    }

}
