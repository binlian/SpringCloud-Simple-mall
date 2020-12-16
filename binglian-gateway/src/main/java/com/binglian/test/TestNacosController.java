package com.binglian.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class TestNacosController {

    @Value("${name}")
    private String name;

    @RequestMapping("/config")
    public String hello() {
        return "hello " + name;
    }
}