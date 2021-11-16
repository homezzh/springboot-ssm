package com.oracle.springboot.ssm.po;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Reciver implements Serializable {
    private Integer id;

    private String reciverName;

    private String phone;

    private String address;

    private Integer userId;

    private static final long serialVersionUID = 1L;
}