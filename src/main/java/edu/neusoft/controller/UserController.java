package edu.neusoft.controller;

import edu.neusoft.domain.User;
import edu.neusoft.service.UserService;
import edu.neusoft.utils.UserResult;
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
@RequestMapping("/users")
public class UserController {
    @Resource
    private UserService userService;

    //获取用户信息
    @GetMapping("/getAllUsers")
    public UserResult getAllUser(){
        return userService.getAllUsers();
    }

    //用户登陆
    @PostMapping("/login")
    public UserResult loginController(@RequestBody User user){
        String username = user.getUsername();
        String password = user.getPassword();
        return userService.loginService(username,password);
    }

    //用户注册
    @PostMapping("/regist")
    public UserResult registController(@RequestBody User user){
        return userService.registService(user);
    }

    //更改用户信息
    @PutMapping("/update")
    public UserResult updateController(@RequestBody User user){
        return userService.updateService(user);
    }

    //删除用户
    @DeleteMapping("/delete")
    public UserResult deleteController(@RequestParam int user_id){
        return userService.deleteService(user_id);
    }


}
