package edu.neusoft.controller;

import cn.hutool.core.io.FileUtil;
import edu.neusoft.domain.User;
import edu.neusoft.service.UserService;
import edu.neusoft.utils.ImageToBase64Util;
import edu.neusoft.utils.ProductPictureResult;
import edu.neusoft.utils.UserResult;
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
 * @Date 2022年09月29日17:20
 */
@CrossOrigin
@RestController
@RequestMapping("/users")
public class UserController {

    private static final String PATH = ProductPictureController
            .class.getClassLoader().getResource("")
            .getPath().split("target/")[0] + "src/main/resources/static/user";

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

    /**
     * 上传头像
     */
//    @PostMapping("/tx")
//    public ProductPictureResult uploadTx(@RequestParam("file") MultipartFile file, @RequestParam("user_id") Integer user_id) {
//
//        if (file.isEmpty()) {
//            return new ProductPictureResult(500, "002","文件为空");
//        }
//
//        String uuid = UUID.randomUUID().toString();
//        String fileName = file.getOriginalFilename();
//        String suffixName = fileName.substring(fileName.lastIndexOf("."));
//        String base64 = uuid + suffixName;
//        String imgUrl = "data:image/jpeg;base64," + ImageToBase64Util.imgToBase64(file);
//        System.out.println("base64转码图片：" + imgUrl);
//
//        File fileTempObj = new File(PATH + File.separator + base64);
//
//        // 检测目录是否存在
//        if (!fileTempObj.getParentFile().exists()) {
//            fileTempObj.getParentFile().mkdirs();
//        }
//
//        // 使用文件名检测文件是否已经存在
//        if (fileTempObj.exists()) {
//            return new ProductPictureResult(500,"002", "文件已存在");
//        }
//
//        try {
//            FileUtil.writeBytes(file.getBytes(), fileTempObj);
//        } catch (IOException e) {
//            return new ProductPictureResult(200,"001", e.getMessage());
//        }
//
//        return userService.upload(user_id, imgUrl);
//    }
}
