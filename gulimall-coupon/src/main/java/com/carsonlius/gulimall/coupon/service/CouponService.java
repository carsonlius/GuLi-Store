package com.carsonlius.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.carsonlius.common.utils.PageUtils;
import com.carsonlius.gulimall.coupon.entity.CouponEntity;

import java.util.Map;

/**
 * 优惠券信息
 *
 * @author carsonlius
 * @email carsonlius@163.com
 * @date 2021-03-02 22:52:48
 */
public interface CouponService extends IService<CouponEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

