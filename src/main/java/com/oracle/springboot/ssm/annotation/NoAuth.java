package com.oracle.springboot.ssm.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Description:
 * @Author: Tu Xu
 * @CreateDate: 2021/8/17 9:48
 * @Version: 1.0
 **/
@Target(value = ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface NoAuth {
}
