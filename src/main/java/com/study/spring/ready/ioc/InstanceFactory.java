package com.study.spring.ready.ioc;

import java.util.HashMap;
import java.util.Map;

public class InstanceFactory {
    public Map<String,HelloWorld> helloWorlds = null;
    public InstanceFactory(){
        helloWorlds = new HashMap<String, HelloWorld>();
        helloWorlds.put("First", new HelloWorld("First"));
        helloWorlds.put("Second", new HelloWorld("Second"));
    }
    public HelloWorld getHelloWorld(String num){
        return helloWorlds.get(num);
    }
}
