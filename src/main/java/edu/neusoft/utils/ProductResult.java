package edu.neusoft.utils;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 姓名： 郑展东
 * 学号：  20107310123
 *
 * @Date 2022年10月17日9:33
 */
@Data
@AllArgsConstructor
public class ProductResult {
    private Integer statusCode;

    private String  code;

    private Object Product;

    private String message;

    public ProductResult(int statusCode, String code , String message) {
        this(statusCode, code,null, message);
    }
}
