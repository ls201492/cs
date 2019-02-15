package com.example.demo.dao.area;

import com.example.demo.common.entity.User;
import org.apache.ibatis.annotations.Param;

/**
 * @author zhanyaa
 * @email admin@zhanyaa.com
 * @date 2018-09-07 15:50:34
 */
public interface ZyAreaDao {

  public User selectStudentById(@Param("id") Integer id);
}
