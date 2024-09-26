package com.ruoyi.file.mapper;

import com.ruoyi.system.api.domain.SysFileInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SysFileInfoMapper {

    public void insert(SysFileInfo fileInfo);

}
