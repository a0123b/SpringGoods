package edu.neusoft.controller;

import edu.neusoft.domain.ShoppingCart;
import edu.neusoft.service.ShoppingCartService;
import edu.neusoft.utils.ShoppingCartResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 姓名： 郑展东
 * 学号：  20107310123
 *
 * @Date 2022年10月19日10:37
 */
@CrossOrigin
@RestController
@RequestMapping("/shoppingcart")
public class ShoppingCartController {
    @Resource
    private ShoppingCartService service;

    //添加购物车
    @PostMapping("/insertShoppingCart")
    public ShoppingCartResult insertShoppingCart(@RequestBody ShoppingCart shoppingCart){
        return service.insertShoppingCart(shoppingCart);
    }

    //删除购物车
    @DeleteMapping("/deleteShoppingCart")
    public ShoppingCartResult deleteShoppingCart(@RequestParam Integer id){
        return service.deleteShoppingCart(id);
    }

    //更新购物车
    @PostMapping("/updateShoppingCart")
    public ShoppingCartResult updateShoppingCart(@RequestBody ShoppingCart shoppingCart){
        return service.updateShoppingCart(shoppingCart);
    }

    //根据用户ID查询购物车
    @GetMapping("/selectShoppingCartByUserId")
    public ShoppingCartResult selectShoppingCartByUserId(@RequestParam int user_id){
        return service.selectShoppingCartByUserId(user_id);
    }
}
