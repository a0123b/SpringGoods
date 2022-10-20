package edu.neusoft.mapper;

import cn.hutool.db.sql.Order;
import edu.neusoft.domain.Orders;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 姓名： 郑展东
 * 学号：  20107310123
 *
 * @Date 2022年10月20日8:42
 */
@Mapper
public interface OrdersMapper {
    List<Order> getAllOrders();

    int updateOrders(Orders orders);

    int insertOrders(Orders orders);

    int deleteOrders(Integer id);

    Orders GetOrdersById(int id);

    Orders GetOrderByUserId(int user_id);

}
