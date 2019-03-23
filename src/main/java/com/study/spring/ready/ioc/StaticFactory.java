package com.study.spring.ready.ioc;

public class StaticFactory {
    public static HelloWorld getInstance(){
        return new HelloWorld();
    }
}
