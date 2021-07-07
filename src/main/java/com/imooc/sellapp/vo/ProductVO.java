package com.imooc.sellapp.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @Auther: 李清依
 * @Date: 2021/7/6 16:26
 * @Description:
 */
@Data
public class ProductVO implements Serializable {
    private static final long serialVersionUID = 1397557650534605111L;
    /**
     * 类目名
     */
    @JsonProperty("name")//序列化返回给前端时，json里面的该字段名为name
    private String categoryName;
    @JsonProperty("type")
    private Integer categoryType;
    @JsonProperty("foods")
    private List<ProductInfoVO> productInfoVOList;
}
