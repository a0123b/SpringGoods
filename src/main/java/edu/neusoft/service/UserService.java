package edu.neusoft.service;
import edu.neusoft.domain.User;
import edu.neusoft.utils.UserResult;

/**
 * 姓名： 郑展东
 * 学号：  20107310123
 *
 * @Date 2022年09月29日17:17
 */
public interface UserService {
   UserResult getAllUsers();

   UserResult loginService(String username, String password);

   UserResult registService(User user);

   UserResult updateService(User user);

   UserResult deleteService(int user_id);

}
