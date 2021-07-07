package com.imooc.sellapp.service;

import com.imooc.sellapp.domain.ProductCategory;

import java.util.List;

/**
 * @Auther: 李清依
 * @Date: 2021/7/6 14:57
 * @Description:
 */
public interface ProductCategoryService {
    /**
     * 查询一个
     * @param categoryId
     * @return
     */
    ProductCategory findOne(Integer categoryId);

    /**
     * 查询所有
     * @return
     */
    List<ProductCategory> findAll();
    /**
     * 通过categoryType集合 查询出ProductCategory集合
     * @param categoryTypeList
     * @return
     */
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    /**
     * 更新和新增
     * @param productCategory
     * @return
     */
    ProductCategory save(ProductCategory productCategory);
}
