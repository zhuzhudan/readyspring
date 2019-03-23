package com.study.spring.ready.aop.xml;

import org.aspectj.lang.ProceedingJoinPoint;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.Date;

public class Logger {
    private LogService logService = new LogService();

    public Object record(ProceedingJoinPoint pjp){
        Log log = new Log();
        try {
            log.setOperator("admin");
            String name = pjp.getSignature().getName();
            log.setOperator(name);

            Object[] args = pjp.getArgs();
            log.setOperParams(Arrays.toString(args));

            Object object = pjp.proceed();
            if(object != null){
                log.setResultMsg(object.toString());
            } else {
                log.setResultMsg(null);
            }

            log.setOperResult("success");
            log.setOperTime(new Date());
            return object;
        }catch (Throwable throwable){
            log.setOperResult("failure");
            log.setResultMsg(throwable.getMessage());
        }finally {
            logService.saveLog(log);
        }
        return null;
    }
}
