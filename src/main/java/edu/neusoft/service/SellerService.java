package edu.neusoft.service;

import edu.neusoft.domain.Seller;
import edu.neusoft.utils.Result;

/**
 * 姓名： 郑展东
 * 学号：  20107310123
 *
 * @Date 2022年10月15日16:45
 */
public interface SellerService {
    Result getAllSeller();

    Result loginSeller(String sname,String spassword);

    Result registSeller(Seller seller);

    Result updateSeller(Seller seller);

    Result deleteSelle(int sid);
}
