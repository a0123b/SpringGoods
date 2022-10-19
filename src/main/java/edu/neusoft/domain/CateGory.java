package edu.neusoft.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 姓名： 郑展东
 * 学号：  20107310123
 *
 * @Date 2022年10月17日16:24
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CateGory {
    private int category_id;
    private String category_name;
}
