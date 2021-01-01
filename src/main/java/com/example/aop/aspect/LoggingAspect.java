package com.example.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
  @Before("@annotation(com.example.aop.Loggable)")
  public void LoggingAdvice(){
    System.out.println("Running Advice for @Loggable");
  }
}
