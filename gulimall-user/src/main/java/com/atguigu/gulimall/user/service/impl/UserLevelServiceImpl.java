package com.atguigu.gulimall.user.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.common.utils.Query;

import com.atguigu.gulimall.user.dao.UserLevelDao;
import com.atguigu.gulimall.user.entity.UserLevelEntity;
import com.atguigu.gulimall.user.service.UserLevelService;


@Service("userLevelService")
public class UserLevelServiceImpl extends ServiceImpl<UserLevelDao, UserLevelEntity> implements UserLevelService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<UserLevelEntity> page = this.page(
                new Query<UserLevelEntity>().getPage(params),
                new QueryWrapper<UserLevelEntity>()
        );

        return new PageUtils(page);
    }

}