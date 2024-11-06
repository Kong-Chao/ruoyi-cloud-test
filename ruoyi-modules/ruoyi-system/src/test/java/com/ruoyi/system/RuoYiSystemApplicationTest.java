package com.ruoyi.system;

import com.ruoyi.system.api.domain.SysUser;
import com.ruoyi.system.service.ISysUserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class RuoYiSystemApplicationTest {

    @Autowired
    private ISysUserService iSysUserService;

    @Test
    public void test() {
        SysUser user = iSysUserService.selectUserById(Long.parseLong("1"));
        System.out.println(user);
    }
}