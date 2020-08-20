package com.zj.lycommon.advice;

import com.zj.lycommon.enums.ExceptionEnums;
import com.zj.lycommon.exception.LyException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @program: leyou
 * @description: 异常拦截器
 * @author: 张军
 * @create: 2020-08-20 23:03
 **/
@ControllerAdvice
public class CommonExceptionHandler {
    /*
    * 拦截ly-item-service里controller的异常
    * e.getMessage()就是Controller里的RuntimeException里的"价格不能为空这条消息"
    * */
    @ExceptionHandler(LyException.class)
    public ResponseEntity<String> handException(LyException e){
        ExceptionEnums enums=e.getExceptionEnums();
        return ResponseEntity.status(enums.getCode()).body(enums.getMsg());

    }
}
