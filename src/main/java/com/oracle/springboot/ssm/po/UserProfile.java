package com.oracle.springboot.ssm.po;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserProfile implements Serializable {
    private Integer id;

    private String sex;

    private Integer age;

    private String address;

    private String memo;

    private Date birthday;

    private static final long serialVersionUID = 1L;
}