package edu.neusoft.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 姓名： 郑展东
 * 学号：  20107310123
 *
 * @Date 2022年10月15日16:43
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Seller {
    private int sid;
    private String sname;
    private String spassword;
    private String sphone;
}
