package com.qf.demo.exception;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.qf.demo.entity.ResultBean;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * 创建全局异常处理类
 * @Author py
 * @Date 2019/7/30
 */
@ControllerAdvice
public class CommonExceptionHandler {
    //private Logger logger= LoggerFactory.getLogger(CommonExceptionHandler.class);
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ResultBean handleException(BindException e) throws JsonProcessingException {
        //logger.error("CommonExceptionHandler info:{}",e.getMessage());
        BindingResult bindingResult=e.getBindingResult();

       // StringBuilder sb=new StringBuilder();
        List<FieldError> fieldErrors = bindingResult.getFieldErrors();
        Map<String,String> message=new HashMap<>();

        for (FieldError fieldError : fieldErrors) {
            //sb.append(fieldError.getDefaultMessage());//返回异常message信息
            message.put(fieldError.getField(),fieldError.getDefaultMessage());
        }
        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(message);
        return new ResultBean("500",json);
    }

}
