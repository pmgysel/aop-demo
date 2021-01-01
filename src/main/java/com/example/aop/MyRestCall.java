package com.example.aop;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestCall {
  @LogMethod
  @RequestMapping(path = "/api/get")
  public String restCall() {
    return "hello world";
  }
}
