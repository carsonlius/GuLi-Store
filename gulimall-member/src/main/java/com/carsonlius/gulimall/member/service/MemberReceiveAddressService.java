package com.carsonlius.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.carsonlius.common.utils.PageUtils;
import com.carsonlius.gulimall.member.entity.MemberReceiveAddressEntity;

import java.util.Map;

/**
 * 会员收货地址
 *
 * @author carsonlius
 * @email carsonlius@163.com
 * @date 2021-03-02 23:07:27
 */
public interface MemberReceiveAddressService extends IService<MemberReceiveAddressEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

