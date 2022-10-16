package edu.neusoft.service.UserServiceImpl;

import edu.neusoft.domain.Goods;
import edu.neusoft.mapper.GoodsMapper;
import edu.neusoft.utils.Result;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Objects;

/**
 * 姓名： 郑展东
 * 学号：  20107310123
 *
 * @Date 2022年10月05日20:49
 */
@Service
  public class GoodsServiceImpl implements edu.neusoft.service.GoodsService {

    @Resource
    private GoodsMapper mapper;


    //获取所有商品信息
    @Override
    public Result getAllGoods() {
        List<Goods> list = mapper.showGoods();
        if(Objects.isNull(list)){
            return new Result(404,"002","商品为空");
        }
        return new Result(200,"001",list,"成功获取所有商品");
    }

    //根据商品id获取商品信息
    @Override
    public Result getGoodsInfoById(Integer gid) {
        Goods goods = mapper.getGoodsInfoById(gid);
        return new Result(200,"001",goods,"获取成功");
    }

    //更改商品信息
    @Override
    public Result updateGoods(Goods goods) {
        int line = mapper.updateGoods(goods);
        if(line > 0){
            return new Result(200,"001","修改成功");
        }
        return new Result(500,"002","修改失败");
    }

    //添加商品信息
    @Override
    public Result insertGoods(Goods goods) {
        int line = mapper.insertGoods(goods);
        if(line > 0){
            return new Result(200,"001","插入成功");
        }
        return new Result(500,"002","插入失败");
    }

    //删除商品信息
    @Override
    public Result deleteGoods(int gid) {
        int line = mapper.deleteGoods(gid);
        if (line > 0){
            return new Result(200,"001","删除成功");
        }
        return new Result(500,"002","删除失败");
    }
}
