package com.imooc.sellapp.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.imooc.sellapp.domain.OrderDetail;
import com.imooc.sellapp.enums.OrderStatusEnum;
import com.imooc.sellapp.enums.PayStatusEnum;
import com.imooc.sellapp.utils.EnumUtil;
import com.imooc.sellapp.utils.serializer.Date2LongSerializer;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @Auther: 李清依
 * @Date: 2021/7/6 17:30
 * @Description:
 */
@Data
public class OrderDTO {
    /**
     * 订单ID
     */
    private String orderId;
    /**
     * 买家名字
     */
    private String buyerName;

    /**
     * 买家手机号
     */
    private String buyerPhone;

    /**
     * 买家地址
     */
    private String buyerAddress;

    /**
     * 买家微信Openid
     */
    private String buyerOpenid;
    /**
     * 订单金额
     */
    private BigDecimal orderAmount;

    /**
     * 订单状态，默认为新下单
     */
    private Integer orderStatus;//初始化状态不需要了

    /**
     * 支付状态，默认为0-未支付
     */
    private Integer payStatus;//初始化状态不需要了

    /**
     * 创建时间
     */
    @JsonSerialize(using = Date2LongSerializer.class)
    private Date createTime;

    /**
     * 更新时间
     */
    @JsonSerialize(using = Date2LongSerializer.class)
    private Date updateTime;

    /**
     * 订单详情
     */
    private List<OrderDetail> orderDetailList;

    @JsonIgnore //对象转换成json格式返回到前端会忽略该方法
    public OrderStatusEnum getOrderStatusEnum() {
        return EnumUtil.getByCode(orderStatus, OrderStatusEnum.class);
    }

    @JsonIgnore //对象转换成json格式返回到前端会忽略该方法
    public PayStatusEnum getPayStatusEnum() {
        return EnumUtil.getByCode(payStatus, PayStatusEnum.class);
    }
}
