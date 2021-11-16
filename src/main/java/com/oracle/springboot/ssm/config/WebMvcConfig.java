package com.oracle.springboot.ssm.config;

import com.oracle.springboot.ssm.security.SecurityInterceptor;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.handler.MappedInterceptor;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Description:
 * @Author: Tu Xu
 * @CreateDate: 2021/8/17 9:06
 * @Version: 1.0
 **/
@Configuration
@EnableSwagger2
public class WebMvcConfig extends  WebMvcConfigurationSupport {



    @Bean
    public Docket createRestApi() {
        ApiInfo apiInfo = new ApiInfoBuilder()
                .title("Rest Api")
                .description("Just once that all I need")
                .version("1.0.0")
                .contact(new Contact("tuxu", "32423", "34324"))
                .build();
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.oracle.springboot.ssm.controller"))
                .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
                .paths(PathSelectors.any())
                .build();
    }
    @Autowired
    private SecurityInterceptor securityInterceptor;


    /**
   添加拦截器
      **/
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(securityInterceptor).addPathPatterns("/**").excludePathPatterns("/**/doc.html","/swagger-resources/**","/webjars/**","/v2/**","/swagger-ui.html/**","/error");
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
       registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
        registry.addResourceHandler("swagger-ui.html")
                .addResourceLocations("classpath:/META-INF/resources/");
        registry.addResourceHandler("/webjars/**")
                .addResourceLocations("classpath:/META-INF/resources/webjars/");
        registry.addResourceHandler("doc.html").addResourceLocations("classpath:/META-INF/resources/");
    }
}
