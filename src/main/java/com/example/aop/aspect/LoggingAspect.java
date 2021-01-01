package com.example.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
  @Before("@annotation(com.example.aop.LogMethod)")
  public void logMethod(){
    System.out.println("Method \"restCall\" was called");
  }
}
