package com.study.spring.service;

import com.study.spring.annotation.TestAnnotation;
import com.study.spring.annotation.Type;

public interface TestServiceInterface {

    @TestAnnotation(type = Type.NOMAL)
    void test();
}
