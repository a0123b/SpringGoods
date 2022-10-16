package edu.neusoft.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 姓名： 郑展东
 * 学号：  20107310123
 *
 * @Date 2022年10月05日20:40
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Goods {

    private int gid;
    private String goods_name;
    private String goods_detail;
    private String goods_img;
    private int goods_price;
}
