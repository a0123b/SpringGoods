package edu.neusoft.mapper;

import edu.neusoft.domain.CateGory;
import edu.neusoft.domain.Product;
import edu.neusoft.domain.ProductCategory;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 姓名： 郑展东
 * 学号：  20107310123
 *
 * @Date 2022年10月17日13:34
 */
@Mapper
public interface CateGoryMapper {
    List<CateGory> GetCategory();
}
