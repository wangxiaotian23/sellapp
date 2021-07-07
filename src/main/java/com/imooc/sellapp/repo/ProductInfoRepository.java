package com.imooc.sellapp.repo;

import com.imooc.sellapp.domain.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Auther: 李清依
 * @Date: 2021/7/6 15:22
 * @Description:
 */
public interface ProductInfoRepository extends JpaRepository<ProductInfo,String> {
    /**
     * 通过商品状态查询
     * @param productStatus
     * @return
     */
    List<ProductInfo> findByProductStatus(Integer productStatus);
}
