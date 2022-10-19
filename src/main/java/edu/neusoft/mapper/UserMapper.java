package edu.neusoft.mapper;

import edu.neusoft.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 姓名： 郑展东
 * 学号：  20107310123
 *
 * @Date 2022年09月28日20:15
 */
@Mapper
public interface UserMapper {

    List<User> getAllUsers();

    User loginUser(String username);

    int registUser(User user);

    int updateUser(User user);

    int deleteUser(int user_id);
}
