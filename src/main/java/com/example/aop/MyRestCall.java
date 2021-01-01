package com.example.aop;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestCall {
  @LogMethod
  @RequestMapping(path = "/api/greeting/{name}")
  public String greeting(@PathVariable(value = "name") String name) {
    return "Hello " + name + "!";
  }

  @LogMethod
  @RequestMapping(path = "/api/order/{menu}")
  public String order(@PathVariable(value = "menu") String menu) {
    return "You placed an order for the menu " + menu + "!";
  }
}
