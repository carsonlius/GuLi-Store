package com.carsonlius.gulimall.ware.dao;

import com.carsonlius.gulimall.ware.entity.WareInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 仓库信息
 * 
 * @author carsonlius
 * @email carsonlius@163.com
 * @date 2021-03-02 23:24:22
 */
@Mapper
public interface WareInfoDao extends BaseMapper<WareInfoEntity> {
	
}
