package com.jihoon.basic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jihoon.basic.service.MainSerivce;

import lombok.RequiredArgsConstructor;

@RestController
// description: http://localhost:8080/sub //
@RequestMapping("/sub")
@RequiredArgsConstructor
public class SubController {

  public final MainSerivce mainSerivce;
  
  @GetMapping("/")
  public String getMethod() {
    return "sub get method";
  }

  @GetMapping("/repository-get")
  public String getRepository() {
    return mainSerivce.getRepository();
  }

}
