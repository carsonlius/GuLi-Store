package com.carsonlius.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.carsonlius.common.utils.PageUtils;
import com.carsonlius.gulimall.member.entity.GrowthChangeHistoryEntity;

import java.util.Map;

/**
 * 成长值变化历史记录
 *
 * @author carsonlius
 * @email carsonlius@163.com
 * @date 2021-03-02 23:07:27
 */
public interface GrowthChangeHistoryService extends IService<GrowthChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

