package com.carsonlius.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.carsonlius.common.utils.PageUtils;
import com.carsonlius.gulimall.coupon.entity.HomeSubjectSpuEntity;

import java.util.Map;

/**
 * 专题商品
 *
 * @author carsonlius
 * @email carsonlius@163.com
 * @date 2021-03-02 22:52:48
 */
public interface HomeSubjectSpuService extends IService<HomeSubjectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

