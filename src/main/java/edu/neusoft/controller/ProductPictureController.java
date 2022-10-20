package edu.neusoft.controller;

import cn.hutool.core.io.FileUtil;
import edu.neusoft.service.ProductPictureService;
import edu.neusoft.utils.ImageToBase64Util;
import edu.neusoft.utils.ProductPictureResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * 姓名： 郑展东
 * 学号：  20107310123
 *
 * @Date 2022年10月18日10:28
 */
@CrossOrigin
@RestController
@RequestMapping("/productpicture")
public class ProductPictureController {

    @Resource
    private ProductPictureService productPictureService;

    //根据商品id获取商品图片
    @GetMapping("/getDetailsPicture")
    public ProductPictureResult GetDetailsPicture(@RequestParam Integer product_id){
        return productPictureService.GetDetailsPicture(product_id);
    }
}
