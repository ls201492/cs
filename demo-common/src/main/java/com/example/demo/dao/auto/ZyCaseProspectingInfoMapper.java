package com.example.demo.dao.auto;

import com.example.demo.common.entity.auto.ZyCaseProspectingInfo;
import com.example.demo.common.entity.auto.ZyCaseProspectingInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZyCaseProspectingInfoMapper {
    public static final String DATA_SOURCE_NAME = "null";

    int countByExample(ZyCaseProspectingInfoExample example);

    int deleteByExample(ZyCaseProspectingInfoExample example);

    int deleteByPrimaryKey(Integer prospectingId);

    int insert(ZyCaseProspectingInfo record);

    int insertSelective(ZyCaseProspectingInfo record);

    List<ZyCaseProspectingInfo> selectByExampleWithBLOBs(ZyCaseProspectingInfoExample example);

    List<ZyCaseProspectingInfo> selectByExample(ZyCaseProspectingInfoExample example);

    ZyCaseProspectingInfo selectByPrimaryKey(Integer prospectingId);

    int updateByExampleSelective(@Param("record") ZyCaseProspectingInfo record, @Param("example") ZyCaseProspectingInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") ZyCaseProspectingInfo record, @Param("example") ZyCaseProspectingInfoExample example);

    int updateByExample(@Param("record") ZyCaseProspectingInfo record, @Param("example") ZyCaseProspectingInfoExample example);

    int updateByPrimaryKeySelective(ZyCaseProspectingInfo record);

    int updateByPrimaryKeyWithBLOBs(ZyCaseProspectingInfo record);

    int updateByPrimaryKey(ZyCaseProspectingInfo record);

    int insertBatch(List<ZyCaseProspectingInfo> records);
}