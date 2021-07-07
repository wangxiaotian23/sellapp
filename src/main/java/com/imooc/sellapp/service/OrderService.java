package com.imooc.sellapp.service;

import com.imooc.sellapp.dto.OrderDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * @Auther: 李清依
 * @Date: 2021/7/6 20:04
 * @Description:
 */
public interface OrderService {
    /**
     * 创建订单
     */
    OrderDTO create(OrderDTO orderDTO);

    /**
     * 查询单个订单
     */
    OrderDTO findOne(String orderId);

    /**
     * 查询订单列表 - 单个人
     */
    Page<OrderDTO> findList(String buyerOpenid, Pageable pageable);

    /**
     * 分页查询订单列表
     */
    Page<OrderDTO> findList(Pageable pageable);

    /**
     * 取消订单
     */
    OrderDTO cancel(OrderDTO orderDTO);

    /**
     * 完结订单
     */
    OrderDTO finish(OrderDTO orderDTO);

    /**
     * 支付订单
     */
    OrderDTO paid(OrderDTO orderDTO);
}
