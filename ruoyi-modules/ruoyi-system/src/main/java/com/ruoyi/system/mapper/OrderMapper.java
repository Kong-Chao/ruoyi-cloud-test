package com.ruoyi.system.mapper;

import com.ruoyi.system.domain.Order;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper {

    public void insert(Order order);

    public void updateById(Order order);
}
