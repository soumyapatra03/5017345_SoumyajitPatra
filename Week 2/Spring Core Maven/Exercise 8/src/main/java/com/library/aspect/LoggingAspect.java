package com.library.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Aspect
@Component
public class LoggingAspect {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
    String formattedDateTime = LocalDateTime.now().format(formatter);

    @Before("execution(* com.library.service.BookService.performService(..))")
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("Entering method: " + joinPoint.getSignature().getName() + " at " + formattedDateTime);
    }

    @After("execution(* com.library.service.BookService.performService(..))")
    public void logAfter(JoinPoint joinPoint) {
        System.out.println("Exiting method: " + joinPoint.getSignature().getName() + " at " + formattedDateTime);
    }
}
