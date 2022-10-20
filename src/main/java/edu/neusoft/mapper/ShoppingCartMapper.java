package edu.neusoft.mapper;

import edu.neusoft.domain.ShoppingCart;
import org.apache.ibatis.annotations.Mapper;

/**
 * 姓名： 郑展东
 * 学号：  20107310123
 *
 * @Date 2022年10月19日10:37
 */
@Mapper
public interface ShoppingCartMapper {
    int insertShoppingCart(ShoppingCart shoppingCart);

    int deleteShoppingCart(Integer id);

    int updateShoppingCart(ShoppingCart shoppingCart);

    ShoppingCart selectShoppingCartByUserId(int user_id);
}
