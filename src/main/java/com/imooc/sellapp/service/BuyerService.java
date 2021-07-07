package com.imooc.sellapp.service;

import com.imooc.sellapp.dto.OrderDTO;

/**
 * @Auther: 李清依
 * @Date: 2021/7/6 17:29
 * @Description:
 */
public interface BuyerService {
    //查询一个订单
    OrderDTO findOrderOne(String openid, String orderId);

    //取消订单
    OrderDTO cancelOrder(String openid,String orderId);
}
