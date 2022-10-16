package edu.neusoft.controller;

import edu.neusoft.domain.Seller;
import edu.neusoft.domain.User;
import edu.neusoft.service.SellerService;
import edu.neusoft.utils.Result;
import org.springframework.data.relational.core.sql.In;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 姓名： 郑展东
 * 学号：  20107310123
 *
 * @Date 2022年10月15日16:49
 */
@CrossOrigin
@RestController
@RequestMapping("/api/sellers")
public class SellerController {
    @Resource
    private SellerService sellerService;

    //获取卖家信息
    @GetMapping("/getAllSeller")
    public Result getAllSeller(){
        return sellerService.getAllSeller();
    }

    //卖家登录
    @PostMapping("/sellerlogin")
    public Result loginSeller(@RequestBody Seller seller){
        String susername = seller.getSname();
        String spassword = seller.getSpassword();
        return sellerService.loginSeller(susername,spassword);
    }

    //卖家注册
    @PostMapping("/registseller")
    public Result registSeller(@RequestBody Seller seller){
        return sellerService.registSeller(seller);
    }

    //更改卖家信息
    @PutMapping("/updateSeller")
    public Result updateSeller(@RequestBody Seller seller){
        return sellerService.updateSeller(seller);
    }

    //删除卖家信息
    @DeleteMapping("/deleteSelle")
    public Result deleteSelle(@RequestParam int sid){
        return sellerService.deleteSelle(sid);
    }


}
