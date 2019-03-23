package com.study.spring.ready.iocdi;

public class DocumentManager {
    private Document document;
    public DocumentManager(Document document){
        this.document = document;
    }
    public void read(){
        this.document.read();
    }
    public void write(){
        this.document.write();
    }
}
