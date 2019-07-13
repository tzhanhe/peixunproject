package com.czbank.fupin.mapper;

import com.czbank.fupin.domain.Product;
import com.czbank.fupin.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
@Mapper
public interface FindMapper {

    @Select("select * from product")
    List<Product> findAllProduct();
    @Select("select * from product province contry where provinceId=#{provinId}")
    List<Product> findProductByProvince(int contryId);//通过省份查找所属地方的商品
    @Select("select * from product where category=#{category}")//根据商品的种类进行查询，
        // 商品的种类用0-2表示,0代表五谷杂粮，1代表茶品、2代表瓜果蔬菜
    List<Product> findProductByCategory(int category);//通过商品种类查找商品
    @Select("select * from product where id=#{productId}")
    Product findProductById(int productId);//通过商品的id查出商品的详细信息
    @Select("select * from users")
    List<User> findAllUsers();
}
