package edu.neusoft.mapper;

import edu.neusoft.domain.ShowOrder;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 姓名： 郑展东
 * 学号：  20107310123
 *
 * @Date 2022年10月11日17:06
 */
@Mapper
public interface OrderMapper {

    List<ShowOrder> selectOrder(Integer uid);
}
