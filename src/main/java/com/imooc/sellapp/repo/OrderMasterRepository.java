package com.imooc.sellapp.repo;

import com.imooc.sellapp.domain.OrderMaster;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Auther: 李清依
 * @Date: 2021/7/6 17:19
 * @Description:
 */
public interface OrderMasterRepository extends JpaRepository<OrderMaster, String> {
    /**
     * 按照买家的openid查询
     * 分页查询订单
     *
     * @param buyerOpenId
     * @param pageable
     * @return
     */
    Page<OrderMaster> findByBuyerOpenid(String buyerOpenId, Pageable pageable);
}
