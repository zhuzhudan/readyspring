package com.study.spring.ready.aop.xml;

public class LogService {
    public void saveLog(Log log){
        System.out.println(log.getId());
        System.out.println(log.getOperator());
        System.out.println(log.getOperName());
        System.out.println(log.getOperParams());
        System.out.println(log.getOperResult());
        System.out.println(log.getResultMsg());
        System.out.println(log.getOperTime().toString());
    }


}
