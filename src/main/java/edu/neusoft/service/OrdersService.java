package edu.neusoft.service;

import edu.neusoft.domain.Orders;
import edu.neusoft.utils.OrdersResult;

/**
 * 姓名： 郑展东
 * 学号：  20107310123
 *
 * @Date 2022年10月20日9:11
 */
public interface OrdersService {
    OrdersResult getAllOrders();

    OrdersResult updateOrders(Orders orders);

    OrdersResult insertOrders(Orders orders);

    OrdersResult deleteOrders(Integer id);

    OrdersResult GetOrdersById(int id);

    OrdersResult GetOrderByUserId(int user_id);

}
