package edu.neusoft.service.UserServiceImpl;

import cn.hutool.db.sql.Order;
import edu.neusoft.domain.Orders;
import edu.neusoft.mapper.OrdersMapper;
import edu.neusoft.mapper.ProductMapper;
import edu.neusoft.service.OrdersService;
import edu.neusoft.utils.OrdersResult;
import edu.neusoft.utils.ProductResult;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Objects;

/**
 * 姓名： 郑展东
 * 学号：  20107310123
 *
 * @Date 2022年10月20日9:11
 */
@Service
public class OrdersServiceImpl implements OrdersService {
    @Resource
    private OrdersMapper ordersMapper;
    @Resource
    private ProductMapper productMapper;

    @Override
    public OrdersResult getAllOrders() {
        List<Order> list = ordersMapper.getAllOrders();
        return new OrdersResult(200,"001",list,"获取成功");
    }

    @Override
    public OrdersResult updateOrders(Orders orders) {
        productMapper.deleteKey();
        int line = ordersMapper.updateOrders(orders);
        productMapper.addKey();
        if (line > 0){
            return new OrdersResult(200,"001",orders,"修改订单成功");
        }
        return new OrdersResult(500,"002","修改订单失败");
    }

    @Override
    public OrdersResult insertOrders(Orders orders) {
        productMapper.deleteKey();
        int line = ordersMapper.insertOrders(orders);
        productMapper.addKey();
        if (line > 0){
            return new OrdersResult(200,"001",orders,"订单添加成功");
        }
        return new OrdersResult(500,"002","订单添加失败");
    }

    @Override
    public OrdersResult deleteOrders(Integer id) {
       productMapper.deleteKey();
        int line = ordersMapper.deleteOrders(id);
        productMapper.addKey();
        if (line > 0){
            return new OrdersResult(200,"001",id,"订单删除成功");
        }
        return new OrdersResult(500,"002",id,"订单删除失败");
    }

    @Override
    public OrdersResult GetOrdersById(int id) {
        Orders orders = ordersMapper.GetOrdersById(id);
        if (Objects.isNull(id)){
            return new OrdersResult(404,"002","订单获取失败");
        }
        return new OrdersResult(200,"001",orders,"订单获取成功");
    }

    @Override
    public OrdersResult GetOrderByUserId(int user_id) {
        Orders orders = ordersMapper.GetOrderByUserId(user_id);
        if (Objects.isNull(user_id)){
            return new OrdersResult(404,"002","订单获取失败");
        }
        return new OrdersResult(200,"001",orders,"订单获取成功");
    }
}
