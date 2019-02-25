package com.example.demo.constant;

import java.util.Arrays;
import java.util.List;

public final class Constants {

  /**
   * 需要展示最近更新的板块类型
   */
  public static final List<Integer> HAS_LAST_UPDATE_COLUMN_TYPE = Arrays.asList(1, 2);

  public enum SignStatusEnum{
    // 正常
    NORMAL(1),
    // 非正常
    ABNORMAL(2);

    private int status;

    SignStatusEnum(int status){
      this.status = status;
    }

    public int getStatus() {
      return status;
    }

    public boolean eq(Integer val){
      if(val == null){
        return false;
      }
      return val.equals(status);
    }
  }

  /**
   * 活动围栏类型
   */
  public static final int ZONE_TYPE_ACTIVE = 1;

  /**
   * 禁区围栏类型
   */
  public static final int ZONE_TYPE_PENALTY = 2;

  /**
   * 定位删除状态
   */
  public static final int SUPERVISION_STATUS_DEL = 0;

  /**
   * 定位正常状态
   */
  public static final int SUPERVISION_STATUS_NORMAL = 1;

  /**
   * 移除所有围栏
   */
  public static final int REMVOE_ALL_ZONE = 1;

  /**
   * 百度entity 前缀
   */
  public static final String BAIDU_ENTITY_PREFIX = "zy_xinan_";
}
