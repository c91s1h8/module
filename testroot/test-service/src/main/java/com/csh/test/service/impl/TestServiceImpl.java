package com.csh.test.service.impl;

import com.csh.test.service.TestService;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {
    @Override
    public String test1() {
        return "test1 string result";
    }
}
