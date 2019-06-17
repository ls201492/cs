package com.example.demo.dao.auto;

import com.example.demo.common.entity.auto.ZyCaseProspectingUser;
import com.example.demo.common.entity.auto.ZyCaseProspectingUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZyCaseProspectingUserMapper {
    public static final String DATA_SOURCE_NAME = "null";

    int countByExample(ZyCaseProspectingUserExample example);

    int deleteByExample(ZyCaseProspectingUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ZyCaseProspectingUser record);

    int insertSelective(ZyCaseProspectingUser record);

    List<ZyCaseProspectingUser> selectByExample(ZyCaseProspectingUserExample example);

    ZyCaseProspectingUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ZyCaseProspectingUser record, @Param("example") ZyCaseProspectingUserExample example);

    int updateByExample(@Param("record") ZyCaseProspectingUser record, @Param("example") ZyCaseProspectingUserExample example);

    int updateByPrimaryKeySelective(ZyCaseProspectingUser record);

    int updateByPrimaryKey(ZyCaseProspectingUser record);

    int insertBatch(List<ZyCaseProspectingUser> records);
}