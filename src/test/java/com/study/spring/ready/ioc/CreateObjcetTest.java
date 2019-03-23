package com.study.spring.ready.ioc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CreateObjcetTest {

    public void testCreateObject(){
        //启动spring容器
        //spring容器创建对象的时机是：启动spring容器时创建。
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        //从spring容器中把对象取出
        //如果xml中lazy-init="true"，在获取对象的时候创建对象，即context.getBean()时，创建对象。
        HelloWorld helloWorld = (HelloWorld)context.getBean("helloWorld");
        //对象调用方法
        helloWorld.hello();
    }


    public void testStaticFactory(){
        //启动spring容器
//        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:ioc/applicationContext-createobject-staticmethod.xml");
        //从spring容器中把对象取出
        HelloWorld helloWorld = (HelloWorld)context.getBean("helloFactory");
        //对象调用方法
        helloWorld.hello();
    }


    public void testInstanceFactory(){
        //启动spring容器
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:ioc/applicationContext-createobjcet-instatncefactory.xml");
        //从spring容器中把对象取出
        HelloWorld helloWorld = (HelloWorld)context.getBean("instance");
        //对象调用方法
        System.out.println(helloWorld.getMsg());
    }


    public void testScope(){
        //启动spring容器
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:ioc/applicationContext-createobjcet-scope.xml");
        //从spring容器中把对象取出
        //若果将配置文件中的bean的scope值修改为“prototype”，那么由spring容器产生的bean就是多例的。
        // 打印结果看出，两次分别获取的bean结果是不一样的。
        // 并且在多例模式下，spring容器在context.getBean(),即获取对象的时候创建对象。
        // 这里有两次获取bean，所以打印出两个
        HelloWorld helloWorld = (HelloWorld)context.getBean("helloScope");
        helloWorld.setMsg("111111111");
        HelloWorld helloWorld2 = (HelloWorld)context.getBean("helloScope");
        helloWorld2.setMsg("222222222");
        //对象调用方法
        System.out.println(helloWorld.getMsg());
        System.out.println(helloWorld2.getMsg());
    }

    @Test
    public void testInitDestory(){
        //启动spring容器
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:ioc/applicationContext-initdestory.xml");
        //从spring容器中把对象取出
        HelloWorld helloWorld = (HelloWorld)context.getBean("helloInitDestory");

        //对象调用方法
        helloWorld.hello();
        ClassPathXmlApplicationContext classPathXmlApplicationContext = (ClassPathXmlApplicationContext)context;
        classPathXmlApplicationContext.close();
    }
}
