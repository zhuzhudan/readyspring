package com.study.spring.ready.aop;

import com.study.spring.ready.aop.annotation.OperService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPTest {
    @Test
    public void serviceTest(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("aop/applicationContext.xml");
        OperService operService = (OperService) ctx.getBean("operService");
        operService.add();

    }

    @Test
    public void testAopXml(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("aop/applicationContext-xml.xml");
        OperService service = (OperService)ctx.getBean("operService");
        service.add();
    }
}
