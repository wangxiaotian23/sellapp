package com.imooc.sellapp.dto;

import lombok.Data;

/**
 * @Auther: 李清依
 * @Date: 2021/7/6 15:25
 * @Description:
 */
@Data
public class CartDTO {
    /**
     * 商品Id
     */
    private String productId;

    /**
     * 数量
     */
    private Integer productQuantity;

    public CartDTO() {
    }

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
