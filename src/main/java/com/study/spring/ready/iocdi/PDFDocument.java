package com.study.spring.ready.iocdi;

public class PDFDocument implements Document {
    public void read() {
        System.out.println("read word");
    }

    public void write() {
        System.out.println("writer word");
    }
}
