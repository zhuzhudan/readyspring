package com.study.spring.ready.aop.annotation;

import org.springframework.stereotype.Service;

@Service
public class OperService {
    public void add(){
        System.out.println("service add");
    }

    public boolean delete(){
        System.out.println("service delete");
        return true;
    }

    public void edit(){
        System.out.println("service edit");
        int i = 5/0;
    }
}
