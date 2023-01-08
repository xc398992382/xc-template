package com.xc.template.controller.query;


import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class UserQuery{

    /**
     * 姓名
     * 字段 name 类型 varchar(255)
     */
    @NotNull(message = "用户名(name)不能为空")
    private String  name;

    /**
     * 性别
     * 字段 sex 类型 tinyint
     */
    @NotNull(message = "用户性别(sex)不能为空")
    private Integer  sex;


}
