package com.design.tender.common.global;

import com.design.tender.common.lang.Result;
import com.design.tender.common.lang.ResultCode;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

@RestControllerAdvice
public class GlobalExceptionHandler {
    private static final Logger log = LogManager.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(value = NullPointerException.class)
    @ResponseBody
    public Object exceptionHandler(HttpServletRequest req , NullPointerException e){
        log.error(e.getMessage());
        return Result.err(ResultCode.NULLPOINTERROR.code(),ResultCode.NULLPOINTERROR.msg());
    }

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Object exceptionHandler(HttpServletRequest req , Exception e){
        log.error(e.getMessage());
        return Result.err(ResultCode.ERROR.code(),ResultCode.ERROR.msg());
    }
}
