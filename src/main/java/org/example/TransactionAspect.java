package org.example;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class TransactionAspect {
    @Pointcut(value ="execution(* org.example.DBService.businessMethod(..)) ")
    private void aspectPointcut() {

    }
    @Around(value = "aspectPointcut()")
    public Object handleControllerMethod(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println(Thread.currentThread()+"aop. dummy open transaction....");
        Object proceed = joinPoint.proceed(joinPoint.getArgs());
        System.out.println(Thread.currentThread()+"aop. dummy close transaction....");
        return proceed;
    }

}
