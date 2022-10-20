package edu.neusoft.service;

import edu.neusoft.domain.ShoppingCart;
import edu.neusoft.utils.ShoppingCartResult;

/**
 * 姓名： 郑展东
 * 学号：  20107310123
 *
 * @Date 2022年10月19日10:40
 */
public interface ShoppingCartService {
    ShoppingCartResult insertShoppingCart(ShoppingCart shoppingCart);

    ShoppingCartResult deleteShoppingCart(Integer id);

    ShoppingCartResult updateShoppingCart(ShoppingCart shoppingCart);

    ShoppingCartResult selectShoppingCartByUserId(int user_id);
}
