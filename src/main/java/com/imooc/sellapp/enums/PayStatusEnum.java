package com.imooc.sellapp.enums;

import lombok.Getter;

/**
 * @Auther: 李清依
 * @Date: 2021/7/6 17:14
 * @Description:
 */
@Getter
public enum PayStatusEnum implements CodeEnum<Integer>{
    WAIT(0,"等待支付"),
    SUCCESS(1,"支付成功"),
    ;

    private Integer code;

    private String message;

    PayStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }


}