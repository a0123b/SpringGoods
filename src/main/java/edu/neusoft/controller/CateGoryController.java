package edu.neusoft.controller;

import edu.neusoft.service.CateGoryService;
import edu.neusoft.utils.CateGoryResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 姓名： 郑展东
 * 学号：  20107310123
 *
 * @Date 2022年10月17日16:41
 */
@CrossOrigin
@RestController
@RequestMapping("/category")
public class CateGoryController {
    @Resource
    private CateGoryService cateGoryService;

    //获取商品分类
    @GetMapping("/getCategory")
    public CateGoryResult GetCategory(){
        return cateGoryService.GetCategory();
    }
}
