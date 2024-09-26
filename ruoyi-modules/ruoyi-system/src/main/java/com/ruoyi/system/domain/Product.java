package com.ruoyi.system.domain;


import lombok.Data;

import java.util.Date;

@Data
public class Product {
    private Integer id;
    /**
     * 价格
     */
    private Double price;
    /**
     * 库存
     */
    private Integer stock;

    private Date lastUpdateTime;
}
