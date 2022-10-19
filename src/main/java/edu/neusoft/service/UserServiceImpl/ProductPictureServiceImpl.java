package edu.neusoft.service.UserServiceImpl;

import edu.neusoft.domain.ProductPicture;
import edu.neusoft.mapper.ProductPictureMapper;
import edu.neusoft.service.ProductPictureService;
import edu.neusoft.utils.ProductPictureResult;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.Objects;

/**
 * 姓名： 郑展东
 * 学号：  20107310123
 *
 * @Date 2022年10月18日10:18
 */
@Service
public class ProductPictureServiceImpl implements ProductPictureService {
    @Resource
    private ProductPictureMapper productPictureMapper;
    @Override
    public ProductPictureResult GetDetailsPicture(int product_id) {
        ProductPicture productPicture = productPictureMapper.GetDetailsPicture(product_id);
        if (Objects.isNull(productPicture)){
            return new ProductPictureResult(404,"002","获取商品图片失败");
        }
        return new ProductPictureResult(200,"001",productPicture,"获取商品图片成功");
    }
}
