package edu.neusoft.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 姓名： 郑展东
 * 学号：  20107310123
 *
 * @Date 2022年10月19日10:36
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ShoppingCart {
    private int id;
    private int user_id;
    private int product_id;
    private int num;
}
