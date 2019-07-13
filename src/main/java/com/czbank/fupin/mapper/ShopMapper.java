package com.czbank.fupin.mapper;

import com.czbank.fupin.domain.Product;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ShopCartMapper {
    /**
     *  @author: wuhao
     *  @Date: 2019/7/12 23:18
     *  @Description: TODO
     *  @Version: 1.0
     */
    @Delete("")
    int orderDelete(String orderId);
    @Update("productAmount")
    int orderUpdateByProductAmount(int productAmount);
    @Select("select * from userid where ")
    List<User> allProductSelect(String userId);


}
