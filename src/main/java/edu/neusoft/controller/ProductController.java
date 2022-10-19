package edu.neusoft.controller;

import edu.neusoft.domain.Product;
import edu.neusoft.service.ProductService;
import edu.neusoft.utils.ProductResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 姓名： 郑展东
 * 学号：  20107310123
 *
 * @Date 2022年10月05日20:52
 */
@CrossOrigin
@RestController
@RequestMapping("/product")
public class ProductController {
    @Resource
    private ProductService service;

    //获取所有商品信息
    @GetMapping("/allGoods")
    public ProductResult getAllGoods(){
        return service.getAllGoods();
    }

    //更改商品信息
    @PutMapping("/updateGoods")
    public ProductResult updateGoods(@RequestBody Product product){
        return service.updateGoods(product);
    }

    //添加商品信息
    @PostMapping("/insertGoods")
    public ProductResult insertGoods(@RequestBody Product product){
        return service.insertGoods(product);
    }

    //删除商品信息
    @DeleteMapping("/deleteGoods")
    public ProductResult deleteGoods(@RequestParam int product_id){
        return service.deleteGoods(product_id);
    }

    //根据商品id获取商品信息
    @GetMapping("/getproductById")
    public ProductResult GetProductById(@RequestParam int product_id){
        return service.GetProductById(product_id);
    }
}
