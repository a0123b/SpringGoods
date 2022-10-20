package edu.neusoft.service.UserServiceImpl;

import edu.neusoft.domain.ShoppingCart;
import edu.neusoft.mapper.ProductMapper;
import edu.neusoft.mapper.ShoppingCartMapper;
import edu.neusoft.service.ShoppingCartService;
import edu.neusoft.utils.ShoppingCartResult;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Objects;

/**
 * 姓名： 郑展东
 * 学号：  20107310123
 *
 * @Date 2022年10月19日10:46
 */
@Service
public class ShoppingCartServiceImpl implements ShoppingCartService {
    @Resource
    private ShoppingCartMapper shoppingCartMapper;

    @Resource
    private ProductMapper productMapper;

    @Override
    public ShoppingCartResult insertShoppingCart(ShoppingCart shoppingCart) {
        productMapper.deleteKey();
        int line = shoppingCartMapper.insertShoppingCart(shoppingCart);
        productMapper.addKey();
        if (line > 0) {
            return new ShoppingCartResult(200, "001", shoppingCart, "添加成功");
        }
        return new ShoppingCartResult(500, "002", shoppingCart, "添加失败");
    }

    @Override
    public ShoppingCartResult deleteShoppingCart(Integer id) {
        productMapper.deleteKey();
        int line = shoppingCartMapper.deleteShoppingCart(id);
        productMapper.addKey();
        if (line > 0){
            return new ShoppingCartResult(200,"001",id,"删除成功");
        }
        return new ShoppingCartResult(500,"002",id,"删除失败");
    }

    @Override
    public ShoppingCartResult updateShoppingCart(ShoppingCart shoppingCart) {
        productMapper.deleteKey();
        int line = shoppingCartMapper.updateShoppingCart(shoppingCart);
        productMapper.addKey();
        if (line > 0){
            return new ShoppingCartResult(200, "001", shoppingCart, "更新成功");
        }
        return new ShoppingCartResult(500, "002", shoppingCart, "更新失败");
    }

    @Override
    public ShoppingCartResult selectShoppingCartByUserId(int user_id) {
         ShoppingCart shoppingCart = shoppingCartMapper.selectShoppingCartByUserId(user_id);
        if (Objects.isNull(user_id)){
            return new ShoppingCartResult(404,"002","查询失败");
        }
        return new ShoppingCartResult(200,"001",shoppingCart,"查询成功");
    }


}
