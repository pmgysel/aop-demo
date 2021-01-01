package com.example.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
  @Before("@annotation(com.example.aop.LogMethod)")
  public void logMethod(JoinPoint joinPoint){
    String method = joinPoint.getSignature().getName();
    System.out.println("Method " + method + " was called");
  }
}
