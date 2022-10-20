package edu.neusoft.service.UserServiceImpl;

import edu.neusoft.domain.Product;
import edu.neusoft.mapper.ProductMapper;
import edu.neusoft.service.ProductService;
import edu.neusoft.utils.ProductResult;
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
  public class ProductServiceImpl implements ProductService {

    @Resource
    private ProductMapper productMapper;


    //获取所有商品信息
    @Override
    public ProductResult getAllGoods() {
        List<Product> list = productMapper.showGoods();
        if(Objects.isNull(list)){
            return new ProductResult(404,"002","商品为空");
        }
        return new ProductResult(200,"001",list,"成功获取所有商品");
    }

    //更改商品信息
    @Override
    public ProductResult updateGoods(Product product) {
        int line = productMapper.updateGoods(product);
        if(line > 0){
            return new ProductResult(200,"001", product,"修改成功");
        }
        return new ProductResult(500,"002","修改失败");
    }

    //添加商品信息
    @Override
    public ProductResult insertGoods(Product product) {
        int line = productMapper.insertGoods(product);
        if(line > 0){
            return new ProductResult(200,"001", product,"插入成功");
        }
        return new ProductResult(500,"002", product,"插入失败");
    }

    //删除商品信息
    @Override
    public ProductResult deleteGoods(Integer product_id) {
        deleteKey();
        int line = productMapper.deleteGoods(product_id);
        addKey();
        if (line > 0){
            return new ProductResult(200,"001",product_id,"删除成功");
        }
        return new ProductResult(500,"002",product_id,"删除失败");
    }

    //根据ID获取商品
    @Override
    public ProductResult GetProductById(int product_id){
        Product product = productMapper.GetProductById(product_id);
        if (Objects.isNull(product)){
            return new ProductResult(404,"002","获取失败");
        }
        return new ProductResult(200,"001",product,"获取成功");
    }

    public void deleteKey(){
        productMapper.deleteKey();
    }

    public void addKey(){
        productMapper.addKey();
    }
}
