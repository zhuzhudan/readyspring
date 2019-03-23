package com.study.spring.ready.di;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Iterator;

public class DITest {
    public static ApplicationContext context;
    static {
        context = new ClassPathXmlApplicationContext("di/applicationContext-di-set.xml");
    }

    @Test
    public void testDISet(){
        Student student = (Student)context.getBean("student");
        System.out.println(student.getName());
        System.out.println(student.getAge());
        student.getSchool().school();
        System.out.println(student.getLists().get(0));
        Iterator<Object> iterable = student.getSets().iterator();
        while (((Iterator) iterable).hasNext()){
            System.out.println(iterable.next());
        }
    }

    @Test
    public void testDIConstructor(){
        Student student = (Student)context.getBean("student_cons");
        System.out.println(student.getName());
        student.getSchool().school();
    }
}
