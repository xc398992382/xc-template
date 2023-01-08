package com.xc.template.repository;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xc.template.domain.UserDO;
import com.xc.template.mapper.UserMapper;
import org.springframework.stereotype.Repository;

/**
 * 用户域CURD
 */
@Repository
public class UserRepository extends ServiceImpl<UserMapper, UserDO> {
}
