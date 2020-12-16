package com.binglian.client;

public class TestFallBack implements TestFeign{
    @Override
    public String getProduct() {

        return "错误";
    }
}
