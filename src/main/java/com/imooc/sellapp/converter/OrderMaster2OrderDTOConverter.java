package com.imooc.sellapp.converter;

import com.imooc.sellapp.domain.OrderMaster;
import com.imooc.sellapp.dto.OrderDTO;
import org.springframework.beans.BeanUtils;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @Auther: 李清依
 * @Date: 2021/7/6 20:15
 * @Description:
 */
public class OrderMaster2OrderDTOConverter {
    public static OrderDTO converter(OrderMaster orderMaster) {
        OrderDTO orderDTO = new OrderDTO();
        BeanUtils.copyProperties(orderMaster, orderDTO);
        return orderDTO;
    }

    public static List<OrderDTO> converter(List<OrderMaster> orderMasterList) {
        return orderMasterList.stream().map(e -> converter(e)).collect(Collectors.toList());
    }
}
