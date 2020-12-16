package com.binglian.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.cloud.gateway.filter.ratelimit.RateLimiter;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class RoutesConfiguration {

//
//    @Bean
//    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
//        return builder.routes()
//                // 配制一个路由,把 http://网关地址:网关端口/demo/ 下的请求路由到 demo-service 微服务中
//                .route(p -> p
//                        .path("/binglian-user/**") //url匹配
//                        .uri("lb://binglian-user"))  // 将请求路由到指定目标, lb开头是注册中心中的服务, http/https 开头你懂的
//                .build();
//    }
//
//    @Autowired
//    private KeyResolver hostNameResolver;
//
//    @Autowired
//    @Qualifier("redisLimiterUser")
//    private RateLimiter rateLimiter;
//
////
//    @Bean
//    public RouteLocator routeLocator(RouteLocatorBuilder builder) {
//        return builder.routes()
//                // 配制一个路由,把 http://网关地址:网关端口/demo/ 下的请求路由到 demo-service 微服务中
//                .route(p -> p
//                        .path("/binglian-user/**") //url匹配
//                        .uri("lb://binglian-user"))  // 将请求路由到指定目标, lb开头是注册中心中的服务, http/https 开头你懂的
//                .build();
//    }
}
