package com.carsonlius.gulimall.order.dao;

import com.carsonlius.gulimall.order.entity.PaymentInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表
 * 
 * @author carsonlius
 * @email carsonlius@163.com
 * @date 2021-03-02 23:19:59
 */
@Mapper
public interface PaymentInfoDao extends BaseMapper<PaymentInfoEntity> {
	
}
