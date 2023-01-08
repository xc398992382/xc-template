package com.juzhun.template.repository;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.juzhun.template.domain.UserDO;
import com.juzhun.template.mapper.UserMapper;
import org.springframework.stereotype.Repository;

/**
 * 用户域CURD
 */
@Repository
public class UserRepository extends ServiceImpl<UserMapper, UserDO> {
}
