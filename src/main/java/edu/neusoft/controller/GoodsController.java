package edu.neusoft.controller;

import edu.neusoft.domain.Goods;
import edu.neusoft.service.GoodsService;
import edu.neusoft.utils.Result;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping("/api/goods")
public class GoodsController {
    @Resource
    private GoodsService service;

    //获取所有商品信息
    @GetMapping("/allGoods")
    public Result getAllGoods(){
        return service.getAllGoods();
    }

    //根据商品id获取商品信息
    @GetMapping("/getGoodsById")
    public Result getGoodsInfoById(@RequestParam Integer gid){
        return service.getGoodsInfoById(gid);
    }

    //更改商品信息
    @PutMapping("/updateGoods")
    public Result updateGoods(@RequestBody Goods goods){
        return service.updateGoods(goods);
    }

    //添加商品信息
    @PostMapping("/insertGoods")
    public Result insertGoods(@RequestBody Goods goods){
        return service.insertGoods(goods);
    }

    //删除商品信息
    @DeleteMapping("/deleteGoods")
    public Result deleteGoods(@RequestParam int gid){
        return service.deleteGoods(gid);
    }
}
