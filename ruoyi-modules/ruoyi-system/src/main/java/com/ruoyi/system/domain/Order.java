package com.ruoyi.system.domain;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor // 自动生成包含 @NonNull 字段的构造函数
public class Order
{
    private Integer id;

    /**
     * 用户ID
     */
    @NonNull
    private Long userId;

    /**
     * 商品ID
     */
    @NonNull
    private Long productId;

    /**
     * 订单状态
     */
    @NonNull
    private int status;

    /**
     * 数量
     */
    @NonNull
    private Integer amount;

    /**
     * 总金额
     */
    private Double totalPrice;

}