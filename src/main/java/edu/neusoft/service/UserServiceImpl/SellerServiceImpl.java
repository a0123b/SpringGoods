package edu.neusoft.service.UserServiceImpl;

import edu.neusoft.domain.Seller;
import edu.neusoft.domain.User;
import edu.neusoft.mapper.SellerMapper;
import edu.neusoft.service.SellerService;
import edu.neusoft.utils.Result;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Objects;

/**
 * 姓名： 郑展东
 * 学号：  20107310123
 *
 * @Date 2022年10月15日16:46
 */
@Service
public class SellerServiceImpl implements SellerService {
    @Resource
    private SellerMapper sellerMapper;

    //获取卖家信息
    @Override
    public Result getAllSeller(){
        List<Seller> list = sellerMapper.getAllSeller();
        return new Result(200,"001",list,"获取成功");
    }

    //卖家登录
    @Override
    public Result loginSeller(String sname, String spassword) {
        Seller seller = sellerMapper.loginSeller(sname);
        if (Objects.isNull(seller)){
            return new Result(500,"002","卖家不存在");
        }
        return new Result(200,"001",seller,"卖家登录成功");
    }

    //卖家注册
    @Override
    public Result registSeller(Seller seller) {
        int line = sellerMapper.registSeller(seller);
        if (line > 0){
            return new Result(200,"001","卖家注册成功");
        }
        return new Result(500,"002","卖家注册成功");
    }

    //更新卖家信息
    @Override
    public Result updateSeller(Seller seller) {
        int line = sellerMapper.updateSeller(seller);
        if (line > 0) {
            return new Result(200,"001","卖家修改成功");
        }
        return new Result(500,"002","卖家修改失败");
    }


    //删除卖家信息
    @Override
    public Result deleteSelle(int sid) {
        int line = sellerMapper.deleteSelle(sid);
        if (line > 0) {
            return new Result(200,"001","卖家删除成功");
        }
        return new Result(500,"002","卖家删除失败");
    }


}
