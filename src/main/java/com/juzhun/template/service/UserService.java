package com.juzhun.template.service;

import com.github.pagehelper.PageInfo;
import com.juzhun.template.domain.bo.UserBO;

public interface UserService {

    /**
     * 新增用户
     * @param userBO
     * @return
     */
    Integer addUser(UserBO userBO);

    /**
     * 查询用户
     * @param userId
     * @return
     */
    UserBO getUser(Integer userId);

    /**
     *
     * @param pageSize
     * @param pageIndex
     * @return
     */
    PageInfo<UserBO> pageUser(Integer pageSize, Integer pageIndex);

}
