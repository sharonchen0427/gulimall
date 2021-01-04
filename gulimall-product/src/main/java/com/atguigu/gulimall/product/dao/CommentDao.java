package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CommentEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价
 * 
 * @author chensh
 * @email chensharon0427@gmail.com
 * @date 2020-12-31 13:13:42
 */
@Mapper
public interface CommentDao extends BaseMapper<CommentEntity> {
	
}
