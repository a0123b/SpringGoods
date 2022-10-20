package edu.neusoft.mapper;

import edu.neusoft.domain.ProductCategory;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 姓名： 郑展东
 * 学号：  20107310123
 *
 * @Date 2022年10月18日8:02
 */
@Mapper
public interface ProductCategoryMapper {
    List<ProductCategory> GetCategoryName(String category_name);
}
