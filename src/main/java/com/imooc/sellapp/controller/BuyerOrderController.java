package com.imooc.sellapp.controller;

import com.imooc.sellapp.form.OrderForm;
import com.imooc.sellapp.service.BuyerService;
import com.imooc.sellapp.service.OrderService;
import com.imooc.sellapp.service.impl.BuyerServiceImpl;
import com.imooc.sellapp.service.impl.OrderServiceImpl;
import com.imooc.sellapp.vo.ResultVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.Map;

/**
 * @Auther: 李清依
 * @Date: 2021/7/7 16:46
 * @Description:
 */
@Slf4j
@RestController
@RequestMapping("/buyer/order")
public class BuyerOrderController {
    @Autowired
    private OrderServiceImpl orderService;

    @Autowired
    private BuyerServiceImpl buyerService;

    @PostMapping("/create")
    public ResultVO<Map<String, String>> create(@Valid OrderForm orderForm, BindingResult bindingResult) {
        // 1. 判断表单校验有没有错误
        if (bindingResult.hasErrors()){
            log.error("【创建订单】参数错误，orderForm={}",orderForm);

        }
    }
}
