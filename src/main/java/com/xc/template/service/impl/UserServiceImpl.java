package com.xc.template.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xc.template.domain.UserDO;
import com.xc.template.domain.bo.UserBO;
import com.xc.template.repository.UserRepository;
import com.xc.template.service.UserService;
import com.xc.template.utils.copy.PageInfoUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    /**
     * 新增用户
     * @param userBO
     * @return
     */
    @Override
    public Integer addUser(UserBO userBO) {
        UserDO userDO = new UserDO();
        BeanUtils.copyProperties(userBO,userDO);
        userRepository.save(userDO);
        return userDO.getId();
    }

    @Override
    public UserBO getUser(Integer userId) {
        UserBO userBO = new UserBO();
        UserDO userDO = userRepository.getById(userId);
        BeanUtils.copyProperties(userDO,userBO);
        return userBO;
    }


    @Override
    public PageInfo<UserBO> pageUser(Integer pageSize, Integer pageIndex) {
        PageHelper.startPage(pageIndex, pageSize);
        List<UserDO> userDOList =  userRepository.list();
        if(CollectionUtils.isEmpty(userDOList)){
            return PageInfo.emptyPageInfo();
        }
        PageInfo<UserDO> page = PageInfo.of(userDOList);
        PageInfo<UserBO> boPage = PageInfoUtil.pageInfoConvert(page, UserBO.class);
        return boPage;
    }
}
