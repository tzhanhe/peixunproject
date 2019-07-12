package com.czbank.fupin.service;

import com.czbank.fupin.domain.Product;
import com.czbank.fupin.domain.Users;

import java.util.List;

public interface FindService {
    List<Product> findAll();
    List<Users> findAllUsers();
}
