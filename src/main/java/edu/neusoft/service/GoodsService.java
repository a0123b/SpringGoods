package edu.neusoft.service;

import edu.neusoft.domain.Goods;
import edu.neusoft.utils.Result;

/**
 * 姓名： 郑展东
 * 学号：  20107310123
 *
 * @Date 2022年10月05日20:48
 */
public interface GoodsService {

    Result getAllGoods();

    Result getGoodsInfoById(Integer gid);

    Result updateGoods(Goods goods);

    Result insertGoods(Goods goods);

    Result deleteGoods(int gid);
}
