package com.imooc.sellapp.repo;

import com.imooc.sellapp.domain.OrderMaster;
import junit.framework.TestCase;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

/**
 * @Auther: 李清依
 * @Date: 2021/7/6 17:21
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class OrderMasterRepositoryTest {
    @Autowired
    private OrderMasterRepository repository;
    private final String OPENID = "110110";

    @Test
    public void saveTest() {
        OrderMaster orderMaster = new OrderMaster();
        orderMaster.setOrderId("1234567");
        orderMaster.setBuyerName("陈浩翔");
        orderMaster.setBuyerPhone("12345678912");
        orderMaster.setBuyerAddress("长沙");
        orderMaster.setBuyerOpenid(OPENID);
        orderMaster.setOrderAmount(new BigDecimal(2.5));
        OrderMaster result = repository.save(orderMaster);
        Assert.assertNotNull(result);
    }
    @Test
    public void findByBuyerOpenid() throws Exception {

        PageRequest pageRequest = PageRequest.of(1,3);
        Page<OrderMaster> result = repository.findByBuyerOpenid(OPENID,pageRequest);
        Assert.assertNotEquals(0,result.getTotalElements());
        System.out.println(result.getTotalElements());//总条数

    }
}