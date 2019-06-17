package com.example.demo.dao.auto;

import com.example.demo.common.entity.auto.ZyCaseInfo;
import com.example.demo.common.entity.auto.ZyCaseInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZyCaseInfoMapper {
    public static final String DATA_SOURCE_NAME = "null";

    int countByExample(ZyCaseInfoExample example);

    int deleteByExample(ZyCaseInfoExample example);

    int deleteByPrimaryKey(Integer caseId);

    int insert(ZyCaseInfo record);

    int insertSelective(ZyCaseInfo record);

    List<ZyCaseInfo> selectByExampleWithBLOBs(ZyCaseInfoExample example);

    List<ZyCaseInfo> selectByExample(ZyCaseInfoExample example);

    ZyCaseInfo selectByPrimaryKey(Integer caseId);

    int updateByExampleSelective(@Param("record") ZyCaseInfo record, @Param("example") ZyCaseInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") ZyCaseInfo record, @Param("example") ZyCaseInfoExample example);

    int updateByExample(@Param("record") ZyCaseInfo record, @Param("example") ZyCaseInfoExample example);

    int updateByPrimaryKeySelective(ZyCaseInfo record);

    int updateByPrimaryKeyWithBLOBs(ZyCaseInfo record);

    int updateByPrimaryKey(ZyCaseInfo record);

    int insertBatch(List<ZyCaseInfo> records);
}