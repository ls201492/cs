package com.example.demo.constant;

public interface ExamConstants {

  /**
   * 单选题
   */
  int QUESTION_TYPE_SINGLE = 11;

  /**
   * 多选题
   */
  int QUESTION_TYPE_MULTIPLE = 12;

  /**
   * 判断题
   */
  int QUESTION_TYPE_JUDGE = 13;

  /**
   * 正式考试
   */
  Integer PAPER_TYPE_OFFICIAL = 10;

  /**
   * 模拟考试
   */
  Integer PAPER_TYPE_SIMULATION = 11;

  /**
   * 问卷调查
   */
  Integer PAPER_TYPE_SURVEY = 12;

  /**
   * 试卷状态 删除
   */
  Integer PAPER_STATUS_DEL = 0;

  /**
   * 试卷状态 空白卷
   */
  Integer PAPER_STATUS_BLANK = 1;

  /**
   * 试卷状态 完成
   */
  Integer PAPER_STATUS_FINISH = 2;

  /**
   * 考试状态-草稿
   */
  int EXAM_STATUS_DRAFT = 2;

  /**
   * 考试状态-发布
   */
  int EXAM_STATUS_PUBLISH = 1;

  /**
   * 考试状态-删除
   */
  int EXAM_STATUS_DEL = 0;

  /**
   * 试卷状态-未发布
   */
  int EXAM_STATUS_NOT_PUBLISH = 1;

  /**
   * 试卷状态-已发布未开始
   */
  int EXAM_STATUS_NOT_START = 2;

  /**
   * 试卷状态-进行中
   */
  int EXAM_STATUS_UNDERWAY = 3;

  /**
   * 试卷状态-已结束
   */
  int EXAM_STATUS_FINISH = 4;

  /**
   * 正式考试
   */
  int EXAM_TYPE_OFFICIAL = 10;

  /**
   * 模拟考试
   */
  int EXAM_TYPE_SIMULATION = 11;

  /**
   * 问卷调查
   */
  int EXAM_TYPE_QUESTIONNAIRE = 12;

  /**
   * 修改试卷中的分值
   */
  int UPDATE_SCORE_TYPE_PAPER = 1;

  /**
   * 修改考试中的分值
   */
  int UPDATE_SCORE_TYPE_EXAM = 2;

  /**
   * 上移
   */
  int MOVE_TYPE_UP = 1;

  /**
   * 下移
   */
  int MOVE_TYPE_DOWN = 2;

  /**
   * 考试时间格式
   */
  String API_EXAM_DATE_FORMAT = "yyyy年MM月dd日";

  /**
   * 用户考试状态未开始
   */
  int EXAM_USER_STATUS_NOT_START = 0;

  /**
   * 用户考试状态答题完成
   */
  int EXAM_USER_STATUS_FINISH = 1;

  /**
   * 用户考试状态答题中
   */
  int EXAM_USER_STATUS_ANSWER = 2;

  /**
   * 考试未开始请等待
   */
  int EXAM_START_WAIT = 0;

  /**
   * 考试开始
   */
  int EXAM_START_BEGIN = 1;

  /**
   * 考试结束
   */
  int EXAM_START_EXPIRE = 2;

  /**
   * 未作答
   */
  int CORRECT_STATUS_UN_DO = -1;

  /**
   * 错误
   */
  int CORRECT_STATUS_UN_ERROR = 0;

  /**
   * 正确
   */
  int CORRECT_STATUS_UN_RIGHT = 1;
  /**
   * 调查
   */
  int EXAM_BUSINESS_TYPE_RESEARCH = 3;

  /**
   * 考试问卷前缀
   */
  String REDIS_KEY_EXAM_PREFIX = "EXAM:";

  /**
   * 用户手动提交
   */
  int POST_TYPE_USER = 1;

  /**
   * 系统提交
   */
  int POST_TYPE_SYSTEM = 2;
  /**
   * 0不是， 1是
   */
  int IS_FINAL_NO = 0;
  /**
   * 0不是， 1是
   */
  int IS_FINAL_YES = 1;

  /**
   * 推送状态 0:未推送 ,1:发布已推送 2:考前已推送
   */
  int  PUSH_STATUS_IS_FINAL=2;
}
