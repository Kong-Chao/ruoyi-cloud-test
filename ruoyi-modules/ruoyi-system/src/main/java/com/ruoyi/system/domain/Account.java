package com.ruoyi.system.domain;

import lombok.Data;

import java.util.Date;

@Data
public class Account
{
    private Long id;

    /**
     * 余额
     */
    private Double balance;

    private Date lastUpdateTime;
}