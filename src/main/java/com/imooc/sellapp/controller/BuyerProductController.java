package com.imooc.sellapp.controller;

import com.fasterxml.jackson.databind.util.BeanUtil;
import com.imooc.sellapp.domain.ProductCategory;
import com.imooc.sellapp.domain.ProductInfo;
import com.imooc.sellapp.service.ProductCategoryService;
import com.imooc.sellapp.service.ProductInfoService;
import com.imooc.sellapp.utils.ResultVOUtil;
import com.imooc.sellapp.vo.ProductInfoVO;
import com.imooc.sellapp.vo.ProductVO;
import com.imooc.sellapp.vo.ResultVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Auther: 李清依
 * @Date: 2021/7/6 16:19
 * @Description:
 */
@RestController
@RequestMapping(value = "/buyer/product")
@Slf4j
public class BuyerProductController {
    @Autowired
    private ProductInfoService productInfoService;
    @Autowired
    private ProductCategoryService productCategoryService;


    @GetMapping("list")
    public ResultVO list() {
        //1.先查询所有的上架商品
        List<ProductInfo> productInfoList = productInfoService.findUpAll();
        //精简方法 (java8 lambda) 推荐
        List<Integer> categoryTypeList = productInfoList.stream().map(e -> e.getCategoryType()).collect(Collectors.toList());
        List<ProductCategory> productCategoryList = productCategoryService.findByCategoryTypeIn(categoryTypeList);

        //3.数据拼装 - 拼装成前端需要的格式
        List<ProductVO> productVOList = new ArrayList<>();
        for (ProductCategory productCategory : productCategoryList) {
            ProductVO productVO = new ProductVO();
            productVO.setCategoryType(productCategory.getCategoryType());
            productVO.setCategoryName(productCategory.getCategoryName());
            List<ProductInfoVO> productInfoVoList = new ArrayList<>();
            for (ProductInfo productInfo : productInfoList
            ) {
                if (productCategory.getCategoryType().equals(productInfo.getCategoryType())){
                    ProductInfoVO productInfoVO = new ProductInfoVO();
                    BeanUtils.copyProperties(productInfo,productInfoVO);
                    productInfoVoList.add(productInfoVO);
                }
            }
            productVO.setProductInfoVOList(productInfoVoList);
            productVOList.add(productVO);
        }
        return ResultVOUtil.success(productVOList);
    }
}
