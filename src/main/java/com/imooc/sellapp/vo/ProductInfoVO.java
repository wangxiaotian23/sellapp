package com.imooc.sellapp.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @Auther: 李清依
 * @Date: 2021/7/6 16:27
 * @Description: 商品详情
 */
@Data
public class ProductInfoVO implements Serializable {
    private static final long serialVersionUID = 4177439763246797991L;
    @JsonProperty("id")
    private String productId;
    @JsonProperty("name")
    private String productName;
    @JsonProperty("price")
    private BigDecimal productPrice;
    @JsonProperty("description")
    private String productDescription;
    @JsonProperty("icon")
    private String productIcon;
}
