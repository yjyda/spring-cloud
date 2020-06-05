package com.springcloud.entity;

import lombok.Data;

/**
 * Description:系统用户控制类
 * Author:YJY
 * Date:2020-06-04
 */
@Data
public class User {
    private Long id;
    private String username;
    private String name;
    private Integer age;
    private Double balance;

}
