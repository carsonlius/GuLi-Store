package com.carsonlius.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.carsonlius.common.utils.PageUtils;
import com.carsonlius.gulimall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author carsonlius
 * @email carsonlius@163.com
 * @date 2021-03-02 23:19:59
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

