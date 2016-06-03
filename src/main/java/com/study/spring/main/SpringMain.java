package com.study.spring.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.study.spring.service.TestService1;
import com.study.spring.service.TestService2;
import com.study.spring.service.TestServiceInterface;

@Component
public class SpringMain {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        new ClassPathXmlApplicationContext("spring.xml");
        testService1.test();
        testService2.test();
        testService3.test();
    }

    private static TestService1 testService1;

    public static TestService1 getTestService1() {
        return testService1;
    }

    @Autowired
    public void setTestService1(TestService1 testService1) {
        SpringMain.testService1 = testService1;
    }

    private static TestService2 testService2;

    public static TestService2 getTestService2() {
        return testService2;
    }

    @Autowired
    public void setTestService2(TestService2 testService2) {
        SpringMain.testService2 = testService2;
    }

    private static TestServiceInterface testService3;

    public static TestServiceInterface getTestService3() {
        return testService3;
    }

    @Autowired
    public void setTestService3(TestServiceInterface testService3) {
        SpringMain.testService3 = testService3;
    }
}
