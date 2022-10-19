package edu.neusoft.service;

import edu.neusoft.utils.ProductPictureResult;
import org.springframework.stereotype.Service;

/**
 * 姓名： 郑展东
 * 学号：  20107310123
 *
 * @Date 2022年10月18日10:17
 */
public interface ProductPictureService {
    ProductPictureResult GetDetailsPicture(int product_id);
}
