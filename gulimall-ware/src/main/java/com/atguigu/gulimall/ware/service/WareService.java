package com.atguigu.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.ware.entity.WareEntity;

import java.util.Map;

/**
 * 仓库信息
 *
 * @author chensh
 * @email chensharon0427@gmail.com
 * @date 2020-12-29 00:39:25
 */
public interface WareService extends IService<WareEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

