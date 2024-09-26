package com.ruoyi.system.domain.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ReduceStockRequest {

    private Long productId;

    private Integer amount;

}
