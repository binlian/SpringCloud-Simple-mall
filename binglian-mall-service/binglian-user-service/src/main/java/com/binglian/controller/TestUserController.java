package com.binglian.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.binglian.client.TestFeign;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "test模块")
@RestController
public class TestUserController {


    @Autowired
    private TestFeign testFeign;

    @ApiImplicitParam(name = "name",value = "姓名",required = true)
    @ApiOperation(value = "测试获取用户接口")
    @SentinelResource(value = "getUser",blockHandler ="exceptionHandler",fallback = "fallback")
    @GetMapping("getUser")
    public String getUser(String name){
        return "this is user";
    }




    @SentinelResource(value = "user-getProduct",blockHandler ="exceptionHandler",fallback = "fallback")
    @ApiOperation(value = "获取binglian-product模块的getProdcut测试接口")
    @GetMapping("getProduct")
    public String getProduct() {
        return testFeign.getProduct();
    }

    // 降级处理
    public String fallback() {
        return "服务降级,用户调商品";
    }
    // 异常处理
    public String exceptionHandler( BlockException be) {
        be.printStackTrace();
        return "服务抛异常,用户调商品";
    }


}
