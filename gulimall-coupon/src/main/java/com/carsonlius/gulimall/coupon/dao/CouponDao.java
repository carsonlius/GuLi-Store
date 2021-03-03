package com.carsonlius.gulimall.coupon.dao;

import com.carsonlius.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author carsonlius
 * @email carsonlius@163.com
 * @date 2021-03-02 22:52:48
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
