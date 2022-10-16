package edu.neusoft.utils;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 姓名： 郑展东
 * 学号：  20107310123
 *
 * @Date 2022年09月29日20:13
 */
@Data
@AllArgsConstructor
public class Result {

    private Integer statusCode;

    private String  code;

    private Object Product;

    private String message;

    public Result(int statusCode, String code , String message) {
        this(statusCode, code, null, message);
    }
}
