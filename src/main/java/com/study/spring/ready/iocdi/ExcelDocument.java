package com.study.spring.ready.iocdi;

public class ExcelDocument implements Document {
    public void read() {
        System.out.println("read Excel");
    }

    public void write() {
        System.out.println("write Excel");
    }
}
