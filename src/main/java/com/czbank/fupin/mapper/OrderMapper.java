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
    /**
     * @Author Leo
     * @Description 查找一个订单
     * @Date 2019/7/13
     * @Param [orderId]订单id
     * @return com.czbank.fupin.domain.Order
     **/
    @Select("one")
    Order orderSelectById(String id);
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
    List<Order> orderSelectByIds(String ids);

    /**
    * @Description: 生成订单
    * @Author: ZhouChaoV
    * @Date: 2019/7/13 8:26
    * @Param: [order]
    * @Return: com.czbank.fupin.domain.Order
    * @Exception:
    *
    */
    @Insert("")
    int orderInsert(Order order);
    /**
     * @Author Leo
     * @Description 根据订单id删除订单
     * @Date 2019/7/13
     * @Param [id]
     * @return int
     **/
    @Delete("")
    int orderDelete(String id);

}
