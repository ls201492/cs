package com.example.demo.service;


import com.example.demo.dao.area.ZyAreaDao;
import com.example.demo.dao.area.ZyAreaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("contentService")
public class ContentServiceImpl implements ContentService {

  @Autowired
  private ZyAreaDao areaDao;

  @Override
  public boolean addContent(String title, String xn, String nl, String jq, String dp, String zp,
      String content) {
    if (null != areaDao.selectContent(title)) {
      return false;
    } ;
    areaDao.insertLF(title, xn, nl, jq, dp, zp, content);
    return false;
  }
}
