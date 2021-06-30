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

import com.atguigu.gulimall.user.entity.UserStatisticsEntity;
import com.atguigu.gulimall.user.service.UserStatisticsService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.common.utils.R;



/**
 * 统计信息表
 *
 * @author chensharon
 * @email chensharon0427@gmail.com
 * @date 2021-01-04 15:37:54
 */
@RestController
@RequestMapping("user/userstatistics")
public class UserStatisticsController {
    @Autowired
    private UserStatisticsService userStatisticsService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("user:userstatistics:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = userStatisticsService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("user:userstatistics:info")
    public R info(@PathVariable("id") Long id){
		UserStatisticsEntity userStatistics = userStatisticsService.getById(id);

        return R.ok().put("userStatistics", userStatistics);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("user:userstatistics:save")
    public R save(@RequestBody UserStatisticsEntity userStatistics){
		userStatisticsService.save(userStatistics);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("user:userstatistics:update")
    public R update(@RequestBody UserStatisticsEntity userStatistics){
		userStatisticsService.updateById(userStatistics);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("user:userstatistics:delete")
    public R delete(@RequestBody Long[] ids){
		userStatisticsService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
