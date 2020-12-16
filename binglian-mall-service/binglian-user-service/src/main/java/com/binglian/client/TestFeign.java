package com.binglian.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "binglian-product",fallback = TestFallBack.class)
public interface TestFeign {

    @GetMapping("getProduct")
    public String getProduct();
}
