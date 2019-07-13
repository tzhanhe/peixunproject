package com.czbank.fupin.controller;

import com.czbank.fupin.domain.Product;
import com.czbank.fupin.mapper.FindMapper;
import com.czbank.fupin.domain.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/user")
public class AllListController {

    @Autowired
    private FindMapper findMapper;
    @RequestMapping("/findAllProduct")
    public List<Product> findAllProduct(){//查找所有商品并将商品显示到页面
        List<Product> products = findMapper.findAllProduct();//查找的Mapper调用findAllProduct（）方法对表product进行查找
       // System.out.println(products.size());
        return products;
    }
    @RequestMapping("/findProductByCategory")
    public List<Product> findProductByCategory(HttpServletRequest req,HttpServletRequest resp){
        String category = req.getParameter("category");//获得请求商品种类的参数
        return findMapper.findProductByCategory(Integer.valueOf(category));
    }
    @RequestMapping("/findAll")
    @ResponseBody
    public String findAll(){

        Users user = findMapper.findAllUsers().get(0);
        return user.toString();
    }
}
