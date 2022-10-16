package edu.neusoft.controller;

import edu.neusoft.domain.User;
import edu.neusoft.service.UserService;
import edu.neusoft.utils.Result;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 姓名： 郑展东
 * 学号：  20107310123
 *
 * @Date 2022年09月29日17:20
 */
@CrossOrigin
@RestController
@RequestMapping("/api/users")
public class UserController {
    @Resource
    private UserService userService;

    //获取用户信息
    @GetMapping("/getAllUsers")
    public Result getAllUser(){
        return userService.getAllUsers();
    }

    //用户登陆
    @PostMapping("/login")
    public Result loginController(@RequestBody User user){
        String username = user.getUsername();
        String password = user.getPassword();
        return userService.loginService(username,password);
    }

    //用户注册
    @PostMapping("/regist")
    public Result registController(@RequestBody User user){
        return userService.registService(user);
    }

    //更改用户信息
    @PutMapping("/update")
    public Result updateController(@RequestBody User user){
        return userService.updateService(user);
    }

    //删除用户
    @DeleteMapping("/delete")
    public Result deleteController(@RequestParam int uid){
        return userService.deleteService(uid);
    }

    //根据用户id获取商品列表
    @GetMapping("/getGoodsById")
    public Result getGoodsById(@RequestParam Integer uid){
        return userService.selectGoodsById(uid);
    }
}
