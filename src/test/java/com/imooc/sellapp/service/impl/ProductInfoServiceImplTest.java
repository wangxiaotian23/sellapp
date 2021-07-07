package com.imooc.sellapp.service.impl;

import com.imooc.sellapp.domain.ProductInfo;
import com.imooc.sellapp.enums.ProductStatusEnum;
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
import java.util.List;

/**
 * @Auther: 李清依
 * @Date: 2021/7/6 16:00
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class ProductInfoServiceImplTest extends TestCase {
    @Autowired
    private ProductInfoServiceImpl productInfoService;
    @Test
    public void findOne() throws Exception {
        ProductInfo productInfo = productInfoService.findOne("123456");
        log.info(productInfo.toString());
        Assert.assertEquals("123456",productInfo.getProductId());
    }

    @Test
    public void findUpAll() throws Exception {
        List<ProductInfo> productInfoList =  productInfoService.findUpAll();
        log.info(productInfoList.size()+" ");
        Assert.assertNotEquals(0,productInfoList.size());
    }

    @Test
    public void findAll() throws Exception {
        PageRequest request = PageRequest.of(1,1);//第几页，内容行数
        Page<ProductInfo> productInfoPage = productInfoService.findAll(request);//分页
        System.out.println(productInfoPage.getTotalElements());//输出总元素
        productInfoPage.getContent();//查询的结果
        System.out.println(productInfoPage);
        Assert.assertNotEquals(0,productInfoPage.getTotalElements());
    }

    @Test
    public void save() throws Exception {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("123457");
        productInfo.setProductName("皮皮虾");
        productInfo.setProductPrice(new BigDecimal(15.5));
        productInfo.setProductStock(100);
        productInfo.setProductDescription("虾子不错");
        productInfo.setProductIcon("http://XXXX.jpg");
        productInfo.setProductStatus(ProductStatusEnum.DOWN.getCode());
        productInfo.setCategoryType(2);

        ProductInfo result = productInfoService.save(productInfo);
        Assert.assertNotNull(result);
    }

    /**
     * 测试上架
     * @throws Exception
     */
    @Test
    public void onSale() throws Exception {
        ProductInfo result = productInfoService.onSale("123456");
        Assert.assertEquals(ProductStatusEnum.UP,result.getProductStatusEnum());
    }

    /**
     * 测试下架
     * @throws Exception
     */
    @Test
    public void offSale() throws Exception {
        ProductInfo result = productInfoService.offSale("1234568");
        Assert.assertEquals(ProductStatusEnum.DOWN,result.getProductStatusEnum());
    }

}