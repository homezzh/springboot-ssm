package com.oracle.springboot.ssm.po;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(description = "用户")
public class User implements Serializable {
    private Integer id;

    @ApiModelProperty(name="username",value = "用户账号")
    private String username;

    private String password;

    private String phone;

    private static final long serialVersionUID = 1L;
}