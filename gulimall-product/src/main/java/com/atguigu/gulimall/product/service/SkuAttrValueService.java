package com.atguigu.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.product.entity.SkuAttrValueEntity;

import java.util.Map;

/**
 * sku销售属性&值
 *
 * @author chensh
 * @email chensharon0427@gmail.com
 * @date 2020-12-31 13:13:42
 */
public interface SkuAttrValueService extends IService<SkuAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

