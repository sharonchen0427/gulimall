package com.atguigu.gulimall.user.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.common.utils.Query;

import com.atguigu.gulimall.user.dao.UserAddressDao;
import com.atguigu.gulimall.user.entity.UserAddressEntity;
import com.atguigu.gulimall.user.service.UserAddressService;


@Service("userAddressService")
public class UserAddressServiceImpl extends ServiceImpl<UserAddressDao, UserAddressEntity> implements UserAddressService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<UserAddressEntity> page = this.page(
                new Query<UserAddressEntity>().getPage(params),
                new QueryWrapper<UserAddressEntity>()
        );

        return new PageUtils(page);
    }

}