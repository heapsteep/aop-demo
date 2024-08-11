package com.heapsteep.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {
    Logger logger = LoggerFactory.getLogger(MyAspect.class);
    @Before("execution(* com.heapsteep.controller.MyController.*(..))") //Pointcut
    public void beforeAdvice(JoinPoint joinPoint) { //JoinPoint
        logger.info("Intercepted {} method calls...", joinPoint.getSignature()); //Advice
    }
}
