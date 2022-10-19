package edu.neusoft.service;

import edu.neusoft.domain.Product;
import edu.neusoft.utils.ProductResult;

/**
 * 姓名： 郑展东
 * 学号：  20107310123
 *
 * @Date 2022年10月05日20:48
 */
public interface ProductService {

    ProductResult getAllGoods();

    ProductResult updateGoods(Product product);

    ProductResult insertGoods(Product product);

    ProductResult deleteGoods(Integer product_id);

    ProductResult GetProductById(int product_id);
}
