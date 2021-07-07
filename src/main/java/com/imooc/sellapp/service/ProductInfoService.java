package com.imooc.sellapp.service;

import com.imooc.sellapp.domain.ProductInfo;
import com.imooc.sellapp.dto.CartDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @Auther: 李清依
 * @Date: 2021/7/6 15:23
 * @Description:
 */
public interface ProductInfoService {
    /**
     * 查询一个
     * @param productInfoId
     * @return
     */
    ProductInfo findOne(String productInfoId);

    /**
     * 查询所有在架商品列表
     * @return
     */
    List<ProductInfo> findUpAll();

    /**
     * 分页查询所有 商品列表
     * @param pageable
     * @return
     */
    Page<ProductInfo> findAll(Pageable pageable);

    /**
     * 更新和新增
     * @param productInfo
     * @return
     */
    ProductInfo save(ProductInfo productInfo);

    /**
     * 加库存
     */
    void increaseStock(List<CartDTO> cartDTOList);

    /**
     * 减库存
     */
    void decreaseStock(List<CartDTO> cartDTOList);

    /**
     * 上架
     */
    ProductInfo onSale(String productId);

    /**
     * 下架
     */
    ProductInfo offSale(String productId);
}
