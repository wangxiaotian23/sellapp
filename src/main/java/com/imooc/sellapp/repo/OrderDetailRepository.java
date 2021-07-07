package com.imooc.sellapp.repo;

import com.imooc.sellapp.domain.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Auther: 李清依
 * @Date: 2021/7/6 20:07
 * @Description:
 */
public interface OrderDetailRepository extends JpaRepository<OrderDetail,String> {
    List<OrderDetail> findByOrderId(String orderId);
}
