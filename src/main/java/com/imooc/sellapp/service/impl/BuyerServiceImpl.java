package com.imooc.sellapp.service.impl;

import com.imooc.sellapp.dto.OrderDTO;
import com.imooc.sellapp.service.BuyerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auther: 李清依
 * @Date: 2021/7/6 20:03
 * @Description:
 */
@Service
public class BuyerServiceImpl implements BuyerService {
    @Autowired
    private BuyerService buyerService;
    @Override
    public OrderDTO findOrderOne(String openid, String orderId) {
        return null;
    }

    @Override
    public OrderDTO cancelOrder(String openid, String orderId) {
        return null;
    }
}
