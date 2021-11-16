package com.oracle.springboot.ssm.po;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Items implements Serializable {
    private Integer id;

    private String itemsName;

    private Double itemsPrice;

    private Integer count;

    private String pic;

    private Integer status;

    private static final long serialVersionUID = 1L;
}