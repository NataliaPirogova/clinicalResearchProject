//package by.pirogova.aop;
//
//import org.aspectj.lang.JoinPoint;
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Before;
//import org.aspectj.lang.annotation.Pointcut;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.stereotype.Component;
//
//import java.util.Arrays;
//import java.util.stream.Collectors;
//
//@Component
//@Aspect
//public class Logging {
//
//    private final Logger logger = LoggerFactory.getLogger(this.getClass());
//
//    @Pointcut("execution(public * by.pirogova.controller.OrganizationController.*())")
//    public void organizationControllerMethodLoggins() {
//
//    }
//
//    @Pointcut("@annotation(GeneralControllerGetMapping)")
//    public void generalControllerGetMappingLogging() {
//
//    }
//
//    @Before("generalControllerGetMappingLogging()")
//    public void beforeGeneralControllerGetMappingLogging(JoinPoint joinPoint) {
//        String args = Arrays.stream(joinPoint.getArgs()).map(Object::toString).collect(Collectors.joining(","));
//        logger.info("before " + joinPoint.toString() + ", args=[" + args + "]");
//        logger.info("Before GeneralControllerGetMappingLogging");
//    }
//
//    @Before("organizationControllerMethodLoggins()")
//    public void beforeAdvice() {
//        logger.info("Before advice");
//    }
//}