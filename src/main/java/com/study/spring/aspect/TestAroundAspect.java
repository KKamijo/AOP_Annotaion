package com.study.spring.aspect;

import java.lang.reflect.Method;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import com.study.spring.annotation.TestAnnotation;
import com.study.spring.annotation.Type;

@Aspect
public class TestAroundAspect {

	@Around("execution(* com.study.spring.service.*.*(..))")
	public Object testAroundAdvice(ProceedingJoinPoint proceedingJoinPoint) throws ClassNotFoundException {
		System.out.println("Class:"+proceedingJoinPoint.getSignature().getDeclaringTypeName());
		Class<?> clazz = Class.forName(proceedingJoinPoint.getSignature().getDeclaringTypeName());
		for (Method method : clazz.getMethods()) {
		    TestAnnotation annotation = method.getAnnotation(TestAnnotation.class);
		    if (annotation == null) continue;
	        Type type = annotation.type();
	        System.out.println(type.getLabel()+" method");
	        if (Type.OLD.equals(type)) {
	            System.out.println("OLD");
	        }
		}
		Object value = null;
		try {
			value = proceedingJoinPoint.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return value;
	}
}
