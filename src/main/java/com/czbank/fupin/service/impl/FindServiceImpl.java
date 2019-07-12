package com.czbank.fupin.service.impl;

import com.czbank.fupin.mapper.FindMapper;
import com.czbank.fupin.domain.Product;
import com.czbank.fupin.domain.Users;
import com.czbank.fupin.service.FindService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class FindServiceImpl implements FindService {
    @Autowired
    private FindMapper findMapper;
    @Override
    public List<Product> findAll() {
        return null;
    }

    @Override
    public List<Users> findAllUsers() {
        return findMapper.findAllUsers();
    }

}
