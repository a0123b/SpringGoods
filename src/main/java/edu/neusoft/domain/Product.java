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
public class Product {

    private int product_id;
    private String product_name;
    private int category_id;
    private String product_title;
    private String product_intro;
    private String product_picture;
    private double product_price;
    private double product_selling_price;
    private int product_num;
    private int product_sales;


}
