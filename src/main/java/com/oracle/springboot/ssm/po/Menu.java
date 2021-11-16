package com.oracle.springboot.ssm.po;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Menu implements Serializable {
    private Integer id;

    private Integer parentId;

    /**
    * 菜单名称
    */
    private String menuName;

    private String menuLogo;

    private String menuUrl;

    private Integer status;

    private Date createTime;

    private String menuKey;

    private static final long serialVersionUID = 1L;
}