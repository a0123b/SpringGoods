package edu.neusoft.mapper;

import edu.neusoft.domain.Seller;
import edu.neusoft.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 姓名： 郑展东
 * 学号：  20107310123
 *
 * @Date 2022年10月15日16:44
 */
@Mapper
public interface SellerMapper {
    List<Seller> getAllSeller();

    Seller loginSeller(String sname);

    int registSeller(Seller seller);

    int updateSeller(Seller seller);

    int deleteSelle(int sid);

}
