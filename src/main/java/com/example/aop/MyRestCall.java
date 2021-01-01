package com.example.aop;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestCall {
  @Loggable
  @RequestMapping(path = "/api/get")
  public String runMethod() {
    System.out.println("hello world");
    return "hello world";
  }
}
