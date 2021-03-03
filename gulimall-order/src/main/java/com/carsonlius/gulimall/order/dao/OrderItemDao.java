package com.carsonlius.gulimall.order.dao;

import com.carsonlius.gulimall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author carsonlius
 * @email carsonlius@163.com
 * @date 2021-03-02 23:19:59
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
