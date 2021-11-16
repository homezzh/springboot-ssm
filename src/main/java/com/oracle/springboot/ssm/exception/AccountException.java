package com.oracle.springboot.ssm.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Description:
 * @Author: Tu Xu
 * @CreateDate: 2021/8/18 16:12
 * @Version: 1.0
 **/
@Data
@AllArgsConstructor
public class AccountException extends  Exception {
    private String message;

    private String status;


}
