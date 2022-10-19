package edu.neusoft.utils;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 姓名： 郑展东
 * 学号：  20107310123
 *
 * @Date 2022年10月18日10:21
 */
@Data
@AllArgsConstructor
public class ProductPictureResult {
    private Integer statusCode;

    private String  code;

    private Object productpicture;

    private String message;

    public ProductPictureResult(int statusCode, String code , String message) {
        this(statusCode, code,null, message);
    }
}
