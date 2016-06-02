package com.study.spring.service;

import org.springframework.stereotype.Component;

import com.study.spring.annotation.TestAnnotation;
import com.study.spring.annotation.Type;

@Component("testService2")
public class TestService2 {

    @TestAnnotation(type = Type.OLD)
    public void test() {
        System.out.println("test");
    }
}
