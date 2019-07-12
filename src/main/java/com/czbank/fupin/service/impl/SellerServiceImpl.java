package com.czbank.fupin.service.impl;

import com.czbank.fupin.domain.Product;
import com.czbank.fupin.mapper.SellerMapper;
import com.czbank.fupin.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName SellerServiceImpl
 * @Description
 * @Author Leo
 * @Date 2019/7/12
 **/
@Service
public class SellerServiceImpl implements SellerService {
    @Autowired
    private SellerMapper sellerMapper;
    @Override
    public int productInsert(Product product) {
        return sellerMapper.productInsert(product);
    }
}
