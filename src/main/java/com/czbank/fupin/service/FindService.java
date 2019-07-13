package com.czbank.fupin.service;

import com.czbank.fupin.domain.Product;
import com.czbank.fupin.domain.User;

import java.util.List;

public interface FindService {
    List<Product> findAllProduct();
    List<Product> findProductByProvince(int ProvinceId);
    List<Product> findProductByCategory(int category);//根据商品种类进行查找
    Product findProductById(int productId);
    List<User> findAllUsers();
}
