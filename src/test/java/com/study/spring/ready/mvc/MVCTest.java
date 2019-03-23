package com.study.spring.ready.mvc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MVCTest {
    @Test
    public void test(){
        //启动spring容器
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:mvc/applicationContext-mvc.xml");
        StudentController studentController = (StudentController)context.getBean("studentController");
        studentController.saveStudent();
    }
}
