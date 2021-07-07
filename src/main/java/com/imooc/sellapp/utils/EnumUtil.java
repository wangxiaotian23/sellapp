package com.imooc.sellapp.utils;

import com.imooc.sellapp.enums.CodeEnum;

/**
 * @Auther: 李清依
 * @Date: 2021/7/6 13:19
 * @Description:
 */
public class EnumUtil {
    private EnumUtil(){}
    public static <T extends CodeEnum> T getByCode(Integer code, Class<T> enumClass){
        for (T each:enumClass.getEnumConstants()
             ) {
            if (code.equals(each.getCode())){
                return each;
            }
        }
        return null;
    }
}
