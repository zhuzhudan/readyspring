package com.study.spring.ready.ioc;

public class HelloWorld {
    private String msg;
    public HelloWorld(String msg){
        this.msg = msg;
        System.out.println(msg);
    }
    public HelloWorld(){//如果不写带参数的构造函数，可不用覆盖无参构造函数
        System.out.println("hello world");
    }
    public void hello(){
        System.out.println("Spring Create Object");
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void init(){
        System.out.println("init初始化");
    }

    public void destory(){
        System.out.println("destory销毁");
    }
}
