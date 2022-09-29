package com.training.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/*
    @Aspect declares the class as aspect
 */
@Aspect
public class EngineStart {
    @Pointcut("execution(* Bus.*(..))")
    public void pointCut(){}
    //@After declares the after advice.
    //It is applied after calling the actual method.
    @After("pointCut()")
    public void start1(JoinPoint joinPoint) {
        System.out.println("Engine stop");
    }
    //@Before declares the before advice and is applied before calling the actual method of Bus class.
    @Before("pointCut()")
    public void start(JoinPoint joinPoint) {
        System.out.println("Bus engine start and moving");
    }
    //@Around declares the around advice it is applied before and after calling the actual method.
    @Around(value = "pointCut()")
    public void door(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("Door open and close");
        proceedingJoinPoint.proceed();
        System.out.println("close");
    }
}