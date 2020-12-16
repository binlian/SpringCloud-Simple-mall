package com.binglian.aspect;


import java.lang.annotation.*;

/**
 * 操作日志
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface OperationAnnotation {


    /**
     * 操作内容
     * @return
     */
    String content();
}
