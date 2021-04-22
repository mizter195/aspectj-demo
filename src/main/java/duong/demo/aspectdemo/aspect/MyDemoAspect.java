package duong.demo.aspectdemo.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
@Slf4j
public class MyDemoAspect {

    @Before("execution(* duong.demo.aspectdemo.service.*.*(..))")
    public void logSomethingBeforeExecution() {
        log.info("this is my very first aspect!");
    }

    @AfterReturning(value = "execution(* duong.demo.aspectdemo.service.MyService1.calculateSomething(..))", returning = "result")
    public void logSomethingAfterReturningMyService1Execution(JoinPoint joinPoint, Object result) {
        log.info(joinPoint.toString());
        log.info("Result from aspect: {}", result);
        log.info("only after return from my service 1");
    }

    @AfterThrowing("@annotation(duong.demo.aspectdemo.model.CustomAnnotation)")
    public void logSomethingAfterThrowingExceptionFromMyService() {
        log.info("This should be logged after throwing an exception");
    }
}
