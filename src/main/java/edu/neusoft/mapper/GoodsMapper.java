package edu.neusoft.mapper;

import edu.neusoft.domain.Goods;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 姓名： 郑展东
 * 学号：  20107310123
 *
 * @Date 2022年10月05日20:44
 */
@Mapper
public interface GoodsMapper {

    List<Goods> showGoods();

    Goods getGoodsInfoById(Integer gid);

    int updateGoods(Goods goods);

    int insertGoods(Goods goods);

    int deleteGoods(int gid);

}
