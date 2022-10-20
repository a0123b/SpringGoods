package edu.neusoft.utils;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 姓名： 郑展东
 * 学号：  20107310123
 *
 * @Date 2022年10月19日10:40
 */
@Data
@AllArgsConstructor
public class ShoppingCartResult {
    private Integer statusCode;

    private String  code;

    private Object shoppingcart;

    private String message;

    public ShoppingCartResult(int statusCode, String code , String message) {
        this(statusCode, code,null, message);
    }
}
