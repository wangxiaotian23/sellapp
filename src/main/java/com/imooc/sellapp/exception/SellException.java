package com.imooc.sellapp.exception;

import com.imooc.sellapp.enums.ResultEnum;

/**
 * @Auther: 李清依
 * @Date: 2021/7/6 15:51
 * @Description:
 */
public class SellException extends RuntimeException {
    private Integer code;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }


    public SellException(Integer code, String defaultMessage) {
        super(defaultMessage);
        this.code=code;
    }
}
