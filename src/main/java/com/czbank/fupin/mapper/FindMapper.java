package com.czbank.fupin.mapper;

import com.czbank.fupin.domain.Product;
import com.czbank.fupin.domain.Users;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
@Mapper
public interface FindMapper {

    List<Product> findAll();
    @Select("select * from users")
    List<Users> findAllUsers();
}
