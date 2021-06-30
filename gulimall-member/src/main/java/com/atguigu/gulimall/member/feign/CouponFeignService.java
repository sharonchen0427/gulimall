package com.atguigu.gulimall.member.feign;

import com.atguigu.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
//name in nacos...:
@FeignClient("gulimall-coupon")
    public interface CouponFeignService {
        @RequestMapping("/coupon/coupon/user/list")
        public R membercoupons();
        //get these two lines from CouponController
}
