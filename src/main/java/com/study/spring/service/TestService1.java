package com.study.spring.service;

import org.springframework.stereotype.Component;

import com.study.spring.annotation.TestAnnotation;
import com.study.spring.annotation.Type;

@Component("testService1")
public class TestService1 {

    @TestAnnotation(type = Type.NEW)
    public void test() {
        System.out.println("test");
    }
}
