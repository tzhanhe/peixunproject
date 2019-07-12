package com.czbank.fupin.mapper;

import com.czbank.fupin.domain.Product;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface SellerMapper {
    @Insert("insert into product(productName,info,price,stock,ownerId)" +
            "values(#{productName},#{info},#{price},#{stock},#{ownerId})")
    int productInsert(Product product);
    @Delete("")
    int productDelete(Product product);
    @Update("")
    int productUpdate(Product product);
    @Select("select * from product where ")
    List<Product> allProductSelect(int ownerId);


}
