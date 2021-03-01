package com.carsonlius.gulimall.product;

import com.baomidou.mybatisplus.core.conditions.AbstractWrapper;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.segments.MergeSegments;
import com.carsonlius.gulimall.product.entity.BrandEntity;
import com.carsonlius.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class GulimallProductApplicationTests {
    @Autowired
    BrandService brandService;


    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setLogo("狼🐺");
//        brandEntity.setName("saven");
//        brandEntity.setDescript("知名品牌");
//        brandEntity.setSort(10);
//        brandEntity.setShowStatus(1);
//        brandEntity.setFirstLetter("w");
//        brandService.save(brandEntity);

//        brandEntity.setBrandId(1L);
//        brandEntity.setName("anta");
//        brandService.updateById(brandEntity);

        Wrapper wrapper = new QueryWrapper<BrandEntity>().ge("brand_id", 1);
        List<BrandEntity>  brandEntityList= brandService.list(wrapper);
        System.out.println("success---------------------------->!");
        System.out.println(brandEntityList);
        System.out.println("===================================");

    }

}
