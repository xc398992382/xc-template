package com.juzhun.template.controller.query;


import com.github.pagehelper.Page;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class UserPageQuery extends Page {

    /**
     * 姓名
     * 字段 name 类型 varchar(255)
     */
    private String  name;

}
