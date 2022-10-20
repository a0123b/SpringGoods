package edu.neusoft.mapper;

import edu.neusoft.domain.Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.relational.core.sql.In;

import java.util.List;

/**
 * 姓名： 郑展东
 * 学号：  20107310123
 *
 * @Date 2022年10月05日20:44
 */
@Mapper
public interface ProductMapper {

    List<Product> showGoods();

    int updateGoods(Product product);

    int insertGoods(Product product);

    int deleteGoods(Integer product_id);

    Product GetProductById(int product_id);

    void deleteKey();
    void addKey();



}
