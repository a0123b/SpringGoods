package edu.neusoft.utils;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 姓名： 郑展东
 * 学号：  20107310123
 *
 * @Date 2022年10月20日8:44
 */
@Data
@AllArgsConstructor
public class OrdersResult {
    private Integer statusCode;

    private String  code;

    private Object Product;

    private String message;

    public OrdersResult(int statusCode, String code , String message) {
        this(statusCode, code,null, message);
    }
}
