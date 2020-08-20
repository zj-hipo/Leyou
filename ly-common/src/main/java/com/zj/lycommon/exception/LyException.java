package com.zj.lycommon.exception;

import com.zj.lycommon.enums.ExceptionEnums;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @program: leyou
 * @description: 自定义异常
 * @author: 张军
 * @create: 2020-08-21 07:07
 **/
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class LyException extends RuntimeException{
    private ExceptionEnums exceptionEnums;
}
