//package com.binglian.aspect;
//
//import lombok.extern.slf4j.Slf4j;
//
//import org.aspectj.lang.JoinPoint;
//import org.aspectj.lang.ProceedingJoinPoint;
//import org.aspectj.lang.annotation.After;
//import org.aspectj.lang.annotation.Around;
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Pointcut;
//import org.aspectj.lang.reflect.MethodSignature;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.annotation.Order;
//import org.springframework.stereotype.Component;
//import org.springframework.web.context.request.RequestContextHolder;
//import org.springframework.web.context.request.ServletRequestAttributes;
//
//import javax.servlet.http.HttpServletRequest;
//import java.lang.reflect.Method;
//
//@Slf4j
////@Order
//@Configuration
//@Aspect
//@Component
//public class OperationAspect {
//
//
//    // 创建日志数据表
//
//    /**
//     * 定义切点 @Pointcut
//     * 在注解的位置切入代码
//     */
//    @Pointcut("@annotation(com.binglian.aspect.OperationAnnotation)")
//    public void logPointCut() {
//    }
//
//    /**
//     * 环绕通知，获取接口调用前后入参及返回值数据
//     * @param proceedingJoinPoint
//     * @return
//     */
//    @Around("logPointCut()")
//    public Object saveSysLog(ProceedingJoinPoint proceedingJoinPoint) {
//        try {
//            //保存日志
//
//            //从切面织入点处通过反射机制获取织入点处的方法
//            MethodSignature signature = (MethodSignature) proceedingJoinPoint.getSignature();
//            //获取切入点所在的方法
//            Method method = signature.getMethod();
//            //获取操作
//            //获取请求的类名
//            String className = proceedingJoinPoint.getTarget().getClass().getName();
//            //获取请求的方法名
//            String methodName = method.getName();
//
//            //请求的参数
//            Object[] args = proceedingJoinPoint.getArgs();
//            //将参数所在的数组转换成json
//
//            //获取用户名
//            //获取用户ip地址
//            // 接收到请求，记录请求内容
//            ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
//            HttpServletRequest request = attributes.getRequest();
//            // 记录下请求内容
//
//            //调用service保存SysLog实体类到数据库
//            // 异步保存日志数据到数据库
//            Object result = proceedingJoinPoint.proceed();
//            return result;
//        } catch (Throwable e) {
//            log.error(e.getMessage());
//        }
//        return null;
//    }
//}
