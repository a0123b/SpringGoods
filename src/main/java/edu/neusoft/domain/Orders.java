package edu.neusoft.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;

/**
 * 姓名： 郑展东
 * 学号：  20107310123
 *
 * @Date 2022年10月20日8:13
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Orders {
    private int id;
    private long order_id;
    private int user_id;
    private int product_id;
    private int product_num;
    private double product_price;
    private long order_time;
}
