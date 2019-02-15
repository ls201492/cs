/**
 * Project Name:XinAn-Common File Name:BasePageResponse.java Package
 * Name:com.xinan.common.bean.api.response Date:2018年4月24日下午7:43:28 Copyright (c) 2018,
 * heyunliang@zhanyaa.com All Rights Reserved.
 */

package com.example.demo.common.bean.response;

import com.example.demo.common.entity.PageHelper;
import io.swagger.annotations.ApiModel;
import java.util.List;

/**
 * ClassName:BasePageResponse <br/>
 * Function: 带分页数据的接口响应基类 <br/>
 * Reason: 带分页数据的接口响应基类 <br/>
 * Date: 2018年4月24日 下午7:43:28 <br/>
 *
 * @author java
 * @see
 * @since JDK 1.8
 */
@ApiModel(description = "分页响应参数")
public class BasePageResponse<T> extends BaseResponse<List<T>> {

  private static final long serialVersionUID = -7555741211218226533L;

  private Integer total = 0;

  private List<T> data;

  private Integer pageNo = 1;

  private Integer count = 0;

  private String search;

  private Integer totalPage = 1;

   public BasePageResponse() {
     // 默认20条
     this.count = 20;
   }

  public BasePageResponse(int count) {
    this.count = count;
  }

  public BasePageResponse(PageHelper pageHelper) {
    if (pageHelper == null) {
      return;
    }
    this.count = pageHelper.getLength();
    this.pageNo = pageHelper.getPageNo();
    this.total = pageHelper.getTotalRecords();
    this.totalPage = pageHelper.getPageCount();
  }

  public Integer getPageNo() {
    return pageNo;
  }

  public void setPageNo(Integer pageNo) {
    this.pageNo = pageNo;
  }

  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public String getSearch() {
    return search;
  }

  public void setSearch(String search) {
    this.search = search;
  }

  public Integer getTotalPage() {
    if (count == 0) {
      return 1;
    }
    return (total - 1) / count + 1;
  }

  public void setTotalPage(Integer totalPage) {
    this.totalPage = totalPage;
  }

  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }

  @Override
  public List<T> getData() {
    return data;
  }

  @Override
  public void setData(List<T> data) {
    this.data = data;
  }
}

