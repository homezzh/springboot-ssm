package com.oracle.springboot.ssm.po;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SeckillItems implements Serializable {
    private Integer id;

    private String itemsName;

    private Long seckillPrice;

    private Integer seckillCount;

    private String imgUrl;

    private Integer seckillSeqId;

    private static final long serialVersionUID = 1L;
}