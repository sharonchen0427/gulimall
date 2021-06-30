package com.atguigu.gulimall.user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.user.entity.UserCollectSkuEntity;

import java.util.Map;

/**
 * 关注商品表
 *
 * @author chensharon
 * @email chensharon0427@gmail.com
 * @date 2021-01-04 15:37:54
 */
public interface UserCollectSkuService extends IService<UserCollectSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

