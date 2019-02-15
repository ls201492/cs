package com.example.demo.common.enums;

public enum SystemResultCode {

    // 成功
    SUCCESS("200", "成功"),
    // 参数不能为空
    SYS_PARAM_IS_NULL("00001", "参数不能为空"),
    //
    SYS_PARAM_NOT_LEGAL("00003", "参数不合法"),
    //
    SYS_FILE_IS_NULL("00002", "文件不能为空"),
    //
    SYS_PARAM_IS_NOT_LEGAL("00003", "参数不合法"),
    //
    SYS_TOKEN_IS_NULL("00004", "token为空"),
    //
    SYSTEM_ERROR("500", "系统错误"),
    //
    SYSTEM_DATA_EXIST("501", "数据已存在"),
    //
    SYSTEM_USER_EXIST("502", "用户已存在"),
    //
    SYSTEM_CODE_ERROR("503", "验证码错误"),
    //
    SYSTEM_USER_IS_NOT_REGISTER("504", "该用户尚未注册"),
    //
    SYSTEM_WECHAT_GROUP_NOT_EXIST("505", "不存在该群组"),

    SYSTEM_AREA_NOT_EXISTS("506", "区域不存在"),

    SYSTEM_USER_AREA_NOT_SCOPE("507", "当前区域不在用户的区域范围内"),
    //
    ACCOUNT_OLD_PASSWORD_ERROR("599", "原始密码错误"),
    //
    ACCOUNT_PASSWORD_ERROR("600", "用户或密码错误"),
    //
    USER_INFO_NOT_PERFECT("601", "用户信息未完善"),
    //
    USER_STATUS_DISABLE("602", "账号被禁用"),
    //
    USER_NOT_LOGIN("603", "用户未登录"),
    //
    USER_AUDIT_NOT_OK("604", "账号审核未通过"),
    //
    USER_IN_AUDIT("605", "账号审核中"),
    //
    WECHAT_GROUP_ERR_PIC_IS_EMPTY("610", "未上传截图"),

    WECHAT_AREA_IS_EMPTY("611", "管理员对应的区域不存在"),

    WECHAT_ONLY_VELLAGE_CAN_CREATE_GROUP("612", "只能村管理员才能创建群众群"),

    WECHAT_GROUP_HOME_COUNT_ERROR("613", "群覆盖的户数不正确"),

    WECHAT_GROUP_IS_NOT_EXISTS("614", "微信群信息不存在"),

    WECHAT_GROUP_IS_NOT_OWNER("615", "不是微信群的创建者，无权修改微信群信息"),

    WECHAT_GROUP_TOTAL_USER_ERROR("616", "微信群总用户数需要0-500的值"),

    WECHAT_GROUP_DELETE_FAIL("617", "删除微信群失败"),

    WECHAT_GROUP_UPDATE_FAIL("618", "修改群组信息失败"),

    WECHAT_GROUP_CREATE_GROUP_ERROR("619", "创建群组失败"),

    WECHAT_GROUP_GROUP_TYPE_ERROR("620", "群组类型错误"),
    //
    USER_ADD_ERROR("604", "用户添加错误"),
    //
    USER_INFO_NOT_EXIST("605", "用户信息不存在"),
    //
    VERSION_EXISTS("606", "版本号已经存在"),
    //
    INTERIOR_VERSION_EXISTS("607", "内部版本号已经存在"),
    //
    VERSION_IS_PUBLISH("608", "版本已发布"),
    //
    DATA_OPERA_ERROR("650", "数据库操作异常"),
    //
    OPERA_PERMISSION_ERROR("651", "没有权限"),
    /**
     *
     */
    UPDATE_ROLE_ERROR("506", "没有修改权限"),

    TRAIN_NO_EXIST("507", "培训信息不存在"),

    TRAIN_ADD_ERROR("508", "培训信息添加失败"),

    GET_VERIFY_CODE_ERROR("509", "获取验证码错误"),

    AREA_ID_NOT_EXISTS_ADMIN_SUB("510", "所选区域不可操作"),

    CONTENT_NOT_EXISTS("511", "文稿不存在" ),
    //
    DATA_NOT_EXISTS("512", "数据不存在"),

    CONTENT_NOT_EXISTS_ERROR("620", "文稿不存在"),

    CONTENT_NOT_PUBLISH("621", "文稿未发布"),

    CONTENT_NOT_PRIVILEGE("622", "无权修改内容"),

    CONTENT_SHARE_ADD_ERROR("623", "添加分享记录失败"),

    CONTENT_SHARE_URL_ERROR("624", "文稿分享地址有误"),

    USER_COLUMN_IS_EMPTY("630", "栏目不能为空"),

    USER_COLUMN_CHOICENESS_COLUMN_ERROR("631", "精选栏目必需固定在最前边"),

    WECHAT_GROUP_HOME_COUNT__GREATER_THAN_ERROR("632", "覆盖户数不能大于村庄总户数"),

    WECHAT_GROUP_USER_COUNT__GREATER_THAN_ERROR("633", "入群人数不能大于村庄总人数"),

    REGISTET_ERROR("513", "注册失败 "),

    UPDATE_PASSWORD_ERROR("514", "修改密码失败 " ),

    VERIFY_PASSWORD_ERROR("515", "密码长度请在6-16位之间 " ),

    MOBILE_IS_EXIST("516", "该手机号已注册 " ),
    CHANGE_VILLAGE_INFO_ERROR("517", "修改村庄信息失败 "  ),

    SYS_CONTENT_INFO_ERROR("518", "查看文稿详情失败 "  ),

    UPDATE_MOBILE_ERROR("519", "修改手机号码失败 "  ),

    ACCOUNT_NOT_EXISTS("520", "用户不存在"),

    SEND_VERIFY_CODE_ERROR("513", "验证码发送失败， 请稍后重试"),

    SEND_COUNT_IS_EXCESS("514", "今日短信发送量已达上限"),

    SEND_TIME_IS_ILLEGALITY("515", "短信发送间隔过快， 请稍后重试"),

    ACCOUNT_CODE_ERROR("606", "无效的验证码"),

    CASE_UN_COMPLETE_ERROR("701", "案子未完结"),

    CASE_UN_FILE_ERROR("702", "案子未归档"),

    CASE_INFO_UPDATE_ERROR("703", "案子已完结或已归档不可修改基础信息"),
    ;

    private String code;

    private String message;

    SystemResultCode(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
