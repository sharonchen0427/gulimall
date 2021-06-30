package com.atguigu.gulimall.user.controller;

import java.util.Arrays;
import java.util.Map;

//import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.atguigu.gulimall.user.entity.IntegrationHistoryEntity;
import com.atguigu.gulimall.user.service.IntegrationHistoryService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.common.utils.R;



/**
 * 购物积分记录表
 *
 * @author chensharon
 * @email chensharon0427@gmail.com
 * @date 2021-01-04 15:37:54
 */
@RestController
@RequestMapping("user/integrationhistory")
public class IntegrationHistoryController {
    @Autowired
    private IntegrationHistoryService integrationHistoryService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("user:integrationhistory:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = integrationHistoryService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("user:integrationhistory:info")
    public R info(@PathVariable("id") Long id){
		IntegrationHistoryEntity integrationHistory = integrationHistoryService.getById(id);

        return R.ok().put("integrationHistory", integrationHistory);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("user:integrationhistory:save")
    public R save(@RequestBody IntegrationHistoryEntity integrationHistory){
		integrationHistoryService.save(integrationHistory);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("user:integrationhistory:update")
    public R update(@RequestBody IntegrationHistoryEntity integrationHistory){
		integrationHistoryService.updateById(integrationHistory);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("user:integrationhistory:delete")
    public R delete(@RequestBody Long[] ids){
		integrationHistoryService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
