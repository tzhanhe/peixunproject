package com.czbank.fupin.controller;

import com.czbank.fupin.domain.Product;
import com.czbank.fupin.mapper.FindMapper;
import com.czbank.fupin.domain.User;
import com.czbank.fupin.service.FindService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
@RestController
@RequestMapping("/user")
public class AllListController {

    @Autowired
    private FindService findService;
    @RequestMapping("/findAllProduct")
    public List<Product> findAllProduct(){//查找所有商品并将商品显示到页面
        List<Product> products = findService.findAllProduct();//查找的Mapper调用findAllProduct（）方法对表product进行查找
       System.out.println(products.size());
        return products;
    }
    @RequestMapping("/findProductByCategory")
    public List<Product> findProductByCategory(HttpServletRequest req,HttpServletRequest resp){
        String category = req.getParameter("category");//获得请求商品种类的参数
        System.out.println(findService.findProductByCategory(Integer.valueOf(category)).size());
        return findService.findProductByCategory(Integer.valueOf(category));
    }
    @RequestMapping("/findProductById")
    public Product findProductById(HttpServletRequest req, HttpServletResponse resp){
        String  productId = req.getParameter("productId");
        Product product = findService.findProductById(Integer.valueOf(productId));
        System.out.println(product);
        return product;
    }
    @RequestMapping("/findAll")
    @ResponseBody
    public String findAll(){

        User user = findService.findAllUsers().get(0);
        return user.toString();
    }
}
