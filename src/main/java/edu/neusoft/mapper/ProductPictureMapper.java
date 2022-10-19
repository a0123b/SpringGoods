package edu.neusoft.mapper;

import edu.neusoft.domain.ProductPicture;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 姓名： 郑展东
 * 学号：  20107310123
 *
 * @Date 2022年10月18日10:16
 */
@Mapper
public interface ProductPictureMapper {
    ProductPicture GetDetailsPicture(int product_id);
}
