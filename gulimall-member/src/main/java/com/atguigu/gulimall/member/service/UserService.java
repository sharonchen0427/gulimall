package com.atguigu.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.member.entity.UserEntity;

import java.util.Map;

/**
 * 用户表
 *
 * @author chensharon
 * @email chensharon0427@gmail.com
 * @date 2021-01-04 15:37:54
 */
public interface UserService extends IService<UserEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

