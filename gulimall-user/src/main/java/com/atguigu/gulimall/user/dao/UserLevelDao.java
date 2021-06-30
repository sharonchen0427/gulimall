package com.atguigu.gulimall.user.dao;

import com.atguigu.gulimall.user.entity.UserLevelEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员等级表
 * 
 * @author chensharon
 * @email chensharon0427@gmail.com
 * @date 2021-01-04 15:37:54
 */
@Mapper
public interface UserLevelDao extends BaseMapper<UserLevelEntity> {
	
}
