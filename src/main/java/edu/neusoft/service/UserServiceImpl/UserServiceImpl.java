package edu.neusoft.service.UserServiceImpl;

import edu.neusoft.domain.ShowOrder;
import edu.neusoft.domain.User;
import edu.neusoft.mapper.OrderMapper;
import edu.neusoft.mapper.UserMapper;
import edu.neusoft.service.UserService;
import edu.neusoft.utils.Result;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.annotation.Resource;
import java.util.List;
import java.util.Objects;

/**
 * 姓名： 郑展东
 * 学号：  20107310123
 *
 * @Date 2022年09月29日17:18
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Resource
    private OrderMapper orderMapper;



    //获取用户信息
    @Override
    public Result getAllUsers() {
        List<User> list = userMapper.getAllUsers();
        return new Result(200,"001",list,"获取成功");
    }

    //用户登陆
    @Override
    public Result loginService(String user_name, String password) {
        User user = userMapper.loginUser(user_name);
        if(Objects.isNull(user)){
            return new Result(500,"002","用户不存在");
        }
        return new Result(200,"001",user,"登录成功");
    }

    //用户注册
    @Override
    @ResponseStatus
    public Result registService(User user) {
        int line = userMapper.registUser(user);
        if (line > 0) {
            return new Result(200,"001","注册成功");
        }
        return new Result(500,"002","注册失败");
    }

    //更改用户信息
    @Override
    public Result updateService(User user) {
        int line = userMapper.updateUser(user);
        if (line > 0) {
            return new Result(200,"001","修改成功");
        }
        return new Result(500,"002","修改失败");
    }

    //删除用户
    @Override
    public Result deleteService(int uid) {
        int line = userMapper.deleteUser(uid);
        if (line > 0) {
            return new Result(200,"001","删除成功");
        }
        return new Result(500,"002","删除失败");
    }

    //根据用户id获取商品列表
    @Override
    public Result selectGoodsById(Integer uid) {
        List<ShowOrder> list = orderMapper.selectOrder(uid);
        return new Result(200,"001",list,"获取成功");
    }


}
