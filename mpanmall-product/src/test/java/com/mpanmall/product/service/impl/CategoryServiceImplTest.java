package com.mpanmall.product.service.impl;

import com.mpanmall.product.entity.CategoryEntity;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class CategoryServiceImplTest {
    @Autowired
    private CategoryServiceImpl categoryService;

    @Test
    public void queryPage() {
    }

    @Test
    public void listWithTree() {
        List<CategoryEntity> categoryEntities = categoryService.listWithTree();
        Assertions.assertThat(categoryEntities.size()).isEqualTo(20);
    }

    @Test
    public void removeMenuByIds() {
    }

    @Test
    public void findCatelogPath() {
    }

    @Test
    public void updateCascade() {
    }
}