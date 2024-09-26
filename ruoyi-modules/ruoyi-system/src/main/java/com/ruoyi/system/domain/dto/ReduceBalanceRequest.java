package com.ruoyi.system.domain.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ReduceBalanceRequest {

    private Long userId;

    private Integer price;

}
