package com.atguigu.gulimall.user.dao;

import com.atguigu.gulimall.user.entity.GrowthHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 成长积分记录表
 * 
 * @author chensharon
 * @email chensharon0427@gmail.com
 * @date 2021-01-04 15:37:54
 */
@Mapper
public interface GrowthHistoryDao extends BaseMapper<GrowthHistoryEntity> {
	
}
