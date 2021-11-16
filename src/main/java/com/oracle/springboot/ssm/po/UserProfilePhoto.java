package com.oracle.springboot.ssm.po;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserProfilePhoto implements Serializable {
    private Integer id;

    private String picName;

    private String picUrl;

    private Integer userId;

    private static final long serialVersionUID = 1L;
}