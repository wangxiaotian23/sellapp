package com.imooc.sellapp.enums;

import lombok.Getter;

/**
 * @Auther: 李清依
 * @Date: 2021/7/6 13:15
 * @Description:
 */
@Getter
public enum ProductStatusEnum implements CodeEnum {
    UP(0, "在架"),
    DOWN(1, "下架");
    private Integer code;

    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
