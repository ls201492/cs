package com.example.demo.common.annotation;

import javax.validation.constraints.Null;

@Null(message = "密码不能为空")
public @interface Passward {

    String message() default "密码校验错误";
}
