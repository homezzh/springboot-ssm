package com.oracle.springboot.ssm.po;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Orders implements Serializable {
    private Integer id;

    private String ordersNum;

    private Integer ordersStatus;

    private Integer itemsCount;

    private Double money;

    private Integer userId;

    private Date createTime;

    private Integer deleteStatus;

    private Integer reciverId;

    private static final long serialVersionUID = 1L;
}