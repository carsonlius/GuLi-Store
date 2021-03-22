package com.carsonlius.gulimall.product.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.carsonlius.common.utils.PageUtils;
import com.carsonlius.common.utils.Query;

import com.carsonlius.gulimall.product.dao.CategoryDao;
import com.carsonlius.gulimall.product.entity.CategoryEntity;
import com.carsonlius.gulimall.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {
    @Autowired
    CategoryDao categoryDao;

    @Override
    public List<CategoryEntity> listsWithTree() {
        // 查所有分类
        List<CategoryEntity> entityList = baseMapper.selectList(null);

        // todo 组装成树
        List<CategoryEntity> categoryEntityList = entityList
                .stream()
                .filter(categoryEntity -> categoryEntity.getParentCid() == 0)
                .map((menu) -> {
                    menu.setChildren(getChildren(menu, entityList));
                    return menu;
                }).sorted((menu1,menu2) ->{
                    if (menu1.getSort() == null) {
                        return -1;
                    }

                    if (menu2.getSort() == null) {
                        return 1;
                    }

                    return menu1.getSort() - menu2.getSort();
                })
                .collect(Collectors.toList());

        return categoryEntityList;
    }

    private List<CategoryEntity> getChildren(CategoryEntity root, List<CategoryEntity> all) {
        // 设置递归基
        return all.stream().
                filter(categoryEntity -> categoryEntity.getParentCid().equals(root.getCatId()))
                .map(categoryEntity -> {
                    categoryEntity.setChildren(getChildren(categoryEntity, all));
                    return categoryEntity;
                }).sorted((menu1,menu2) ->{
                    if (menu1.getSort() == null) {
                        return -1;
                    }

                    if (menu2.getSort() == null) {
                        return 1;
                    }

                    return menu1.getSort() - menu2.getSort();
                })
                .collect(Collectors.toList());
    }

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

}