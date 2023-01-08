package com.xc.template.domain.bo;

import lombok.Data;

/**
 * 用户BO
 */
@Data
public class UserBO {

    /**
     * 姓名
     * 字段 name 类型 varchar(255)
     */
    private String  name;

    /**
     * 性别
     * 字段 sex 类型 tinyint
     */
    private Integer  sex;

}
