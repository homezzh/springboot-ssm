package com.oracle.springboot.ssm.po;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SeckillSeq implements Serializable {
    private Integer id;

    /**
    * 这一期的名称
    */
    private String seqName;

    private Date startDate;

    private Date endDate;

    /**
    * 默认为0
    */
    private Integer status;

    private static final long serialVersionUID = 1L;
}