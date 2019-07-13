package com.czbank.fupin.controller;

import com.czbank.fupin.domain.Product;
import com.czbank.fupin.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ClassName SellerController
 * @Description
 * @Author Leo
 * @Date 2019/7/12
 **/
@RestController
@RequestMapping("/seller")
public class SellerController {
    @Autowired
    private SellerService sellerService;
    @RequestMapping("/productInsert")
    public Object productInsert(HttpServletRequest req, HttpServletResponse resp){
        Product product = new Product();
        String productName = req.getParameter("productName");
        String price = req.getParameter("price");
        String info = req.getParameter("info");
        String stock = req.getParameter("stock");
        String ownerId = req.getParameter("ownerId");
        product.setProductName(productName);
        product.setPrice(Double.parseDouble(price));
        product.setInfo(info);
        product.setStock(Integer.parseInt(stock));
        product.setOwnerId(Integer.parseInt(ownerId));
        product.setCountyId(1);
        product.setProvinceId(2);
        return sellerService.productInsert(product);
    }


}
