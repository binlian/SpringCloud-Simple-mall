//package com.binglian.config;
//
//import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
//import org.springframework.cloud.gateway.filter.ratelimit.RedisRateLimiter;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
//import reactor.core.publisher.Mono;
//
////@Configuration
//public class RedisLimiterConfiguration {
//
//    //  ID:KEY
//    //  HostAddress的key
////    @Bean
////    @Primary
////    public KeyResolver remoteAddrKeyResolver() {
////        return exchange -> Mono.just(
////                exchange.getRequest()
////                        .getRemoteAddress()
////                        .getAddress()
////                        .getHostAddress()
////        );
////    }
////
////    @Bean("redisLimiterUser")
////    @Primary
////    public RedisRateLimiter redisRateLimiter() {
////        //  每秒发送10个令牌，一个桶能装20个
////        return new RedisRateLimiter(10, 20);
////    }
//}
