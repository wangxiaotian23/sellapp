package com.imooc.sellapp.repo;

import com.imooc.sellapp.domain.ProductCategory;
import junit.framework.TestCase;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;

/**
 * @Auther: 李清依
 * @Date: 2021/7/6 13:26
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class ProductCategoryRepositoryTest extends TestCase {
    @Autowired
    private ProductCategoryRepository repository;

    /**
     * 测试查找
     */
    @Test
    public void findOnetest() {
        ProductCategory productCategory = (ProductCategory) repository.findById(1).orElse(null);
        log.info(productCategory.toString()+"***");
    }

    /**
     * 新增
     */
    @Test
    //@Transactional //在测试里面的事务是完全回滚，运行完就回滚
    public void saveTest(){
        ProductCategory productCategory = new ProductCategory("女生最爱",5);
        ProductCategory result = repository.save(productCategory);
        Assert.assertNotNull(result);
//        Assert.assertNotEquals(null,result);//不期望是null，期望是result  和上面是一样的
    }
    /**
     * 更新
     * 先查询出来再更新
     */
    @Test
    public void saveTest2(){
        ProductCategory productCategory = repository.findById(2).orElse(null);
        productCategory.setCategoryType(10);
        repository.save(productCategory);
    }

    @Test
    public void findByCategoryTypeInTest(){
        List<Integer> list = Arrays.asList(2,3,4);
        List<ProductCategory> productCategoryList =  repository.findByCategoryTypeIn(list);
        log.info(productCategoryList.toString());
        Assert.assertNotEquals(0,productCategoryList.size());
    }
}