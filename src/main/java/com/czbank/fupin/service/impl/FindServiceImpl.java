package com.czbank.fupin.service.impl;

import com.czbank.fupin.mapper.FindMapper;
import com.czbank.fupin.domain.Product;
import com.czbank.fupin.domain.Users;
import com.czbank.fupin.service.FindService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class FindServiceImpl implements FindService {
    @Autowired
    private FindMapper findMapper;
    @Override
    public List<Product> findAllProduct() {

        return findMapper.findAllProduct();
    }

    @Override
    public List<Product> findProductByCategory(int category) {
        return findMapper.findProductByCategory(category);
    }

    @Override
    public List<Product> findProductByProvince(int provinceId) {
        return findMapper.findProductByProvince(provinceId);
    }

    @Override
    public List<Users> findAllUsers() {
        return findMapper.findAllUsers();
    }

}
