package edu.neusoft.utils;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 姓名： 郑展东
 * 学号：  20107310123
 *
 * @Date 2022年10月18日8:06
 */
@Data
@AllArgsConstructor
public class ProductCategoryResult {
    private Integer statusCode;

    private String  code;

    private Object productcategory;

    private String message;

    public ProductCategoryResult(int statusCode, String code , String message) {
        this(statusCode, code,null, message);
    }
}
