package com.carsonlius.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.carsonlius.common.utils.PageUtils;
import com.carsonlius.gulimall.ware.entity.WareSkuEntity;

import java.util.Map;

/**
 * 商品库存
 *
 * @author carsonlius
 * @email carsonlius@163.com
 * @date 2021-03-02 23:24:22
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

