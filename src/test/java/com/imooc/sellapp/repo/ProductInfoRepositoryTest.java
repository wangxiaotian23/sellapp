package com.imooc.sellapp.repo;

import com.imooc.sellapp.domain.ProductInfo;
import junit.framework.TestCase;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

/**
 * @Auther: 李清依
 * @Date: 2021/7/6 15:26
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class ProductInfoRepositoryTest {
    @Autowired
    private ProductInfoRepository repository;
    @Test
    public void saveTest(){
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("88888");
        productInfo.setProductName("鸡蛋粥");
        productInfo.setProductPrice(new BigDecimal(6.5));
        productInfo.setProductStock(100);
        productInfo.setProductDescription("味道不错哦");
        productInfo.setProductIcon("http://XXXX.jpg");
        productInfo.setProductStatus(0);
        productInfo.setCategoryType(2);
        ProductInfo result = repository.save(productInfo);
        Assert.assertNotEquals(null,result);

    }

    @Test
    public void findByProductStatus() throws Exception {
        List<ProductInfo> productInfoList = repository.findByProductStatus(0);
        for (ProductInfo p:productInfoList
             ) {
            System.out.println(p);
        }
        Assert.assertNotEquals(0,productInfoList.size());
    }
}