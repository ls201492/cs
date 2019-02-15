/**
 * Project Name:XinAn-Common
 * File Name:ResultInfo.java
 * Package Name:com.xinan.common.response
 * Date:2018年4月24日下午7:07:08
 * Copyright (c) 2018, heyunliang@zhanyaa.com All Rights Reserved.
 */

package com.example.demo.common.bean.response;

import com.alibaba.fastjson.JSON;
import com.example.demo.common.enums.SystemResultCode;
import io.swagger.annotations.ApiModel;
import java.io.Serializable;

/**
 * ClassName:ResultInfo <br/>
 * Function: 定义系统统一的响应结果信息. <br/>
 * Reason:	 定义系统统一的响应结果信息. <br/>
 * Date:     2018年4月24日 下午7:07:08 <br/>
 *
 * @author java
 * @see
 * @since JDK 1.6
 */
@ApiModel(description= "响应状态信息")
public class ResultInfo implements Serializable {

    private static final long serialVersionUID = 7090871925754206719L;

    private String resultCode = SystemResultCode.SUCCESS.getCode();

    private String resultMsg = SystemResultCode.SUCCESS.getMessage();

    public ResultInfo() {
        super();
    }

    public String getResultCode() {
        return resultCode;
    }

    public void setResultEnum(SystemResultCode resultEnum) {
        this.resultCode = resultEnum.getCode();
        this.resultMsg = resultEnum.getMessage();
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultMsg() {
        return resultMsg;
    }

    public void setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
    }

    /**
     * @return
     */
    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}

