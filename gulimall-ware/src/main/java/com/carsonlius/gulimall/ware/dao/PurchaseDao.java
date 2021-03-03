package com.carsonlius.gulimall.ware.dao;

import com.carsonlius.gulimall.ware.entity.PurchaseEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 采购信息
 * 
 * @author carsonlius
 * @email carsonlius@163.com
 * @date 2021-03-02 23:24:22
 */
@Mapper
public interface PurchaseDao extends BaseMapper<PurchaseEntity> {
	
}
