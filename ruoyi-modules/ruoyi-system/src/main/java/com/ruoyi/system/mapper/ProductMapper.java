package com.ruoyi.system.mapper;

import com.ruoyi.system.domain.Product;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProductMapper {
    public Product selectById(Long productId);

    public void updateById(Product product);
}
