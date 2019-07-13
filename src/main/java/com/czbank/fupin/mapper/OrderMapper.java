package com.czbank.fupin.mapper;

import com.czbank.fupin.domain.Order;
import com.czbank.fupin.domain.Product;
import com.czbank.fupin.utils.OrderId;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: ZhouChaoV
 * @Date: 2019/7/12 22:50
 * @Description:
 */
@Mapper
@Repository
public interface OrderMapper {
//    @Insert("insert into product(productName,info,price,stock,ownerId)" +
//            "values(#{productName},#{info},#{price},#{stock},#{ownerId})")
//    int productInsert(Order product);
//    @Delete("")
//    int productDelete(Order order);
//    @Update("")
//    int productUpdate(Order order);
//    @Select("select * from product where ")
//    List<Product> allProductSelect(int ownerId);
    /*select by id

     */
    @Select("one")
    Order orderSelect(String orderId);
   /**
   * @Description: select by ids
   * @Author: ZhouChaoV
   * @Date: 2019/7/12 23:26
   * @Param:
   * @Return:
   * @Exception:
   *
   */
    @Select("duo")
    List<Order> duoOrderSelect(String orderId);

    @Insert("")
    /**
    * @Description: 生成订单
    * @Author: ZhouChaoV
    * @Date: 2019/7/13 8:26
    * @Param: [order]
    * @Return: com.czbank.fupin.domain.Order
    * @Exception:
    *
    */
    Order getOrder(Order order);

}
