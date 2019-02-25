/**
 * Project Name:XinAn-Common File Name:SystemConstants.java Package Name:com.xinan.common.constant
 * Date:2018年4月25日下午7:08:59 Copyright (c) 2018, heyunliang@zhanyaa.com All Rights Reserved.
 */

package com.example.demo.constant;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;

/**
 * ClassName:SystemConstants <br/> Function: 系统公共常量定义. <br/> Date: 2018年4月25日 下午7:08:59 <br/>
 *
 * @author java
 * @see
 */
public interface SystemConstants {

  Integer SYNC_ROOT_AREA_ID = 207282;

  Charset DATA_FILE_CHARSET = Charset.forName("UTF-8");
  String DATA_FILE_COLUMEN_SPLITER = "\u20AC";
  String DATA_FILE_LINE_SPLITER = "\n";
  /*String DATA_LOCAL_PATH = AppConst.getConfig("path.local.tmp", "tmp");
  String DATA_PATH = AppConst.getConfig("path.remote.data", "exchange/inner/data");
  String DATA_PROC_PATH = AppConst.getConfig("path.remote.proc", "exchange/inner/proc");
  String DATA_COMP_PATH = AppConst.getConfig("path.remote.comp", "exchange/inner/comp");
  String DATA_ERROR_PATH = AppConst.getConfig("path.remote.error", "exchange/inner/error");


  String CLEAR_LOCAL_CACHE_NOTIFY_URL = AppConst.getConfig("clear.local.cache.notify.url", null);*/

  String LOCAL_AREA_NODE_TREE_CACHE_NAME = "localAreaNodeTreeCache";

  String LOCAL_DICTIONARY_CACHE_NAME = "localDictionaryCache";

  String LOCAL_BUSINESSCONTROL_CACHE_NAME = "localBusinessControlCache";

  int BACH_DATA_BUNDEL = 5000;

  String SYS_CHARTSET_UTF8 = "utf-8";

  String API_SECURITY_CHECK_PWD = "Zhanya201710@!";

  String DATA_ENCRYPT_PWD = "Zhanya2017!@qwer";

  String BASE_ADDRESS = "http://127.0.0.1";

  int DEFAULT_LEARN_OR_LABOR_TIME = 4 * 60;

  /**
   * 圆形头像
   */
  String DEFAULT_FACE_IMAGE = "http://pic.zhanyaa.com/avatar/defaultFaceImage.png";
  /**
   * 方形头像
   */
  String DEFAULT_FACE_IMAGE_2 =
      "http://xinpic.zhanyaa.com/pic/2018/10/a68784f9-6e90-48de-8b8a-7f77f3261d40.png";


  String DATE_TIME_FULL_FORMAT = "yyyy-MM-dd HH:mm:ss SSS";
  String DATE_TIME_FORMAT_ISO1 = "yyyy-MM-dd HH:mm:ss";
  String DATE_TIME_MINUTE_FORMAT_ISO1 = "yyyy-MM-dd HH:mm";
  String DATE_FORMAT_ISO = "yyyy-MM-dd";
  String MONTH_FORMAT_ISO = "yyyy-MM";
  String DATE_LABLE_FORMAT = "yyyyMMdd";
  String MONTH_LABLE_FORMAT = "yyyyMM";
  String YEAR_LABLE_FORMAT = "yyyy";
  String MONTH_FORMAT = "MM";
  int CONTENT_PUSH_STATUS = 2;
  int AREA_BUSINESS_CONTROL_RULE_STATUS_IS_DELETED = 0;

  int AREA_BUSINESS_CONTROL_RULE_STATUS_IS_NOT_DELETED = 1;
  int TREE_NODE_ROOT = 0;

  int USER_GROUPID_ADMIN = 2;
  int USER_GROUPID_RECTIFY = 1;

  int MAX_AREA_NODE_LEVEL = 6;
  String PAGE_SPLIT = "\\[NextPage\\]\\[\\/NextPage\\]";
  String PAGER_STR = "[NextPage][/NextPage]";
  String REG_DATE_FORMAT_YYYY_MM_DD =
      "((\\d{3}[1-9]|\\d{2}[1-9]\\d{1}|\\d{1}[1-9]\\d{2}|[1-9]\\d{3})-(((0[13578]|1[02])-(0[1-9]|[12]\\d|3[01]))|((0[469]|11)-(0[1-9]|[12]\\d|30))|(02-(0[1-9]|[1]\\d|2[0-8]))))|(((\\d{2})(0[48]|[2468][048]|[13579][26])|((0[48]|[2468][048]|[3579][26])00))-02-29)";
  String REG_DATE_FORMAT_YYYYMMDD =
      "((((\\d{3}[1-9])|(\\d{2}[1-9]\\d{1})|(\\d{1}[1-9]\\d{2})|([1-9]\\d{3}))(((0[13578]|1[02])(0[1-9]|[12]\\d|3[01]))|((0[469]|11)(0[1-9]|[12]\\d|30))|(02(0[1-9]|[1]\\d|2[0-8]))))|(((\\d{2})(0[48]|[2468][048]|[13579][26])|(((0[48])|([2468][048])|([3579][26]))00))0229))";
  String REG_ID_CARD_NO =
      "(^[1-9]\\d{5}((((\\d{3}[1-9])|(\\d{2}[1-9]\\d{1})|(\\d{1}[1-9]\\d{2})|([1-9]\\d{3}))(((0[13578]|1[02])(0[1-9]|[12]\\d|3[01]))|((0[469]|11)(0[1-9]|[12]\\d|30))|(02(0[1-9]|[1]\\d|2[0-8]))))|(((\\d{2})(0[48]|[2468][048]|[13579][26])|(((0[48])|([2468][048])|([3579][26]))00))0229))\\d{3}[0-9Xx]$)|(^[1-9]\\d{5}(((\\d{2})(((0[13578]|1[02])(0[1-9]|[12]\\d|3[01]))|((0[469]|11)(0[1-9]|[12]\\d|30))|(02(0[1-9]|[1]\\d|2[0-8]))))|((0[48]|[2468][048]|[13579][26])0229))\\d{2}[0-9Xx]$)";
/*  int USER_TOKEN_EXPRED_TIME = Integer.valueOf(AppConst.getConfig("remember.sec", "2592000"));*/

  /**
   * 手机号码格式匹配正则
   */
  String PHONE_NUMBER_REG =
      "^(13[0-9]|14[579]|15[0-3,5-9]|16[6]|17[0135678]|18[0-9]|19[89])\\d{8}$";

  /**
   * 默认签到范围
   */
  int SIGIN_DEFALT_RANGE = 500;

  /**
   * 审批者类型：机构
   */
  public int LEAVE_FLOW_NODE_APPROVER_TYPE_ORG = 1;
  /**
   * 审批者类型：用户
   */
  public int LEAVE_FLOW_NODE_APPROVER_TYPE_USER = 2;

  /**
   * 规则状态：删除
   */
  public int LEAVE_RULE_STATUS_DELETED = 2;
  /**
   * 规则状态：启用
   */
  public int LEAVE_RULE_STATUS_USED = 1;

  public String DICT_GROUPKEY_BUSINESS_CONTROL_TYPE = "business_control_type";

  public int ITEM_TYPE_0 = 0;
  public int ITEM_TYPE_1 = 1;
  /**
   * 防刷题用户列表
   */
  int USER_LIST_RULE = 1;
  int USER_LIST_LABOR = 2;

  int LABOR_USER_FROM_TYPE_OPERATOR_ADD = 1;
  int LABOR_USER_FROM_TYPE_APPLY = 0;

  int LABOR_STATE_WAIT_AUDIT = 0;

  int LABOR_STAT_AUDIT_PASS = 1;

  int LABOR_STATE_AUDIT_REFUSE = 2;

  int LABOR_STATE_LEAVED = 3;

  int LABOR_STATE_FINISH = 4;

  int LABOR_STATE_REVIEW_FINISH = 5;

  int LABOR_STATE_NOT_FINISH = 6;

  int LABOR_STATE_WAIT_OVERDUE = 7;


  /**
   * 司法所
   */
  int AREA_TYPE_OFFICE = 5;

  /**
   * 日学习时长
   */
  int USER_GETTIME_STUDY_DAY = 10;

  /**
   * 月学习时长
   */
  int USER_GETTIME_STUDY_MONTH = 11;

  /**
   * 日社区服务时长
   */
  int USER_GETTIME_LABOR_DAY = 20;

  /**
   * 月社区服务时长
   */
  int USER_GETTIME_LABOR_MONTH = 21;

  /**
   * 默认司法人员角色
   */
  Integer DEFAULT_JUDICIAL_ROLE = 55;
  /**
   * 一分钟的毫秒数
   */
  long MINUTES_MS = 1000 * 60L;

  /**
   * 社区服务默认签到有效范围
   */
  int DEFAULT_SIGN_IN_RANGE = 2500;

    /**
   * ClassName: Task <br/> Reason: 状态相关参数常量定义 <br/> date: 2018年4月26日 下午7:26:29 <br/>
   *
   * @author java
   * @version SystemConstants
   * @since JDK 1.6
   */
  enum Status {
    CLOSE(0), OPEN(1), DELETED(0), NORMAL(1), TASK_NOT_RUN(0), TASK_RUNNING(1), TASK_FINISH(
        2), TASK_ERROR(3), LEAVE_RULE_NORMAL(
        1), LEAVE_RULE_DELETE(2), BEGIN(0), RUNNING(2), FINISHED(1), ERROR(3);

    private int status = 0;

    Status(int status) {
      this.status = status;
    }

    public int v() {
      return this.status;
    }

    public boolean eq(Integer v) {
      if (null == v) {
        return false;
      }
      return Integer.compare(this.status, v) == 0;
    }
  }


  static final class API {


    /**
     * 漫画资讯
     */
    public static final int CHANNEL_ID_CARTOON = 70;

    /**
     * 学习漫画
     */
    public static final int CHANNEL_ID_CARICATURE = 43;
    /**
     * 学习
     */
    public static final int CHANNEL_ID_STUDY = 79;
    /**
     * 学习视频
     */
    public static final int CHANNEL_ID_VIDEO = 49;
    /**
     * 学习音频
     */
    public static final int CHANNEL_ID_VOICE = 50;

    /**
     *
     */
    public static final List<Integer> NEED_SHOW_GETTIME_CHANNEL = Arrays.asList(70, 43, 79, 49, 50);

    /**
     * 内容处理参数
     */
    public static final String PAGE_SPLIT = "\\[NextPage\\]\\[\\/NextPage\\]";
    public static final String PAGER_STR = "[NextPage][/NextPage]";

    /**
     * 收藏类型-文章
     */
    public static final int FAVOUR_TYPE_ARTICLE = 1;

    /**
     * 收藏类型-视频
     */
    public static final int FAVOUR_TYPE_VIDEO = 1;

    /**
     * 已收藏
     */
    public static final int USER_FAVOUR_FLAG_YES = 1;

    /**
     * 未收藏
     */
    public static final int USER_FAVOUR_FLAG_NO = 0;
    /**
     * 分散社区服务类型
     */
    public static final Integer LABOR_TYPE_DISPERSED = 1;
  }

  static final class Manager {

    public static final String TASK_PERIOD_TYPE_ONCE = "ONCE";
    public static final String TASK_PERIOD_TYPE_DAY = "DAY";
    public static final String TASK_PERIOD_TYPE_MONTH = "MONTH";
    public static final String TASK_PERIOD_TYPE_YEAR = "YEAR";
    public static final String TASK_PERIOD_TYPE_WEEK = "WEEK";

    public static final int STAOVERVIEWINFO_TYPE_STUDY = 1;
    public static final int STAOVERVIEWINFO_TYPE_LABOR = 2;
    public static final int STAOVERVIEWINFO_TYPE_SIGN = 3;
    public static final int STAOVERVIEWINFO_TYPE_LOCATE = 4;

    /**
     * 总用户数
     */
    public static final String STATISTICS_GROUP_BASE_COUNT_TOTAL_USER = "total_user";
    /**
     * 总学习用户数
     */
    public static final String STATISTICS_GROUP_BASE_COUNT_TOTAL_STUDY_USER = "total_study_user";

    /**
     * 当前总解矫用户数
     */
    public static final String STATISTICS_GROUP_BASE_COUNT_TOTAL_RECTIFY_END_USER =
        "total_rectify_end_user";

    /**
     * 学习完成用户数
     */
    public static final String STATISTICS_GROUP_BASE_COUNT_STUDY_FINISH_COUNT =
        "study_finish_count";
    /**
     * 学习完成且当月解矫用户数
     */
    public static final String STATISTICS_GROUP_BASE_COUNT_STUDY_FINISH_RECTIFY_END_COUNT =
        "study_finish_rectify_end_count";
    /**
     * 总社区服务用户数
     */
    public static final String STATISTICS_GROUP_BASE_COUNT_TOTAL_LABOR_USER = "total_labor_user";
    /**
     * 社区服务完成数
     */
    public static final String STATISTICS_GROUP_BASE_COUNT_LABOR_FINISH_COUNT =
        "labor_finish_count";
    /**
     * 总签到次数
     */
    public static final String STATISTICS_GROUP_BASE_COUNT_NEED_SIGN_TIMES = "need_sign_times";
    /**
     * 签到成功数
     */
    public static final String STATISTICS_GROUP_BASE_COUNT_FINISH_SIGN_TIMES = "finish_sign_times";
    /**
     * 漏签次数
     */
    public static final String STATISTICS_GROUP_BASE_COUNT_SIGN_FORGET_TIMES = "sign_forget_times";
    /**
     * 告警次数
     */
    public static final String STATISTICS_GROUP_BASE_COUNT_WARNING_USER_COUNT =
        "warning_user_count";

    /**
     * 基础统计
     */
    public static final String STATISTICS_GROUP_BASE_COUNT = "base_count";

    /**
     * 基于学习类型的当月解矫用户统计
     */
    public static final String STATISTICS_GROUP_LEARN_TYPE_RECTIFY_END_COUNT =
        "learn_type_rectify_end_count";

    /**
     * 基于学习类型的完成学习用户统计
     */
    public static final String STATISTICS_GROUP_LEARN_TYPE_FINISHED_COUNT =
        "learn_type_finished_count";

    /**
     * 学习完成率
     */
    public static final String STATISTICS_GROUP_BASE_COUNT_LEARN_FINISHED_RATE = "learn_finished_rate";

    /**
     * 社区服务完成率
     */
    public static final String STATISTICS_GROUP_BASE_COUNT_COMMUNITY_SERVICE_FINISHED_RATE = "community_service_finished_rate";

    /**
     * 性别分布统计
     */
    public static final String STATISTICS_GROUP_GENDER = "gender_group";
    /**
     * 矫正级别分布统计
     */
    public static final String STATISTICS_GROUP_RECTIFY_LEVEL = "rectify_level_group";

    /**
     * 学习类型分布统计
     */
    public static final String STATISTICS_GROUP_RECTIFY_LEARN_TYPE = "rectify_learn_type";

    /**
     * 社区服务类型分布统计
     */
    public static final String STATISTICS_GROUP_COMMUNITY_SERVICE_TYPE = "community_service_type";

    /**
     * 矫正阶段分布统计
     */
    public static final String STATISTICS_GROUP_RECTIFY_STAGE = "rectify_stage_group";
    /**
     * 年龄阶段分布统计
     */
    public static final String STATISTICS_GROUP_AGE_STAGE = "age_stage_group";

    /**
     * 犯罪类型分布统计
     */
    public static final String STATISTICS_GROUP_CRIME_TYPE = "crime_type";

    /**
     * 民族分布统计
     */
    public static final String STATISTICS_GROUP_NATION = "nation_group";

    /**
     * 文化程度分布统计
     */
    public static final String STATISTICS_GROUP_DEGREE_OF_EDUCATION = "degree_of_education";

    /**
     * 整治面貌分布统计
     */
    public static final String STATISTICS_GROUP_POLITICS_STATUS = "politics_status";

    /**
     * 婚姻状态分布统计
     */
    public static final String STATISTICS_GROUP_MARITAL_STATUS = "marital_status";

    /**
     * 报道情况分布统计
     */
    public static final String STATISTICS_GROUP_REPORTED_CASES = "reported_cases";
    /**
     * WORD存放地址
     */
    public static final String STATISTICS_GROUP_WORD_CASES = "word_url";


    /**
     * 防刷题规则-按区域
     */
    public static final int CONTENT_RULE_TYPE_AREA = 1;

    /**
     * 防刷题规则-按人员
     */
    public static final int CONTENT_RULE_TYPE_USER = 2;

    /**
     * 全国区域
     */
    public static final int AREA_ALL = 0;

    /**
     * 管理员类型
     */
    public static final Integer USER_TYPE_ANDIM = 2;


  }

  int USER_PERFORMANCE_TYPE_STUDY = 1;
  int USER_PERFORMANCE_TYPE_LABOR = 2;
  /**
   * 1 学习试题使用 2考试试题使用 3调查问卷试题使用'
   */
  int LABEL_TYPE_STUDY_EXAM = 1;
  int LABEL_TYPE_EXAM = 2;
  int LABEL_TYPE_QUESTIONNAIRES = 3;

  // 题库类型1 学习试题使用 2考试试题使用 3调查问卷试题使用'
  int STUDY_QUESTIONEXAM_TYPE = 1;
  int EXAM_QUESTION_TYPE = 2;
  int QUESTIONNAIRES_TYPE = 3;

  int CATAGORY_TYPE_COLUMN = 10; // 栏目类型
  int CATAGORY_TYPE_CRIMINAL = 11; // 犯罪类型

  int YES = 1;
  int NO = 0;
  int ALL = -1;

  /**
   * 人脸重置状态
   */
  int USER_FACE_RESETING = 9;
  /**
   * 人脸正常状态
   */
  int USER_FACE_NORMAL = 1;

  /**
   * 人脸正常状态
   */
  int USER_FACE_NOT_REG = 0;
  /**
   * IOS标识
   */
  public static final int CLIENT_TYPE_IOS = 2;
  /**
   * 安卓标识
   */
  public static final int CLIENT_TYPE_ANDROID = 1;
  /**
   * 调查
   */
  int EXAM_TYPE_RESEARCH = 12;
  /**
   * 正式考试
   */
  int EXAM_TYPE_FORMAL = 10;
  /**
   * 模拟考试
   */
  int EXAM_TYPE_ANALOG = 11;
  /**
   * 考试状态 0删除
   */
  int EXAM_STATUS_DEL = 0;

  /**
   * 1已发布
   */
  int EXAM_STATUS_PUBLISH = 1;
  /**
   * 2草稿
   */
  int EXAM_STATUS_DRAFT = 2;
  /**
   * 1学习内容对应的试题
   */
  int QUESTION_TYPE_STUDY = 1;
  /**
   * 2考试试题
   */
  int QUESTION_TYPE_EXAM = 2;
  /**
   * 3调查问卷试题
   */
  int QUESTION_TYPE_RESEARCH = 3;
  /**
   * 11单选
   */
  int QUESTION_TYPE_SINGLE = 11;
  /**
   * 12复选
   */
  int QUESTION_TYPE_CHECK = 12;
  /**
   * 0未进行推送
   */
  int EXAM_ANALYSIS_NO = 0;
  /**
   * 0未进行推送
   */
  int EXAM_ANALYSIS_YES = 1;
  /**
   * 未作答
   */
  int USER_IS_CORRECT_NO = -1;
  /**
   * 试题状态为正常
   */
  int QUESTION_STATUS_IS_PUSH = 1;
  /**
   * 试题状态为删除
   */
  int QUESTION_STATUS_IS_DEL = 0;
  /**
   * 默认犯罪类型
   */
  int DEFAULT_CRIME_TYPE = -1;
  int SPACEID_POINTS = 10;// 积分商城焦点内容
  // int SPACEID_RECOMMENTACT=8;//发现精选广告
  int SPACEID_APPINDEX = 12;// 首页弹窗广告
  int SPACEID_APPBOOT = 11;// APP启动页*/
  int SPACEID_NEWS = 9;// 资讯焦点图（Banner）
  int EXAM_PUSH_NOT_PUSH = 0;
  int EXAM_PUSH_PUBLISH_PUSH = 1;
  int EXAM_PUSH_AGO_PUSH = 2;

  /**
   * 导出时page页码为-1
   */
  int EXPORT_PAGE = -1;
  int COLUMON_TYPE_INFO = 0;
  int COLUMON_TYPE_VIDEO = 1;
  int COLUMON_TYPE_AUDIO = 2;
  int COLUMON_TYPE_CARTOON = 3;
  int COLUMON_TYPT_PICS = 4;

  // 最后更新栏目
  int CATEGORY_LAST_UPDATE = 95;

  /**
   * 版本获取类型
   */

  int VERSION_TYPE_ANDROID = 1;
  int VERSION_TYPE_IOS = 2;
  int VERSION_UPDATE_TYPE_FORCE = 1;
  int VERSION_UPDATE_TYPE_UN_FORCE = 2;
  int VERSION_STATUS_PUSH = 1;
  int VERSION_STATUS_UN_PUSH = 0;

  enum AdvTargetType {
    IMGTXT(1, "图文"),

    GOODS(2, "商品"),

    VOICE(3, "视听-音频"),

    VIDEO(4, "视听-视频"),

    VIEWPOINT(5, "看法"),

    FOCUSSTUDY(6, "集中学习"),

    FOCUSLABOR(7, "社区服务(集中)"),

    EXAMINATION(8, "在线考试"),

    TEST(9, "模拟考试"),

    QUESTIONNAIRE(10, "调查问卷"),

    LEARNINGRATE(11, "学习进度");

    public static AdvTargetType getAdvType(int type) {
      for (AdvTargetType adv : AdvTargetType.values()) {
        if (Integer.compare(adv.getType(), type) == 0) {
          return adv;
        }
      }
      return null;
    }

    private int type;
    private String name;

    AdvTargetType(int type, String name) {
      this.type = type;
      this.name = name;
    }

    public int getType() {
      return type;
    }

    public String getName() {
      return name;
    }
  }

  static final class Ossfile {

    /**
     * 0集中学习文档
     */
    public static final int BTYPE_FOCUS = 0;
  }

  int RECTIFY_LEARN_TYPE_ONLINE = 1;
  int RECTIFY_LEARN_TYPE_FOCUS = 2;
  int RECTIFY_LEARN_TYPE_EXCLUDE = 3;

  int COMMUNITY_SERVICE_ASSESSMENT_INCLUDE = 1;
  int COMMUNITY_SERVICE_ASSESSMENT_EXCLUDE = 2;

  int ASSESSMENT_EXCLUDE_RECTIFY_LEARN = 1;
  int ASSESSMENT_EXCLUDE_COMMUNITY_SERVICE = 2;

  int ASSESSMENT_TIME_TYPE_LEARN_ONLINE = 11;
  int ASSESSMENT_TIME_TYPE_LEARN_FOCUS = 12;
  int ASSESSMENT_TIME_TYPE_COMMUNITY_SERVICE = 20;


  /**
   * 分散学习时长
   */
  int GET_STUDY_TYPE_LEARN = 10;

  /**
   * 集中学习系统评定获得学习时长
   */
  int GET_STUDY_TYPE_FOCUSSTUDY = 11;


  /**
   * 考试获得学习时长
   */
  int GET_STUDY_TYPE_EXAM = 13;

  static enum GetTimeTypeEnum {
    // 天数据统计
    DAY,
    // 月数据统计
    MONTH
  }

  int COUNT_MAX = 999999999;

  int DEFAULT_PAGE_NO = 1;
  int DEFAULT_PAGE_COUNT = 20;

  String DYNAMIC_SUFFIX = ".htm";
  int ADMIN_AREA_ID = 0;

  String DEFAULT_DICTIONARY_ITEM_KEY = "1";

  int AREA_OPERATION_TYPE_UPDATE = 1;
  int AREA_OPERATION_TYPE_REMOVE = 2;

  /******************************** 常量 ******************************************************/
  // role角色 '0:法律咨询 ，1 心里咨询，2 就业咨询，3 普法员,4 司法员'
  /**
   * 法律咨询
   */
  Integer ROLE_LAWYER = 0;
  /**
   * 心里咨询
   */
  Integer ROLE_PSYCHOLOGICAL = 1;
  /**
   * 就业咨询
   */
  Integer ROLE_WORK = 2;
  /**
   * 普法员
   */
  Integer ROLE_POPULARIZELAWS = 3;

  /**
   * 司法员
   */
  Integer ROLE_FIRM = 4;
  // groupId '1:普通用户 2：调解员'
  /**
   * 1：普通用户
   */
  Integer GENERAL_GROUP = 1;
  /**
   * :2：调解员
   */
  Integer MEDIATOR_GROUP = 2;

  /**
   * 区域类型
   */
  enum AreaType {
    /**
     * 省/直辖市
     */
    PROVICE(1),
    /**
     * 市
     */
    CITY(2),
    /**
     * 区/县
     */
    COUNTY(3),
    /**
     * 乡镇/街道
     */
    TOWN(4),

    /**
     * 村/社区
     */
    VILLAGE(5),
    ;
    private int type;

    AreaType(int type) {
      this.type = type;
    }

    public int v() {
      return this.type;
    }

    public boolean eq(Integer v) {
      return null != v && Integer.compare(this.type, v) == 0;
    }
  }

  /**
   * 集中学习
   */
  int FOCUS_STUDY_TYPE = 2;
  /**
   * 自主学习
   */
  int OWN_STUDY_TYPE = 1;

  /**
   * 发布转态, 已发布
   */
  int PUBLISH_STATUS_YES = 1;

  /**
   * 发布转态, 未发布
   */
  int PUBLISH_STATUS_NO = 0;

  /**
   * app 通知
   */
  int NOTICE_TYPE_APP = 1;

  /**
   * 短信通知
   */
  int NOTICE_TYPE_MESSAGE = 2;

  /**
   * 阅读区域规则, 按区域
   */
  int READ_RULE_TYPE_AREA = 1;

  /**
   * 阅读区域规则, 按人员
   */
  int READ_RULE_TYPE_USER = 2;

  /**
   * 区域类型
   */
  enum CommunityServiceType {
    /**
     * 分散
     */
    SCATTERED(1),
    /**
     * 集中
     */
    ONCENTRATED(2),
    ;
    private int type;

    CommunityServiceType(int type) {
      this.type = type;
    }

    public int v() {
      return this.type;
    }

    public boolean eq(Integer v) {
      return null != v && Integer.compare(this.type, v) == 0;
    }
  }

  /**
   * 评定类型
   */
  enum CommunityEvaluationType {
    /**
     * 0为系统计时，
     */
    DEFAULT_EVALUATION(0),
    /**
     * 1为评定计时
     */
    OPERATION_EVALUATION(1),
    ;
    private int type;

    CommunityEvaluationType(int type) {
      this.type = type;
    }

    public int v() {
      return this.type;
    }

    public boolean eq(Integer v) {
      return null != v && Integer.compare(this.type, v) == 0;
    }
  }

  /**
   * 评定结果 1差 2中 3优 4请假 5旷工
   */
  enum CommunityEvaluationStar {
    /**
     * 0差
     */
    POOR(1),
    /**
     * 2中
     */
    WELL(2),
    /**
     * 3优
     */
    GOOD(3),
    /**
     * 4请假
     */
    LEAVE(4),
    /**
     * 5旷工
     */
    ABSENTEEISM(5),
    ;
    private int type;

    CommunityEvaluationStar(int type) {
      this.type = type;
    }

    public int v() {
      return this.type;
    }

    public boolean eq(Integer v) {
      return null != v && Integer.compare(this.type, v) == 0;
    }
  }

  /**
   * 评定结果 1差 2中 3优 4请假 5旷工
   */
  enum NOTICE_TYPE {
    /**
     * 未通知
     */
    NORMAL(0),
    /**
     * 发布通知
     */
    PUBLISH(1),
    /**
     * 开始通知
     */
    START(2),
    /**
     * 结束通知
     */
    END(3),

    ;
    private int type;

    NOTICE_TYPE(int type) {
      this.type = type;
    }

    public int v() {
      return this.type;
    }

    public boolean eq(Integer v) {
      return null != v && Integer.compare(this.type, v) == 0;
    }
  }

  /**
   * 状态0 删除1 待发布 2已发布
   */
  enum COMMUNITY_SERVICE_STATUS {
    /**
     * 0 删除
     */
    DELETE(0),
    /**
     * 1 待发布
     */
    UNPUBLISH(1),
    /**
     * 2已发布
     */
    PUBLISH(2),

    ;
    private int type;

    COMMUNITY_SERVICE_STATUS(int type) {
      this.type = type;
    }

    public int v() {
      return this.type;
    }

    public boolean eq(Integer v) {
      return null != v && Integer.compare(this.type, v) == 0;
    }
  }

  /**
   * 状态0 删除1 待发布 2已发布
   */
  enum COMMUNITY_SERVICE_USER_STATUS {
    /**
     * 0 待审核
     */
    AUDIT(0),
    /**
     * 1 已通过
     */
    PASS(1),
    /**
     * 2拒绝
     */
    REFUSED(2),
    /**
     * 3请假
     */
    LEAVE(3),
    /**
     * 完成
     */
    FINISH(4),
    /**
     * 已评定
     */
    EVALUATED(5),
    /**
     * 已撤销
     */
    REVOCATION(8),
    ;
    private int type;

    COMMUNITY_SERVICE_USER_STATUS(int type) {
      this.type = type;
    }

    public int v() {
      return this.type;
    }

    public boolean eq(Integer v) {
      return null != v && Integer.compare(this.type, v) == 0;
    }
  }
  /**
   * 状态0 删除1 待发布 2已发布
   */
  enum SendObjType {
    /**
     * 1所有人
     */
    ALL(1),
    /**
     * 2未完成
     */
    UNFINISH(2),
    /**
     * 完成
     */
    FINISH(3),
    ;
    private int type;

    SendObjType(int type) {
      this.type = type;
    }

    public int v() {
      return this.type;
    }

    public boolean eq(Integer v) {
      return null != v && Integer.compare(this.type, v) == 0;
    }
  }

  /**
   * 状态0 删除1 待发布 2已发布
   */
  enum SHOW_BUTTON {
    /**
     * 0去看看
     */
    SHOW(0),
    /**
     * 1确定
     */
    DOWN(1),

    ;
    private int type;

    SHOW_BUTTON(int type) {
      this.type = type;
    }

    public int v() {
      return this.type;
    }

    public boolean eq(Integer v) {
      return null != v && Integer.compare(this.type, v) == 0;
    }
  }

  /**
   * 状态0 删除1 待发布 2已发布
   */
  enum COMMUNITY_SERVICE_USER_NOTIC_TYPE {
    /**
     * 发布通知
     */
    PUBLISH_NOTICE(1),
    /**
     * 未通知
     */
    PUBLISH_STATUS_IS_NO(0),

    ;
    private int type;

    COMMUNITY_SERVICE_USER_NOTIC_TYPE(int type) {
      this.type = type;
    }

    public int v() {
      return this.type;
    }

    public boolean eq(Integer v) {
      return null != v && Integer.compare(this.type, v) == 0;
    }
  }


  /**
   * 状态短信通知开关
   */
  enum THOUGHT_TYPE {
    /**
     * 思想汇报
     */
    DAY(1),
    /**
     * 周
     */
    WEEK(2),
    /**
     * 月
     */
    MONTH(3),
    ;
    private Integer type;

    THOUGHT_TYPE(Integer type) {
      this.type = type;
    }

    public Integer v() {
      return this.type;
    }

    public boolean eq(Integer v) {
      return null != v && type.compareTo(v) == 0;
    }
  }

  /**
   * 默认延迟签退时间
   */
  Integer DEFAULT_LAST_SIGN_MIN = 30;

  /**
   * 默认提前签到时间
   */
  Integer DEFAULT_EARLY_SIGN_MIN = 30;

  int MAX_LBS_QUERY_LIMIT=30;
  int MAX_LBS_TASK_EXE=50;

  int USER_MNG_TYPE_LOCK=1;
  int USER_MNG_TYPE_UNLOCK=2;

  enum FenceType{
    /**
     * 活动围栏
     */
    ACTIVE(1),
    /**
     * 禁区围栏
     */
    PENALTY(2),
    ;
    private Integer type;

    FenceType(Integer type) {
      this.type = type;
    }

    public Integer v() {
      return this.type;
    }

    public boolean eq(Integer v) {
      return null != v && type.compareTo(v) == 0;
    }
  }

  int LBS_TASK_TYPE_REG_ENTIFY = 1;
  int LBS_TASK_TYPE_REG_FENCE = 2;
  int LBS_TASK_TYPE_ENTIFY_MODIFY = 3;
  int LBS_TASK_TYPE_SEEK_AREA = 4;
}

