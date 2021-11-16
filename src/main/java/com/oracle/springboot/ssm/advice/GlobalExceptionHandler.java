package com.oracle.springboot.ssm.advice;

import com.oracle.springboot.ssm.exception.AccountException;
import com.oracle.springboot.ssm.vo.ResponseVo;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description:
 * @Author: Tu Xu
 * @CreateDate: 2021/8/18 16:03
 * @Version: 1.0
 **/
@ControllerAdvice
public class GlobalExceptionHandler {

    @ResponseBody
    @ExceptionHandler(Exception.class)
    public ResponseVo globalExceptionHandle(){
        return new ResponseVo("500", null, "程序出错了，请稍后再试");
    }

    @ResponseBody
    @ExceptionHandler(AccountException.class)
    public ResponseVo accountExceptionHandle(){
        return new ResponseVo("500", null, "账号密码错误!");
    }


}
