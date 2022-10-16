package edu.neusoft.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 姓名： 郑展东
 * 学号：  20107310123
 *
 * @Date 2022年10月11日8:24
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private int oid;
    private int uid;
    private int sid;
    private String order_name;
    private String order_price;
    private String order_img;
}
