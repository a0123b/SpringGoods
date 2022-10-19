package edu.neusoft.service.UserServiceImpl;

import edu.neusoft.domain.ProductCategory;
import edu.neusoft.mapper.ProductCategoryMapper;
import edu.neusoft.service.ProductCategoryService;
import edu.neusoft.service.ProductService;
import edu.neusoft.utils.CateGoryResult;
import edu.neusoft.utils.ProductCategoryResult;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Objects;

/**
 * 姓名： 郑展东
 * 学号：  20107310123
 *
 * @Date 2022年10月18日8:04
 */
@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {

    @Resource
    private ProductCategoryMapper productCategoryMapper;


    @Override
    public ProductCategoryResult GetCategoryId(Integer category_id) {
        List<ProductCategory> list = productCategoryMapper.GetCategoryId(category_id);
        if (Objects.isNull(list)){
            return new ProductCategoryResult(404,"002","获取分类失败");
        }
        return new ProductCategoryResult(200,"001",list,"获取分类成功");
    }
}
