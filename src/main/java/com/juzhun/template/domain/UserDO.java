package com.juzhun.template.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *  
 * @author xc
 * @date 2022-08-31
 */
@TableName("t_user")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDO {

    /**
     * 主键
     * 字段 id 类型 int
     */
    private Integer  id;

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