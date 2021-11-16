package com.oracle.springboot.ssm;

import com.oracle.springboot.ssm.config.CacheConfig;
import com.oracle.springboot.ssm.config.WebMvcConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
ssm整合 springmvc
 **/
@SpringBootApplication
@MapperScan("com.oracle.springboot.ssm.mapper")
@EnableTransactionManagement
@Import({CacheConfig.class, WebMvcConfig.class})
public class App  {

    public static void main(String[] args) {
       SpringApplication.run(App.class);
    }


}


