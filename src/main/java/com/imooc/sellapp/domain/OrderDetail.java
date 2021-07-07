package com.imooc.sellapp.domain;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @Auther: 李清依
 * @Date: 2021/7/6 17:30
 * @Description:
 */
//Include.Include.ALWAYS 默认
//Include.NON_DEFAULT 属性为默认值不序列化
//Include.NON_EMPTY 属性为 空（“”） 或者为 NULL 都不序列化
//Include.NON_NULL 属性为NULL 不序列化
//@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL) //旧版本的，已弃用
//@JsonInclude(JsonInclude.Include.NON_NULL)//如果属性为null就不返回到前端去,也就是转json 为NULL不参加序列化
@Data
@Entity
@DynamicUpdate
public class OrderDetail {
    @Id
    private String detailId;

    /**
     * 订单id
     */
    private String orderId;

    /**
     * 商品Id
     */
    private String productId;

    /**
     * 商品名称
     */
    private String productName;

    /**
     * 单价
     * 千万不能从前端传过来。必须从数据库由我们自己取出来
     */
    private BigDecimal productPrice;

    /**
     * 商品数量
     */
    private Integer productQuantity;

    /**
     * 商品小图
     */
    private String productIcon;

}
