package com.imooc.sellapp.utils;

import java.util.Random;

/**
 * @Auther: 李清依
 * @Date: 2021/7/7 12:52
 * @Description:
 */
public class KeyUtil {
    public static synchronized String getUniqueKey() {
        Random random = new Random();
        Integer number = random.nextInt(900000) + 100000;
        return System.currentTimeMillis() + String.valueOf(number);
    }
}
