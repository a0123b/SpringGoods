package edu.neusoft.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 姓名： 郑展东
 * 学号：  20107310123
 *
 * @Date 2022年10月18日10:15
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductPicture {
    private int id;
    private int product_id;
    private String product_picture;
    private String intro;
}
