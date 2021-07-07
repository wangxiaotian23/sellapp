package com.imooc.sellapp.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @Auther: 李清依
 * @Date: 2021/7/6 16:21
 * @Description:
 */
@Data
public class ResultVO<T> implements Serializable {
    private static final long serialVersionUID = 4176441568338187710L;//实现序列化
    /**
     * 错误码
     */
    private Integer code;
    /**
     * 提示信息
     */
    private String msg;
//    private String msg = "";//赋予初始值

    /**
     * 返回的具体内容
     */
    private T data;
}
