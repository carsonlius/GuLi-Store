package com.carsonlius.gulimall.member.dao;

import com.carsonlius.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author carsonlius
 * @email carsonlius@163.com
 * @date 2021-03-02 23:07:27
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
