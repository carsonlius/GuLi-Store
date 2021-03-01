package com.carsonlius.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1. 整合mybaits-plus
 *  1> 倒入依赖        <dependency>
 *             <groupId>com.baomidou</groupId>
 *             <artifactId>mybatis-plus-boot-starter</artifactId>
 *             <version>3.3.1</version>
 *         </dependency>
 *  2> 配置
 *      1) 配置数据源（数据库）
 *          1. 倒入数据库驱动
 *          2. 配置数据源
 *      2) 配置mybaits-plus
 *          1. @MapperScan("com.baomidou.mybatisplus.samples.quickstart.mapper")
 *          2. 映射文件
 * */
@SpringBootApplication
@MapperScan("com.carsonlius.gulimall.product.dao")
public class GulimallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallProductApplication.class, args);
    }

}
