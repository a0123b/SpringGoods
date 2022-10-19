package edu.neusoft.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 姓名： 郑展东
 * 学号：  20107310123
 *
 * @Date 2022年09月28日20:12
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User{

    private int user_id;
    private String username;
    private String password;
    private String usersex;
    private String userphone;
    private Date userdate;
    private String userregion;
    private String useraddress;
    private String useremail;
}
