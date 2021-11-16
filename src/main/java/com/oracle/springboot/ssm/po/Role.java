package com.oracle.springboot.ssm.po;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Role implements Serializable {
    private Integer id;

    private String englishName;

    private String chineseName;

    private Integer status;

    private Date createTime;

    private static final long serialVersionUID = 1L;
}