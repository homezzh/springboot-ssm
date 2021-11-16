package com.oracle.springboot.ssm.controller;

import com.oracle.springboot.ssm.annotation.NoAuth;
import com.oracle.springboot.ssm.exception.AccountException;
import com.oracle.springboot.ssm.po.User;
import com.oracle.springboot.ssm.service.UserService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * @Description:
 * @Author: Tu Xu
 * @CreateDate: 2021/8/16 10:06
 * @Version: 1.0
 **/
@RestController
@RequestMapping("/test")
@Api(tags = "用户相关接口",description = "用户相关增删改查")
public class TestController {
    @Autowired
    private UserService userService;
    @Autowired
    private RedisTemplate redisTemplate;

    @RequestMapping("/detail/{id}")
    public User test(@PathVariable("id") int id, HttpSession session){
        return userService.selectByPrimaryKey(id);
    }

    @NoAuth
    @RequestMapping(value = "/test/{id}",method = RequestMethod.GET)
    @ApiOperation(value="用户详情查询",notes = "通过用户id查询用户详情")
    @ApiImplicitParams({
            @ApiImplicitParam(name="id",value="用户id",required = true,dataType = "Integer")
      })
    public User test1 (@PathVariable("id") int id, HttpSession session) throws Exception{
        //判断用户名密码是否正确
      // throw new AccountException("500","账号密码不对!");
        return userService.selectByPrimaryKey(id);

    }
}
