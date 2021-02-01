package com.medical.the_mental_health.honoured_vip.controller.advice;

import com.medical.the_mental_health.commen.page.Result;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author LocalUserZzy
 */
@RestControllerAdvice
public class MyExceptionHandler {

    @ExceptionHandler(Exception.class)
    public Result exceptionHandler(Exception exception) {
        exception.printStackTrace();
        System.out.println(exception.getMessage());
        return new Result(false, "系统繁忙!请稍后重试!"+exception.getMessage());
    }
}
