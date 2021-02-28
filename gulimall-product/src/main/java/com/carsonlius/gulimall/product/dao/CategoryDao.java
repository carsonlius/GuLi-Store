package com.carsonlius.gulimall.product.dao;

import com.carsonlius.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author carsonlius
 * @email carsonlius@163.com
 * @date 2021-02-28 15:10:47
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
