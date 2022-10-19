package edu.neusoft.controller;

import edu.neusoft.service.ProductCategoryService;
import edu.neusoft.utils.CateGoryResult;
import edu.neusoft.utils.ProductCategoryResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 姓名： 郑展东
 * 学号：  20107310123
 *
 * @Date 2022年10月18日8:11
 */
@CrossOrigin
@RestController
@RequestMapping("/productcategory")
public class ProductCateGoryController {
    @Resource
    private ProductCategoryService productCategoryService;

    //根据商品分类名称获取商品信息
    @GetMapping("/getCategoryId")
    public ProductCategoryResult GetCategoryId(@RequestParam Integer category_id){
        return productCategoryService.GetCategoryId(category_id);
    }
}
