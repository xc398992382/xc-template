package com.xc.template.controller;

import cn.hutool.core.collection.CollectionUtil;
import com.github.pagehelper.PageInfo;
import com.xc.template.controller.query.UserPageQuery;
import com.xc.template.controller.query.UserQuery;
import com.xc.template.domain.bo.UserBO;
import com.xc.template.domain.vo.UserVO;
import com.xc.template.service.UserService;
import com.xc.template.utils.copy.BeanUtilCopy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 用户
 */
@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {


    @Autowired
    private UserService userService;

    private String url;

    @GetMapping("/config")
    public String addUser() {
        return url;
    }

    /**
     * 查询用户
     * @param userId
     * @return
     */
    @GetMapping("/{userId}")
    public UserVO getUser(@PathVariable Integer userId) {
        UserBO userBO = userService.getUser(userId);
        UserVO userVO = new UserVO();
        BeanUtils.copyProperties(userBO,userVO);
        return userVO;
    }

    /**
     * 新增用户
     * @param userQuery
     * @return
     */
    @PostMapping("/add")
    public Integer addUser(@Validated @RequestBody UserQuery userQuery) {
        UserBO userBO = new UserBO();
        BeanUtils.copyProperties(userQuery,userBO);
        return userService.addUser(userBO);
    }

    /**
     * 查询用户
     * @param userPageQuery 分页
     * @return
     */
    @PostMapping("/page")
    public PageInfo<UserVO> pageUser(@RequestBody UserPageQuery userPageQuery) {
        Integer pageSize = userPageQuery.getPageSize();
        Integer pageIndex = userPageQuery.getPageNum();
        PageInfo<UserBO> userBOPageInfo = userService.pageUser(userPageQuery.getPageSize(),userPageQuery.getPageNum());
        List<UserBO> boList = userBOPageInfo.getList();
        if(CollectionUtil.isEmpty(boList)){
            return PageInfo.emptyPageInfo();
        }
        List<UserVO> voList = BeanUtilCopy.copyListProperties(boList,UserVO::new);
        return PageInfo.of(voList);
    }

}
