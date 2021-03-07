package com.carsonlius.gulimall.member.feign;

import com.carsonlius.common.utils.R;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("gulimall-coupon")
public interface CouponFeginService {
    @RequestMapping("/coupon/coupon/member/list")
    public R memberCoupons();
}
