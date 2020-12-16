package com.binglian.test;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestSentinle {


    @GetMapping("hello")
    @SentinelResource(value = "hello",blockHandler ="exceptionHandler",fallback = "fallback")
    public String hello(String id) {
        return "hello:" + id;
    }

    // 降级处理
    public String fallback(String id) {
        return "服务降级,id="+id ;
    }
    // 异常处理
    public String exceptionHandler(String id, BlockException be) {
        be.printStackTrace();
        return "服务抛异常,id="+id ;
    }
}

