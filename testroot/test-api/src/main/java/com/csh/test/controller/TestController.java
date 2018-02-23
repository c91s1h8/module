package com.csh.test.controller;

import com.csh.test.service.TestService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController()
public class TestController {
    @Resource
    TestService testService;


    @RequestMapping("test1")
    public String test1() {
        return testService.test1();
    }

}
