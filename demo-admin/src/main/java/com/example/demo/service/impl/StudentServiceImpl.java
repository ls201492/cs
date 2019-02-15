package com.example.demo.service.impl;

import com.example.demo.dao.area.ZyAreaDao;
import com.example.demo.entity.User;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("studentService")
public class StudentServiceImpl implements StudentService {

  @Autowired
  private ZyAreaDao zyAreaDao;

  @Override
  public User selectStudentById(int id) {
    return zyAreaDao.selectStudentById(id);
  }
}
