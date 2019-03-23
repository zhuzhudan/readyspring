package com.study.spring.ready.iocdi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static ApplicationContext context;
    static {
        context = new ClassPathXmlApplicationContext("iocdi/applicationContext-document.xml");
    }

    @org.junit.Test
    public void Test(){
        DocumentManager documentManager = (DocumentManager)context.getBean("documentManger");
        documentManager.read();
        documentManager.write();
    }
}
