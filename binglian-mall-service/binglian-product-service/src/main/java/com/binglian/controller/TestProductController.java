package com.binglian.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.binglian.result.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestProductController {


    @SentinelResource(value = "getProduct",blockHandler ="exceptionHandler",fallback = "fallback")
    @GetMapping("getProduct")
    public Result getProduct(){

        return Result.success("data");
    }

    // 降级处理
    public Result fallback() {
        return Result.success("服务降级,用户调商品");
    }
    // 异常处理
    public Result exceptionHandler( BlockException be) {
        be.printStackTrace();
        return Result.success("服务降级,用户调商品");
    }


}
