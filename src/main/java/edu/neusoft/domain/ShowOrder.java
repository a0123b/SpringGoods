package edu.neusoft.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 姓名： 郑展东
 * 学号：  20107310123
 *
 * @Date 2022年10月11日17:07
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ShowOrder {
    private int uid;
    private int oid;
    private String order_name;
    private String order_price;
    private String order_img;
}
