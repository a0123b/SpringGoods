package edu.neusoft.service;
import edu.neusoft.domain.User;
import edu.neusoft.utils.Result;

/**
 * 姓名： 郑展东
 * 学号：  20107310123
 *
 * @Date 2022年09月29日17:17
 */
public interface UserService {
   Result getAllUsers();

   Result loginService(String user_name, String password);

   Result registService(User user);

   Result updateService(User user);

   Result deleteService(int uid);

   Result selectGoodsById(Integer uid);



}
