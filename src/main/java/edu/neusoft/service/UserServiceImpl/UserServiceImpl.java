package edu.neusoft.service.UserServiceImpl;

import edu.neusoft.domain.User;
import edu.neusoft.mapper.UserMapper;
import edu.neusoft.service.UserService;
import edu.neusoft.utils.UserResult;
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

    //获取用户信息
    @Override
    public UserResult getAllUsers() {
        List<User> list = userMapper.getAllUsers();
        return new UserResult(200,"001",list,"获取成功");
    }

    //用户登陆
    @Override
    public UserResult loginService(String username, String password) {
        User user = userMapper.loginUser(username);
        if(Objects.isNull(user)){
            return new UserResult(500,"002","用户不存在");
        }
        return new UserResult(200,"001",user,"登录成功");
    }

    //用户注册
    @Override
    @ResponseStatus
    public UserResult registService(User user) {
        int line = userMapper.registUser(user);
        if (line > 0) {
            return new UserResult(200,"001",user,"注册成功");
        }
        return new UserResult(500,"002","注册失败");
    }

    //更改用户信息
    @Override
    public UserResult updateService(User user) {
        int line = userMapper.updateUser(user);
        if (line > 0) {
            return new UserResult(200,"001",user,"修改成功");
        }
        return new UserResult(500,"002","修改失败");
    }

    //删除用户
    @Override
    public UserResult deleteService(int user_id) {
        int line = userMapper.deleteUser(user_id);
        if (line > 0) {
            return new UserResult(200,"001","删除成功");
        }
        return new UserResult(500,"002","删除失败");
    }
}
