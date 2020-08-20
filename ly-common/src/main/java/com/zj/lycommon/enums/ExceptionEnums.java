package com.zj.lycommon.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @program: leyou
 * @description: 异常的枚举
 * @author: 张军
 * @create: 2020-08-21 07:08
 **/
@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum ExceptionEnums {
    /*这个相当于一个对象*/
    PRICE_CANNOT_BE_NULL(400,"价格不能为空!!!"),
    ;
    private int code;
    private String msg;
}
