package edu.neusoft.controller;

import edu.neusoft.domain.Orders;
import edu.neusoft.service.OrdersService;
import edu.neusoft.utils.OrdersResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 姓名： 郑展东
 * 学号：  20107310123
 *
 * @Date 2022年10月20日9:16
 */
@CrossOrigin
@RestController
@RequestMapping("/orders")
public class OrdersController {
    @Resource
    private OrdersService ordersService;

    //获取所有订单
    @GetMapping("/getAllOrder")
    public OrdersResult getAllOrders() {
        return ordersService.getAllOrders();
    }

    //修改订单信息
    @PutMapping("/updateOrders")
    public OrdersResult updateOrders(@RequestBody Orders orders) {
        return ordersService.updateOrders(orders);
    }


    //添加订单信息
    @PostMapping("/insertOrders")
    public OrdersResult insertOrders(@RequestBody Orders orders) {
        return ordersService.insertOrders(orders);
    }

    //删除订单信息
    @DeleteMapping("/deleteOrders")
    public OrdersResult deleteOrders(@RequestParam int id){
        return ordersService.deleteOrders(id);
    }

    //根据订单ID获取订单信息
    @GetMapping("/getOrdersById")
    public OrdersResult GetOrdersById(@RequestParam int id){
        return  ordersService.GetOrdersById(id);
    }

    //根据用户ID获取订单信息
    @GetMapping("/getOrderByUserId")
    public OrdersResult GetOrderByUserId(@RequestParam int user_id){
        return ordersService.GetOrderByUserId(user_id);
    }
}
