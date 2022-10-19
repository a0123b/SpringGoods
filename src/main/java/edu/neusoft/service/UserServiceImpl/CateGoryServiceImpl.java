package edu.neusoft.service.UserServiceImpl;

import edu.neusoft.domain.CateGory;
import edu.neusoft.mapper.CateGoryMapper;
import edu.neusoft.service.CateGoryService;
import edu.neusoft.utils.CateGoryResult;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Objects;

/**
 * 姓名： 郑展东
 * 学号：  20107310123
 *
 * @Date 2022年10月18日8:32
 */
@Service
public class CateGoryServiceImpl implements CateGoryService {
    @Resource
    private CateGoryMapper cateGoryMapper;

    @Override
    public CateGoryResult GetCategory() {
        List<CateGory> list = cateGoryMapper.GetCategory();
        if (Objects.isNull(list)){
            return new CateGoryResult(404,"002","获取商品分类失败");
        }
        return new CateGoryResult(200,"001",list,"获取商品分类成功");
    }
}
